package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.ExamMarks;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Lecturer;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-17T01:34:48")
@StaticMetamodel(Subject.class)
public class Subject_ { 

    public static volatile SingularAttribute<Subject, String> subjName;
    public static volatile CollectionAttribute<Subject, Lecturer> lecturerCollection;
    public static volatile SingularAttribute<Subject, Integer> hour;
    public static volatile SingularAttribute<Subject, Integer> subjId;
    public static volatile SingularAttribute<Subject, Integer> semester;
    public static volatile CollectionAttribute<Subject, ExamMarks> examMarksCollection;

}