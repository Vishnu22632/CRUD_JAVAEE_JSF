package com.ems.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Vishnu
 */
@MappedSuperclass
public abstract class AbstractEntityChangeTracker extends AbstractLongPKEntity{
    private static final long serialVersionUID = 1L;
    
    @Column(name="created_at")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date createdAt;
    
    
    @Column(name="updated_at")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date updatedAt;

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    @PrePersist
    public void prePersist(){
        createdAt = new Date();
    }
    
    @PreUpdate
    public void preUpdate(){
        updatedAt = new Date();
    }
    
    
}
