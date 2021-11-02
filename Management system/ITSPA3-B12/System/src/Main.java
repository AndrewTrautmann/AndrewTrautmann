
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trist
 */
public class Main {
    ResultSet rs;
    Connection con;
    Statement stmnt;

    

    public void disconnect(){
        try {
           rs.close();
           stmnt.close();
           con.close();
        } catch (Exception e) {
        }             
    }
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        
    }
    
}
