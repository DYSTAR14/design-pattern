package design_pattern.dp.solid.open_or_closed_principle.we_do;

import design_pattern.dp.solid.open_or_closed_principle.Invoice;

public class FileInvoiceDao implements InvoiceDao{

	@Override
	public void save(Invoice invoice) {
		//Save invoice in the File with the given name	
	}

}
