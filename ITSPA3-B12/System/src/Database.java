
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrew_Trautmann
 */
public class Database {

    ResultSet rs;
    Connection con;
    Statement stmnt;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // making a connection with the mysql database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chop_gui?useSSL=false", "root", "root");
            stmnt = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection error" + e);
        }
    }

    public void disconnect() {
        try {
            rs.close();
            stmnt.close();
            con.close();
        } catch (Exception e) {
        }
    }

    public void addEmpRecord(String empName, String empSurname, String empID, String empContactNum, String empEmail, String empRole) {
        try {
            stmnt.executeUpdate("INSERT INTO Employee(empID,empRole,empName,empSurN, empConNum, empEmail)" + "VALUES(" + empID + ",'" + empRole + "','" + empName + "','" + empSurname + "','" + empContactNum + "','" + empEmail + "')");
            JOptionPane.showMessageDialog(null, "You have successfully added an employee!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error at adding employee record " + e);
        }
    }
    
    public void removeEmpRecord(){
        try {
            PreparedStatement pstmnt = con.prepareStatement("");
        } catch (Exception e) {
        }
        
    }
    
    public void addNewProject(String projName, String clientName, String vatRegNo, String projContactPerson, String clientEmail, String clientContactNo, String userStartDate,String userEndDate) {
        try {
            stmnt.executeUpdate("INSERT INTO Project(projName,projStartDate, projEndDate, clientName, clientContact, vatRegNo, clientConNum, clientEmail)" + "VALUES('" + projName + "','" + userStartDate + "','" + userEndDate + "','" + clientName + "','" + projContactPerson + "','" + vatRegNo + "','" + clientContactNo + "','" + clientEmail + "')");
            JOptionPane.showMessageDialog(null, "You have successfully added a project!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error at adding employee record " + e);
        }
    }

    public void deleteEmployeeRecord (String empID){
        try {
            stmnt.executeUpdate("DELETE FROM Employee WHERE empID = '" + empID + "'");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error at deleting employee record from database: "+e);
        }
    }
    public void deleteProjectRecord(String projName){
        try {
            stmnt.executeUpdate("DELETE FROM Project WHERE projName = '" + projName + "'");
            JOptionPane.showMessageDialog(null, "Project record has been removed from the database");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error at deleting project record from database: "+e);
        }
    }

}
