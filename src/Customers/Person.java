
package Customers;

public abstract class Person {
    private String fistName;
    private String lastName;
    private long idNumber;

    public Person(String fistName, String lastName, long idNumber) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }
    
    
}
