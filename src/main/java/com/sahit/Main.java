package com.sahit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("$ ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println(userInput+": command not found");
    }
}