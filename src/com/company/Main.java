package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        final String next = scn.next();
        long sum = Long.valueOf(next);
        long num = 0;
        while (sum > 10) {
            num = sum;
            sum = sumOfNumbers(sum);
            System.out.println("сумма цифер числа: " + num + " ---> " + sum);
        }
    }

    public static long sumOfNumbers(long x) {
        long sum = 0;
        while(x != 0){
            sum = sum + (x % 10);
            x/=10;
        }
        return sum;
    }

}
