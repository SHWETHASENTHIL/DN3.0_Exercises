package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulate fetching customer from database
        return new Customer(id, "Olivia");
    }
}

