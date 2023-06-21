package com.stit.entity;

import com.stit.entity.BasCstMastD;
import com.stit.entity.BasCstMastD1;
import com.stit.entity.BasCstMastD3;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(BasCstMast.class)
public class BasCstMast_ { 

    public static volatile SingularAttribute<BasCstMast, String> currNo;
    public static volatile SingularAttribute<BasCstMast, String> cstAddr3;
    public static volatile SingularAttribute<BasCstMast, BigDecimal> discount;
    public static volatile SingularAttribute<BasCstMast, String> cstAddr1;
    public static volatile SingularAttribute<BasCstMast, String> cstAddr2;
    public static volatile SingularAttribute<BasCstMast, String> shipMarkE;
    public static volatile SingularAttribute<BasCstMast, String> cstType;
    public static volatile SingularAttribute<BasCstMast, String> cstAbbr;
    public static volatile SingularAttribute<BasCstMast, BigDecimal> advDsct;
    public static volatile SingularAttribute<BasCstMast, Short> payDays;
    public static volatile SingularAttribute<BasCstMast, String> payment;
    public static volatile SingularAttribute<BasCstMast, String> priceTerm;
    public static volatile SingularAttribute<BasCstMast, String> taxPriceYn;
    public static volatile SingularAttribute<BasCstMast, String> pricePort;
    public static volatile CollectionAttribute<BasCstMast, BasCstMastD1> basCstMastD1Collection;
    public static volatile SingularAttribute<BasCstMast, String> shipCompany;
    public static volatile SingularAttribute<BasCstMast, String> editEmp;
    public static volatile SingularAttribute<BasCstMast, Date> editDate;
    public static volatile SingularAttribute<BasCstMast, String> creaEmp;
    public static volatile SingularAttribute<BasCstMast, String> taxId;
    public static volatile SingularAttribute<BasCstMast, String> salesman;
    public static volatile SingularAttribute<BasCstMast, String> cstRemarks;
    public static volatile SingularAttribute<BasCstMast, String> paymentTerm;
    public static volatile SingularAttribute<BasCstMast, Short> closeDd;
    public static volatile SingularAttribute<BasCstMast, String> destination;
    public static volatile SingularAttribute<BasCstMast, String> taxKind;
    public static volatile SingularAttribute<BasCstMast, String> accoNo;
    public static volatile SingularAttribute<BasCstMast, String> stopEmp;
    public static volatile SingularAttribute<BasCstMast, String> swiftCode;
    public static volatile SingularAttribute<BasCstMast, String> bankName;
    public static volatile SingularAttribute<BasCstMast, String> cstNo;
    public static volatile SingularAttribute<BasCstMast, String> packing;
    public static volatile SingularAttribute<BasCstMast, String> payKind;
    public static volatile SingularAttribute<BasCstMast, String> webSite;
    public static volatile SingularAttribute<BasCstMast, BigDecimal> dnRate;
    public static volatile SingularAttribute<BasCstMast, String> locaNo;
    public static volatile CollectionAttribute<BasCstMast, BasCstMastD> basCstMastDCollection;
    public static volatile SingularAttribute<BasCstMast, String> triangleYn;
    public static volatile SingularAttribute<BasCstMast, String> customBroker;
    public static volatile SingularAttribute<BasCstMast, String> bankNo;
    public static volatile SingularAttribute<BasCstMast, String> ordRemarks;
    public static volatile SingularAttribute<BasCstMast, String> invKind;
    public static volatile SingularAttribute<BasCstMast, String> cstName;
    public static volatile SingularAttribute<BasCstMast, String> stopYn;
    public static volatile SingularAttribute<BasCstMast, BigDecimal> upRate;
    public static volatile SingularAttribute<BasCstMast, String> grupNo;
    public static volatile SingularAttribute<BasCstMast, String> bankAddr;
    public static volatile SingularAttribute<BasCstMast, String> bankRemark;
    public static volatile CollectionAttribute<BasCstMast, BasCstMastD3> basCstMastD3Collection;
    public static volatile SingularAttribute<BasCstMast, Date> creaDate;
    public static volatile SingularAttribute<BasCstMast, String> samplePlan;
    public static volatile SingularAttribute<BasCstMast, String> deliMethod;
    public static volatile SingularAttribute<BasCstMast, String> category;
    public static volatile SingularAttribute<BasCstMast, Date> stopDate;

}