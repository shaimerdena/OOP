package practice2;

public class StarTriangle {
	private String structure;
	private int width;
	private String symbol;
//	symbol [*] [-]


	public StarTriangle(int width, String symbol) {
		this.width = width;
		this.symbol = symbol;
		construct(this.width, this.symbol);
//		this.construct(this.width);
	}

//	setWidth() this.construct(this.width);
	public void setWidth(int width, String symbol) {
		this.width = width;
		construct(this.width, this.symbol);
	}

	public void setSymbol(String symbol) {
	    this.symbol = symbol;
	    construct(this.width, this.symbol);
	}

	public void construct(int width, String symbol) {
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=width; i++) {
			for(int j=0; j<i; j++) {
				sb.append("[").append(symbol).append("]");
			}
			sb.append("\n");
		}
		this.structure = sb.toString();
	}
	// method - construct - void, String -> structure

	@Override
	public String toString() {
		return structure;
	}
}