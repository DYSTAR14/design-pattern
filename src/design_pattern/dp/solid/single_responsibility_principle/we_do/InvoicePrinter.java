package design_pattern.dp.solid.single_responsibility_principle.we_do;

public class InvoicePrinter {
	Invoice invoice; 
	
	InvoicePrinter(Invoice invoice){
		this.invoice = invoice;
	}
	
	public void printInvoice() {
		//Print the Invoice
	}

}
