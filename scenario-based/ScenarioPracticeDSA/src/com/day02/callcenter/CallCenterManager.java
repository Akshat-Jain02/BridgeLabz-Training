package com.day02.callcenter;

import java.util.*;

class CallCenterManager {
	
    private Queue<CustomerCall> regularQueue;
    private PriorityQueue<CustomerCall> vipQueue;
    private Map<String, Integer> callFrequency;
    private int timeCounter;

    public CallCenterManager() {
        regularQueue = new LinkedList<>();
        // VIPs with same arrival time → lexicographically higher name served first
        vipQueue = new PriorityQueue<>((a, b) -> {
            if (a.callTime != b.callTime) {
                return Integer.compare(a.callTime, b.callTime); // earlier first
            }
            return b.name.compareTo(a.name); // higher name first if same time
        });
        callFrequency = new HashMap<>();
        timeCounter = 1;
    }

    public void addCall(String name, boolean isVip) {
        CustomerCall customer = new CustomerCall(name, isVip, timeCounter++);
        
        callFrequency.put(name, callFrequency.getOrDefault(name, 0) + 1);

        if (isVip) {
            vipQueue.offer(customer);
            System.out.println("→ VIP customer added: " + customer);
        } else {
            regularQueue.offer(customer);
            System.out.println("→ Regular customer added: " + customer);
        }
    }

    public void serveNext() {
        if (!vipQueue.isEmpty()) {
            CustomerCall next = vipQueue.poll();
            System.out.println("Serving VIP: " + next);
        } else if (!regularQueue.isEmpty()) {
            CustomerCall next = regularQueue.poll();
            System.out.println("Serving regular: " + next);
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void showStatistics() {
        System.out.println("\n=== Call Statistics (this month) ===");
        if (callFrequency.isEmpty()) {
            System.out.println("No calls recorded yet.");
        } else {
            callFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                    .thenComparing(Map.Entry::getKey))
                .forEach(e -> System.out.printf("%-18s : %d calls%n", e.getKey(), e.getValue()));
        }

        System.out.println("\nQueue Status:");
        System.out.println("VIP queue     : " + vipQueue.size() + " customers");
        System.out.println("Regular queue : " + regularQueue.size() + " customers");
    }
}