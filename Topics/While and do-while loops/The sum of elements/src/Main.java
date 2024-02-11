import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int elem;
        int sum = 0;
        do {
            elem = scanner.nextInt();
            sum += elem;
        } while (elem != 0);
        System.out.println(sum);

    }
}