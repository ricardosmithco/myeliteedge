package com.myeliteedge.myeliteedge.beans;
import com.myeliteedge.myeliteedge.beans.Credential;

import java.sql.Timestamp;
import java.util.Objects;

public class User {

    private Integer userID;
    private String firstName;
    private String lastName;
    private String email;
    private Credential credential;
    private Timestamp createdOn;
    private Timestamp activeUntil;
    private Boolean isRecruiter;

    User(){super();}
    User(String firstName, String lastName, String email, Credential credential, Timestamp createdOn, Timestamp activeUntil, Boolean isRecruiter){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.credential = credential;
        this.createdOn = createdOn;
        this.activeUntil = activeUntil;
        this.isRecruiter = isRecruiter;
    }

    public Integer getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Credential getCredential() {
        return credential;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public Timestamp getActiveUntil() {
        return activeUntil;
    }

    public Boolean getRecruiter() {
        return isRecruiter;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public void setActiveUntil(Timestamp activeUntil) {
        this.activeUntil = activeUntil;
    }

    public void setRecruiter(Boolean recruiter) {
        isRecruiter = recruiter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserID(), user.getUserID()) &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getCredential(), user.getCredential()) &&
                Objects.equals(getCreatedOn(), user.getCreatedOn()) &&
                Objects.equals(getActiveUntil(), user.getActiveUntil()) &&
                Objects.equals(isRecruiter, user.isRecruiter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserID(), getFirstName(), getLastName(), getEmail(), getCredential(), getCreatedOn(), getActiveUntil(), isRecruiter);
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", credential=" + credential +
                ", createdOn=" + createdOn +
                ", activeUntil=" + activeUntil +
                ", isRecruiter=" + isRecruiter +
                '}';
    }
}
