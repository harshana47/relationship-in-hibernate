package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.List;
//Invers side
@Entity
public class Address {
    @Id
    private int aId;
    private String no;
    private String road;
    private String city;
    @ManyToMany(mappedBy = "addressList")
    private List<Customer> customers;

    public Address() {
    }

    public Address(int aId, String no, String road, String city) {
        this.aId = aId;
        this.no = no;
        this.road = road;
        this.city = city;
        this.customers = customers;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Address{" +
                "aId=" + aId +
                ", no='" + no + '\'' +
                ", road='" + road + '\'' +
                ", city='" + city + '\'' +
                ", customers=" + customers +
                '}';
    }
}
