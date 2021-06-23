package com.firat.euler;

public class Problem5 {
    public static void main(String[] args) {
        int number = 100000000;
        boolean close = false;

        while (true){
            number += 1;
            for (int i=1;i<21;i++){
                if (number%i==0){
                    close = true;
                    continue;

                }else {
                    close = false;
                    break;
                }
            }
            if (close == true){
                break;
            }

        }
        System.out.println(number);
    }
}
