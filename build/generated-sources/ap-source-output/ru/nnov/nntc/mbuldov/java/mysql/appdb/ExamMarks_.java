package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.ExamMarksPK;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Student;
import ru.nnov.nntc.mbuldov.java.mysql.appdb.Subject;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-01-17T01:34:48")
@StaticMetamodel(ExamMarks.class)
public class ExamMarks_ { 

    public static volatile SingularAttribute<ExamMarks, Date> examDate;
    public static volatile SingularAttribute<ExamMarks, Student> student;
    public static volatile SingularAttribute<ExamMarks, ExamMarksPK> examMarksPK;
    public static volatile SingularAttribute<ExamMarks, Subject> subject;
    public static volatile SingularAttribute<ExamMarks, Integer> mark;

}