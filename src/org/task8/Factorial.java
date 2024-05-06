package org.task8;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num ; i++) {
              factorial=factorial*i;
        }
        System.out.println("The factorial of the " + factorial);


    }
}
