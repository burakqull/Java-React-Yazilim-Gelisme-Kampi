package müsteriIsleri;

import musteri.Customer;

public class NeroCustomerManager  extends BaseCustomerManager{

    @Override
    public void save(Customer customer) {
        
        super.save(customer);
        System.out.println("ben : "+getClass()+" da çalıştım");
    }
    
}
