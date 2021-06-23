package com.firat.euler;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        long number = 600851475143l;

        for(long i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
