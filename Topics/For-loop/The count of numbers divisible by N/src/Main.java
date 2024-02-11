import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here 
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int firstDivisible = a + (n - a % n) % n; // First number >= a that's divisible by n
        int lastDivisible = b - b % n;            // Last number <= b that's divisible by n

        int count = (lastDivisible - firstDivisible) / n + 1;

        System.out.println(count);
    }
}
