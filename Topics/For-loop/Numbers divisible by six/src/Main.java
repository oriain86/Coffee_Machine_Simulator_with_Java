import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int sumDivisibleBySix = 0;

        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element % 6 == 0) {
                sumDivisibleBySix += element;
            }
        }
        System.out.println(sumDivisibleBySix);
    }
}