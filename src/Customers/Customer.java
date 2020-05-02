
package Customers;

import Ticket.Ticket;
import java.util.Objects;

public class Customer extends Person {
    private long cusId;
    private String email;
    private Ticket ticket;

    public Customer(String fistName, String lastName, long idNumber, String email) {
        super(fistName, lastName, idNumber);
        this.cusId = idNumber;
        this.email = email;
        this.ticket = ticket;
    }

    public long getCusId() {
        return cusId;
    }

    public String getEmail() {
        return email;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

//equalมั้ย    
    @Override
    public String toString() {
        return "Customer{" +"Customer name"+super.getFistName()+" "+super.getLastName()
                + "cusId=" + cusId + ", email=" + email + ", ticket=" + ticket + '}';
    }
    
}