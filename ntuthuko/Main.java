package com.ntuthuko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        System.out.println("Enter first number ");
          int num1 = in.nextInt();
        System.out.println("Enter second number ");
        int num2 = in.nextInt();
        }


    public static boolean isSixtyFive(int num1, int num2) {
        return num1 == 65 || num2 == 65 || (num1 + num2) == 65;
    }

}

