package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;

public class MainTest {

    /*@org.junit.Test
    public void main() {
    }*/

    @Before
    public void setUp() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612595", "sql10612595", "2mKDgPLLsj");
        Statement stmt = con.createStatement();
        stmt.execute("CREATE TABLE JUGADORES(nombre varchar(255), numero int)");
        stmt.close();
    }

    @After
    public void tearDown() throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10612595", "sql10612595", "2mKDgPLLsj");
        Statement stmt = con.createStatement();
        stmt.execute("DROP TABLE JUGADORES");
        stmt.close();
    }



    @Test
    public void agregameEstoaLaDB() throws SQLException {
        Assert.assertTrue(Main.agregameEstoaLaDB());
    }
}