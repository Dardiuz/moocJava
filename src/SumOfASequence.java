import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number? ");
        int j = Integer.parseInt(scanner.nextLine());

        System.out.println("Last Number? ");
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = j; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
