package E5_4;

import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string : ");
        String word = in.nextLine();
        if(word.substring(0,1).equals(word.substring(word.length()-1))){
            System.out.println("first and last letter same");
        }
        else {
            System.out.println("first and last letter different");
        }
    }
}
