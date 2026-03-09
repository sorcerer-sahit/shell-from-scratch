package com.sahit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> keywords = new HashSet<>(Arrays.asList("echo", "exit", "type"));
        while (true) {
            System.out.print("$ ");

            String userInput = scanner.nextLine();
            String[] words = userInput.split(" ");
            switch(words[0]) {
                case "exit":
                    return;
                case("echo"):
                    for (int i = 1; i < words.length; i++) {
                        System.out.print(words[i]);
                        if (i != words.length - 1) System.out.print(" ");
                        else System.out.println();
                    }
                    break;
                case "type":
                    if(keywords.contains(words[1])) {
                        System.out.println(words[1]+" is a shell builtin");
                    }
                    else System.out.println(String.join(" ", Arrays.copyOfRange(words, 1, words.length)) + ": not found");
                    break;
                default:
                    System.out.println(userInput + ": command not found");
            }
        }
    }
}