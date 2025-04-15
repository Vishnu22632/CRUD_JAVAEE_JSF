package com.ems.facades;

import com.ems.entity.Banks;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vishnu
 */
@Stateless
public class BanksFacade extends AbstractFacade<Banks> {

    @PersistenceContext(unitName = "EmployeePU")
    private EntityManager em;

    public BanksFacade() {
        super(Banks.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
