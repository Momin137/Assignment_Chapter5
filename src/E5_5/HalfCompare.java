package E5_5;

import java.util.Scanner;
public class HalfCompare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word = in.next();
        int len = word.length();
        int half = len / 2;
        if(len % 2 == 0){
            if(word.substring(0,half).equals(word.substring(half))){
                System.out.println("first and second half same");
            }
            else{
                System.out.println("first and second half different");
            }
        }
        else{
            if(word.substring(0,half).equals(word.substring(half+1))){
                System.out.println("first and second half same");
            }
            else {
                System.out.println("first and second half different");
            }
        }

    }
}
