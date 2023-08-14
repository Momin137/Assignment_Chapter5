package E5_10;

import java.util.Scanner;
public class pairs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();
        int number4 = in.nextInt();

        if(number1 == number2 && number1 == number3 && number1 == number4){
            System.out.println("in order");
        }
        else if(number1 == number2 && number3 == number4){
            System.out.println("in order");
        }
        else if(number1 == number4 && number3 == number2){
            System.out.println("in order");
        }
        else if(number1 == number3 && number2 == number4){
            System.out.println("in order");
        }
        else {
            System.out.println("not in order");
        }
    }
}
