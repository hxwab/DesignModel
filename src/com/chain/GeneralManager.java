package com.chain;

/**
 * Created by xuwuhuang on 2017/9/18.
 */
public class GeneralManager extends  Handler {
    @Override
    public String handleRequest(String user, double fee) {
        String result =null;
        if(fee>=1000){
            result ="同意" + user + "经费为" + fee + "Ԫ";
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleRequest(user,fee);
            }else{
                return "final";
            }
        }

        return  result;
    }
}
