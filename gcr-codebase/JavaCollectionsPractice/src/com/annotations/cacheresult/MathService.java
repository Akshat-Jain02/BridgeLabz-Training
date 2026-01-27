package com.annotations.cacheresult;

public class MathService {

    @CacheResult
    public int slowSquare(int number) {
        System.out.println("Computing square for " + number);
        return number * number;
    }
}
