import java.util.Scanner;
public class Pattern{
    public static void main (String[] args){
        
        Scanner s1 = new Scanner(System.in); // s1 is the name for the Scanner
        
        System.out.print("String: "); 
        String input = s1.nextLine(); // input for the String
        
        int output = input.length() * (input.length() - 1);
        System.out.println("Number of Patterns : " + output); // outputs the number of patterns

        char[] arr = new char[input.length()];
        for (int i = 0; i < input.length(); i++){ // Decleration of each characters in arrays
            arr[i] = input.charAt(i);
        }

        for (int i = 0; i < input.length(); i++){
            char temp = arr[i]; // swap the first element to the designated array
            arr[i] = arr[0];
            arr[0] = temp;
            for (int j = 1; j < input.length(); j++){
                System.out.print(arr[0]); // prints the first array
                for (int k = 1; k < input.length(); k++){
                    System.out.print(arr[k]); // prints the rest of the array
                }
                for (int k = 1; k < input.length()-1; k++){
                    temp = arr[k]; // moves the array of characters
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
                System.out.println(); // prints a new line
            }
        }
        s1.close();
    }
}