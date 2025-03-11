/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {
    
    public String strSecondClassVar="Testing";
    

    public static void main(String[] args) {
        System.out.println("Hello World! i just did github ");
        newClass nc = new newClass();
        
        nc.helloClass();// have to use the variable name to communicate with the class.
        
        System.out.println(nc.strSecondClassVar);
    }
}
