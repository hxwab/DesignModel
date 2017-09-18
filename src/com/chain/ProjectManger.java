package com.chain;

/**
 * Created by xuwuhuang on 2017/9/18.
 */
public class ProjectManger extends Handler {


    @Override
    public String handleRequest(String user, double fee) {
        String result =null;
        if(fee<500){
           result ="成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
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
