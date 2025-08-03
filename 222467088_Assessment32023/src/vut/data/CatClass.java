
package vut.data;

import java.text.NumberFormat;

/**
 *
 * @author TS Jiyane 222467088
 */
public class CatClass extends PetClass {

    private double amountPaid;

    public CatClass(String name, int age, PetType petType, String petBreed) {
        super(name, age, petType, petBreed);
        setAmountPaid(0.0);
    }

    public CatClass(String name, int age, PetType petType, String petBreed, double amountPaid) {
        super(name, age, petType, petBreed);
        setAmountPaid(0.0);
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    @Override
    public double calcConsultationCost() {
        double discountAmount;
        double amount;
        double discount;

        if (age < 5) {
            discount = 0.09;
        } else if (age > 5 && age < 9) {
            discount = 0.13;
        } else {
            discount = 0.18;
        }
        discountAmount = amountPaid * discount;
        amount = amountPaid - discountAmount;
        return amount;
    }
    NumberFormat nff = NumberFormat.getInstance();

    @Override
    public String toString() {
        return "petName : " + name + "\n"
                + "petType : " + petType + "\n"
                + "petBreed : " + petBreed + "\n"
                + "age : " + age + "\n"
                + "amountPaid : " + nff.format(calcConsultationCost());
    }
}
