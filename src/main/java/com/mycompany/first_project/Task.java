/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_project;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    String taskName;
    int taskNumber;
    String taskDescription;
    String developerDetails;
    double taskDuration;
    String taskID;
    String taskStatus;
    
    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, double taskDuration, String taskStatus){
        
     this.taskName = taskName;
     this.taskNumber = taskNumber;
     this.taskDescription = taskDescription;
     this.developerDetails = developerDetails;
     this.taskID = createTaskID();
     this.taskStatus = taskStatus;
     
    }
    
    public boolean checkTaskDescription(){
     return taskDescription.length() <= 50;
    
    }
    
    public String createTaskID(){
    return (taskName.substring(0,2).toUpperCase() + ":" + taskNumber + developerDetails.substring(developerDetails.length()-3).toUpperCase());
    }
    
    public String printTaskDetails(){
    return "Task Status:" + taskStatus + "Developer Details:" + developerDetails + "Task Number:" + taskNumber + "Task Name:" + taskName + "Task Description:" + taskDescription + "Task ID:" + taskID + "Duration" + taskDuration + "Hours";
    }
    
    public int returnTotalHours(){
     return (int) taskDuration;
    }
    
        
}
