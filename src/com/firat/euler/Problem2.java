package com.firat.euler;

public class Problem2 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;


        int sum = 0;

        // Iterate till counter is N
        while (num2 < 4000000) {

            // Print the number
            //System.out.println(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;


            if (num1 %2==0){
                sum = sum + num1;
            }


        }

        System.out.println(sum);
    }
}
