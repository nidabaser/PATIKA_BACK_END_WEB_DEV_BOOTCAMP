package business.concretes;

import business.abstracts.ICustomerService;
import dao.abstracts.ICustomerDao;
import entity.Customer;

/**
 * @author Nida Başer
 * May 2024
 */

public class CustomerManager implements ICustomerService {

    //private CustomerJdbcDao customerDao = new CustomerJdbcDao();
    //private CustomerHibernateDao customerDao = new CustomerHibernateDao();

    // Yukarıdaki yöntemler DEPENDENCY INJECTION'A terstir!
    // Aşağıdaki ise bunu DI uygun bir şekilde yapmanın yoludur.

    private final ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public boolean save (Customer customer) {
        // Veritabanında bu customer mail adresi daha önce eklenmiş mi?
        // Bu sorguyu burada yaptık diyelim.
        // Sonrasında dao üzerinden devam edilir.
        System.out.println("Business Layer worked");
        return this.customerDao.saveCustomer(customer); // Metod adlandırmaları JDBC'de farklı, Hibernate'de farklı olabiliyor
    }

    public Customer getByID(int id){
        return this.customerDao.getById(id); // Metod adlandırmaları JDBC'de farklı, Hibernate'de farklı olabiliyor
    }

}

// NOT
// JDBC'den Hibernate'e geçeyim derken bu kadarcık projede bile bir çok yerde değişiklik yapmak zorunda kaldık
// Bu clean code prensiblerine uygun değildir. Bu tarz durumlarda INTERFACE kullanmalıyız ki
// metodların falan adının değişmeyeceği garanti olsun diye.!
// Interface'leri şöyle düşünebiliriz: Keskin kuralları sağlayan arabulucu sınıflardır.