package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int aId;
    private String no;
    private String road;
    private String city;
    @OneToOne
    private Customer id;

    public Address() {
    }

    public Address(int aId, String no, String road, String city, Customer id) {
        this.aId = aId;
        this.no = no;
        this.road = road;
        this.city = city;
        this.id = id;
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

    public Customer getId() {
        return id;
    }

    public void setId(Customer id) {
        this.id = id;
    }
}
