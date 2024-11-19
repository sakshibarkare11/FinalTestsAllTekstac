
public class Bag {
	private String bagName;
	private String category;
	private String color;
	private double price;

	public Bag() {
		super();

	}
	public Bag(String bagName, String category, String color, double price) {
		super();
		this.bagName = bagName;
		this.category = category;
		this.color = color;
		this.price = price;
	}
	public String getBagName() {
		return bagName;
	}
	public void setBagName(String name) {
		this.bagName = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bag [name=" + bagName + ", category=" + category + ", color=" + color + ", price=" + price + "]";
	}



}
