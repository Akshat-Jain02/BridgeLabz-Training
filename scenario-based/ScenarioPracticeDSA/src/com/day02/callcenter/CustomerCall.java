package com.day02.callcenter;

class CustomerCall {
	
    String name;
    boolean isVip;
    int callTime; // simple timestamp for ordering (demo)

    public CustomerCall(String name, boolean isVip, int callTime) {
        this.name = name;
        this.isVip = isVip;
        this.callTime = callTime;
    }

    @Override
    public String toString() {
        return (isVip ? "[VIP] " : "") + name + " (called at " + callTime + ")";
    }
}