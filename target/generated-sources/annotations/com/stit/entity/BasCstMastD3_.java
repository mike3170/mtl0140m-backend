package com.stit.entity;

import com.stit.entity.BasCstMast;
import com.stit.entity.BasCstMastD3PK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(BasCstMastD3.class)
public class BasCstMastD3_ { 

    public static volatile SingularAttribute<BasCstMastD3, String> dlvCstName;
    public static volatile SingularAttribute<BasCstMastD3, String> stopYn;
    public static volatile SingularAttribute<BasCstMastD3, BasCstMastD3PK> basCstMastD3PK;
    public static volatile SingularAttribute<BasCstMastD3, String> dlvAddr;
    public static volatile SingularAttribute<BasCstMastD3, String> destination;
    public static volatile SingularAttribute<BasCstMastD3, String> stopEmp;
    public static volatile SingularAttribute<BasCstMastD3, String> editEmp;
    public static volatile SingularAttribute<BasCstMastD3, String> contactMan;
    public static volatile SingularAttribute<BasCstMastD3, Date> editDate;
    public static volatile SingularAttribute<BasCstMastD3, String> telNo;
    public static volatile SingularAttribute<BasCstMastD3, String> creaEmp;
    public static volatile SingularAttribute<BasCstMastD3, Date> creaDate;
    public static volatile SingularAttribute<BasCstMastD3, String> faxNo;
    public static volatile SingularAttribute<BasCstMastD3, String> dlvNo;
    public static volatile SingularAttribute<BasCstMastD3, BasCstMast> basCstMast;
    public static volatile SingularAttribute<BasCstMastD3, Date> stopDate;

}