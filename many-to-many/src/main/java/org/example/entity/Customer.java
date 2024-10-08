package org.example.entity;

import jakarta.persistence.*;

import java.util.List;
//Owners end
@Entity
public class Customer {
    @Id
    private int id;
    private String name;
    @ManyToMany
    private List<Address> addressList;

    public Customer() {
    }

    public Customer(int id, String name, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.addressList = addressList;
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

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressList=" + addressList +
                '}';
    }
}
