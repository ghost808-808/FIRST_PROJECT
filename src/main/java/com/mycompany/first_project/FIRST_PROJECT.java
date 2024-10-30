/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.first_project;


import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

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
        //object for our JOption to appear
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
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
        
        //declaration
        int totalHours = 0 ;
         //welcoming message
        JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanban");
        int choice;
        do{
            // THE NUMERIC MENU
            Object[] options = {"Add Tasks", "Show Report", "Quit"};
            choice = JOptionPane.showOptionDialog(dialog, "Select an option:", "FIRST_PROJECT", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch (choice){
                 //ADD TASKS
                case 0:
                    
                    //PROMTING THE USER FOR NUMBER OF TASKS
                    int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));
                    Task[] tasks = new Task[numTasks]; 
                    //loop to enter task details
                    for(int i = 0; i < numTasks; i++){
          
                    String taskName = JOptionPane.showInputDialog("Enter task name:");
                    String taskDescription = JOptionPane.showInputDialog("Enter task description:");
                    while (taskDescription.length() > 50){
                    taskDescription = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters:");
                    }
                    if (taskDescription.length() <= 50){
                    JOptionPane.showMessageDialog(dialog, "Task successfully captured");
                    }
                    String developerDetails = JOptionPane.showInputDialog("Enter developer details(first and last name):");
                    int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration:"));
                    String[] optionsadditional = {"To Do", "Done", "Doing"};
                    int selection = JOptionPane.showOptionDialog(dialog, "Select task status:", "Task Status",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsadditional, optionsadditional[0]);
                    String taskStatus =  optionsadditional[selection];
                    tasks[i] = new Task(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus);
                    JOptionPane.showMessageDialog(dialog, tasks[i].printTaskDetails());
             
                   totalHours += taskDuration;
            
        }
                    //diplay total hours
                    JOptionPane.showMessageDialog(dialog, "Total Hours:" + totalHours);
                    break;
                //SHOW REPORT
                case 1:
                    // displaying the message
                    JOptionPane.showMessageDialog(dialog, "Coming soon");
                    break;
                 //QUIT
                case 2:
                    
                    System.exit(0);
                    break;
            
            }
        }while(choice != 2);
          
    dialog.dispose();
    }
    
        
      
}
