package javaQuestions;

public class SortStringArrayDesc {

	public static void main(String[] args) {

		String[] cities = { "Baroda", "Surat", "Ahmedabad", "Rajkot", "Jamnagar" };

		String[] sortedCities = sortArray(cities);

		for (String str : sortedCities) {
			System.out.print(str + " ");
		}

	}

	private static String[] sortArray(String[] cities) {

		String temp = "";

		for (int i = 0; i < cities.length; i++) {
			for (int j = i + 1; j < cities.length; j++) {
				if (cities[i].compareTo(cities[j]) < 0) {
					temp = cities[j];
					cities[j] = cities[i];
					cities[i] = temp;
				}
			}
		}

		return cities;

	}

}
