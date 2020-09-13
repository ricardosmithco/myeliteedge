package com.myeliteedge.myeliteedge.beans;

import java.util.Objects;

public class Credential {

    private Integer credentialID;
    private String username;
    private String password;

    Credential(){ super(); }
    Credential(String username, String password){
        this.username = username;
        this.password = password;
    }

    public Integer getCredentialID() {
        return credentialID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setCredentialID(Integer credentialID) {
        this.credentialID = credentialID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Credential)) return false;
        Credential that = (Credential) o;
        return Objects.equals(getCredentialID(), that.getCredentialID()) &&
                Objects.equals(getUsername(), that.getUsername()) &&
                Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCredentialID(), getUsername(), getPassword());
    }

    @Override
    public String toString() {
        return "Credential{" +
                "credentialID=" + credentialID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

