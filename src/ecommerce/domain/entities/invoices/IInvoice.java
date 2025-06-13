package ecommerce.domain.entities.invoices;

import ecommerce.building_block.shared.enums.InvoiceStatus;
import ecommerce.domain.entities.base.IEntity;
import ecommerce.domain.entities.customers.Customer;

public interface IInvoice extends IEntity {

    void setName(String name);

    void setCustomerId(int customerId);

    void setInvoiceStatus(InvoiceStatus invoiceStatus);

    void setCustomer(Customer customer);

    Customer getCustomer();

    InvoiceStatus getInvoiceStatus();

    int getCustomerId();


    String getName();

    void display();
}
