package Chapter04;

import java.util.Scanner;

/**
 * Stores and calculates information about an employee
 *
 * @author Noah Carter
 */
public class C4_3 {

    /**
     * is a method that contains everything
     *
     * @param args command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String name;
        double hours;
        double pay;
        double ftax;
        double stax;
        double gpay;
        System.out.println("Enter Employees name: ");
        name = input.next();
        System.out.println("Enter Number of Hours worked: ");
        hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        pay = input.nextDouble();
        System.out.println("Enter federal tax with-holding rate: ");
        ftax = input.nextDouble();
        System.out.println("Enter State tax with-holding rate: ");
        stax = input.nextDouble();

        gpay = hours * pay;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.println("Pay rate: $" + pay);
        System.out.println("Gross pay: $" + gpay);
        System.out.println("Deductions: ");
        System.out.println("    Federal with-holding (" + (ftax * 100) + "%): " + (gpay * ftax));
        System.out.println("    State with-holding (" + (stax * 100) + "%): " + (gpay * stax));
        System.out.println("    Total deduction: $" + ((gpay * ftax) + (gpay * stax)));
        System.out.println("Netpay: $" + (gpay - ((gpay * ftax) + (gpay * stax))));
    }
}
