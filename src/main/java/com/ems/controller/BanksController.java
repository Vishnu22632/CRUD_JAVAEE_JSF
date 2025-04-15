package com.ems.controller;

import com.ems.entity.Banks;
import com.ems.facades.BanksFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Vishnu
 */
@ManagedBean(name = "banksController")
@ViewScoped
public class BanksController implements Serializable {

    private static final long serialVersionUID = 1L;

    @EJB
    private BanksFacade banksFacade;

    private List<Banks> banks;
    private Banks bank;

    @PostConstruct
    public void init() {
        banks = banksFacade.findAll();
        bank = new Banks();
    }

    public void createBank() {
        banksFacade.create(bank);
        banks = banksFacade.findAll();
        bank = new Banks();
    }
    
    public void updateBank(){
        banksFacade.edit(bank);
    }
    
    public void deleteBank(Banks bank){
        banksFacade.remove(bank);
        banks = banksFacade.findAll();
    }
    
    public void beforeCreate(){
        bank = new Banks();
    }
    
    public void beforeEdit(Banks bank){
        this.bank = bank;
    }

    public List<Banks> getBanks() {
        return banks;
    }

    public void setBanks(List<Banks> banks) {
        this.banks = banks;
    }

    public Banks getBank() {
        return bank;
    }

    public void setBank(Banks bank) {
        this.bank = bank;
    }

}
