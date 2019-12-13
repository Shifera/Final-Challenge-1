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
    private int Phone;

    @NotNull

    private int DateofBirth;
    @NotNull
    private boolean WorkPermit;

    @NotNull
    private boolean Veteran;

    @NotNull
    private boolean AreYouEmployed;

    @NotNull
    @Size(min = 2)
    private String NameofSchool;

    @NotNull
    @Size(min = 1)
    private String DegreeEarned;


    public BootCamp() {
    }

    public BootCamp(@NotNull @Size(min = 2) String whichBootCampwouldyouliketoapply, @NotNull @Size(min = 2) String firstName, @NotNull @Size(min = 2) String lastName, @NotNull @Size(min = 1) String email, @NotNull int phone, @NotNull int dateofBirth, @NotNull boolean workPermit, @NotNull boolean veteran, @NotNull boolean areYouEmployed, @NotNull @Size(min = 2) String nameofSchool, @NotNull @Size(min = 1) String degreeEarned) {
        WhichBootCampwouldyouliketoapply = whichBootCampwouldyouliketoapply;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Phone = phone;
        DateofBirth = dateofBirth;
        WorkPermit = workPermit;
        Veteran = veteran;
        AreYouEmployed = areYouEmployed;
        NameofSchool = nameofSchool;
        DegreeEarned = degreeEarned;
    }

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