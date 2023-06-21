package com.stit.entity;

import com.stit.entity.Book;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-05-26T17:04:41", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Author.class)
public class Author_ { 

    public static volatile SingularAttribute<Author, String> name;
    public static volatile SingularAttribute<Author, String> genre;
    public static volatile SingularAttribute<Author, Long> id;
    public static volatile SingularAttribute<Author, Long> age;
    public static volatile ListAttribute<Author, Book> bookList;

}