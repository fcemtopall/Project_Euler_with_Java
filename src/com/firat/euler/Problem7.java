package com.firat.euler;

public class Problem7 {
    public static void main(String[] args) {

        int sayi = 1;
        int counter = 1;
        while (counter<=10001){
            sayi +=1;
            boolean divided = false;

            for (int i=2;i<sayi;i++){
                if (sayi % i == 0){
                    divided = true;
                }
            }
            if (divided == false){
                System.out.println(sayi);
                counter +=1;
            }
        }
    }
}
