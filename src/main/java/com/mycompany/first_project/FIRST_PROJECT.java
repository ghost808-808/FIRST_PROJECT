/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.first_project;


import java.util.*;

/**
 *
 * @author RC_Student_lab
 */
public class FIRST_PROJECT {

    
      public static void main(String[] args) {
        //login instance;
        LOGIN check_all = new LOGIN();
        
        //object for our scanner
        Scanner user_input = new Scanner(System.in);
        
        //promting the username and password
        String firstname = "";
        String lastname = "";
        String username = "";
        String password = "";
        
        //use do while
        do {
         //promt
         System.out.println("enter username: ");
         username = user_input.nextLine();
         
        }while(!check_all.CheckUsername(username));
        
        //user do while for password
        do{
         //prompt
         System.out.println("enter password: ");
         password = user_input.nextLine();
         
        }while(!check_all.checkPassword(password));
        
        System.out.println("enter firstname:");
        firstname = user_input.nextLine();
        System.out.println("enter lastname:");
        lastname = user_input.nextLine();
        
        System.out.println("welcome," + firstname + lastname);
        
        System.out.println(check_all.registerUser("user_", "password"));
        System.out.println(check_all.returnLoginStatus("user_", "password1"));
        System.out.println(check_all.returnLoginStatus("user_", "wrongpass"));
        
    }
    
        
      
}
