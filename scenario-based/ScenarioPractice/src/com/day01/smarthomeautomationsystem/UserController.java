package com.day01.smarthomeautomationsystem;
public class UserController {

    public void operateAppliance(Appliance appliance) {
        appliance.turnOn();
    }

    public void stopAppliance(Appliance appliance) {
        appliance.turnOff();
    }

    public void adjustAppliance(Adjustable appliance, int value) {
        appliance.adjust(value);
    }
}
