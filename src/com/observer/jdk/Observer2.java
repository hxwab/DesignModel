package com.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xuwuhuang on 2017/9/8.
 */
public class Observer2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("observer2 has  received");
    }
}
