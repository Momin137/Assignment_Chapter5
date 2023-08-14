package E5_18;

import java.util.Scanner;
import java.util.Arrays;
public class LexicographicOrder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first string : ");
        String str1 = in.nextLine();
        System.out.print("Enter second string : ");
        String str2 = in.nextLine();
        System.out.print("Enter third string : ");
        String str3 = in.nextLine();

        in.close();

        String[] strings = {str1, str2, str3};

        Arrays.sort(strings);

        System.out.println("The sorted string are : ");
        for(String str : strings){
            System.out.println(str);
        }
    }
}
