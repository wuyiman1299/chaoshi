package com.company;

import java.util.Scanner;

public class tianxin6 {
    public static void main(String[] args) {
        System.out.println("学员人数");

        int year =2012;
        int students = 250000;
        while ( students < 1000000) {
            students = (int) (students * (1 + 0.25));
            year++;
        }
        System.out.println("年份:" + year + "学生" + students);
        System.out.println(year + "超过一百万");
    }

}
