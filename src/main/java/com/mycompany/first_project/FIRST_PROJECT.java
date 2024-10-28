/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.first_project;


import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
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
       
        
       int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tasks"));
       List<Task> tasks = new ArrayList<>();
       int taskNumber = 0;
       double totalHours = 0;
       
       while(tasks.size()< numTasks){
       
           String taskName = JOptionPane.showInputDialog("Enter task name");
           String taskDescription = JOptionPane.showInputDialog("Enter task description");
          
       
       while(taskDescription.length() > 50){
        
           JOptionPane.showMessageDialog(dialog, "Please enter a task description of less than 50 characters");
           taskDescription = JOptionPane.showInputDialog("Enter task description");
           
       }
       JOptionPane.showMessageDialog(dialog, "Task successfully captured");
       String developerDetails = JOptionPane.showInputDialog("Enter developer's first and last name");
       double taskDuration = Double.parseDouble(JOptionPane.showInputDialog("Enter task duration in hours"));
       totalHours += taskDuration;
       
       String[] statuses = {"To Do", "Done", "Doing"};
       String taskStatus = (String)JOptionPane.showInputDialog(dialog, "Select task status", "Task Status", JOptionPane.QUESTION_MESSAGE, null, statuses, statuses[0]);
       
       Task task = new Task(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
       tasks.add(task);
       
       JOptionPane.showMessageDialog(dialog, task.toString());
       taskNumber++;
       
       }
       
       JOptionPane.showMessageDialog(dialog, "Total hours across all tasks: " + totalHours);
      
        
        dialog.dispose();
    }
    
        
      
}
