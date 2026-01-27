package com.annotations.cacheresult;
public class CacheResultApp {

    public static void main(String[] args) {

        MathService service = new MathService();

        System.out.println(CacheExecutor.execute(service, "slowSquare", 5));
        System.out.println(CacheExecutor.execute(service, "slowSquare", 5));
        System.out.println(CacheExecutor.execute(service, "slowSquare", 10));
        System.out.println(CacheExecutor.execute(service, "slowSquare", 10));
    }
}
