package app.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerPhoneNumber=" + customerPhoneNumber +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(Integer customerId, String customerName, Integer customerPhoneNumber, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
    }

    private String customerName;
    private Integer customerPhoneNumber;
    private String customerEmail;

    public Customer(String customerName, Integer customerPhoneNumber, String customerEmail) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
    }

    public Customer() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(Integer customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerName, customer.customerName) && Objects.equals(customerPhoneNumber, customer.customerPhoneNumber) && Objects.equals(customerEmail, customer.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, customerPhoneNumber, customerEmail);
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
