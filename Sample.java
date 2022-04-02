package com.lokesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String reverse = "";

        int length = word.length();
        for (int i = length-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("It is a palindrome.....");
        } else {
            System.out.println("It is not a plaindrome.....");
        }
    }
}
