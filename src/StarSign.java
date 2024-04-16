
public class StarSign {

    public static void main(String[] args) {

        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(1);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(1);
        System.out.println("\n---");
        printRectangle(1, 1);
        System.out.println("\n---");
        printTriangle(5);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int start = 0;
        for (int i = start; i < number; i++) {
            System.out.print("*");
            start++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int start = 0;
        while (start < size) {
            printStars(size);
            start++;
        }

    }


    public static void printRectangle(int width, int height) {

        for (int i = 0; i < height; i++) {
            printStars(width);
        }

    }

    public static void printTriangle(int size) {
        for (int i = size; i > 0; i--) {
            size++;
            printStars(size);
        }
    }
}


//hallo