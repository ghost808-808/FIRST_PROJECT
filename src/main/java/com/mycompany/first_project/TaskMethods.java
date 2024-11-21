/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.first_project;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class TaskMethods {
    //Method to populate the developers array
    public String[] populateDevelopers(int numDevelopers) {
        String[] developers = new String[numDevelopers];
        for (int i = 0; i < numDevelopers; i++) {
            developers[i] = JOptionPane.showInputDialog("Enter developer " + (i + 1) + "'s name:");
        }
        return developers;
    }
    //Method to populate the task names array
      public String[] populateTaskNames(int numTasks) {
        String[] taskNames = new String[numTasks];
        for (int i = 0; i < numTasks; i++) {
            taskNames[i] = JOptionPane.showInputDialog("Enter task " + (i + 1) + " name:");
        }
        return taskNames;
    }
      //Method to populate the task IDs array
        public String[] populateTaskIDs(int numTasks) {
        String[] taskIDs = new String[numTasks];
        for (int i = 0; i < numTasks; i++) {
            taskIDs[i] = JOptionPane.showInputDialog("Enter task " + (i + 1) + " ID:");
        }
        return taskIDs;
    }
        //Method to populate the task durations array
    public int[] populateTaskDurations(int numTasks) {
        int[] taskDurations = new int[numTasks];
        for (int i = 0; i < numTasks; i++) {
            taskDurations[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter task " + (i + 1) + " duration (days):"));
        }
        return taskDurations;
    }
  //Method to populate the task statuses array
    public String[] populateTaskStatuses(int numTasks) {
        String[] taskStatuses = new String[numTasks];
        for (int i = 0; i < numTasks; i++) {
            taskStatuses[i] = JOptionPane.showInputDialog("Enter task " + (i + 1) + " status (e.g., 'In Progress', 'Done'):");
        }
        return taskStatuses;
    }
    //Method to display completed tasks
       public void displayCompletedTasks() {
        String completedTasks = "\nCompleted Tasks:\n";
        for (int i = 0; i < FIRST_PROJECT.taskNames.length; i++) {
            if (FIRST_PROJECT.taskStatuses[i].equals("Done")) {
                completedTasks += "Task Name: " + FIRST_PROJECT.taskNames[i] + "\n" +
                        "Developer: " + FIRST_PROJECT.developers[i % FIRST_PROJECT.developers.length] + "\n" +
                        "Task Duration: " + FIRST_PROJECT.taskDurations[i] + " days\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, completedTasks);
    }
       //Method to display the longest task
     public void displayLongestTask() {
        int longestTaskIndex = 0;
        for (int i = 1; i < FIRST_PROJECT.taskDurations.length; i++) {
            if (FIRST_PROJECT.taskDurations[i] > FIRST_PROJECT.taskDurations[longestTaskIndex]) {
                longestTaskIndex = i;
            }
        }
        String longestTask = "\nLongest Task:\n" +
                "Task Name: " + FIRST_PROJECT.taskNames[longestTaskIndex] + "\n" +
                "Developer: " + FIRST_PROJECT.developers[longestTaskIndex % FIRST_PROJECT.developers.length] + "\n" +
                "Task Duration: " + FIRST_PROJECT.taskDurations[longestTaskIndex] + " days";
        JOptionPane.showMessageDialog(null, longestTask);
    }
     //Method to search for a task by task name
     public void searchTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter task name to search:");
        for (int i = 0; i < FIRST_PROJECT.taskNames.length; i++) {
            if (FIRST_PROJECT.taskNames[i].equals(taskName)) {
                String taskDetails = "\nTask Name: " + FIRST_PROJECT.taskNames[i] + "\n" +
                        "Developer: " + FIRST_PROJECT.developers[i % FIRST_PROJECT.developers.length] + "\n" +
                        "Task Status: " + FIRST_PROJECT.taskStatuses[i];
                JOptionPane.showMessageDialog(null, taskDetails);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found");
    }
     //Method o search for a task by developer details(name)
      public void searchTasksByDeveloper() {
        String developerName = JOptionPane.showInputDialog("Enter developer name to search:");
        String tasks = "\nTasks assigned to " + developerName + ":\n";
        for (int i = 0; i < FIRST_PROJECT.taskNames.length; i++) {
            if (FIRST_PROJECT.developers[i % FIRST_PROJECT.developers.length].equals(developerName)) {
                tasks += "Task Name: " + FIRST_PROJECT.taskNames[i] + "\n" +
                        "Task Status: " + FIRST_PROJECT.taskStatuses[i] + "\n\n";
            }
        }
        JOptionPane.showMessageDialog(null, tasks);
      }

//Method that deletes the task by name
    public void deleteTask() {
        String taskName = JOptionPane.showInputDialog("Enter task name to delete");
        
    }
    public void displayAllTasks() { StringBuilder result = new StringBuilder("All captured tasks:\n");
    int taskCount = 0;
    for (int i = 0; i < FIRST_PROJECT.taskCount; i++) { result.append("Developer: ").append(FIRST_PROJECT.developers[i]) .append(", Task Name: ").append(FIRST_PROJECT.taskNames[i]) .append(", Task ID: ").append(FIRST_PROJECT.taskIDs[i]) .append(", Task Duration: ").append(FIRST_PROJECT.taskDurations[i]) .append(", Task Status: ").append(FIRST_PROJECT.taskStatuses[i]) .append("\n"); } 
    JOptionPane.showMessageDialog(null, result.toString()); }
    
}
