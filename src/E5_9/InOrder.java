package E5_9;

import java.util.Scanner;
public class InOrder
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        if((number1 <= number2 && number2 <= number3) || (number1 >= number2 && number2 >= number3)){
            System.out.println("in order");
        }
        else {
            System.out.println("not in order");
        }
    }
}
