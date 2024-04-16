

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {

        while (number > 0) {

            if (number == 0) {
                break;
            } else {
                System.out.println(number);
                number--;
            }
        }
    }

}