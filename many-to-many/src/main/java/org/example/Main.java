package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Kamal");

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setName("Amal");

        List<Customer>customerList= new ArrayList<>();
        customerList.add(customer);
        customerList.add(customer1);

        Address address = new Address(1,"367","Kandy Rd","Kadawatha");
        Address address1 = new Address(2,"337","Dambulla Rd","Matale");

        List<Address>addressList=new ArrayList<>();
        addressList.add(address);
        addressList.add(address1);

        customer.setAddressList(addressList);
        customer1.setAddressList(addressList);

        address.setCustomers(customerList);
        address1.setCustomers(customerList);

        session.save(address);
        session.save(address1);
        session.save(customer);
        session.save(customer1);

        transaction.commit();
        session.close();
    }
}