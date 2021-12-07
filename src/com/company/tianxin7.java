package com.company;

import java.util.Scanner;

public class tianxin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shifouhege = "";
        do {
            System.out.println("编写程序");
            System.out.println("是否合格:（y/n）");
            shifouhege = scanner.next();
            } while ( shifouhege.equals("n"));
        System.out.println("恭喜你合格了");
        }
    }

