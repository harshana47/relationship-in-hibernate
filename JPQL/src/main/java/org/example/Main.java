package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.example.entity.Address;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        //insert
//            Customer customer = new Customer();
//            customer.setId(3);
//            customer.setName("Pamal");
//
//            Address address = new Address();
//            address.setaId(101);
//            address.setNo("123");
//            address.setRoad("Main Street");
//            address.setCity("kadawatha");
//            address.setCustomer(customer);
//
//            session.save(customer);
//            session.save(address);

        //update
//        Customer customer = session.get(Customer.class, 3);
//        customer.setName("Charith");

        //delete
//        Address address = session.get(Address.class, 101);
//        session.delete(address);

        //search
//        Customer customer = session.get(Customer.class, 3);
//        System.out.println(customer);

        Query<Customer> query = session.createQuery(
                "SELECT DISTINCT c FROM Customer c LEFT JOIN FETCH c.addressList",
                Customer.class
        );

        List<Customer> resultList = query.getResultList();

        for (Customer customer : resultList) {
            System.out.println("Customer Name: " + customer.getName());

            if (customer.getAddressList() != null && !customer.getAddressList().isEmpty()) {
                for (Address address : customer.getAddressList()) {
                    System.out.println("  Address ID: " + address.getaId() +
                            ", No: " + address.getNo() +
                            ", Road: " + address.getRoad() +
                            ", City: " + address.getCity());
                }
            }

            System.out.println();
        }

        transaction.commit();
        session.close();
    }
}
