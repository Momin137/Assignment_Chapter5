package E5_2;

import java.util.Scanner;
public class FloatingIdentify {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number = in.nextFloat();
        if(number == 0.0)
            System.out.print("zero");
        else if(number > 0.0)
            System.out.print("positive");
        else
            System.out.print("negative");
        float absNumber = Math.abs(number);
        if(absNumber < 1)
            System.out.println(", small");
        else if(absNumber >= 1000000)
            System.out.println(", large");
    }
}
