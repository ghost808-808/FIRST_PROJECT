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
// Arrays to store task details
    static String[] developers = new String[100];
    static String[] taskNames = new String[100];
    static String[] taskID = new String[100];
    static int[] taskDuration = new int[100];
    static String[] taskStatuses = new String[100];
    static int taskCount = 0;
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
    
    do{
    System.out.println("Add Task");
    System.out.println("Display task with status");
    System.out.println("Display task with longest duration");
    System.out.println("Search task by name");
    System.out.println("Search task by developer");
    System.out.println("Delete task by name");
    System.out.println("Display all tasks");
    System.out.println("Exit");
    System.out.print("Enter your choice: ");
    choice = user_input.nextInt();
    user_input.nextLine();
    
    switch(choice){
    
        case 1:
            addTask(user_input);
            break;
        case 2:
            displayTasksWithStatusDone();
            break;
        case 3:
            displayTaskWithLongestDuration();
            break;
        case 4:
            searchTasksByName(user_input);
            break;
        case 5:
            searchTasksByName(user_input);
            break;
        case 6:
            deleteTaskByName(user_input);
            break;
        case 7:
            displayAllTasks();
            break;
        case 8:
            System.out.println("Exiting");
            break;
        default:
            System.out.println("Invalid choice. Please try again");
    }
    }while(choice !=8);
    }
    public static void addTask(Scanner user_input){
    System.out.print("Enter developer name:");
    developers[taskCount] = user_input.nextLine();
    System.out.print("Enter task name:");
    taskNames[taskCount] = user_input.nextLine();
    System.out.print("Enter task ID: ");
    taskID[taskCount] = user_input.nextLine();
    System.out.print("Enter task duration: ");
    taskDuration[taskCount] = user_input.nextInt();
    user_input.nextLine(); // Consume newline
    System.out.print("Enter task status: ");
    taskStatuses[taskCount] = user_input.nextLine();
    taskCount++;
    System.out.println("Task added successfully.");
    }
    
    public static void displayTasksWithStatusDone(){
    System.out.println("Tasks with status 'Done':");
    for (int i = 0; i < taskCount; i++){
    if (taskStatuses[i].equalsIgnoreCase("Done")){
        System.out.println("Developer:" + developers[i] + "Task Name:" + taskNames[i] + "Task Duration:" + taskDuration[i]);
        }
       }
     }
    
    public static void displayTaskWithLongestDuration(){
    int maxDurationIndex = 0;
    for (int i = 1; i < taskCount; i++){
    if (taskDuration[i] > taskDuration[maxDurationIndex]){
    maxDurationIndex = i;
    }
    }
    System.out.println("Task with longest duration:");
    System.out.println("Developer:" + "Task Duration:" + taskDuration[maxDurationIndex]);
    }
    


    
    }


    
        
      

