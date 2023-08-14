package E5_6;

import java.util.Scanner;
public class SameOrDifferentNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 1st number : ");
        int number1 = in.nextInt();
        System.out.println("Please enter 2nd number : ");
        int number2 = in.nextInt();
        System.out.println("Please enter 3rd number : ");
        int number3 = in.nextInt();
        if(number1 == number2 && number3 == number1){
            System.out.println("all the same");
        }
        else if (number1 != number2 && number1 != number3 && number3 != number2)
        {
            System.out.println("all different");
        }
        else{
            System.out.println("neither");
        }
    }
}
