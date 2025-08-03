package vut.data;

/**
 *
 * @author jane
 */
public class CreditCard {

    private String fullName;
    private String IDNumber;
    private String cellNumber;
    private int noOfPurchases;
    private int pointsAccumulated;

    public CreditCard(String fullName, String IDNumber, String cellNumber) {
        this.noOfPurchases = 0;
        this.pointsAccumulated = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name cannot be empty!");
        }
        String name[] = fullName.split(",");
        if (name.length < 2 || name[0].trim().length() < 3 || name[1].trim().length() < 3) {
            throw new IllegalArgumentException("Invalid Full Name. Use format 'Name,Surname' with at least 3 characters each");
        }
        this.fullName = fullName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        if (IDNumber == null) {
            throw new IllegalArgumentException("ID Number cannot be empty!");
        }
        if (IDNumber.length() == 13) {
            this.IDNumber = IDNumber;
        } else {
            throw new IllegalArgumentException("Invalid! South African ID Number must contain 13-digits.");
        }

    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        if (cellNumber == null) {
            throw new IllegalArgumentException("Cellphone Number cannot be empty!");
        }
        if (cellNumber.length() == 10) {
            this.cellNumber = cellNumber;
        } else {
            throw new IllegalArgumentException("Invalid! Cellphone Number must contain 10-digits.");
        }
    }

    public int getNoOfPurchases() {
        return noOfPurchases;
    }

    private void setNoOfPurchases(int noOfPurchases) {
        this.noOfPurchases = noOfPurchases;
    }

    public int getPointsAccumulated() {
        return pointsAccumulated;
    }

    private void setPointsAccumulated(int pointsAccumulated) {
        this.pointsAccumulated = pointsAccumulated;
    }

    /**
     * Method to calculate points based on purchase amount
     *
     * @param amount The amount spent on the purchase
     * @throws IllegalArgumentException if the purchase amount is negative
     */
    public void cardPurchase(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative!");
        }
        int pointsEarned;
        if (amount <= 100) {
            pointsEarned = 5;
        } else if (amount <= 500) {
            pointsEarned = 10;
        } else if (amount <= 1800) {
            pointsEarned = 18;
        } else {
            pointsEarned = 25;
        }

        setPointsAccumulated(getPointsAccumulated() + pointsEarned);
        setNoOfPurchases(getNoOfPurchases() + 1);

    }
}
