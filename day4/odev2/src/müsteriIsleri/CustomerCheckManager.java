package müsteriIsleri;

import interfacess.ICustomerCheckService;
import musteri.Customer;


public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        // mernis ile ilgili işlemleri yapamadım o yüzden buraya böyle saçma sapan bişey yaptım
        if((int)(Math.random()*10)%2==0){
            return true;
        }else {
            return false;
        }
        

        
        
    }
    
}
