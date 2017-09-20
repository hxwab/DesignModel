package com.observer;

import java.util.Observer;

/**
 * Created by xuwuhuang on 2017/9/8.
 */
public interface Subject {


    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();

}
