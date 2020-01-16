/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author misha
 */
@Entity
@Table(name = "subject")
@NamedQueries({
    @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s"),
    @NamedQuery(name = "Subject.findBySubjId", query = "SELECT s FROM Subject s WHERE s.subjId = :subjId"),
    @NamedQuery(name = "Subject.findBySubjName", query = "SELECT s FROM Subject s WHERE s.subjName = :subjName"),
    @NamedQuery(name = "Subject.findByHour", query = "SELECT s FROM Subject s WHERE s.hour = :hour"),
    @NamedQuery(name = "Subject.findBySemester", query = "SELECT s FROM Subject s WHERE s.semester = :semester")})
public class Subject implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBJ_ID")
    private Integer subjId;
    @Column(name = "SUBJ_NAME")
    private String subjName;
    @Column(name = "HOUR")
    private Integer hour;
    @Column(name = "SEMESTER")
    private Integer semester;
    @ManyToMany(mappedBy = "subjectCollection")
    private Collection<Lecturer> lecturerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private Collection<ExamMarks> examMarksCollection;

    public Subject() {
    }

    public Subject(Integer subjId) {
        this.subjId = subjId;
    }

    public Integer getSubjId() {
        return subjId;
    }

    public void setSubjId(Integer subjId) {
        this.subjId = subjId;
    }

    public String getSubjName() {
        return subjName;
    }

    public void setSubjName(String subjName) {
        this.subjName = subjName;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Collection<Lecturer> getLecturerCollection() {
        return lecturerCollection;
    }

    public void setLecturerCollection(Collection<Lecturer> lecturerCollection) {
        this.lecturerCollection = lecturerCollection;
    }

    public Collection<ExamMarks> getExamMarksCollection() {
        return examMarksCollection;
    }

    public void setExamMarksCollection(Collection<ExamMarks> examMarksCollection) {
        this.examMarksCollection = examMarksCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subjId != null ? subjId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.subjId == null && other.subjId != null) || (this.subjId != null && !this.subjId.equals(other.subjId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.nnov.nntc.mbuldov.java.mysql.appdb.Subject[ subjId=" + subjId + " ]";
    }
    
}
