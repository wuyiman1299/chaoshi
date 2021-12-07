package com.company;

import java.util.Scanner;

public class tianxin3 {
    public static void main(String[] args) {
        System.out.println("********");
        System.out.println("\t\t 1登陆系统");
        System.out.println("\t\t 2退出");
        System.out.println("********");
        //用户输入功能号
        Scanner scanner = new Scanner(System.in);
        if ( scanner.hasNextInt() ){  //用户需要输入整数，才会进入判断
            int bianhao1 = scanner.nextInt();
            if  ( bianhao1 == 1) {
                System.out.println("二级菜单");
                System.out.println("1 客户信息管理");
                System.out.println("2 购物结算");
                System.out.println("3 真情回馈");
                System.out.println("4 注销");
                //进入二级菜单
                System.out.println("输入功能编号");
                int bianhao2 = scanner.nextInt();
                switch ( bianhao2) {
                    case 1:
                        System.out.println("购物管理系统>客户信息化管理");
                        System.out.println("1 显示所有客户信息");
                        System.out.println("2 添加客户信息");

                        System.out.println("3 修改客户信息");
                        System.out.println("4 查询客户信息");
                        // 具体客户信息管理操作
                        break;
                    case 2:
                        System.out.println("购物结算");
                        System.out.println("输入购物金额");
                        //用户输入 sumMoney
                        double moeny = scanner.nextInt();
                        double realmoney = 0;

                        //显示够换信息
                        System.out.println("是否参加换购活动");
                        System.out.println("1 满50 加2元换百事可乐");
                        System.out.println("2 满100 加3元500ml可乐一瓶");
                        System.out.println("3 满100 加10元5筋面粉");
                        System.out.println("4  满200 加10元炒菜锅");
                        System.out.println("5 满200 加10元爽肤水");
                        System.out.println("0 不换购");
                        // 用户输入功能编号
                        System.out.println("请选择");
                        int funNo = scanner.nextInt();
                        switch ( funNo ) {
                            case 1:
                                if ( funNo >= 50) {
                                    realmoney = moeny+2;
                                   // System.out.println("本次消费金额："+( funNo + 2 ));
                                    System.out.println("成功换购 百事可乐一瓶");
                                }else {
                                    System.out.println("你购买的金额不足以参加本次换购");
                                }
                                break;
                            case 2:
                                if ( moeny >= 100) {
                                    realmoney = moeny + 3;
                                    //  System.out.println("本次消费金额："+(moeny + 3));
                                    System.out.println("成功换购 500ml可乐一瓶");
                                }
                                    break;
                            case  3:
                                realmoney = moeny+10;
                               // System.out.println("本次消费总金额"+(moeny+10));
                                System.out.println("成功换购 5筋面粉");
                                break;
                            case 4:
                                realmoney = moeny + 10;
                              //  System.out.println("本次消费金额"+);
                                System.out.println("成功换购 炒菜锅");
                                break;
                            case  5:
                                realmoney = moeny +20;
                               // System.out.println("本次消费金额"+ ( moeny+20));
                                System.out.println("成功换购 爽肤水");
                                break;
                            case  0:
                                System.out.println("本次消费金额"+ moeny);
                                System.out.println("没有参加换购活动");
                                break;

                                }
                        System.out.println("本次换购金额"+ moeny);


                        break;
                    case 3:
                        System.out.println("购物管理系统>真情回馈");
                        System.out.println("幸运大放送");
                        System.out.println("新运抽奖");
                        System.out.println("生日问候");
                        break;
                    case 4:
                        System.out.println("注销");
                        break;
                }
            }else  if(bianhao1 == 2) {
                System.out.println("你已退出系统");
            }

        }
    }
}
