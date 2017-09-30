package book.com.test;

import com.template.Star;
import sun.util.resources.cldr.en.CurrencyNames_en_MT;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xuwuhuang on 2017/9/30.
 */
public class TestCountDown {

    private CountDownLatch start = new CountDownLatch(1);
    private  CountDownLatch  stop = new CountDownLatch(4);


    public static void main(String[] args) throws InterruptedException {
        TestCountDown t= new TestCountDown();

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(t.new Count("a"));
        executorService.submit(t.new Count("b"));
        executorService.submit(t.new Count("c"));
        executorService.submit(t.new Count("d"));

        System.out.println("before");
        Thread.sleep(100);
        t.start.countDown();
        System.out.println("in");
        t.stop.await();
        System.out.println("after");

    }



    class  Count  implements  Runnable{
        String name;
        Count(String name){
            this.name = name;
        }

        @Override
        public void run() {

            try {
                start.await();
                System.out.println(name + "running");
                stop.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "over");

        }
    }


}
