package müsteriIsleri;

import interfacess.ICustomerCheckService;
import musteri.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    



    ICustomerCheckService customerCheckService;
    
    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        
        super.save(customer);
        System.out.println(getClass()+" da çalışıyorum ben");
    }

    
}
