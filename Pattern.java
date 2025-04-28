import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String input = scanner.nextLine();

        int numberOfPatterns = input.length() * (input.length() - 1);
        System.out.println("Number of Patterns: " + numberOfPatterns);

        char[] arr = input.toCharArray(); // directly convert string to character array

        for (int i = 0; i < input.length(); i++) {
            // Swap the first character with the ith character
            swap(arr, 0, i);

            for (int j = 1; j < input.length(); j++) {
                // Print the pattern
                for (char c : arr) {
                    System.out.print(c);
                }
                System.out.println();

                // Move characters to the left except for the first character
                for (int k = 1; k < input.length() - 1; k++) {
                    swap(arr, k, k + 1);
                }
            }

            // Restore the original array before next iteration
            arr = input.toCharArray();
        }

        scanner.close();
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
