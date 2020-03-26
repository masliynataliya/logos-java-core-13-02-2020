package homework.denysyerchenko.lesson10.replacing;

import java.util.Scanner;

public class Replacing {
    public static void main(String[] args) {
        System.out.println("Enter your text: ");
        Scanner textScanner = new Scanner(System.in);
        String text = textScanner.nextLine().toUpperCase();
        text = text.replace('A','-');
        text = text.replace('E','-');
        text = text.replace('I','-');
        text = text.replace('O','-');
        text = text.replace('U','-');
        System.out.println(text);
        }
    }
