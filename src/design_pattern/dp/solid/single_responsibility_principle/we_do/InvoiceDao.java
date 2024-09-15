package design_pattern.dp.solid.single_responsibility_principle.we_do;

public class InvoiceDao {
	Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		//Save the data into DB 
	}

}
