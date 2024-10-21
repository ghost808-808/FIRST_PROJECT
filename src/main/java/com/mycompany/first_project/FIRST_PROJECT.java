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
        
        //declarations
        String firstname = "";
        String lastname = "";
        String username = "";
        String password = "";
        
        //prompts
        System.out.println("enter firstname:");
        firstname = user_input.nextLine();
        System.out.println("enter lastname:");
        lastname = user_input.nextLine();
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
        
        //display
        System.out.println("welcome," + firstname + lastname + ",it is good to see you.");
        //messages
        System.out.println(check_all.registerUser("user_", "password"));
        System.out.println(check_all.returnLoginStatus("user_", "password1"));
        
        
        // get number of tasks from user
        System.out.print("Enter number of tasks:");
        int numTasks = user_input.nextInt();
        
        //intialize task array
        String[] tasks = new String[numTasks];
        
        //menu
//        do{
//        System.out.println("===========MENU===========");
//        System.out.println("1 - AddTasks");
//        System.out.println("2 - ShowReport");
//        System.out.println("3 - Quit");
//        
//        }while(true);

        //menu
        while(true){
        System.out.println("===========MENU===========");
        System.out.println("1 - AddTasks");
        System.out.println("2 - ShowReport");
        System.out.println("3 - Quit");
        
        System.out.print("Enter choice:");
        int choice = user_input.nextInt();
        
        switch(choice){
            case 1:
                //adding tasks
                AddTasks(user_input, tasks);
                break;
            case 2:
                //show report
                ShowReport(tasks);
                break;
            case 3:
                //quit
                System.out.println("Enter zero to exit:");
                int exit = 0;
                break;
            default:
                System.out.println("invalid choice. Please try again");
                
                //
               
                  
        }
   
        }
        
    }
    
        
      
}
