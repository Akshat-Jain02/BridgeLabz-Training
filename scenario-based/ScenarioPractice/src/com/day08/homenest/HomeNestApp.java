
package com.day08.homenest;

public class HomeNestApp {
	public static void main(String[] args) {
		System.out.println("===== HomeNest Smart Home =====\n");

		Light livingRoomLight = new Light("LIV-LT-01");
		Camera frontDoorCam = new Camera("ENT-CAM-02");
		Thermostat bedroomAC = new Thermostat("BED-AC-03");
		Lock mainDoorLock = new Lock("MAIN-LOCK-04");

		// Polymorphism
		IControllable[] devices = { livingRoomLight, frontDoorCam, bedroomAC, mainDoorLock };

		System.out.println("--- Turning everything ON ---");
		for (IControllable dev : devices) {
			dev.turnOn();
		}

		// Light-specific
		livingRoomLight.setBrightness(80);

		// Camera-specific
		frontDoorCam.startRecording();

		// Thermostat-specific
		bedroomAC.setTemperature(22.5);

		System.out.println("\n--- Current status & energy ---");
		for (SmartDevice dev : new SmartDevice[] { livingRoomLight, frontDoorCam, bedroomAC, mainDoorLock }) {
			System.out.println(dev);
		}

		System.out.println("\nTotal energy used by light + AC = "
				+ String.format("%.2f kWh", livingRoomLight.plusEnergy(bedroomAC)));

		System.out.println("\n--- Reset all devices ---");
		for (IControllable dev : devices) {
			dev.reset();
		}

		System.out.println("\n--- Final status ---");
		for (SmartDevice dev : new SmartDevice[] { livingRoomLight, frontDoorCam, bedroomAC, mainDoorLock }) {
			System.out.println(dev);
		}
	}
}