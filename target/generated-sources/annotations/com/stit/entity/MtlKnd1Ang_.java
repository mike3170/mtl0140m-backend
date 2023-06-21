package com.stit.entity;

import com.stit.entity.MtlKnd2Ang;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(MtlKnd1Ang.class)
public class MtlKnd1Ang_ { 

    public static volatile SingularAttribute<MtlKnd1Ang, String> creaEmp;
    public static volatile SingularAttribute<MtlKnd1Ang, Date> creaDate;
    public static volatile CollectionAttribute<MtlKnd1Ang, MtlKnd2Ang> mtlKnd2AngCollection;
    public static volatile SingularAttribute<MtlKnd1Ang, String> stkKind;
    public static volatile SingularAttribute<MtlKnd1Ang, String> editEmp;
    public static volatile SingularAttribute<MtlKnd1Ang, String> knd1Name;
    public static volatile SingularAttribute<MtlKnd1Ang, Date> editDate;
    public static volatile SingularAttribute<MtlKnd1Ang, String> mtlNo1;

}