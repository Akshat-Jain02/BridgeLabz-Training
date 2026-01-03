package com.day01.smarthomeautomationsystem;

public class SmartHomeAutomationSystem {
    public static void main(String[] args) {

        Appliance light = new Light("Bedroom");
        Appliance fan = new Fan("Hall");
        Appliance ac = new AC("Living Room");

        UserController controller = new UserController();

        controller.operateAppliance(light);
        controller.adjustAppliance((Adjustable) light, 80);

        controller.operateAppliance(fan);
        controller.adjustAppliance((Adjustable) fan, 3);

        controller.operateAppliance(ac);
        controller.adjustAppliance((Adjustable) ac, 22);

        controller.stopAppliance(ac);
    }
}
