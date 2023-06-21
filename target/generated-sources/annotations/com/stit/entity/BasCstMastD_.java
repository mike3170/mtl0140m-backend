package com.stit.entity;

import com.stit.entity.BasCstMast;
import com.stit.entity.BasCstMastDPK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(BasCstMastD.class)
public class BasCstMastD_ { 

    public static volatile SingularAttribute<BasCstMastD, String> extension;
    public static volatile SingularAttribute<BasCstMastD, String> address;
    public static volatile SingularAttribute<BasCstMastD, String> telNo2;
    public static volatile SingularAttribute<BasCstMastD, String> callNo;
    public static volatile SingularAttribute<BasCstMastD, String> editEmp;
    public static volatile SingularAttribute<BasCstMastD, String> contactMan;
    public static volatile SingularAttribute<BasCstMastD, String> title;
    public static volatile SingularAttribute<BasCstMastD, Date> editDate;
    public static volatile SingularAttribute<BasCstMastD, String> telNo;
    public static volatile SingularAttribute<BasCstMastD, String> eMail;
    public static volatile SingularAttribute<BasCstMastD, String> creaEmp;
    public static volatile SingularAttribute<BasCstMastD, Date> creaDate;
    public static volatile SingularAttribute<BasCstMastD, String> faxNo;
    public static volatile SingularAttribute<BasCstMastD, BasCstMastDPK> basCstMastDPK;
    public static volatile SingularAttribute<BasCstMastD, BasCstMast> basCstMast;
    public static volatile SingularAttribute<BasCstMastD, String> cellPhone;
    public static volatile SingularAttribute<BasCstMastD, String> remarks;

}