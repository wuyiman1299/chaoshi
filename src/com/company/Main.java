package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("请输入名次");
        Scanner scanner = new Scanner(System.in);
        int mingci = scanner.nextInt();
        if ( mingci == 1 ) {
            System.out.println("参加夏令营");
        }
        if ( mingci == 2 ) {
            System.out.println("笔记本电脑");
        }
        if ( mingci ==3 ) {
            System.out.println("硬盘一个");
        }else {
            System.out.println("没有奖励");
        }
        switch ( mingci ) {
            case 1:
                System.out.println("参加夏令营");
                break;
            case 2:
                System.out.println("笔记本电脑");
                break;
            case 3:
                System.out.println("硬盘一个");
                break;
            default:
                System.out.println("没有奖励");
        }

    }
}
