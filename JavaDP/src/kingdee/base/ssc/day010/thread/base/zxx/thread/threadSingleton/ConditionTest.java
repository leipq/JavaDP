package kingdee.base.ssc.day010.thread.base.zxx.thread.threadSingleton;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
    public static void main(String[] args) {
        Puter puter = new Puter();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        puter.put1("zhangxiaoxiang");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        puter.put2("fanglixun");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        puter.put3("lihuoming");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
    static class Puter{
        Lock lock = new ReentrantLock();
        Condition condition1 = lock.newCondition();
        Condition condition2 = lock.newCondition();
        Condition condition3 = lock.newCondition();
        int x = 1;

        public void put1(String name) throws InterruptedException {
            try{
                lock.lock();
                while (x!=1){
                    condition1.await();
                }
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
                x = 2;
                condition2.signal();
            }finally {
                lock.unlock();
            }
        }
        public void put2(String name) throws InterruptedException {
            try{
                lock.lock();
                while (x!=2){
                    condition2.await();
                }
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
                x = 3;
                condition3.signal();
            }finally {
                lock.unlock();
            }
        }
        public void put3(String name) throws InterruptedException {
            try{
                lock.lock();
                while (x != 3){
                    condition3.await();
                }
                for (int i = 0; i < name.length(); i++) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
                x = 1;
                condition1.signal();
            }finally {
                lock.unlock();
            }
        }
    }
}
