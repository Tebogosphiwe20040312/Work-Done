package vut;

/**
 * 
 * 
 * @author 222467088 TS Jiyane
 */
public class ProGamer extends Gamer {

    private int registeredYears;
    private int rank;

    public ProGamer(String id, String name, int age, int registeredYears, int rank) {
        super(id, name, age);
        this.registeredYears = registeredYears;
        this.rank = rank;
    }

    @Override
    public String genCode() {

        String rankAge = String.format("%02d%02d", rank, getAge());
        String registeredYearsFormatted = String.format("%02d", registeredYears);
        return "P" + rankAge + "-" + registeredYearsFormatted;
    }

    @Override
    public int calculateDiscount(int fee) {

        int discount = 0;
        if (registeredYears > 10) {
            discount = 250;
        } else {
            discount = (int) (fee * (0.05 * registeredYears));
        }
        return discount;
    }

    @Override
    public String toString() {

        return "Code: " + genCode() + "\nID number: " + getId() + "\nName: " + getName()
                + "\nYears: " + registeredYears + "\nRank: " + rank;
    }

    public int getRegisteredYears() {
        return registeredYears;
    }

    public void setRegisteredYears(int registeredYears) {
        this.registeredYears = registeredYears;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
