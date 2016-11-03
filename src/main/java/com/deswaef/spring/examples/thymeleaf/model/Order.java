package com.deswaef.spring.examples.thymeleaf.model;

import java.util.Calendar;
import java.util.Set;

public class Order {
    private int id;
    private Calendar date;
    private Customer customer;
    private Set<OrderLine> orderLines;

    public Order(int id, Calendar date, Customer customer, Set<OrderLine> orderLines) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.orderLines = orderLines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(Set<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
