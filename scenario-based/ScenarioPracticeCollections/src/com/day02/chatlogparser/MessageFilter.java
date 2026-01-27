package com.day02.chatlogparser;

public interface MessageFilter<T> {
    boolean shouldKeep(T message);
}
