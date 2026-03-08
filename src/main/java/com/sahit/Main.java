package com.sahit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");

            String userInput = scanner.nextLine();
            if(userInput.equals("exit")) return;
            String[] words = userInput.split(" ");
            if(words[0].equals("echo")) {
                for(int i = 1;i < words.length;i++) {
                    System.out.print(words[i]);
                    if(i != words.length - 1) System.out.print(" ");
                    else System.out.println();
                }
            }
            else System.out.println(userInput + ": command not found");
        }
    }
}