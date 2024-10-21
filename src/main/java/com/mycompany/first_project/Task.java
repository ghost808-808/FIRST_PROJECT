/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_project;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
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
     this.taskID = generateTaskID(taskName, taskNumber, developerDetails);
     this.taskStatus = taskStatus;
    }
    
   private String generateTaskID(String taskName, int taskNumber, String developerDetails) {
        String[] developerNames = developerDetails.split(" ");
        return (taskName.substring(0, 2) + ":" + taskNumber + ":" + developerNames[developerNames.length - 1].substring(developerNames[developerNames.length - 1].length() - 3)).toUpperCase();
    }
   
   public String toString(){
    return"Task Status:" + taskStatus + "Developer Details:" + developerDetails + "Task Number:" + taskNumber + "Task Name:" + taskName + "Task Description:" + taskDescription + "Task ID:" + taskID + "Duration:" + taskDuration + "hours.";
   
   }
     
    

    
}
