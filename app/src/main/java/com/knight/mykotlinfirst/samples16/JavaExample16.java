package com.knight.mykotlinfirst.samples16;

/**
 * description: ${TODO}
 * autour: Knight
 * new date: 2018/5/11 on 14:45
 * e-mail: 37442216knight@gmail.com
 * update: 2018/5/11 on 14:45
 * version: v 1.0
 */
public class JavaExample16 {
    /**
     * 定义策略接口
     */
    public interface Strategy {
        void doSth();
    }

    /**
     * A策略
     */
    public static class AStrategy implements Strategy {
        @Override
        public void doSth() {
            System.out.println("Do A strategy");
        }
    }

    /**
     * B策略
     */
    public static class BStrategy implements Strategy {
        @Override
        public void doSth() {
            System.out.println("Do B  Strategy");
        }
    }

    public static class Worker {
        private Strategy strategy;

        public Worker(Strategy strategy) {
            this.strategy = strategy;
        }

        public void work() {
            System.out.println("START");
            if (strategy != null) {
                strategy.doSth();
            }
            System.out.println("END");
        }
    }

    public static  void testStrategy() {
        Worker worker1 = new Worker(new AStrategy());
        Worker worker2 = new Worker(new BStrategy());
        worker1.work();
        worker2.work();
    }

    public static void  main(String agrs[]){
        testStrategy();
    }
}
