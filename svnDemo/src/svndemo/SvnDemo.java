/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svndemo;

import beans.Staff;

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
        String[] dept = {"IT", "EC", "CIVIL", "IT"};
        
        Staff staffObj;
        for(int i=1; i<5; i++)
        {
            staffObj = new Staff(i, names[i-1], dept[i-1]);
            System.out.println("Staff Name = " + staffObj.getEmpName() + " , Dept = " + staffObj.getEmpDept());
        }
    }
    
}
