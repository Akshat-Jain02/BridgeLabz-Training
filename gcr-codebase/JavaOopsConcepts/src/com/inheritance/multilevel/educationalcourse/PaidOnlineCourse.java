package com.inheritance.multilevel.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {
	private double fee;
    private double discount;  // percentage

    public PaidOnlineCourse(String courseName, int duration, String platform,
                            boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Original Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getFinalPrice());
        System.out.println("Type: Paid Online Course");
        System.out.println("---");
    }
}
