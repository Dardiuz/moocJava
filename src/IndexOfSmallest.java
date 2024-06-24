import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Read numbers from the user until 9999 is entered
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }

        // Find the smallest number and its indices
        if (list.size() > 0) {
            int smallest = list.get(0);
            ArrayList<Integer> indices = new ArrayList<>();

            // Find the smallest number in the list
            for (int i = 0; i < list.size(); i++) {
                int num = list.get(i);
                if (num < smallest) {
                    smallest = num;
                }
            }

            // Find the indices of the smallest number
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == smallest) {
                    indices.add(i);
                }
            }

            // Print the smallest number
            System.out.println("Smallest number: " + smallest);

            // Print the indices of the smallest number
            for (int index : indices) {
                System.out.println("Index of smallest number: " + index);
            }
        }
    }
}
