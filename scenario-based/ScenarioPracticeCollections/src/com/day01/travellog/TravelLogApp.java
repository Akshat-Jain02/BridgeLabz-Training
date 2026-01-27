package com.day01.travellog;

import java.io.IOException;
import java.time.LocalDate;

public class TravelLogApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TravelLogManager manager = new TravelLogManager();

		// sample folder
		String folder = "samplefiles/trips";

		// add sample trips
		manager.addTrip(new Trip("1", "Paris", "France", LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 10),
				"Visited Eiffel in Paris"), folder);
		manager.addTrip(new Trip("2", "Berlin", "Germany", LocalDate.of(2025, 2, 1), LocalDate.of(2025, 2, 3),
				"Saw wall in Berlin"), folder);
		manager.addTrip(new Trip("3", "Paris", "France", LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 8),
				"Back to Paris and Louvre"), folder);
		manager.addTrip(new Trip("4", "Rome", "Italy", LocalDate.of(2025, 4, 1), LocalDate.of(2025, 4, 12),
				"Colosseum in Rome"), folder);
		manager.addTrip(
				new Trip("5", "Madrid", "Spain", LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 4), "Prado in Madrid"),
				folder);

		// load back
		manager.loadTrips(folder);

		// show summaries
		System.out.println("All cities from notes: \n" + manager.findCities());

		System.out.println("\nLong trips (>5 days): ");
		System.out.println("------------------------------------------------------------");
		for (Trip t : manager.longTrips()) {
			System.out.println(t);
		}
		System.out.println("------------------------------------------------------------");

		System.out.println("\nUnique countries: \n" + manager.uniqueCountries());
		System.out.println("\nTop 3 cities: \n" + manager.topCities());
	}
}