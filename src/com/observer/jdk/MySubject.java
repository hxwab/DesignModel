package com.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xuwuhuang on 2017/9/8.
 */
public class MySubject extends Observable implements Subject {

    @Override
    public void operation() {
        System.out.println("update self!");
        setChanged();
        notifyObservers();
    }
}
