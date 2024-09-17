package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction=session.beginTransaction();

//        NativeQuery query=session.createNativeQuery("SELECT * FROM customer");
//        //insert,Update,Delete,Search By Id
//        query.addEntity(Customer.class);
//
//        List<Customer>personList=query.list();
//        for(Person person : personList){
//            System.out.println(Customer.getId());
//        }

//        NativeQuery query=session.createNativeQuery("INSERT INTO Customer (id, name) VALUES (?, ?)");
//        query.setParameter(1, 2); // Assuming ID is an integer
//        query.setParameter(2, "John Doe"); // Name is a string
//
//        int rowAffected = query.executeUpdate();
//        System.out.println("Row Affected: " + rowAffected);

        // Update
//        NativeQuery query=session.createNativeQuery("UPDATE customer SET name=? WHERE id=?");
//        query.setParameter(1, "Sumimal"); // New name
//        query.setParameter(2, 1); // Customer ID
//
//        int rowAffected = query.executeUpdate();
//        System.out.println("Row Affected: " + rowAffected);

        //Delete
//        NativeQuery query=session.createNativeQuery("DELETE FROM customer WHERE id=?");
//        query.setParameter(1, 2); // Customer ID
//
//        int rowAffected = query.executeUpdate();
//        rowAffected = query.executeUpdate();
//        System.out.println("Row Affected: " + rowAffected);

        //SearchByName
//        NativeQuery<Customer> query = session.createNativeQuery("SELECT * FROM Customer WHERE name = ?", Customer.class);
//        query.setParameter(1, "Sumimal"); // Name is a string
//
//        List<Customer> customerList = query.getResultList();
//        for (Customer customer : customerList) {
//            System.out.println(customer.getId());
//        }

        //JoinQuery between address and customer
        NativeQuery<Object[]> query = session.createNativeQuery("SELECT c.id, c.name, a.city FROM Customer c INNER JOIN Address a ON c.id = a.id");


        List<Object[]> resultList = query.getResultList();
        for (Object[] row : resultList) {
            System.out.println("Customer ID: " + row[0] + ", Name: " + row[1] + ", Address: " + row[2]);
        }

        transaction.commit();
        session.close();

    }
}