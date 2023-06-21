package com.stit.entity;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> country;
    public static volatile SingularAttribute<Customer, String> custNo;
    public static volatile SingularAttribute<Customer, String> address2;
    public static volatile SingularAttribute<Customer, String> city;
    public static volatile SingularAttribute<Customer, String> address1;
    public static volatile SingularAttribute<Customer, String> postalCode;
    public static volatile SingularAttribute<Customer, Long> salesRepEmpNo;
    public static volatile SingularAttribute<Customer, String> contactLastname;
    public static volatile SingularAttribute<Customer, String> custName;
    public static volatile SingularAttribute<Customer, String> contactFirstname;
    public static volatile SingularAttribute<Customer, String> phone;
    public static volatile SingularAttribute<Customer, BigDecimal> creditLimit;
    public static volatile SingularAttribute<Customer, String> state;

}