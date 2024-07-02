
import java.util.ArrayList;

public class PrintInRange {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(3);
        numbers.add(6);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        numbers.add(18);
        numbers.add(15);
        numbers.add(414);
        numbers.add(13);

        printNumbersInRange(numbers, 10, 20);
    }


    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);


            }

        }
    }

}
