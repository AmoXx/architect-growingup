package com.xinlizz.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 测试类
 * @Author xinlizz
 * @Date ${DATE}
 */
public class DemoTest {
    public static void main(String[] args) throws Exception {
//        System.out.println("正常运行（5次）...");
//        noSortRun();
        System.out.println("join实现有序（5次）...");
        joinRun();
//        System.out.println("Executors实现有序（5次）...");
//        executorRun();
    }

    /**
     * 正常运行（无序）
     *
     * @return void
     */
    private static void noSortRun() {
        new Thread(new TestThread()).start();
        new Thread(new TestThread()).start();
        new Thread(new TestThread()).start();
        new Thread(new TestThread()).start();
        new Thread(new TestThread()).start();
    }

    /**
     * join实现有序
     *
     * @return void
     */
    private static void joinRun() throws Exception {
        Thread t1 = new Thread(new TestThread());
        t1.start();
        //join()实现线程有序
        t1.join();
        Thread t2 = new Thread(new TestThread());
        t2.start();
        t2.join();
        Thread t3 = new Thread(new TestThread());
        t3.start();
        t3.join();
        Thread t4 = new Thread(new TestThread());
        t4.start();
        t4.join();
        Thread t5 = new Thread(new TestThread());
        t5.start();
    }

    /**
     * executors实现有序
     *
     * @return void
     */
    private static void executorRun() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new TestThread());
        executorService.submit(new TestThread());
        executorService.submit(new TestThread());
        executorService.submit(new TestThread());
        executorService.submit(new TestThread());
        executorService.shutdown();
    }
}

/**
 * 用于测试的线程类
 */
class TestThread implements Runnable {

    /**
     * 打印当前线程名称
     *
     * @return void
     */
    @Override
    public void run() {
        System.out.println("This thread name is " + Thread.currentThread().getName());
    }
}