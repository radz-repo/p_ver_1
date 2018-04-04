/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author radz
 */
public class TeachingStaff extends Staff {
    
    private List subjects = new LinkedList(); 

    public TeachingStaff() {}
    
    public TeachingStaff(int empCode, String empName, String empDept) {
        super(empCode, empName, empDept);
    }
    
    public TeachingStaff(int empCode, String empName, String empDept, String[] empSub) {
        super(empCode, empName, empDept);
        for(String subject : empSub)
            subjects.add(subject);
    }
    
    public void addSubjects(String subName)
    {
        subjects.add(subName);
    }
    
    public String showSubjects()
    {
        String strSub = "";
        Iterator itr = subjects.iterator();
        while(itr.hasNext())
        {
            strSub = strSub + itr.next() + ",";
        }
        return strSub.substring(0, strSub.length()-1);
    }
}
