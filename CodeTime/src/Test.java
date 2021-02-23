import java.util.Date;
import org.apache.commons.lang.time.StopWatch;

public class Test {
    public static void main(String[] args) {
        //-----------method1------------------
//        // 开始时间
//        long startTime = System.currentTimeMillis();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // 结束时间
//        long endTime = System.currentTimeMillis();
//        // 统计执行用时
//        System.out.println("执行用时: " + (endTime - startTime) + "毫秒");

        //----------method2-------------------
//        // 开始时间
//        long startTime = System.nanoTime();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // 结束时间
//        long endTime = System.nanoTime();
//        // 统计执行用时
//        System.out.println("执行用时: " + (endTime - startTime) + "纳秒");

        //---------method3--------------------
//        // 开始时间
//        Date startDate = new Date();
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // 结束时间
//        Date endDate = new Date();
//        // 统计执行用时
//        System.out.println("执行用时: " + (endDate.getTime() - startDate.getTime()) + "毫秒");

        //---------method4------------------
//        StopWatch stopWatch = new StopWatch();
//        // 开始时间
//        stopWatch.start();
//        // 执行时间（1s）
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // 结束时间
//        stopWatch.stop();
//        System.out.println("执行用时: " + stopWatch.getTime() + "毫秒");
    }
}
