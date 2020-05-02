package Dao;

import Customers.Customer;
//import Customers.GeneralList;
import java.util.ArrayList;


public interface CustomerDao { 
    int insert(Customer obj);
    int delete(Customer obj);
    Customer findById(int id);
    GeneralList<Customer> findByName(String name);
ArrayList<Customer> printAllCustomers();

}
