package org.example;

import java.util.Scanner;

public class Test {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the string: ");
        String s = scanner.nextLine();

        Paliandrom p = new Paliandrom();

        if (p.isPaliandrom(s)) System.out.println("This string is paliandrom");
        else System.out.println("This string isn't paliandrom");

    }
}
