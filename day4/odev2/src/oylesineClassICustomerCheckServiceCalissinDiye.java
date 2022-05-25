import interfacess.ICustomerCheckService;
import musteri.Customer;

public class oylesineClassICustomerCheckServiceCalissinDiye  implements ICustomerCheckService{

    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        
        return false;
    }

    
}

