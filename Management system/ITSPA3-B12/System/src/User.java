/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew_Trautmann
 */
class User {
    private int empID;
    private String empRole, empName, empSurname, empConNum, empEmail;
    
    public User(int empID, String empRole, String empName, String empSurname, String empConNum, String empEmail) {
        
        this.empID = empID;
        this.empRole = empRole;
        this.empName = empName;
        this.empSurname = empSurname;
        this.empConNum = empConNum;
        this.empEmail = empEmail;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpRole() {
        return empRole;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public String getEmpConNum() {
        return empConNum;
    }

    public String getEmpEmail() {
        return empEmail;
    }    
}

