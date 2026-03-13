package problem1.parta;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape3D> arr = new ArrayList<>();
		
		Cylinder c1 = new Cylinder(3, 5);
		Cube c2 = new Cube(3);
		Sphere s1 = new Sphere(2);
 
		arr.add(c1);
		arr.add(c2);
		arr.add(s1);
		
		for(Shape3D s : arr) {
			System.out.println(s.surfaceArea());
			System.out.println("\n");
			System.out.println(s.volume());
			System.out.println("\n");
		}
	}

}
