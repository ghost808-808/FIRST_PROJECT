/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_project;

/**
 *
 * @author RC_Student_lab
 */
//task class representing a task with attributes and methods
public class Task {
    String taskName;
    int taskNumber;
    String taskDescription;
    String developerDetails;
    int taskDuration;
    String taskID;
    String taskStatus;
    // constructor to initialize task attributes
    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus){
        
     this.taskName = taskName;
     this.taskNumber = taskNumber;
     this.taskDescription = taskDescription;
     this.developerDetails = developerDetails;
     this.taskID = createTaskID();
     this.taskStatus = taskStatus;
     
    }
    //method to check if task description exeeds 50 characters
    public boolean checkTaskDescription(){
     return taskDescription.length() <= 50;
    
    }
    //method to auto-generate task ID
    public String createTaskID(){
    return (taskName.substring(0,2).toUpperCase() + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length()-3).toUpperCase());
    }
    //Method to print task details
    public String printTaskDetails(){
    return "Task Status:" + taskStatus + "\nDeveloper Details:" + developerDetails + "\nTask Number:" + taskNumber + "\nTask Name:" + taskName + "\nTask Description:" + taskDescription + "\nTask ID:" + taskID + "\nDuration:" + taskDuration + "hours";
    }
    //method to return total hours
    public int returnTotalHours(){
     return  taskDuration;
    }
    
        
}
