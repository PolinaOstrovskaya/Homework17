import java.util.Scanner;
import java.util.function.Function;
public class Task3 {
        public static void main(String[] args) {
            Function<String, Double> convertToDollars = amount -> {
                double sum = Double.parseDouble(amount.split(" ")[0]);
                return sum / 3.3;
            };
            double result = convertToDollars.apply("453 BYN");
            System.out.println(result);
        }
    }

