package com.stit.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(EmpJpa.class)
public class EmpJpa_ { 

    public static volatile SingularAttribute<EmpJpa, String> empId;
    public static volatile SingularAttribute<EmpJpa, String> firstName;
    public static volatile SingularAttribute<EmpJpa, String> lastName;
    public static volatile SingularAttribute<EmpJpa, String> jobId;
    public static volatile SingularAttribute<EmpJpa, LocalDate> hireDate;
    public static volatile SingularAttribute<EmpJpa, String> phoneNumber;
    public static volatile SingularAttribute<EmpJpa, Integer> salary;
    public static volatile SingularAttribute<EmpJpa, LocalDateTime> creTs;
    public static volatile SingularAttribute<EmpJpa, String> email;
    public static volatile SingularAttribute<EmpJpa, String> deptNo;
    public static volatile SingularAttribute<EmpJpa, BigDecimal> commissionPct;

}