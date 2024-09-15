package design_pattern.dp.solid.open_or_closed_principle.we_do;

import design_pattern.dp.solid.open_or_closed_principle.Invoice;

public interface InvoiceDao {
	void save(Invoice invoice);
}
