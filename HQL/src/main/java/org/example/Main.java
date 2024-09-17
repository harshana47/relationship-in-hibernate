package org.example;

import jakarta.persistence.QueryHint;
import org.example.config.FactoryConfiguration;
import org.example.entity.Address;
import org.example.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

//        Query query = session.createQuery("FROM Customer");
//        List<Customer>customerList = query.list();
//        for(Customer customer : customerList){
//            System.out.println(customer.getId());
//        }

//        Query query1 = session.createQuery("FROM Customer WHERE id = :customerId");
//        query1.setParameter("customerId", 1);
//
//        Customer customer= (Customer)query1.uniqueResult();
//        System.out.println(customer.getName());
//
//        transaction.commit();
//        session.close();
//    }

//        Query query1 = session.createQuery("select name FROM Customer WHERE id = :customerId");
//        query1.setParameter("customerId", 1);
//
//        // Execute the query and get the single result
//        String name = (String) query1.uniqueResult();
//        System.out.println(name);

//        Query query1 = session.createQuery("select id, name FROM Customer WHERE id = :customerId");
//        query1.setParameter("customerId", 1);

//        List<Object[]> results = query1.getResultList();

//        for (Object[] result : results) {
//            Integer id = (Integer) result[0];
//            String name = (String) result[1];
//            System.out.println(result[0]);
//            System.out.println(result[1]);
//        }

//        Query query1 = session.createQuery("Insert into Customer (id, name) values (:customerId, :name)");
//        query1.setParameter("customerId", 2);
//        query1.setParameter("name", "Nimal");
//
//        int rowsAffected = query1.executeUpdate();
//        System.out.println("Rows affected: " + rowsAffected);

//        Query query1 = session.createQuery("UPDATE Customer SET name = :name WHERE id = :customerId");
//        query1.setParameter("name", "Pamal");
//        query1.setParameter("customerId", 1);
//        int rowsAffected = query1.executeUpdate();
//        System.out.println("Rows affected: " + rowsAffected);

//        Query query1 = session.createQuery("DELETE FROM Customer WHERE id = :customerId");
//        query1.setParameter("customerId", 2);
//        int rowsAffected = query1.executeUpdate();
//        System.out.println("Rows affected: " + rowsAffected);

        transaction.commit();
        session.close();
    }
}