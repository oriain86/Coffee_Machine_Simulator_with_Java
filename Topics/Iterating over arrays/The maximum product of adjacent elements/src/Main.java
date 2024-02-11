import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements = scanner.nextInt(); // Reads the number of elements
        scanner.nextLine(); // Consumes the newline left-over

        String line = scanner.nextLine(); // Reads the entire line of elements as a single string
        String[] elementsStrings = line.split(" "); // Splits the string into an array of string elements

        int[] elements = new int[numOfElements]; // Creates an array to store the integer elements

        // Parses each string element into an integer and stores it in the integer array
        for (int i = 0; i < numOfElements; i++) {
            elements[i] = Integer.parseInt(elementsStrings[i]);
        }



        int maxProduct = elements[0] * elements[1]; // Initialize maxProduct with the product of the first two elements

        for (int i = 1; i < elements.length - 1; i++) { // Start from index 1 to avoid out-of-bounds
            int currentProduct = elements[i] * elements[i + 1]; // Product of current and next element
            if (currentProduct > maxProduct) { // If currentProduct is greater than maxProduct
                maxProduct = currentProduct; // Update maxProduct with currentProduct
            }
        }
        System.out.println(maxProduct);
    }
}
