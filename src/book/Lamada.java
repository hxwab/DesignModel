package book;

import sun.applet.Main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

/**
 * Created by xuwuhuang on 2017/9/14.
 *
 * 测试lamada表达式在过滤后对原集合有无影响
 * 测试结果表明对原集合无影响
 */
public class Lamada {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int  i = 0;i<10;i++){
            list.add(i);
        }

        List<Integer> result = list.stream().filter(entity->entity>3).collect(Collectors.toList());
        System.out.println(list.size()+":"+result.size());

        Date da = new Date();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.HOUR_OF_DAY, -16);
        System.out.println(c.toString());
       da = c.getTime();
        System.out.println(da.toString());
        String errMsg = null;
        String s = null;
        errMsg += s;

        System.out.println(errMsg==null);
        System.out.println(s == null);
        StringBuffer  ssb = new StringBuffer();
        ssb.append(errMsg);
        ssb.append(s);
        System.out.println(ssb.toString().length());
    }
}
