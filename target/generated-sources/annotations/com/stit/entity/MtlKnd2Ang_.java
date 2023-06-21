package com.stit.entity;

import com.stit.entity.MtlKnd1Ang;
import com.stit.entity.MtlKnd2AngPK;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(MtlKnd2Ang.class)
public class MtlKnd2Ang_ { 

    public static volatile SingularAttribute<MtlKnd2Ang, String> creaEmp;
    public static volatile SingularAttribute<MtlKnd2Ang, Date> creaDate;
    public static volatile SingularAttribute<MtlKnd2Ang, MtlKnd1Ang> mtlKnd1Ang;
    public static volatile SingularAttribute<MtlKnd2Ang, String> stkYn;
    public static volatile SingularAttribute<MtlKnd2Ang, String> rmtlYn;
    public static volatile SingularAttribute<MtlKnd2Ang, String> accNo;
    public static volatile SingularAttribute<MtlKnd2Ang, MtlKnd2AngPK> mtlKnd2AngPK;
    public static volatile SingularAttribute<MtlKnd2Ang, String> knd2Name;
    public static volatile SingularAttribute<MtlKnd2Ang, String> editEmp;
    public static volatile SingularAttribute<MtlKnd2Ang, String> dmtlYn;
    public static volatile SingularAttribute<MtlKnd2Ang, Date> editDate;

}