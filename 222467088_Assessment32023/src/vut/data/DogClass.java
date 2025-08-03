
package vut.data;

import java.text.NumberFormat;

/**
 *
 * @author TS Jiyane 222467088
 */
public class DogClass extends PetClass {

    private double amountPaid;

    public DogClass(String name, int age, PetType petType, String petBreed) {
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
        if (age < 4) {
            discount = 0.10;
        } else if (age > 4 && age < 8) {
            discount = 0.15;
        } else {
            discount = 0.20;
        }
        discountAmount = amountPaid * discount;
        amount = amountPaid - discountAmount;

        return amount;
    }
    NumberFormat nffs = NumberFormat.getInstance();

    @Override
    public String toString() {
        return "petName : " + name + "\n"
                + "petType : " + petType + "\n"
                + "petBreed : " + petBreed + "\n"
                + "age : " + age + "\n"
                + "amountPaid : " + nffs.format(calcConsultationCost());
    }
}
