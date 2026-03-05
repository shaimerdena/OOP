package practice2;

public class TimeTest {
	public static void main(String args[]) {
		Time t = new Time(11, 5, 6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		Time t2 = new Time(8, 24, 33);
		t.add(t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
	}
}