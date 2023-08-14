package E5_20;

import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a single character from a alphabet : ");
        String input = in.nextLine();
        in.close();

        input = input.toUpperCase();

        if(input.length() != 1){
            System.out.println("Error : Please enter a single character.");
        }
        else{
            char character = input.charAt(0);
            if(character >= 'A' && character <= 'Z')
            {
                if(isVowel(character)){
                    System.out.println("Vowel");
                }
                else {
                    System.out.println("Consonant");
                }
            }
        }
    }

    public static boolean isVowel(char character){
        return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }
}
