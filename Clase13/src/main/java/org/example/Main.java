package org.example;
import java.sql.*;

public class Main {
    public static void main(String args[]) {
        try {
            //Deprecated function//Funcion obsoleta
            //Class.forName("com.mysql.jdbc.Driver");
            //De todas formas, usar esto es innecesario
            //com.mysql.cj.jdbc.Driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hydra", "root", "contraseña");
            Statement stmt = con.createStatement();



            //FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)


            ResultSet rs=stmt.executeQuery("SELECT * FROM departamento ORDER BY nombre DESC");
            while (rs.next()) System.out.println(rs.getString(1)+" "+ rs.getDouble(2));
            //while(rs.next()) System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ "  "+ rs.getString(4)+ "  "+ rs.getString(5));


            //stmt.execute("ALTER TABLE actor RENAME COLUMN apellido to last_name");
            //stmt.execute("ALTER TABLE address RENAME COLUMN phone TO telefono");
            /*stmt.execute("CREATE TABLE Empleado (\n" +
                    "    DNI int,\n" +
                    "    apellido varchar(255),\n" +
                    "    nombre varchar(255),\n" +
                    "    nacionalidad varchar(255),\n" +
                    "    departamento varchar(255)\n" +
                    ");");*/
            //System.out.println(result + " records affected");
            /*stmt.execute("ALTER TABLE Empleado\n" +
                    "ADD PRIMARY KEY (DNI);");*/


            /*stmt.execute("CREATE TABLE departamento(" +
                    "nombre varchar(255) NOT NULL, " +
                    "id int NOT NULL, " +
                    "presupuesto double NOT NULL," +
                    "PRIMARY KEY (id)" +
                    ")");*/


            /*stmt.execute("INSERT INTO empleado(dni, nombre, apellido, nacionalidad, departamento)" +
                    "VALUES (8888888, 'manuelito', 'gonzales', 'mexicano', 'logistica')");*/

            /*stmt.execute("INSERT INTO empleado " +
                    "VALUES (999999, 'gonzales', 'manuelazo', 'mexicano', 'HR')");*/




            //Cerramos la conexion para que la DB no ocupe recursos innecesarios
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
