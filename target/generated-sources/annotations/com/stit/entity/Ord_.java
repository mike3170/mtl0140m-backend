package com.stit.entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Ord.class)
public class Ord_ { 

    public static volatile SingularAttribute<Ord, Date> ordDate;
    public static volatile SingularAttribute<Ord, String> custNo;
    public static volatile SingularAttribute<Ord, String> ordNo;
    public static volatile SingularAttribute<Ord, String> comments;
    public static volatile SingularAttribute<Ord, Date> requiredDate;
    public static volatile SingularAttribute<Ord, Date> shippedDate;
    public static volatile SingularAttribute<Ord, String> status;

}