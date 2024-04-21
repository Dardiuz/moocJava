import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double total = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());


            if (input == 0) {
                break;
            }

            if (input > 0) {
                count = count + 1;
                total = total + input;
            }
            System.out.println(input);
        }
        if (count > 0) {
            System.out.println("Average of the numbers: " + (total / count));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
