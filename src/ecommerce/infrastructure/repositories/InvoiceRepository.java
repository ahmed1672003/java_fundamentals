package ecommerce.infrastructure.repositories;

import ecommerce.domain.entities.invoices.IInvoiceRepository;
import ecommerce.domain.entities.invoices.Invoice;
import ecommerce.infrastructure.context.DummyDbContext;

final class InvoiceRepository extends Repository<Invoice> implements IInvoiceRepository {
    public InvoiceRepository(DummyDbContext context) {
        super(context);
    }
}
