
public class Project {
    private int projID;
    private String projName, empName, projDesc, projStartDate, projEndDate;
 //, String projDesc
    public Project(int projID, String projName, String empName, String projStartDate, String projEndDate) {
        this.projID = projID;
        this.projName = projName;
        this.empName = empName;
        //this.projDesc = projDesc;
        this.projStartDate = projStartDate;
        this.projEndDate = projEndDate;
    }  

    public int getProjID() {
        return projID;
    }

    public String getProjName() {
        return projName;
    }

    public String getEmpName() {
        return empName;
    }

    public String getProjDesc() {
        return projDesc;
    }

    public String getProjStartDate() {
        return projStartDate;
    }

    public String getProjEndDate() {
        return projEndDate;
    }
    
    
}
