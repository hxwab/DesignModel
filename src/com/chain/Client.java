package com.chain;

/**
 * Created by xuwuhuang on 2017/9/18.
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManger();
        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        String test1 = h3.handleRequest("张三", 300);
        System.out.println("test1 = " + test1);
        String test2 = h3.handleRequest("李四", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = h3.handleRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = h3.handleRequest("李四", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = h3.handleRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = h3.handleRequest("李四", 1500);
        System.out.println("test6 = " + test6);
    }
}
