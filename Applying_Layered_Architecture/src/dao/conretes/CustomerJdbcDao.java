package dao.conretes;

import dao.abstracts.ICustomerDao;
import entity.Customer;

/**
 * @author Nida Başer
 * May 2024
 */

public class CustomerJdbcDao implements ICustomerDao {

    public boolean saveCustomer(Customer customer) {
        System.out.println("JDBC DAO layer worked");
        System.out.println("Customer added to database");
        return true;
    }

    public Customer getById(int id){
        System.out.println("JDBC DAO layer worked");
        System.out.println("Customer selected from the database");
        return new Customer();
    }

}
