/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.first_project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskMethodsIT {
    
    public TaskMethodsIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of populateDevelopers method, of class TaskMethods.
     */
    @Test
    public void testPopulateDevelopers() {
        System.out.println("populateDevelopers");
        int numDevelopers = 0;
        TaskMethods instance = new TaskMethods();
        String[] expResult = null;
        String[] result = instance.populateDevelopers(numDevelopers);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateTaskNames method, of class TaskMethods.
     */
    @Test
    public void testPopulateTaskNames() {
        System.out.println("populateTaskNames");
        int numTasks = 0;
        TaskMethods instance = new TaskMethods();
        String[] expResult = null;
        String[] result = instance.populateTaskNames(numTasks);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateTaskIDs method, of class TaskMethods.
     */
    @Test
    public void testPopulateTaskIDs() {
        System.out.println("populateTaskIDs");
        int numTasks = 0;
        TaskMethods instance = new TaskMethods();
        String[] expResult = null;
        String[] result = instance.populateTaskIDs(numTasks);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateTaskDurations method, of class TaskMethods.
     */
    @Test
    public void testPopulateTaskDurations() {
        System.out.println("populateTaskDurations");
        int numTasks = 0;
        TaskMethods instance = new TaskMethods();
        int[] expResult = null;
        int[] result = instance.populateTaskDurations(numTasks);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of populateTaskStatuses method, of class TaskMethods.
     */
    @Test
    public void testPopulateTaskStatuses() {
        System.out.println("populateTaskStatuses");
        int numTasks = 0;
        TaskMethods instance = new TaskMethods();
        String[] expResult = null;
        String[] result = instance.populateTaskStatuses(numTasks);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayCompletedTasks method, of class TaskMethods.
     */
    @Test
    public void testDisplayCompletedTasks() {
        System.out.println("displayCompletedTasks");
        TaskMethods instance = new TaskMethods();
        instance.displayCompletedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class TaskMethods.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskMethods instance = new TaskMethods();
        instance.displayLongestTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class TaskMethods.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        TaskMethods instance = new TaskMethods();
        instance.searchTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskMethods.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        TaskMethods instance = new TaskMethods();
        instance.searchTasksByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class TaskMethods.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        TaskMethods instance = new TaskMethods();
        instance.deleteTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasks method, of class TaskMethods.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        TaskMethods instance = new TaskMethods();
        instance.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
