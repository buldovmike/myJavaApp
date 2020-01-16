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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author misha
 */
@Entity
@Table(name = "university")
@NamedQueries({
    @NamedQuery(name = "University.findAll", query = "SELECT u FROM University u"),
    @NamedQuery(name = "University.findByUnivId", query = "SELECT u FROM University u WHERE u.univId = :univId"),
    @NamedQuery(name = "University.findByUnivName", query = "SELECT u FROM University u WHERE u.univName = :univName"),
    @NamedQuery(name = "University.findByRating", query = "SELECT u FROM University u WHERE u.rating = :rating"),
    @NamedQuery(name = "University.findByCity", query = "SELECT u FROM University u WHERE u.city = :city")})
public class University implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UNIV_ID")
    private Integer univId;
    @Column(name = "UNIV_NAME")
    private String univName;
    @Column(name = "RATING")
    private Integer rating;
    @Column(name = "CITY")
    private String city;
    @OneToMany(mappedBy = "univId")
    private Collection<Student> studentCollection;
    @OneToMany(mappedBy = "univId")
    private Collection<Lecturer> lecturerCollection;

    public University() {
    }

    public University(Integer univId) {
        this.univId = univId;
    }

    public Integer getUnivId() {
        return univId;
    }

    public void setUnivId(Integer univId) {
        this.univId = univId;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Collection<Student> getStudentCollection() {
        return studentCollection;
    }

    public void setStudentCollection(Collection<Student> studentCollection) {
        this.studentCollection = studentCollection;
    }

    public Collection<Lecturer> getLecturerCollection() {
        return lecturerCollection;
    }

    public void setLecturerCollection(Collection<Lecturer> lecturerCollection) {
        this.lecturerCollection = lecturerCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (univId != null ? univId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof University)) {
            return false;
        }
        University other = (University) object;
        if ((this.univId == null && other.univId != null) || (this.univId != null && !this.univId.equals(other.univId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ru.nnov.nntc.mbuldov.java.mysql.appdb.University[ univId=" + univId + " ]";
    }
    
}
