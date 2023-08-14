package E5_17;

import java.util.Scanner;
public class LargeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number1 = in.nextFloat();
        float number2 = in.nextFloat();
        float number3 = in.nextFloat();

        if(number1 > number2 && number1 > number3){
            System.out.println(number1);
        }
        else if(number2 > number3){
            System.out.println(number2);
        }
        else {
            System.out.println(number3);
        }
    }
}
