package org.task8;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("First number");
        int num1= s.nextInt();
        System.out.println("Second number");
        int num2= s.nextInt();
        int temp=0;
         temp=num1;
         num1=num2;
         num2=temp;

        System.out.println("After swaping");
        System.out.println("First number:"+ num1);
        System.out.println("Second number:"+ num2);
    }
}
