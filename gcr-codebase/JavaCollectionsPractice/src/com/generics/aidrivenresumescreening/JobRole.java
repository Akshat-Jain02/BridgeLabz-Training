package com.generics.aidrivenresumescreening;

abstract class JobRole {
    String title;
    abstract boolean isSuitable(Resume resume);
}