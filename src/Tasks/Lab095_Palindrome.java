package Tasks;

import java.util.Scanner;

public class Lab095_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input, I will check the palindrome");
        String userInput = scanner.next();

        String newStr = reverseString(userInput);
        if (newStr.equalsIgnoreCase(userInput)){
            System.out.println("Input is palindrome");
        }else {
            System.out.println("Input is not palindrome");
        }

            }

    private static String reverseString(String userInput) {
        String reversed = "";
        for (int i = userInput.length()-1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }


        return reversed;
    }
}
