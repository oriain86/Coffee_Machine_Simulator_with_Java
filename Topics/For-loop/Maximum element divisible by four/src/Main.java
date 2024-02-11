import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        if (n > 1000) {
            System.out.println("Error: The number of elements cannot exceed 1000.");
        }

        int maxDivisibleBy4 = -1;

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element <= 30000 && element % 4 == 0 && element > maxDivisibleBy4) {
                maxDivisibleBy4 = element;
            }
        }
        System.out.println(maxDivisibleBy4);

    }
}


