import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // start coding here
        int a = scanner.nextInt();

        if ((a > -15 && a <= 12) || (a > 14 && a < 17) || (a >= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}


