package online_store;

public class Product {
	enum Category{
		ELECTRONICS(0.05), 
	    CLOTHING(0.10), 
	    BOOKS(0.0),
	    ACCESSORIES(0.02),
	    SPORT(0.15);
		
		private final double defaultDiscount;
		Category(double defaultDiscount){
			this.defaultDiscount = defaultDiscount;
		}
		
		public double getDefaultDiscount() {
	        return defaultDiscount;
	    }
	}
	private static final double TAX_RATE = 0.18;
	private static int totalProducts = 0;
	private final String id;
	private String name;
	private double price;
	private Category category;
	private double discount;
	
	{
		totalProducts++;
		id = "PR80" + totalProducts;
	}
	
	public Product(String name) {
		this.name = name;
		this.discount = 0.0;
	}
	
	public Product(String name, double price, Category category) {
		this(name);
		if(price < 0) this.price = 0;
		else this.price = price;
		this.category = category;
		this.discount = category.getDefaultDiscount();
	}

	public Product(String name, double price, Category category, double discount) {
		this(name, price, category);
		if(discount < 0) this.discount = 0;
		else this.discount = discount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) System.out.println("Invalid input.");
		else this.price = price;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}
	
	public void setDiscount(double discount) {
		if(discount < 0) System.out.println("Invalid input.");
		else this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}

	public double getFinalPrice() {
		return price + price * TAX_RATE - price * discount;
	}

	@Override
	public String toString() {
	    return "Product: " + this.id + " - " + this.name + " - " +
	           this.category + " - Final Price: " + getFinalPrice();
	}
	
	public void getInfo() {
		System.out.println(this.toString());
	}
}
