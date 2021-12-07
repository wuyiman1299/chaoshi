package com.company;

import java.util.Scanner;

public class tianxin9 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String shifoujixu = "";
        int bianhao = 0;
        do {
            System.out.println("请输入商品编号:");
            bianhao = scanner.nextInt();

            switch ( bianhao ) {
                case 1:
                    System.out.println("T恤\t\t\t ￥245.0 ");
                    break;
                case 2:
                    System.out.println("网球鞋\t\t\t $60 ");
                    break;
                case 3:
                    System.out.println("网球拍\t\t\t $30");
                    break;
            }
            System.out.println("是否继续（y/n）");
            shifoujixu = scanner.next();
        }
    }
}
