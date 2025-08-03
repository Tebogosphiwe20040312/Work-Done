package vut.data;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author TS Jiyane 222467088
 */
public abstract class PetClass {

    public enum PetType {
        DOG, CAT
    }
    protected String name;
    protected int age;
    protected String petBreed;
    protected PetType petType;

    public PetClass(String name, int age, PetType petType, String petBreed) {
        setName(name);
        setAge(age);
        setPetType(petType);
        setPetBreed(petBreed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {

            throw new IllegalArgumentException("The name must be entered");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 25) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("The age must be between 0 and 25");
        }
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public abstract double calcConsultationCost();

    NumberFormat nf = NumberFormat.getInstance();

    @Override
    public String toString() {
        return "petName : " + name + "\n"
                + "petType : " + petType + "\n"
                + "petBreed : " + petBreed + "\n"
                + "age : " + age + "\n"
                + "amountPaid" + nf.format(calcConsultationCost());
    }

    public void initialisePetDBConnection() throws DataStorageException {
        PetDAClass.initialisePetDBConnection();
    }

    public void addPet(PetClass objPet) throws DuplicateException {
        PetDAClass.addPet(objPet);
    }

    public ArrayList<PetClass> returnCatPets() throws NotFoundException {
        return PetDAClass.returnCatPets();
    }

    public void terminateConnection() throws DataStorageException {
        PetDAClass.terminateConnection();
    }

}
