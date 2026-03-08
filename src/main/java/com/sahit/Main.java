package com.sahit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");

            String userInput = scanner.nextLine();

            System.out.println(userInput + ": command not found");
        }
    }
}