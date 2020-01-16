/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.nnov.nntc.mbuldov.java.mysql.appdb;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author misha
 */
@Entity
@Table(name = "lecturer")
@NamedQueries({
    @NamedQuery(name = "Lecturer.findAll", query = "SELECT l FROM Lecturer l"),
    @NamedQuery(name = "Lecturer.findByLecturerId", query = "SELECT l FROM Lecturer l WHERE l.lecturerId = :lecturerId"),
    @NamedQuery(name = "Lecturer.findBySurname", query = "SELECT l FROM Lecturer l WHERE l.surname = :surname"),
    @NamedQuery(name = "Lecturer.findByName", query = "SELECT l FROM Lecturer l WHERE l.name = :name"),
    @NamedQuery(name = "Lecturer.findByCity", query = "SELECT l FROM Lecturer l WHERE l.city = :city")})
public class Lecturer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LECTURER_ID")
    private Integer lecturerId;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CITY")
    private String city;
    @JoinTable(name = "subj_lect", joinColumns = {
        @JoinColumn(name = "LECTURER_ID", referencedColumnName = "LECTURER_ID")}, inverseJoinColumns = {
        @JoinColumn(name = "SUBJ_ID", referencedColumnName = "SUBJ_ID")})
    @ManyToMany
    private Collection<Subject> subjectCollection;
    @JoinColumn(name = "UNIV_ID", referencedColumnName = "UNIV_ID")
    @ManyToOne
    private University univId;

    public Lecturer() {
    }

    public Lecturer(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Integer getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        this.lecturerId = lecturerId;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Collection<Subject> getSubjectCollection() {
        return subjectCollection;
    }

    public void setSubjectCollection(Collection<Subject> subjectCollection) {
        this.subjectCollection = subjectCollection;
    }

    public University getUnivId() {
        return univId;
    }

    public void setUnivId(University univId) {
        this.univId = univId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lecturerId != null ? lecturerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturer)) {
            return false;
        }
        Lecturer other = (Lecturer) object;
        if ((this.lecturerId == null && other.lecturerId != null) || (this.lecturerId != null && !this.lecturerId.equals(other.lecturerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.nnov.nntc.mbuldov.java.mysql.appdb.Lecturer[ lecturerId=" + lecturerId + " ]";
    }
    
}
