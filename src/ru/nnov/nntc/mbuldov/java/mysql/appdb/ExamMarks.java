/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author misha
 */
@Entity
@Table(name = "exam_marks")
@NamedQueries({
    @NamedQuery(name = "ExamMarks.findAll", query = "SELECT e FROM ExamMarks e"),
    @NamedQuery(name = "ExamMarks.findByExamId", query = "SELECT e FROM ExamMarks e WHERE e.examMarksPK.examId = :examId"),
    @NamedQuery(name = "ExamMarks.findByStudentId", query = "SELECT e FROM ExamMarks e WHERE e.examMarksPK.studentId = :studentId"),
    @NamedQuery(name = "ExamMarks.findBySubjId", query = "SELECT e FROM ExamMarks e WHERE e.examMarksPK.subjId = :subjId"),
    @NamedQuery(name = "ExamMarks.findByMark", query = "SELECT e FROM ExamMarks e WHERE e.mark = :mark"),
    @NamedQuery(name = "ExamMarks.findByExamDate", query = "SELECT e FROM ExamMarks e WHERE e.examDate = :examDate")})
public class ExamMarks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExamMarksPK examMarksPK;
    @Column(name = "MARK")
    private Integer mark;
    @Column(name = "EXAM_DATE")
    @Temporal(TemporalType.DATE)
    private Date examDate;
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "STUDENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Student student;
    @JoinColumn(name = "SUBJ_ID", referencedColumnName = "SUBJ_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Subject subject;

    public ExamMarks() {
    }

    public ExamMarks(ExamMarksPK examMarksPK) {
        this.examMarksPK = examMarksPK;
    }

    public ExamMarks(int examId, int studentId, int subjId) {
        this.examMarksPK = new ExamMarksPK(examId, studentId, subjId);
    }

    public ExamMarksPK getExamMarksPK() {
        return examMarksPK;
    }

    public void setExamMarksPK(ExamMarksPK examMarksPK) {
        this.examMarksPK = examMarksPK;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (examMarksPK != null ? examMarksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamMarks)) {
            return false;
        }
        ExamMarks other = (ExamMarks) object;
        if ((this.examMarksPK == null && other.examMarksPK != null) || (this.examMarksPK != null && !this.examMarksPK.equals(other.examMarksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.nnov.nntc.mbuldov.java.mysql.appdb.ExamMarks[ examMarksPK=" + examMarksPK + " ]";
    }
    
}
