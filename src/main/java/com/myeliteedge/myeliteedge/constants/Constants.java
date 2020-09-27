package com.myeliteedge.myeliteedge.constants;

public final class Constants {

    public static final String INSERT_A_CREDENTIAL = "Insert into Credentials values(?,?);";
    public static final String INSERT_A_USER = "Insert into Users values(?,?,?,?,?,?);";
    public static final String RETURN_USER = "Select * from Users where Email = ? ;";
    public static final String RETURN_USER_COUNT = "Select COUNT(*) FROM Users where Email = ? ;";
}
