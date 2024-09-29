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
    if(username.contains("_") && (username.length() <= 5)){
    //then assign to true
    Found = true;
    //message
    System.out.println("Username is captured");
    }else{
        //assign to false
        Found = false;
        //message 
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no  more than 5 characters long.");
    }
    return Found;
    }
    
    //check the password
    public boolean checkPassword(String password){
    //pattern regex
    Pattern check_num = Pattern.compile("[0123456789]");
    Pattern check_specials = Pattern.compile("[!@#$%^&*()-_]");
    Pattern check_uppercase = Pattern.compile("[QWERTYUIOPASDFGHJKLZXCVBNM]");
    
    //temp variables
    boolean Found = false;
    
    //check all here 
    if(check_num.matcher(password).find() && check_specials.matcher(password).find() && check_uppercase.matcher(password).find() && (password.length() >= 8)){
     //assign true
     Found = true;
     //message
     System.out.println("Password successfully captured");
    
    }else{
      //assign true
      Found = false;
      //message
      System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }
    return Found;
    }
     //register user
     private String registeredUsername;
     private String registeredPassword;
     
     public String registerUser(String username, String password){
      if (!username.matches("[a-zA-z0-9_]{1,5}") && (!username.contains("_"))){
      return "username is incorrectly formated";
      }
      if (password.length()<8 && (!password.matches("[QWERTYUIOPASDFGHJKLZXCVBNM]") && (!password.matches("[0123456789]") && (!password.matches("[!@#$%^&*()]"))))){
      return "password does not meet the requirements";
      }
      this.registeredPassword = password;
      this.registeredUsername = username;
     return "user has been registered successfully";
      }
     
     
     
     //login user
     public boolean loginUser(String username, String password){
     return username.equals(registeredUsername) && password.equals(registeredPassword);
     
     }
     //returning login status
     public String returnLoginStatus(String username, String password){
      if (username.equals(registeredUsername) && (password.equals(registeredPassword))){
      return "login successful";
      }else{
       return "login failed";
       } 
     }
    }

    

    