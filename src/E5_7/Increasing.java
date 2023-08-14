package E5_7;

import java.util.Scanner;
public class Increasing {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double number1 = in.nextDouble();
        double number2 = in.nextDouble();
        double number3 = in.nextDouble();

        if(number1 > number2 && number2 > number3){
            System.out.println("decreasing");
        }
        else if(number1 < number2 && number2 < number3)
        {
            System.out.println("increasing");
        }
        else {
            System.out.println("neither");
        }
    }
}
