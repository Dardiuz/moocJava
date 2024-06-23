
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double total = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Average: " + (count / total));
                break;
            }

            list.add(input);

            if (input != -1) {
                total = total + 1;
                count = count + input;
            }

        }
    }
}
        // Then it computes the average of the numbers on the list
        // and prints it.

