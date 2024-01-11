import java.util.Scanner;
import java.util.NoSuchElementException;

public class NoSuchElementExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt(); // This line may throw NoSuchElementException
            System.out.println("You entered: " + number);
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}