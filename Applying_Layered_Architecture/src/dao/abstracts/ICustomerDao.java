package dao.abstracts;

import entity.Customer;

/**
 * @author Nida Başer
 * May 2024
 */

public interface ICustomerDao {

    boolean saveCustomer(Customer customer);

    Customer getById(int id);

}
