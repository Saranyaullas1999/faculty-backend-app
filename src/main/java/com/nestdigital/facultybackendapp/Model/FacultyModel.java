package com.nestdigital.facultybackendapp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class FacultyModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String department;
    private String designation;
    private  String qualification;

    public FacultyModel() {
    }

    public FacultyModel(int id, String name, String department, String designation, String qualification) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.qualification = qualification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
