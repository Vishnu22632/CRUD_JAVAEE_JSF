package com.ems.controller;

import com.ems.entity.Employee;
import com.ems.facades.EmployeeFacade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vishnu
 */
@ManagedBean(name = "employeeController")
@ViewScoped
public class EmployeeController implements Serializable {

    private static final long serialVersionUID = 1L;

    @EJB
    private EmployeeFacade employeeFacade;

    private String firstName;
    private String lastName;
    private String email;
    private BigDecimal salary;

    private List<Employee> employees;
    private Employee selectedEmployee;

    @PostConstruct
    public void init() {
        employees = employeeFacade.findAll();
        selectedEmployee = new Employee();
    }

    public void createEmployee() {
        Employee employee = new Employee(firstName, lastName, email, salary);
        employeeFacade.create(employee);
        employees = employeeFacade.findAll();
        clearForm();
    }

    public void updateEmployee() {
        if (selectedEmployee != null) {
            employeeFacade.edit(selectedEmployee);
            employees = employeeFacade.findAll();
            selectedEmployee = new Employee();
        }
    }

    public void selectEmployee(Employee emp) {
        this.selectedEmployee = emp;
    }

    public void deleteEmployee(Employee employee) {
        employeeFacade.remove(employee);
        employees = employeeFacade.findAll();
    }

    private void clearForm() {
        firstName = null;
        lastName = null;
        email = null;
        salary = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getSelecteEmployee() {
        return selectedEmployee;
    }

    public void setSelecteEmployee(Employee selecteEmployee) {
        this.selectedEmployee = selecteEmployee;
    }

}
