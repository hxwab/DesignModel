package book.com.test;

/**
 * Created by xuwuhuang on 2017/9/19.
 */
public class TestLock {

    public static void main(String[] args) {
       // while (true);
        String str ="abc";
        System.out.println(str.getBytes().toString());
        System.out.println(new String(str.getBytes()));
    }
}
