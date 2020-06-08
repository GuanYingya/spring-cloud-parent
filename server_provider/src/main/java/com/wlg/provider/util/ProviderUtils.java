package com.wlg.provider.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ProviderUtils
 * @Description: TODO
 * @Author Guanyingya
 * @Date 2020/6/4
 * @Version V1.0
 **/
public class ProviderUtils implements Runnable {


    public static ReentrantLock lock = new ReentrantLock();
    public static Condition condition = lock.newCondition();


    public void run() {

        try {
            lock.lock();
            condition.await();
            System.out.println("Thread is going on");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }


    public static void main(String[] args) {


        Collections.synchronizedMap(new HashMap());


        ProviderUtils p = new ProviderUtils();

        Thread thread = new Thread(p);

        thread.start();
        try {
            Thread.sleep(2000);
            lock.lock();
            condition.signal();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
