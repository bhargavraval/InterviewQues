package javaQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValuesDescOrder1 {

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
		// Entry set of map
		Set<Entry<Integer, String>> entrySet = map.entrySet();

		// Create a list of elements of hashmap
		List<Map.Entry<Integer, String>> list = new LinkedList<>(entrySet);

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		});

		// put data from sorted list to a new hashmap
		Map<Integer, String> sortedMap = new LinkedHashMap<>();

		for (Map.Entry<Integer, String> aa : list) {
			sortedMap.put(aa.getKey(), aa.getValue());
		}
		return sortedMap;
	}

}
