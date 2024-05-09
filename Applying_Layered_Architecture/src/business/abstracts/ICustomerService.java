package business.abstracts;

import entity.Customer;

/**
 * @author Nida Başer
 * May 2024
 */

public interface ICustomerService {

    boolean save (Customer customer);

    Customer getByID(int id);

}
