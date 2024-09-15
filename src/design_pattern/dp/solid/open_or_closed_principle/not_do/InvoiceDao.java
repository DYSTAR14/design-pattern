package design_pattern.dp.solid.open_or_closed_principle.not_do;

import design_pattern.dp.solid.open_or_closed_principle.Invoice;

public class InvoiceDao {
	Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		//Save the data into DB 
	}
	
	public void saveToFile(String filename) {
		//Save invoice in the File with the given name
	}


}
