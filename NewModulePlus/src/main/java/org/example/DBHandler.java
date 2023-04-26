package org.example;

public class DBHandler {

    private static DBHandler instance;
    private DBHandler() {}
    public static DBHandler getInstance()
    {if (instance == null) instance = new DBHandler();
    return  instance;}






}
