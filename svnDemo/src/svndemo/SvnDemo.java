/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svndemo;

import beans.*;

/**
 *
 * @author radz
 */
public class SvnDemo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        String[] names = {"abc", "def", "pqr", "xyz"};
        String[] dept = {"Accounts", "Hospitality", "Accounts", "IT"};
        String[] subjects = {"Java", "Networking", "Oracle"}; 
        
        Staff staffObj;
        int i = 1;
        for(; i<4; i++)
        {
            staffObj = new Staff(i, names[i-1], dept[i-1]);
            System.out.println("Staff Name = " + staffObj.getEmpName() + " , Dept = " + staffObj.getEmpDept());
        }
        
        staffObj = new TeachingStaff(i, names[i-1], dept[i-1], subjects);
        System.out.println("Staff Name = " + staffObj.getEmpName() + " , Dept = " + staffObj.getEmpDept() + " , Subjects = [" + staffObj.showSubjects() + "]");
        
//        TeachingStaff teacherObj = new TeachingStaff(i, names[i-1], dept[i-1], subjects);
//        System.out.println("Staff Name = " + teacherObj.getEmpName() + " , Dept = " + teacherObj.getEmpDept() + " , Subjects = [" + teacherObj.showSubjects() + "]");
    }
    
}
