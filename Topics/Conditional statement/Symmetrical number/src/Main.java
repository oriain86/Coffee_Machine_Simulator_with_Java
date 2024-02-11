import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // start coding here
        int input = scanner.nextInt();

        int a = input / 1000;
        int b = input % 1000 / 100;
        int c = input % 100 / 10;
        int d = input % 10;

        System.out.println();

        if ((a == d) && (b == c)) {
            System.out.println("1");
        } else {
            System.out.println("375");
        }

    }
}


