package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class BootCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 2)
    private String WhichBootCampwouldyouliketoapply;

    @NotNull
    @Size(min = 2)
    private String FirstName;
    @NotNull
    @Size(min = 2)
    private String LastName;

    @NotNull
    @Size(min = 1)
    private String Email;

    @NotNull
    @Min(10)
    private int Phone;

    @NotNull
    @Min(6)
    private int DateofBirth;

    @NotNull
    @Size(min = 1)
    private boolean WorkPermit;

    @NotNull
    @Size(min = 1)
    private boolean Veteran;

    @NotNull
    @Size(min = 1)
    private boolean AreYouEmployed;

    @NotNull
    @Size(min = 1)
    private String NameofSchool;

    @NotNull
    @Size(min = 1)
    private String DegreeEarned;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWhichBootCampwouldyouliketoapply() {
        return WhichBootCampwouldyouliketoapply;
    }

    public void setWhichBootCampwouldyouliketoapply(String whichBootCampwouldyouliketoapply) {
        WhichBootCampwouldyouliketoapply = whichBootCampwouldyouliketoapply;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public int getDateofBirth() {
        return DateofBirth;
    }

    public void setDateofBirth(int dateofBirth) {
        DateofBirth = dateofBirth;
    }

    public boolean isWorkPermit() {
        return WorkPermit;
    }

    public void setWorkPermit(boolean workPermit) {
        WorkPermit = workPermit;
    }

    public boolean isVeteran() {
        return Veteran;
    }

    public void setVeteran(boolean veteran) {
        Veteran = veteran;
    }

    public boolean isAreYouEmployed() {
        return AreYouEmployed;
    }

    public void setAreYouEmployed(boolean areYouEmployed) {
        AreYouEmployed = areYouEmployed;
    }

    public String getNameofSchool() {
        return NameofSchool;
    }

    public void setNameofSchool(String nameofSchool) {
        NameofSchool = nameofSchool;
    }

    public String getDegreeEarned() {
        return DegreeEarned;
    }

    public void setDegreeEarned(String degreeEarned) {
        DegreeEarned = degreeEarned;
    }

}