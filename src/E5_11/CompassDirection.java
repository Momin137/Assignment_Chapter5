package E5_11;

import java.util.Scanner;
public class CompassDirection {
    public static void main(String[] args) {
        final double onePortionSize = 22.5;

        Scanner in = new Scanner(System.in);
        double degree = in.nextDouble();

        double portion = degree / onePortionSize;

        if(portion >= 3 && portion <= 5) {
            System.out.println("E");
        }
        else if(portion > 5 && portion < 7) {
            System.out.println("SE");
        }
        else if(portion >= 7 && portion <= 9) {
            System.out.println("S");
        }
        else if(portion > 9 && portion < 11) {
            System.out.println("SW");
        }
        else if(portion >= 11 && portion <= 13) {
            System.out.println("W");
        }
        else if(portion > 13 && portion < 15) {
            System.out.println("NW");
        }
        else if(portion >= 15 || portion <= 1) {
            System.out.println("N");
        }
        else if(portion > 1 && portion < 3) {
            System.out.println("NE");
        }
    }
}
