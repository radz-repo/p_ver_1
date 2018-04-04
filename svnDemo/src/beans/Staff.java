/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author radz
 */
public class Staff {
    
    private int empCode;
    private String empName;
    private String empDept;
    
    public Staff() {}
    
    public Staff(int empCode, String empName, String empDept)
    {
        this.empCode = empCode;
        this.empName = empName;
        this.empDept = empDept;
    }

    public int getEmpCode() {
        return empCode;
    }

//    public void setEmpCode(int empCode) {
//        this.empCode = empCode;
//    }

    public String getEmpName() {
        return empName;
    }

//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }

    public String getEmpDept() {
        return empDept;
    }

//    public void setEmpDept(String empDept) {
//        this.empDept = empDept;
//    }
    
    public String showSubjects()
    {
        return null;
    }
}
