package müsteriIsleri;

import interfacess.ICustomerService;
import musteri.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

    @Override
    public void save(Customer customer) {
        System.out.println(customer.getFirstName()+" veri tabanına kaydedildi" +getClass());
        
        
    }

    
    
}
