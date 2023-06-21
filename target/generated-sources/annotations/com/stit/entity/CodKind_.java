package com.stit.entity;

import com.stit.entity.CodMast;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(CodKind.class)
public class CodKind_ { 

    public static volatile SingularAttribute<CodKind, String> creaEmp;
    public static volatile SingularAttribute<CodKind, String> usercr;
    public static volatile SingularAttribute<CodKind, Date> creaDate;
    public static volatile SingularAttribute<CodKind, String> kind;
    public static volatile SingularAttribute<CodKind, String> module;
    public static volatile SingularAttribute<CodKind, String> name;
    public static volatile SingularAttribute<CodKind, String> editEmp;
    public static volatile SingularAttribute<CodKind, String> bigKind;
    public static volatile SingularAttribute<CodKind, Date> editDate;
    public static volatile CollectionAttribute<CodKind, CodMast> codMastCollection;
    public static volatile SingularAttribute<CodKind, Short> lengLimt;
    public static volatile SingularAttribute<CodKind, String> remarks;

}