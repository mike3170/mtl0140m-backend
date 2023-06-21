package com.stit.entity;

import com.stit.entity.MtlPurOrdeDAng;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(MtlPurOrdeMAng.class)
public class MtlPurOrdeMAng_ { 

    public static volatile SingularAttribute<MtlPurOrdeMAng, Short> canQtyDn;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> currNo;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> editEmp;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> poKind;
    public static volatile SingularAttribute<MtlPurOrdeMAng, Date> editDate;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> venNo;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> payKind;
    public static volatile SingularAttribute<MtlPurOrdeMAng, Short> canQtyUp;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> creaEmp;
    public static volatile SingularAttribute<MtlPurOrdeMAng, Date> creaDate;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> poNo;
    public static volatile CollectionAttribute<MtlPurOrdeMAng, MtlPurOrdeDAng> mtlPurOrdeDAngCollection;
    public static volatile SingularAttribute<MtlPurOrdeMAng, Date> poDate;
    public static volatile SingularAttribute<MtlPurOrdeMAng, Short> payDays;
    public static volatile SingularAttribute<MtlPurOrdeMAng, String> paymentTerm;

}