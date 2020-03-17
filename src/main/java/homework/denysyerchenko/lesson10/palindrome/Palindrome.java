package homework.denysyerchenko.lesson10.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws WrongLengthException {
        System.out.println("Enter the word of 5 letters: ");
        Scanner wordScanner = new Scanner(System.in);
        String enteredWord = wordScanner.nextLine();
        StringBuffer word = new StringBuffer((enteredWord));
        boolean isPalindrome = false;
        if (enteredWord.equalsIgnoreCase(String.valueOf(word.reverse()))) {
            isPalindrome = true;
            System.out.println("Entered word is a palindrome");
        } if (word.length() != 5) {
            throw new WrongLengthException("The word must contain only 5 letters");
        } if (isPalindrome == false) {
            System.out.println("Entered word is not a palindrome");
        }
    }
}
