/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pkgfinal.poe;

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
public class KanbanSystemTest {
    
    public KanbanSystemTest() {
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
     * Test of setPassword method, of class KanbanSystem.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        KanbanSystem instance = new KanbanSystem();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class KanbanSystem.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        KanbanSystem instance = new KanbanSystem();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class KanbanSystem.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        KanbanSystem instance = new KanbanSystem();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class KanbanSystem.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        KanbanSystem instance = new KanbanSystem();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class KanbanSystem.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        KanbanSystem instance = new KanbanSystem();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class KanbanSystem.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        KanbanSystem instance = new KanbanSystem();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class KanbanSystem.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        KanbanSystem instance = new KanbanSystem();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class KanbanSystem.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        KanbanSystem instance = new KanbanSystem();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUsernameValid method, of class KanbanSystem.
     */
    @Test
    public void testIsUsernameValid() {
        System.out.println("isUsernameValid");
        String username = "";
        KanbanSystem instance = new KanbanSystem();
        boolean expResult = false;
        boolean result = instance.isUsernameValid(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordValid method, of class KanbanSystem.
     */
    @Test
    public void testIsPasswordValid() {
        System.out.println("isPasswordValid");
        String password = "";
        KanbanSystem instance = new KanbanSystem();
        boolean expResult = false;
        boolean result = instance.isPasswordValid(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class KanbanSystem.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        KanbanSystem instance = new KanbanSystem();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class KanbanSystem.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String enteredPassword = "";
        KanbanSystem instance = new KanbanSystem();
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class KanbanSystem.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String enteredUsername = "";
        String enteredPassword = "";
        KanbanSystem instance = new KanbanSystem();
        String expResult = "";
        String result = instance.returnLoginStatus(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class KanbanSystem.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        KanbanSystem.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of runKanbanSystem method, of class KanbanSystem.
     */
    @Test
    public void testRunKanbanSystem() {
        System.out.println("runKanbanSystem");
        KanbanSystem.runKanbanSystem();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addTasks method, of class KanbanSystem.
     */
    @Test
    public void testAddTasks() {
        System.out.println("addTasks");
        KanbanSystem.addTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showReport method, of class KanbanSystem.
     */
    @Test
    public void testShowReport() {
        System.out.println("showReport");
        KanbanSystem.showReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDescription method, of class KanbanSystem.
     */
    @Test
    public void testCheckDescription() {
        System.out.println("checkDescription");
        String description = "";
        boolean expResult = false;
        boolean result = KanbanSystem.checkDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class KanbanSystem.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "";
        int index = 0;
        String developer = "";
        String expResult = "";
        String result = KanbanSystem.createTaskID(taskName, index, developer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chooseTaskStatus method, of class KanbanSystem.
     */
    @Test
    public void testChooseTaskStatus() {
        System.out.println("chooseTaskStatus");
        String expResult = "";
        String result = KanbanSystem.chooseTaskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class KanbanSystem.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String status = "";
        String developer = "";
        int index = 0;
        String taskName = "";
        String description = "";
        String taskID = "";
        int time = 0;
        KanbanSystem.printTaskDetails(status, developer, index, taskName, description, taskID, time);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showGeneralReport method, of class KanbanSystem.
     */
    @Test
    public void testShowGeneralReport() {
        System.out.println("showGeneralReport");
        KanbanSystem.showGeneralReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showCompletedTasks method, of class KanbanSystem.
     */
    @Test
    public void testShowCompletedTasks() {
        System.out.println("showCompletedTasks");
        KanbanSystem.showCompletedTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showLongestDurationTask method, of class KanbanSystem.
     */
    @Test
    public void testShowLongestDurationTask() {
        String founder ="";
        System.out.println("showLongestDurationTask");
        KanbanSystem.showLongestDurationTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class KanbanSystem.
     */
    @Test
    public void testSearchTaskByName() {
        String checking = "mike smith";
        boolean varify = false;
        System.out.println("searchTaskByName");
        KanbanSystem.searchTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class KanbanSystem.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        String DEV = "SAMANTHA PAULSON";
        String tasknameing = "create reports";
        System.out.println("searchTasksByDeveloper");
        KanbanSystem.searchTasksByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class KanbanSystem.
     */
    @Test
    public void testDeleteTask() {
        String deletename ="create reports";
        boolean deletetask =false;
        System.out.println("deleteTask");
        KanbanSystem.deleteTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnHours method, of class KanbanSystem.
     */
    @Test
    public void testReturnHours() {
        System.out.println("returnHours");
        int hours = 0;
        int expResult = 0;
        int result = KanbanSystem.returnHours(hours);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
