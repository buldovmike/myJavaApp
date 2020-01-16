package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Lecturer;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Student;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-17T01:34:48")
@StaticMetamodel(University.class)
public class University_ { 

    public static volatile CollectionAttribute<University, Lecturer> lecturerCollection;
    public static volatile SingularAttribute<University, String> city;
    public static volatile SingularAttribute<University, String> univName;
    public static volatile SingularAttribute<University, Integer> univId;
    public static volatile SingularAttribute<University, Integer> rating;
    public static volatile CollectionAttribute<University, Student> studentCollection;

}