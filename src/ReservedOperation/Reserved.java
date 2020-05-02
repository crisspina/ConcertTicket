
package ReservedOperation;

import Customers.Customer;

public interface Reserved<Customer> {
    public abstract void reserved(Customer c);
}
