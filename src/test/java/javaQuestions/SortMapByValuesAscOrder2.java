package javaQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValuesAscOrder2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "India");
		map.put(1, "USA");
		map.put(3, "Australia");
		map.put(4, "India");
		System.out.println("Map before sort: " + map);
		System.out.println("Map after sort: " + sortByValue(map));
	}

	private static Map<Integer, String> sortByValue(Map<Integer, String> map) {
		// Create a list of values of hashmap
		List<String> list = new LinkedList<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			list.add(entry.getValue());
		}

		// Sort the list
		Collections.sort(list);

		// put data from sorted list to a new hashmap
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (String str : list) {
			for (Entry<Integer, String> entry : map.entrySet()) {
				if (entry.getValue().equals(str)) {
					sortedMap.put(entry.getKey(), str);
				}
			}
		}
		return sortedMap;
	}

}
