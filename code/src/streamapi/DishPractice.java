package streamapi;

import java.util.Arrays;

import java.util.List;
import java.util.Locale.FilteringMode;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

import streamapi.Dish.Type;
/*
 Q1. select vegetarians menu?
 Q2. select all non vegetarians menu?
 Q3. sort menu by calories?
 Q4. group menu by type?
 Q5. select highest calories meal?
 Q6. select lowest calories meal?
 Q7. select highest calories vegetarian meal?
 Q8. select highest calories non vegetarian meal?
 Q9. select first three dishes that have more than 300 calories?
 Q10. find out whether the menu is healthy (all dishes are below 100 calories)?
 Q11. find out whether the menu is not healthy(calories>=100)?
 Q12. find a dish that is vegetarian?
 Q13
 
 */

public class DishPractice {

	public static List<Dish> getMenu() {
		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		return menu;

	}

	public static void main(String[] args) {
		// Q1. select vegetarians menu?
		getMenu().stream().filter(d -> {
			return d.isVegetarian() == true;
		}).collect(toList()).forEach(System.out::println);
		// Q2. select all non vegetarians menu?
		// getMenu().stream().filter(t->{return
		// t.isVegetarian()==false;}).collect(Collectors.toList()).forEach(System.out::println);
		Stream<Dish> stream = getMenu().stream();
		Map<Type, List<Dish>> collect = stream.collect(groupingBy(Dish::getType));
		/**
		 * for(Map.Entry<Type, List<Dish>> entry:collect.entrySet()) {
		 * System.out.println(entry.getKey()+ " " +entry.getValue()); }
		 **/
		Map<Type, List<Dish>> collect2 = getMenu().stream().collect(groupingBy(d -> d.getType()));
		// collect.entrySet().forEach((key,value)->System.out.println(key +" "+value););
		// collect2.forEach((k,v)->System.out.println(k+ " "+v));
		// q. group the menu by type having more than 500 calories?
		// getMenu().stream().filter(p->{return
		// p.getCalories()>500;}).collect(Collectors.groupingBy(Dish::getType)).forEach((key,value)->System.out.println(key+
		// " "+value));
//	getMenu().stream().collect(groupingBy(Dish::getType,filtering(p->{return p.getCalories()>500;}),toList()));
		Map<Type, Map<Boolean, List<Dish>>> collect3 = getMenu().stream()
				.collect(groupingBy(Dish::getType, groupingBy(Dish::isVegetarian)));
		for (Map.Entry<Type, Map<Boolean, List<Dish>>> e : collect3.entrySet()) {

			for (Map.Entry<Boolean, List<Dish>> e1 : e.getValue().entrySet()) {
				System.out
						.println("Type : " + e.getKey() + " isVegeterian :" + e1.getKey() + " Menu :" + e1.getValue());
			}
		}
		collect3.forEach((k1, v1) -> v1.forEach((k2, v2) -> System.out.println((k1 + " " + k2 + " " + v2))));
		Map<Boolean, List<Dish>> collect4 = getMenu().stream().collect(partitioningBy(d -> d.getCalories() > 500));
		collect4.forEach((k, v) -> System.out.println(k + " " + v));
		for (Map.Entry<Boolean, List<Dish>> a : collect4.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}
		getMenu().stream().filter(d -> d.getCalories() > 500).peek(System.out::println).collect(toList());
		Map<Type, Long> collect5 = getMenu().stream().collect(groupingBy(Dish::getType, counting()));
		collect5.forEach((k, v) -> System.out.println(k + " " + v));

		// Q. Print the length of the each word of the array ?
		String[] s = { "hello", "world", "java", "servelet", "jsp" };
		Stream<String> stream2 = Arrays.stream(s);
		stream2.map(String::length).collect(toList()).forEach(System.out::println);

		// Q. Print the characters of the words present in the array ?
		String[] arr = { "hello", "world" };
		Stream<String> stream3 = Arrays.stream(arr);
		Stream<String[]> map = stream3.map(w -> w.split(""));
		// List<Stream<String>> collect8 =
		// map.map(Arrays::stream).distinct().collect(toList());
		List<String> collect9 = map.flatMap(Arrays::stream).distinct().collect(toList());
		System.out.println(collect9);
		// stream3.flatMap(w->w.split(""));
		/**
		 * Diff between map and flatmap? map:- It transforms into a seprate stream
		 * everytime but flatmap transforms into single stream
		 */
		// Q. Print the square of the no.present in the array ?
		int[] ar = { 1, 2, 3, 4, 5 }; // output 1 4 9 16 25
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> collect8 = asList.stream().map(i -> i * i).collect(toList());
		System.out.println(collect8);

		// Q. You have two list ,list1 contains 1,2,3 and list2 contain 3,4.
		// 1.You should return pairs of numbers like (1,3),(1,4) ?h
		// 2.Extract those pairs whose sum is divisible by 3.
		List<Integer> asList1 = Arrays.asList(1, 2, 3);
		List<Integer> asList2 = Arrays.asList(3, 4);
		List<int[]> collect10 = asList1.stream().flatMap(i -> asList2.stream().map(j -> new int[] { i, j }))
				.collect(toList());
		collect10.stream().forEach(k -> System.out.print("(" + k[0] + "," + k[1] + ")"));
		System.out.println();
		List<int[]> collect11 = asList1.stream()
				.flatMap(i -> asList2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
				.collect(toList());
		collect11.stream().forEach(k -> System.out.println("(" + k[0] + "," + k[1] + ")"));

//	Q. Check all the dishes having calories<1000 ?
		boolean allMatch = getMenu().stream().allMatch(i -> i.getCalories() < 1000);
		System.out.println(allMatch);

//  Q. Check none of the dish having calories >1000 ?
		boolean noneMatch = getMenu().stream().noneMatch(i -> i.getCalories() > 1000);
		System.out.println(noneMatch);

//  Q.Any dish having calories <500 ?
		boolean anyMatch = getMenu().stream().anyMatch(i -> i.getCalories() < 500);
		System.out.println(anyMatch);

//  Q. find any vegetarian dish ?
		Dish dish1 = getMenu().stream().filter(d -> d.isVegetarian()).findAny().get();
		System.out.println(dish1);
//      Optional<Dish> findAny = getMenu().stream().filter(d->d.isVegetarian()).findAny();

//  Q. sum of the calories of the dishes ?
		Integer reduce = getMenu().stream().map(Dish::getCalories).reduce(0, (a, b) -> a + b);
		System.out.println();
		Optional<Integer> reduce2 = getMenu().stream().map(Dish::getCalories).reduce(Integer::min);
		System.out.println(reduce2);
//      T reduce(T identity,BinaryOperator<T> accumulator);

//		Numeric Stream Api
		int sum = getMenu().stream().mapToInt(Dish::getCalories).sum();
		System.out.println(sum);

	}

}
