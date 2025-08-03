package vut;

import java.util.Scanner;

/**
 *
 * @author jane
 */
public class PolyClass {

    public static void main(String[] args) {

        FullTimeEmp obj1 = new FullTimeEmp();
        obj1.Salary();

        PartTimeEmp obj2 = new PartTimeEmp();
        obj2.Salary();
    }
}

class Employee {

    final int hoursPerDay = 9;
    int weeksPerMonth;
    int daysPerWeek;
    String empName;
    final double empHourRate = 100.0;
    double empMonthlyRate;
    String employeeType;
    String fullTime = "Full Time";
    String partTime = "Part Time";

    void Salary() {
        System.out.println("Paid Monthly");
    }

}

class FullTimeEmp extends Employee {

    @Override
    void Salary() {

        Scanner inputInt = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        Scanner inputString2 = new Scanner(System.in);

        System.out.println("WELCOME TO DEV COMPANY");

        System.out.print("Are You a Full Time or Part Time Employee? :");
        employeeType = inputString2.next();


        if(employeeType.equals(fullTime)){
            
        
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
}

class PartTimeEmp extends Employee {

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
