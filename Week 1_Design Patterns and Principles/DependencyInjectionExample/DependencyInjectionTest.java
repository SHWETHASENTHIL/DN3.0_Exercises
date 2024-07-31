package DependencyInjectionExample;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use service to find customer
        Customer customer = service.getCustomerById("1");
        System.out.println(customer);
    }
}
