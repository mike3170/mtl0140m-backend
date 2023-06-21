package com.stit.entity;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, BigDecimal> buyPrice;
    public static volatile SingularAttribute<Product, String> prodCode;
    public static volatile SingularAttribute<Product, String> prodLine;
    public static volatile SingularAttribute<Product, Integer> qtyInStock;
    public static volatile SingularAttribute<Product, String> prodName;
    public static volatile SingularAttribute<Product, String> prodScale;
    public static volatile SingularAttribute<Product, String> prodDesc;
    public static volatile SingularAttribute<Product, String> prodVendor;

}