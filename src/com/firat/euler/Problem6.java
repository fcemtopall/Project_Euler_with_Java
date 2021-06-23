package com.firat.euler;

public class Problem6 {

    public static void main(String[] args) {
        int numberSum=0;
        long squareNumber = 0;

        for (int i=1;i<101;i++){
            numberSum += i;
            squareNumber += i*i;
        }

        int sumNumberSquare = numberSum*numberSum;
        System.out.println(numberSum);
        System.out.println(squareNumber);

        System.out.println(sumNumberSquare - squareNumber);
    }
}
