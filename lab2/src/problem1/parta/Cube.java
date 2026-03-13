package problem1.parta;

public class Cube extends Shape3D{
	private double length;
	
	public Cube(double l) {
		this.length = l;
	}
	
	@Override
	public double volume() {
		return Math.pow(length, 3);
	}

	@Override
	public double surfaceArea() {
		return 6 * length * length;
	}
	
}
