package org.task8;

import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        int count=0;
        while (num!=0){
            num=num/10;
            count++;
        }
        System.out.println("The count of the integer "+ count);
    }
}
