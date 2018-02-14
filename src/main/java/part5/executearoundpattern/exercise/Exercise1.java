package part5.executearoundpattern.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 
 * Implement a filter method that returns a new list filtering the initial
 * collection using a lambda expression 
 * Then test the implementation using a lambda expression that: 
 * 1- Filtering all empty string 
 * 2- Filtering strings shorter than 3
 * 3- combine both filters
 * 
 * @author aohz
 *
 */
public class Exercise1 {

	public static List filter(List list, Predicate predicate) {
		List results = new ArrayList<>();
		list.forEach(s -> {
			if (predicate.test(s))
				results.add(s);
		});
		return results;
	}

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("aaa", "b", "ccccc", "", "dddddddddd");
		printNoEmptyString(listOfStrings);
		printShorterThan3(listOfStrings);
		printStringsAppliyingBothFilers(listOfStrings);

	}

	public static void printNoEmptyString(List<String> listOfStrings) {
		System.out.println("==========No empty========");
		Predicate<String> predicate = s -> !s.isEmpty();
		filter(listOfStrings,  predicate).forEach(System.out::println);
	}

	public static void printShorterThan3(List<String> listOfStrings) {
		System.out.println("==========Sort String========");
		Predicate<String> predicate = s -> s.length() <= 3;
		filter(listOfStrings, predicate).forEach(System.out::println);;
	}

	public static void printStringsAppliyingBothFilers(List<String> listOfStrings) {
		System.out.println("==========Both========");
		Predicate<String> predicate = s -> !s.isEmpty();
		Predicate<String> predicate2 = s -> s.length() <= 3;

		filter(listOfStrings, 	predicate.and(predicate2)).forEach(System.out::println);;
	}

}
