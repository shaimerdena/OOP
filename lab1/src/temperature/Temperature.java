package temperature;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		this(0.0, 'C');
	}
	
	public Temperature(double value) {
		this(value, 'C');
	}
	
	public Temperature(char scale) {
		this(0.0, scale);
	}
	
	public Temperature(double value, char scale) {
		setBoth(value, scale);
	}
	
    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale.");
        }
    }

    public void setBoth(double value, char scale) {
        setValue(value);
        setScale(scale);
    }
    
    public double getCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5 * (value - 32) / 9;
        }
    }

    public double getFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9 * value / 5) + 32;
        }
    }
    
    public double getValue() {
        return value;
    }

    public char getScale() {
        return scale;
    }
    
    @Override
    public String toString() {
        return String.format("%.2f°%s", value, scale);
    }
    
    public void printValue() {
    	System.out.println(this.toString());
    }
}
