
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {

                break;

            }

            numbers.add(number);


        }

        System.out.println("From Where?");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("To Where?");
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second; i++) {
            System.out.println(numbers.get(i));



        }

    }
}


