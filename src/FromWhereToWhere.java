
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where to?");
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int start = Integer.parseInt(scanner.nextLine());


        for(int i = start; i <= input; i++){
            System.out.println(i);
        }
    }
}
