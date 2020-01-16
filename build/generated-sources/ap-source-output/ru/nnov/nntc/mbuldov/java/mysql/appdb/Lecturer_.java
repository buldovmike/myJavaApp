package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Subject;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.University;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-17T01:34:48")
@StaticMetamodel(Lecturer.class)
public class Lecturer_ { 

    public static volatile SingularAttribute<Lecturer, Integer> lecturerId;
    public static volatile CollectionAttribute<Lecturer, Subject> subjectCollection;
    public static volatile SingularAttribute<Lecturer, String> city;
    public static volatile SingularAttribute<Lecturer, String> surname;
    public static volatile SingularAttribute<Lecturer, University> univId;
    public static volatile SingularAttribute<Lecturer, String> name;

}