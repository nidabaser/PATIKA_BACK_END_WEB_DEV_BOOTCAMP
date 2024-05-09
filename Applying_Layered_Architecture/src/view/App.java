package view;

import business.concretes.CustomerManager;
import dao.conretes.CustomerHibernateDao;
import entity.Customer;

/**
 * @author Nida Başer
 * May 2024
 */

public class App {
    // Presentation Layer
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setMail("test@patika.dev");
        customer.setName("Test");

        CustomerManager customerManager = new CustomerManager(new CustomerHibernateDao());
        // DEPENDENCY INJECTION ile manager'da bağımlılık kalmadı sadece -buradayukarıda- dışarıdan veriyoruz.
        customerManager.save(customer);

        Customer test = customerManager.getByID(1);

    }
}
