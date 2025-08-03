package vut.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author TS Jiyane 222467088
 */
public abstract class PetDAClass {

    private static Connection petDBConnection;
    private static Statement st;
    private static ResultSet rs;
    private static PreparedStatement ps;

    public static void initialisePetDBConnection() throws DataStorageException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            petDBConnection = DriverManager.getConnection("jdbc:mysql://localhost/Test3PetDB", "root", "");

        } catch (SQLException | ClassNotFoundException e) {
            throw new DataStorageException(e.getMessage());
        }
    }

    public static void addPet(PetClass objPet) throws DuplicateException {
        String qry = "INSERT INTO tblPets VALUES (?,?,?,?,?,?)";
        try {
            ps = petDBConnection.prepareStatement(qry);
            ps.setString(2, objPet.getName());
            ps.setString(3, objPet.getPetType().name());
            ps.setString(4, objPet.getPetBreed());
            ps.setInt(5, objPet.getAge());
            ps.setDouble(6, objPet.calcConsultationCost());

            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new DuplicateException(e.getMessage());
        }
    }

    public static ArrayList<PetClass> returnCatPets() throws NotFoundException {
        ArrayList<PetClass> arListPet = new ArrayList<>();

        try {
            ps = petDBConnection.prepareStatement("SELECT * FROM tblPets");
            rs = ps.executeQuery();

            while (rs.next()) {
                String petName = rs.getString(2);
                String petType = rs.getString(3);
                String petBreed = rs.getString(4);
                int petAge = rs.getInt(5);
                double amountPaid = rs.getDouble(6);

                if (petType.equals("Cat")) {
                    arListPet.add(new CatClass(petName, petAge, PetClass.PetType.CAT, petBreed, amountPaid));
                }
            }
        } catch (SQLException e) {
            throw new NotFoundException(e.getMessage());
        }
        return arListPet;
    }

    public static void terminateConnection() throws DataStorageException {
        try {
            if (petDBConnection != null && !petDBConnection.isClosed()) {
                petDBConnection.close();
            }
        } catch (SQLException e) {
            throw new DataStorageException(e.getMessage());
        }
    }
}
