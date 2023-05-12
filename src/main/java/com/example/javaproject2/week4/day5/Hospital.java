package com.example.javaproject2.week4.day5;

public class Hospital {
    private String name;
    private String websiteaddr;
    private Address address;

    public Hospital(String name, String phoneNumber, Address address) {
        this.name = name;
        this.websiteaddr = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteaddr() {
        return websiteaddr;
    }

    public Address getAddress() {
        return address;
    }
}
