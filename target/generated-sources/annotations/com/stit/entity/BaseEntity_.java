package com.stit.entity;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(BaseEntity.class)
public class BaseEntity_ { 

    public static volatile SingularAttribute<BaseEntity, String> creaEmp;
    public static volatile SingularAttribute<BaseEntity, LocalDateTime> creaDate;
    public static volatile SingularAttribute<BaseEntity, String> editEmp;
    public static volatile SingularAttribute<BaseEntity, LocalDateTime> editDate;

}