/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author misha
 */
@Entity
@Table(name = "student")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentId", query = "SELECT s FROM Student s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "Student.findBySurname", query = "SELECT s FROM Student s WHERE s.surname = :surname"),
    @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name"),
    @NamedQuery(name = "Student.findByStipend", query = "SELECT s FROM Student s WHERE s.stipend = :stipend"),
    @NamedQuery(name = "Student.findByKurs", query = "SELECT s FROM Student s WHERE s.kurs = :kurs"),
    @NamedQuery(name = "Student.findByCity", query = "SELECT s FROM Student s WHERE s.city = :city"),
    @NamedQuery(name = "Student.findByBirthday", query = "SELECT s FROM Student s WHERE s.birthday = :birthday")})
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STUDENT_ID")
    private Integer studentId;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STIPEND")
    private BigDecimal stipend;
    @Column(name = "KURS")
    private Integer kurs;
    @Column(name = "CITY")
    private String city;
    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @JoinColumn(name = "UNIV_ID", referencedColumnName = "UNIV_ID")
    @ManyToOne
    private University univId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Collection<ExamMarks> examMarksCollection;

    public Student() {
    }

    public Student(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getStipend() {
        return stipend;
    }

    public void setStipend(BigDecimal stipend) {
        this.stipend = stipend;
    }

    public Integer getKurs() {
        return kurs;
    }

    public void setKurs(Integer kurs) {
        this.kurs = kurs;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public University getUnivId() {
        return univId;
    }

    public void setUnivId(University univId) {
        this.univId = univId;
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
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.nnov.nntc.mbuldov.java.mysql.appdb.Student[ studentId=" + studentId + " ]";
    }
    
}
