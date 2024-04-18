
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double total = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                System.out.println("Average of the numbers: " + (count / total));
                break;
            } if (input != 0) {
                total = total + 1;
                count = count + input;
            }
            System.out.println(input);
        }
    }
}
