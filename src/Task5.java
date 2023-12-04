import java.util.function.Supplier;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Supplier<String> reverseStringSupplier = () -> {
            System.out.print("Введите строку: ");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();

            StringBuilder reversedString = new StringBuilder(inputString);
            reversedString.reverse();

            return reversedString.toString();
        };


        String reversedInputString = reverseStringSupplier.get();
        System.out.println("Строка задом наперед: " + reversedInputString);
    }
}

