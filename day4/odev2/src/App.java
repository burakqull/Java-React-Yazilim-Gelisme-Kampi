import musteri.Customer;
import müsteriIsleri.BaseCustomerManager;
import müsteriIsleri.NeroCustomerManager;
import müsteriIsleri.StarbucksCustomerManager;

public class App {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new oylesineClassICustomerCheckServiceCalissinDiye() );
        customerManager.save(new Customer(1, "burak", "gül", "12345607528"));
    }
}
