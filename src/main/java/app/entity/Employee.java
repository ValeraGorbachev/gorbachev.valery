package app.entity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name = "customer")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    private String employeeName;
    private Integer employeePhone;
    private String employeeAddress;
    private String position;

    public Employee() {

    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(Integer employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if (Objects.equals(employeeId, employee.employeeId)) return false;
        if (Objects.equals(employeeName, employee.employeeName)) return false;
        if (Objects.equals(employeePhone, employee.employeePhone)) return false;
        if (Objects.equals(employeeAddress, employee.employeeAddress)) return false;
        return Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        int result = employeeId != null ? employeeId.hashCode() : 0;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = 31 * result + (employeePhone != null ? employeePhone.hashCode() : 0);
        result = 31 * result + (employeeAddress != null ? employeeAddress.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeePhone=" + employeePhone +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
