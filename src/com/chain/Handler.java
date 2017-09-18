package com.chain;

/**
 * Created by xuwuhuang on 2017/9/18.
 */
public abstract class Handler {

    protected  Handler successor;

    public abstract  String handleRequest(String user,double fee);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
