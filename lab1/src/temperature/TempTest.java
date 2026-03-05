package temperature;

public class TempTest {
	public static void main(String[] args) {
		Temperature t1 = new Temperature();
	    Temperature t2 = new Temperature(50.0);
	    Temperature t3 = new Temperature('F');
	    Temperature t4 = new Temperature(31.0, 'F');
	    
	    
	    t1.setBoth(33.0, 'F');
	    System.out.println(t2.getFahrenheit());
	    System.out.println(t3.getCelsius());
	    
	    t1.printValue();
	    t2.printValue();
	    t3.printValue();
	    t4.printValue();
	}
}
