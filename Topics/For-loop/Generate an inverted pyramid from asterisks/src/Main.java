import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows for the pyramid
        int n = scanner.nextInt();

        // For each row
        for (int i = n; i >= 1; i--) {
            // For each column
            for (int j = i; j >= 1; j--) {
                // Print an asterisk without going to the next line
                System.out.print("*");
            }

            // After each row, print a newline character
            System.out.print("\n");
        }

    }
}