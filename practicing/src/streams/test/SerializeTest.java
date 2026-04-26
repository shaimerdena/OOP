package streams.test;

import streams.helper.ObjectIO;
import streams.model.Product;

public class SerializeTest {
	public static void main(String[] args) {
		String filePath = "/Users/ayaulymshaimerden/eclipse-workspace/practicing/src/streams/file/product.txt";
		Product p1 = new Product("Book", 2650);
		boolean result = ObjectIO.write(p1, filePath);
		if(result == true) {
			System.out.println("The product is stored " + filePath);
		} else {
			System.out.println("Something went wrong");
		}
		
		Product p2 = (Product) ObjectIO.read(filePath);
		
		p2.setName("Book-v2");
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
