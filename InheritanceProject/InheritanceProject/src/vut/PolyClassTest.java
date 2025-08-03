package vut;

import java.util.Scanner;

/**
 *
 * @author jane
 */
public class PolyClassTest {

    public static void main(String[] args) {

        Employee obj1 = new FullTimeEmp();
        obj1.Salary();

        Employee obj2 = new PartTimeEmp();
        obj2.Salary();
    }
}

class Employee1 {

    final int hoursPerDay = 9;
    int weeksPerMonth;
    int daysPerWeek;
    String empName;
    final double empHourRate = 100.0;
    double empMonthlyRate;
    String employeeType;

    void Salary() {
        System.out.println("Paid Monthly");
    }

}

class FullTimeEmp1 extends Employee1 {

    @Override
    void Salary() {

        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("Your Name: ");
        empName = inputString.next();

        System.out.print("How many weeks Worked: ");
        weeksPerMonth = inputInt.nextInt();

        daysPerWeek = 5;

        empMonthlyRate = ((empHourRate * hoursPerDay) * daysPerWeek) * weeksPerMonth;

        System.out.println("-------------------------------Full Time------------------------------");
        System.out.println("Hi " + empName + ", your salary is R" + empMonthlyRate + " per month");
        System.out.println("----------------------------------------------------------------------");

    }
}

class PartTimeEmp1 extends Employee1 {

    @Override
    void Salary() {

        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.print("Your Name: ");
        empName = inputString.next();

        System.out.print("How many weeks Worked: ");
        weeksPerMonth = inputInt.nextInt();

        daysPerWeek = 5;

        empMonthlyRate = ((empHourRate * hoursPerDay) * daysPerWeek) * weeksPerMonth;

        System.out.println("-------------------------------Part Time------------------------------");
        System.out.println("Hi " + empName + ", your salary is R" + empMonthlyRate + " per month");
        System.out.println("----------------------------------------------------------------------");

    }
}
