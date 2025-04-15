package com.ems.facades;

import com.ems.entity.Employee;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vishnu
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> {

    @PersistenceContext(unitName = "EmployeePU")
    private EntityManager em;

    public EmployeeFacade() {
        super(Employee.class);
    }

    protected EntityManager getEntityManager() {
        return em;
    }

}
