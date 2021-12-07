package com.company;

import java.util.Scanner;

public class tianxin2 {
    public static void main(String[] args) {
        System.out.println("自动拨号");
        Scanner scanner = new Scanner(System.in);
        int bohao = scanner.nextInt();
        switch ( bohao ) {
            case 1:
                System.out.println("爸爸的");
                break;
            case 2:
                System.out.println("妈妈的");
                break;
            case 3:
                System.out.println("爷爷的");
                break;
            case 4:
                System.out.println("奶奶的");
                break;
        }
    }
}
