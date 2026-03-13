package problem1.partc;

import java.util.HashSet;

public class FruitTest {
	public static void main(String[] args) {
		Apple a1 = new Apple("American", "red", 1000.0, true);
		Apple a2 = new Apple("Lemon", "yellow", 900.0, false);
		Apple a3 = new Apple("American", "red", 1000.0, true);
		
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a2));
		
		HashSet<Apple> apples = new HashSet<>();
		apples.add(a1);
		apples.add(a3);
		apples.add(a2);
		
		for(Apple apple: apples) {
			System.out.println(apple);
		}
	}
}
