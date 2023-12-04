import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.parse(new Scanner(System.in).next()).plusYears(100));

    }
}
