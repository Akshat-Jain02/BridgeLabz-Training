package com.annotations.importantmethods;

public class ServiceManager {

    @ImportantMethod
    public void startService() {
        System.out.println("Service started");
    }

    @ImportantMethod(level = "LOW")
    public void logServiceStatus() {
        System.out.println("Logging service status");
    }

    public void stopService() {
        System.out.println("Service stopped");
    }
}
