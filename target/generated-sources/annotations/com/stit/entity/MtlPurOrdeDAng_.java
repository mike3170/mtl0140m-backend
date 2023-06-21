package com.stit.entity;

import com.stit.entity.MtlPurOrdeDAngPK;
import com.stit.entity.MtlPurOrdeMAng;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(MtlPurOrdeDAng.class)
public class MtlPurOrdeDAng_ { 

    public static volatile SingularAttribute<MtlPurOrdeDAng, Date> preDate;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> endCode;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> stkUnit;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> endReason;
    public static volatile SingularAttribute<MtlPurOrdeDAng, MtlPurOrdeMAng> mtlPurOrdeMAng;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> autoYn;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> editEmp;
    public static volatile SingularAttribute<MtlPurOrdeDAng, Short> verNo;
    public static volatile SingularAttribute<MtlPurOrdeDAng, BigDecimal> poPrice;
    public static volatile SingularAttribute<MtlPurOrdeDAng, BigDecimal> poQty;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> remark;
    public static volatile SingularAttribute<MtlPurOrdeDAng, BigDecimal> inQty;
    public static volatile SingularAttribute<MtlPurOrdeDAng, Date> editDate;
    public static volatile SingularAttribute<MtlPurOrdeDAng, MtlPurOrdeDAngPK> mtlPurOrdeDAngPK;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> mtlNo;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> creaEmp;
    public static volatile SingularAttribute<MtlPurOrdeDAng, Date> creaDate;
    public static volatile SingularAttribute<MtlPurOrdeDAng, BigDecimal> poAmt;
    public static volatile SingularAttribute<MtlPurOrdeDAng, BigDecimal> canlQty;
    public static volatile SingularAttribute<MtlPurOrdeDAng, BigDecimal> retnQty;
    public static volatile SingularAttribute<MtlPurOrdeDAng, String> purUnit;

}