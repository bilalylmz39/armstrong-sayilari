package com.company;
public class Main {
    public static void main(String[] args) {
        //153 = (1*1*1)+(5*5*5)+(3*3*3)[ArmstrongSayisi]
        int a,b,c,toplam;

        for(a=1; a<=9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    int i = 100 * a + 10 * b + c;       /* sayi = abc (üç basamaklı) */

                    toplam = (a * a * a) + (b * b * b) + (c * c * c);
                    if (toplam == i) {
                        System.out.println(i + " bir armstrong sayısıdır.");
                    }
                }
            }
        }
    }
}
