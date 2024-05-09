package dao.conretes;

import dao.abstracts.ICustomerDao;
import entity.Customer;

/**
 * @author Nida Başer
 * May 2024
 */

public class CustomerHibernateDao implements ICustomerDao {

    @Override
    public boolean saveCustomer(Customer customer) {
        System.out.println("Hibernate DAO layer worked");
        System.out.println("Customer added to database");
        return true;
    }

    @Override
    public Customer getById(int id) {
        System.out.println("Hibernate DAO layer worked");
        System.out.println("Customer selected from the database");
        return new Customer();
    }
}
