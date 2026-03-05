package online_store;

public class ProducTest {
	public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000, Product.Category.ELECTRONICS);
        Product p2 = new Product("Shirt", 50, Product.Category.CLOTHING, 0.15);
        Product p3 = new Product("Book", 20, Product.Category.BOOKS);

        p1.getInfo();
        p2.getInfo();
        p3.getInfo();
    }
}

    