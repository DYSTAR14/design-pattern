package design_pattern.dp.solid.open_or_closed_principle;

public class Marker {
	private String name;
	private String color;
	private int year;
	private int price;
	
	public Marker(String name, String color, int year, int price) {
		this.name = name;
		this.color = color;
		this.year = year;
		this.setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 

}
