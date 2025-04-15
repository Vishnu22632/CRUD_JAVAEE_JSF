package com.ems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Vishnu
 */
@Entity
@Table(name = "banks")
public class Banks extends AbstractEntityChangeTracker {

    @Column(name = "bank_name")
    private String name;

    @Column(name = "bank_code")
    private String code;

    @Column(name = "bank_location")
    private String location;

    public Banks() {
    }

    public Banks(String name, String code, String location) {
        this.name = name;
        this.code = code;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "" + getId();
    }

}
