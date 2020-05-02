
package Customers;

import Ticket.Ticket;

public class Customer {
    private String cusId;
    private String fistname;
    private String lastName;
    private String email;
    private Ticket ticket;
    public Customer(String fistname, String lastName, String email) {
        this.fistname = fistname;
        this.lastName = lastName;
        this.email = email;
       
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
}
