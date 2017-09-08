package com.observer.jdk;

/**
 * Created by xuwuhuang on 2017/9/8.
 */
public class ObserverTest {
    public static void main(String[] args) {
        MySubject ms = new MySubject();
        ms.addObserver(new Observer1());
        ms.addObserver(new Observer2());
        ms.operation();
    }

}
