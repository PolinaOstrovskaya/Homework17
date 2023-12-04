import java.util.Scanner;
import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        Consumer<String> convertToUSD = str -> {
            String[] parts = str.split(" ");
            double sum = Double.parseDouble(parts[0]);
            double convertedSum = sum / 3.3; //
            System.out.println(convertedSum + " USD");
        };

        Scanner input = new Scanner(System.in);
        convertToUSD.accept(input.nextLine());
    }
}

