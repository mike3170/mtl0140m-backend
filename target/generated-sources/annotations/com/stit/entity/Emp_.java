package com.stit.entity;

import com.stit.entity.Dept;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Emp.class)
public class Emp_ { 

    public static volatile SingularAttribute<Emp, String> empId;
    public static volatile SingularAttribute<Emp, String> firstName;
    public static volatile SingularAttribute<Emp, String> lastName;
    public static volatile SingularAttribute<Emp, String> jobId;
    public static volatile SingularAttribute<Emp, LocalDate> hireDate;
    public static volatile SingularAttribute<Emp, String> phoneNumber;
    public static volatile SingularAttribute<Emp, Integer> salary;
    public static volatile SingularAttribute<Emp, Date> creTs;
    public static volatile SingularAttribute<Emp, String> email;
    public static volatile SingularAttribute<Emp, Dept> deptNo;
    public static volatile SingularAttribute<Emp, BigDecimal> commissionPct;

}