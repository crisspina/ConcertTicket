
package Utility;

import dataaccess.DBConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DatabaseInitialization {
    
      public static void main(String[] args) {
        createTablesCustomer();
        initializeDb(true);
    }

    public static void reNew() {
        createTablesCustomer();
        initializeDb(false);
    }

    private static void createTablesCustomer() {
    try (Connection conn = DBConnection.getConnection();
            Statement stm = conn.createStatement()) {
            try {stm.executeUpdate("DROP TABLE customer");} catch (SQLException ex) {}
           
            
            
            try {stm.executeUpdate("CREATE TABLE Customer (idNumber INT NOT NULL, firstname VARCHAR(50) NOT NULL, lastname VARCHAR(50) NOT NULL, email VARCHAR(100) NOT NULL, PRIMARY KEY (idNumber))");} catch (SQLException ex) {}
           

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void initializeDb(boolean b) {
        String sqlCustomer = "INSERT INTO customer VALUES(?,?,?,?)";

        try (Connection conn = DBConnection.getConnection();
                PreparedStatement stmC = conn.prepareStatement(sqlCustomer);){

            Scanner sc;
            
            try {
                if (b) {
                    System.out.println("\n--- Import Customer ---");
                    sc = new Scanner(new File("file/customers"));
                    String line;
                    
                    try {
                        while ((line = sc.nextLine()) != null) {
                            String[] temp = line.split(",");
                            stmC.setString(1, temp[0]);
                            stmC.setString(2, temp[1]);
                            stmC.setLong(3, Long.parseLong(temp[2]));
                            stmC.setString(4, temp[3]);
                            stmC.executeUpdate();
                            if (b) {
                                System.out.println("Insert: " + line);
                            }
                        }
                    } catch (NoSuchElementException ex) {}
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
