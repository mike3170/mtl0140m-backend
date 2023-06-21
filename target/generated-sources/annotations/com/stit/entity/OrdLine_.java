package com.stit.entity;

import com.stit.entity.OrdLinePK;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(OrdLine.class)
public class OrdLine_ { 

    public static volatile SingularAttribute<OrdLine, BigDecimal> unitPrice;
    public static volatile SingularAttribute<OrdLine, String> prodCode;
    public static volatile SingularAttribute<OrdLine, Long> qty;
    public static volatile SingularAttribute<OrdLine, OrdLinePK> ordLinePK;

}