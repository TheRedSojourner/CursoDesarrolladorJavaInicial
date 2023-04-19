package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {


        /*try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612595", "sql10612595", "2mKDgPLLsj");
            Statement stmt = con.createStatement();
            //stmt.execute("CREATE TABLE empleado(nombre varchar(255), dni int, PRIMARY KEY(dni))");

            stmt.execute("INSERT INTO JUGADORES VALUES ('nombrino', 2540034)");
            ResultSet rs = stmt.executeQuery("SELECT * FROM JUGADORES");

            while (rs.next()) System.out.println(rs.getString(1)+" "+rs.getInt(2));
            con.close();
        } catch (SQLException e)
        {
            System.out.println(e);
        }*/
    }

    public static boolean AgregameEstoaLaDB() throws SQLException
    {
        boolean success = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612595", "sql10612595", "2mKDgPLLsj");
            Statement stmt = con.createStatement();
            //stmt.execute("CREATE TABLE empleado(nombre varchar(255), dni int, PRIMARY KEY(dni))");

            stmt.execute("INSERT INTO JUGADORES VALUES ('nombrino', 2540034)");
            ResultSet rs = stmt.executeQuery("SELECT * FROM JUGADORES");
            while (rs.next()) System.out.println(rs.getString(1)+" "+rs.getInt(2));

            success = true;
            stmt.close();}
        catch (SQLException e) {System.out.println(e);}

        return success;
    }
}