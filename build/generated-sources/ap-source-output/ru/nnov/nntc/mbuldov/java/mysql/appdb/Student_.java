package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.ExamMarks;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.University;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-17T01:34:48")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, Integer> studentId;
    public static volatile SingularAttribute<Student, Date> birthday;
    public static volatile SingularAttribute<Student, String> city;
    public static volatile SingularAttribute<Student, String> surname;
    public static volatile SingularAttribute<Student, University> univId;
    public static volatile SingularAttribute<Student, String> name;
    public static volatile SingularAttribute<Student, BigDecimal> stipend;
    public static volatile SingularAttribute<Student, Integer> kurs;
    public static volatile CollectionAttribute<Student, ExamMarks> examMarksCollection;

}