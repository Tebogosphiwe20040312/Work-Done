package vut;

/**
 *
 *
 * @author 222467088 TS Jiyane
 */

public class AmGamer extends Gamer {

    private int category;

    public AmGamer(String id, String name, int age, int category) {
        super(id, name, age);
        this.category = category;
    }

    @Override
    public String genCode() {

        return "A" + getId() + "-" + category;
    }

    @Override
    public int calculateDiscount(int fee) {

        int discount = 0;
        if (category == 1) {

            discount = (getAge() >= 16) ? 30 : 40;
        } else if (category == 2) {

            discount = 20;
        }
        return discount;
    }

    @Override
    public String toString() {

        return "Code: " + genCode() + "\nID number: " + getId() + "\nName: " + getName() + "\nCategory: " + category;
    }
}
