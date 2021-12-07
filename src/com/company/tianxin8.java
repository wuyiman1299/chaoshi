package com.company;

import java.util.Scanner;

public class tianxin8 {
    public static void main(String[] args) {
        System.out.println("摄氏度\t\t\t华氏度");
        Scanner scanner = new Scanner(System.in);
       double  sheshi = 0 ;
       double  huashi = 0 ;
       int  tiaomu = 0 ;
       do {

           tiaomu ++;
           huashi = sheshi *9/5.0 + 32;
           System.out.println(sheshi + "\t\t\t" + huashi );
           sheshi += 20;

       }while ( tiaomu < 10 && sheshi <=250);
    }
}
