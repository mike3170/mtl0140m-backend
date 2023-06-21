package com.stit.entity;

import com.stit.entity.BasCstMast;
import com.stit.entity.BasCstMastD1PK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(BasCstMastD1.class)
public class BasCstMastD1_ { 

    public static volatile SingularAttribute<BasCstMastD1, String> creaEmp;
    public static volatile SingularAttribute<BasCstMastD1, Date> creaDate;
    public static volatile SingularAttribute<BasCstMastD1, BasCstMastD1PK> basCstMastD1PK;
    public static volatile SingularAttribute<BasCstMastD1, String> packingE;
    public static volatile SingularAttribute<BasCstMastD1, String> editEmp;
    public static volatile SingularAttribute<BasCstMastD1, Date> editDate;
    public static volatile SingularAttribute<BasCstMastD1, BasCstMast> basCstMast;
    public static volatile SingularAttribute<BasCstMastD1, String> packingC;

}