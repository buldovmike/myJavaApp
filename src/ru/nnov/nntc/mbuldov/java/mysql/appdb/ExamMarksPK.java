/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author misha
 */
@Embeddable
public class ExamMarksPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "EXAM_ID")
    private int examId;
    @Basic(optional = false)
    @Column(name = "STUDENT_ID")
    private int studentId;
    @Basic(optional = false)
    @Column(name = "SUBJ_ID")
    private int subjId;

    public ExamMarksPK() {
    }

    public ExamMarksPK(int examId, int studentId, int subjId) {
        this.examId = examId;
        this.studentId = studentId;
        this.subjId = subjId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjId() {
        return subjId;
    }

    public void setSubjId(int subjId) {
        this.subjId = subjId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) examId;
        hash += (int) studentId;
        hash += (int) subjId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExamMarksPK)) {
            return false;
        }
        ExamMarksPK other = (ExamMarksPK) object;
        if (this.examId != other.examId) {
            return false;
        }
        if (this.studentId != other.studentId) {
            return false;
        }
        if (this.subjId != other.subjId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.nnov.nntc.mbuldov.java.mysql.appdb.ExamMarksPK[ examId=" + examId + ", studentId=" + studentId + ", subjId=" + subjId + " ]";
    }
    
}
