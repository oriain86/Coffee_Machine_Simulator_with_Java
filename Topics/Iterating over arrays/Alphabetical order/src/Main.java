import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        boolean isInOrder = true;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].compareTo(input[i+1]) <= 0) {
                isInOrder = true;
            } else {
                isInOrder = false;
                break;
            }
        }
        System.out.println(isInOrder);

    }
}


