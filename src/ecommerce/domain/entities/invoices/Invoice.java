package ecommerce.domain.entities.invoices;

import ecommerce.building_block.shared.enums.InvoiceStatus;
import ecommerce.domain.entities.base.Entity;
import ecommerce.domain.entities.customers.Customer;
import ecommerce.domain.entities.orders.Order;

public class Invoice extends Entity implements IInvoice {

    private String name;
    private int customerId;
    private int orderId;
    private InvoiceStatus invoiceStatus;
    private double totalPrice;
    private final double profit;
    private Customer customer;
    private Order order;

    public Invoice(String name, int customerId, int orderId, InvoiceStatus invoiceStatus, double totaPrice, double profit, Customer customer, Order order) {
        this.name = name;
        this.customerId = customerId;
        this.orderId = orderId;
        this.invoiceStatus = invoiceStatus;
        this.totalPrice = totalPrice;
        this.profit = profit;
        this.customer = customer;
        this.order = order;
    }

    public double getProfit() {
        return profit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Order getOrder() {
        return order;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public int getCustomerId() {
        return customerId;
    }


    public String getName() {
        return name;
    }

    @Override
    public void display() {
        System.out.println("Invoice information =>  " + "Name: " + name + " status: " + invoiceStatus + " customer: " + customer.getName());
    }
}
