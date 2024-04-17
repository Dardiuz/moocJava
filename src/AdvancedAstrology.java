
public class AdvancedAstrology {

    public static void printStars(int number) {
        int start = 0;
        for (int i = start; i < number; i++) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }


    public static void printSpaces(int number) {
        int start = 0;
        for (int i = start; i < number; i++) {
            System.out.print(" ");
            start++;
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i + (i - 1) );

        }
            printSpaces(height - 2);
            printStars(3);
           printSpaces(height - 2);
            printStars(3);
    }

        public static void main (String[]args){
            // The tests are not checking the main, so you can modify it freely.

            printTriangle(3);
            System.out.println("---");
            christmasTree(4);
            System.out.println("---");
            christmasTree(6);
        }
    }
