package E5_15;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double income = in.nextDouble();

        double tax = calculateIncome(income);
        System.out.println(tax);
    }

    public static double calculateIncome(double income){
        if(income <= 0){
            return  0;
        }
        double tax = 0;
        if(income > 500000){
            tax = tax + (income - 500000) * 0.06;
            income = 500000;
        }
        if(income > 250000){
            tax = tax + (income - 500000) * 0.05;
            income = 250000;
        }
        if(income > 100000){
            tax = tax + (income - 100000) * 0.04;
            income = 100000;
        }
        if(income > 75000){
            tax = tax + (income - 75000) * 0.03;
            income = 75000;
        }
        if(income > 50000){
            tax = tax + (income - 50000) * 0.02;
            income = 50000;
        }
        tax = tax + income * 0.01;

        return tax;
    }
}
