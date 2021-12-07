package com.company;

import java.util.Scanner;

public class tianxin5 {
    public static void main(String[] args) {
        System.out.println("合格了嘛（y/n）");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        while ( !"y".equals(answer)) {
            System.out.println("上午阅读教材");
            System.out.println("下午写编程/n");
            System.out.println("合格了嘛（y/n）");
            answer = scanner.next();
        }
        System.out.println("完成学习任务");
    }
}
