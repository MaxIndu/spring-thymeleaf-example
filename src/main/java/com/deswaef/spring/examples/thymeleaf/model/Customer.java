package com.deswaef.spring.examples.thymeleaf.model;

import java.util.Calendar;

public class Customer {
    private int id;
    private String name;
    private Calendar Date;

    public Customer(int id, String name, Calendar date) {
        this.id = id;
        this.name = name;
        Date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return Date;
    }

    public void setDate(Calendar date) {
        Date = date;
    }


}
