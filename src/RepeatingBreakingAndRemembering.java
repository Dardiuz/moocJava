
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Give numbers:");
        int sum = 0;
        int nums = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

        if(input == -1) {
            System.out.println("Thx! Bye!");
            break;
        }
        if (input > 0) {
            sum += input;
            nums++;

        } if(input % 2 == 0) {
             even++;
            } else {
            odd++;
            }

        }
        double average = (double) sum /nums;
            System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + nums);
        System.out.println("Average: " + average);
        System.out.println("Even " + even);
        System.out.println("Odd: " + odd);
    }
}
