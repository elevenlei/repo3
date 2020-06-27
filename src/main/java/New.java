//import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class New {
    public static ThreadPoolExecutor pool  = new ThreadPoolExecutor(2, 3, 10L, TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(10));
    public static void main(String[] args) {
        pool.setCorePoolSize(5);
        int i;
        for (i=0;i<20;i++){
            Thread thread=new Thread();
            pool.execute(thread);
            System.out.println("线程"+i+"开始运行");
        }
        pool.shutdown();
        System.out.println("hello");
    }
}
