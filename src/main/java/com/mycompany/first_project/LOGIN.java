/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_project;

import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class LOGIN {
     //check username
    public boolean CheckUsername(String username){
    //temp variable for checking
    boolean Found = false;
    
    //check the username 
    if(username.contains("_")){
    //then assign to true
    Found = true;
    //message
    System.out.println("Username is captured");
    }else{
        //assign to false
        Found = false;
        //message 
        System.out.println("Username is not captured");
    }
    return Found;
    }
    
    //check the password
    public boolean checkPassword(String password){
    //pattern regex
    Pattern check_num = Pattern.compile("[0123456789]");
    Pattern check_specials = Pattern.compile("!`~@#$%^&*:;'_-/,");
    Pattern check_uppercase = Pattern.compile("[QWERTYUIOPASDFGHJKLZXCVBNM]");
    
    //temp variables
    boolean Found = false;
    
    //check all here 
    if(check_num.matcher(password).find() && check_specials.matcher(password).find() && check_uppercase.matcher(password).find()){
     //assign true
     Found = true;
     //message
     System.out.println("Password is captured");
    
    }else{
    //assign true
    Found = true;
    //message
    System.out.println("Password is not captured");
    }
    return Found;
    }
}