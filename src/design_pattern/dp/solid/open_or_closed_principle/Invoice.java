package design_pattern.dp.solid.open_or_closed_principle;

import design_pattern.dp.solid.single_responsibility_principle.Marker;

public class Invoice {
	private Marker marker;
	private int quantity;
	
	public Invoice(Marker marker, int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	public int calculateTotal() {
		int price = ((marker.getPrice()) * this.quantity);
		return price;
	}

}
