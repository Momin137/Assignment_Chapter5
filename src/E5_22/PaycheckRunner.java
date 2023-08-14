package E5_22;

import java.util.Scanner;
public class PaycheckRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter employee name : ");
        String name = in.nextLine();

        System.out.println("Enter hourly wage : ");
        double hourlyWage = in.nextDouble();

        System.out.println("Enter worked hours for last week : ");
        double hoursWorked = in.nextDouble();

        in.close();

        Paycheck paycheck = new Paycheck(name, hourlyWage,hoursWorked);
        paycheck.printPaycheck();
    }
}
