package com.annotations.depricatedmethods;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature is running (deprecated)");
    }

    public void newFeature() {
        System.out.println("New feature is running");
    }
}
