package io.github.valentyn.nahai.basics.loops;

import java.util.Scanner;

/*
 * Task:
 * Complete the following program to handle attempts of entering an incorrect PIN code.
 * Дополните программу, чтобы оьработать попытки ввода неправильного PIN кода.
 */
public class PinCode {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pinCode = 2354;

        System.out.println("Welcome to the most trusted bank!");
        System.out.print("Enter your PIN code: ");
        int entryCode = keyboard.nextInt();

        // ...
    }
}
