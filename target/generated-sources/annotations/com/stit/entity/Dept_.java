package com.stit.entity;

import com.stit.entity.Emp;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Dept.class)
public class Dept_ { 

    public static volatile SingularAttribute<Dept, String> deptName;
    public static volatile SingularAttribute<Dept, String> loc;
    public static volatile ListAttribute<Dept, Emp> empList;
    public static volatile SingularAttribute<Dept, String> deptNo;

}