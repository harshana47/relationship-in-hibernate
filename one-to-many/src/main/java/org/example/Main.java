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


        Address address = new Address(1,"367/B","Dambulla Rd","Matale");
        Address address1 = new Address(2,"30/2","Olter Salagadu Rd","Panadura");

        List<Address> addressList = new ArrayList<>();
        addressList.add(address);
        addressList.add(address1);

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Kamal");
        customer.setAddressList(addressList);

        address.setCustomer(customer);
        address1.setCustomer(customer);

        session.save(address);
        session.save(address1);
        session.save(customer);

        transaction.commit();
        session.close();
    }
}