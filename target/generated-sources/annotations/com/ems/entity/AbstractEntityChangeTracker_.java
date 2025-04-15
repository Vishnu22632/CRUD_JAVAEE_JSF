package com.ems.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2025-04-15T16:23:55")
@StaticMetamodel(AbstractEntityChangeTracker.class)
public abstract class AbstractEntityChangeTracker_ extends AbstractLongPKEntity_ {

    public static volatile SingularAttribute<AbstractEntityChangeTracker, Date> createdAt;
    public static volatile SingularAttribute<AbstractEntityChangeTracker, Date> updatedAt;

}