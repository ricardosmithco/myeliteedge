package com.myeliteedge.myeliteedge.beans;

import java.util.Objects;

public class Credential {

    private String email;
    private String password;

    public Credential(){ super(); }
    public Credential(String email, String password){
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Credential)) return false;
        Credential that = (Credential) o;
        return Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getPassword());
    }

    @Override
    public String toString() {
        return "Credential{" +
                "username='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

