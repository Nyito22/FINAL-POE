/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.poe;
import javax.swing.JOptionPane;

        public class KanbanSystem {
  //part2 declaration
    private static int total = 0;
    private static int size= 0;
    private static String[] taskname;
    private static String[] developer;
    private static String[] TaskDescript;
    private static int[] Duration;
    private static String[] TASKID;
    private static String[] Option;
    private static String[] DELETE = {"Delete", "Cancel"};
    //part1
    private String password, username, firstName, lastName;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isUsernameValid(String username) {
        if (username.length() >= 5 && username.contains("_")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "The username does not meet the requirements. Please ensure that the username has an underscore and contains at least 5 characters.");
            return false;
        }
    }

    public boolean isPasswordValid(String password) {
        boolean passwordDigit = false;
        boolean passwordSpecial = false;
        boolean passwordUpper = false;

        for (char singlePassword : password.toCharArray()) {
            if (Character.isUpperCase(singlePassword)) {
                passwordUpper = true;
            }
            if (Character.isDigit(singlePassword)) {
                passwordDigit = true;
            }
            if (!Character.isLetterOrDigit(singlePassword)) {
                passwordSpecial = true;
            }
        }

        if (password.length() < 8 || !passwordDigit || !passwordSpecial || !passwordUpper) {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted. Please ensure that the password is at least 8 characters long, contains at least one uppercase letter, one digit, and one special character.");
            return false;
        } else {
            return true;
        }
    }

    public String registerUser(String username, String password) {
        if (isUsernameValid(username) && isPasswordValid(password)) {
            setUsername(username);
            setPassword(password);
            return "User registered successfully";
        } else {
            return "Username or password does not meet the criteria";
        }
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Login successful!";
        } else {
            return "Incorrect username or password";
        }
    }

    public static void main(String[] args) {
       KanbanSystem account = new KanbanSystem();
        String username = JOptionPane.showInputDialog(null, "Enter username:");
        String password = JOptionPane.showInputDialog(null, "Enter password:");

        String registrationStatus = account.registerUser(username, password);
        JOptionPane.showMessageDialog(null, registrationStatus);

        if (registrationStatus.equals("User registered successfully")) {
            String enteredUsername = JOptionPane.showInputDialog(null, "Enter username:");
            String enteredPassword = JOptionPane.showInputDialog(null, "Enter password:");

            String loginStatus = account.returnLoginStatus(enteredUsername, enteredPassword);
            JOptionPane.showMessageDialog(null, loginStatus);
 }
        
        runKanbanSystem();
    }

    public static void runKanbanSystem() {
        
        JOptionPane.showMessageDialog(null, "Welcome to easy kanbaan \n" , "HOMEPAGE", JOptionPane.INFORMATION_MESSAGE);

        int select = 0;
        while (select != 3) {
            try {
                select = Integer.parseInt(JOptionPane.showInputDialog("Choose an option to proceed with:\n1: Add tasks\n2: Show report\n3: QUIT"));

                switch (select) {
                    case 1:
                        addTasks();
                        break;
                    case 2:
                        showReport();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "The total hours of all the tasks performed: " + total + " hrs");
                        JOptionPane.showMessageDialog(null, "GOODBYE!!!");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, please choose the correct option", "Invalid option", JOptionPane.WARNING_MESSAGE);
                        break;
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An error occurred.");
            }
        }
    }

    public static void addTasks() {
        
         size= Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you wish to capture?"));

        taskname = new String[ size];
        developer = new String[ size];
        TaskDescript = new String[ size];
        Duration= new int[ size];
        TASKID = new String[ size];
        Option = new String[ size];

        for (int i = 0; i <  size; i++) {
            taskname[i] = JOptionPane.showInputDialog("Enter task name");

            do {
                TaskDescript[i] = JOptionPane.showInputDialog("Enter task description (less than 50 characters)");
            } while (!checkDescription(TaskDescript[i]));

            developer[i] = JOptionPane.showInputDialog("Enter developer details (firstname and lastname)");

            Duration[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter Task Details (in hours)"));

            TASKID[i] = createTaskID(taskname[i], i, developer[i]);

            JOptionPane.showMessageDialog(null, "Task id \n" + TASKID[i]);

           Option[i] = chooseTaskStatus();

            printTaskDetails(Option[i], developer[i], i, taskname[i], TaskDescript[i], TASKID[i], Duration[i]);

            total += returnHours(Duration[i]);
        }
    }

    public static void showReport() {
        int options = Integer.parseInt(JOptionPane.showInputDialog("Choose an option to proceed with:\n1: Show report\n2: View all completed tasks\n3: Display the task with the longest duration\n4: Search for Task\n5: Search Tasks by Developer\n6: Delete a Task"));

        switch (options) {
            case 1:
                showGeneralReport();
                break;
            case 2:
                showCompletedTasks();
                break;
            case 3:
                showLongestDurationTask();
                break;
            case 4:
                searchTaskByName();
                break;
            case 5:
                searchTasksByDeveloper();
                break;
            case 6:
                deleteTask();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option, please choose the correct option", "Invalid option", JOptionPane.WARNING_MESSAGE);
                break;
        }
    }

    public static boolean checkDescription(String description) {
        return description.length() < 50;
    }
//method that creates Task id
    public static String createTaskID(String taskName, int index, String developer) {
        // Simplified task ID creation logic
        String task = taskName.substring(0, 2)+ ":"+ index + ":"  + developer.substring(0, 3);
        return task.toUpperCase() ;
    }
    
//method that creates the task status
    public static String chooseTaskStatus() {
        // Simplified task status selection logic
        return JOptionPane.showInputDialog("Choose task status (e.g., To Do , Done, Doing)");
    }
//method that prints the reports
    public static void printTaskDetails(String status, String developer, int index, String taskName, String description, String taskID, int time) {
        StringBuilder display = new StringBuilder();
        display.append("Task Details:\n")
                .append("Status: ").append(status).append("\n")
                .append("Developer: ").append(developer).append("\n")
                .append("Task number: ").append(index).append("\n")
                .append("Task name: ").append(taskName).append("\n")
                .append("Task Description: ").append(description).append("\n")
                .append("Task ID: ").append(taskID).append("\n")
                .append("Duration: ").append(time).append(" hours\n")
                .append("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");

        JOptionPane.showMessageDialog(null, display.toString(), "Task Details", JOptionPane.PLAIN_MESSAGE);
    }
//report of the tasks performed
    public static void showGeneralReport() {
        StringBuilder report = new StringBuilder();

        for (int i = 0; i <  size; i++) {
            report.append("Task status: ").append(Option[i])
                    .append("\nDeveloper: ").append(developer[i])
                    .append("\nTask number: ").append(i)
                    .append("\nTask name: ").append(taskname[i])
                    .append("\nTask Description: ").append(TaskDescript[i])
                    .append("\nTask ID: ").append(TASKID[i])
                    .append("\nDuration: ").append(Duration[i]).append(" hours\n")
                    .append("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>\n");
        }

        if ( size == 0) {
            JOptionPane.showMessageDialog(null, "Please add tasks to view reports", "No tasks to review", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, report.toString(), "Task report", JOptionPane.PLAIN_MESSAGE);
        }
    }
 //method that show all the tasks that are completed
    public static void showCompletedTasks() {
        
        StringBuilder completedTasks = new StringBuilder();
        int found = 0;

        for (int i = 0; i <  size; i++) {
            if ("DONE".equalsIgnoreCase(Option[i])) {
                completedTasks.append("Task name: ").append(taskname[i])
                        .append("\nDeveloper: ").append(developer[i])
                        .append("\nTask Duration: ").append(Duration[i]).append(" hours\n")
                        .append("*\n");
                found++;
            }
        }

        if (found > 0) {
            JOptionPane.showMessageDialog(null, completedTasks.toString(), "Completed tasks", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No tasks are complete");
        }
    }
 //method that displays the task with the longest duration
    public static void showLongestDurationTask() {
        if ( size == 0) {
            JOptionPane.showMessageDialog(null, "Please add tasks to view the longest duration");
        } else {
            int longestDuration = 0;
            String developerWithLongestDuration = null;

            for (int i = 0; i <  size; i++) {
                if (Duration[i] > longestDuration) {
                    longestDuration = Duration[i];
                    developerWithLongestDuration = developer[i];
                }
            }

            JOptionPane.showMessageDialog(null, "Developer with the longest task duration: " + developerWithLongestDuration + "\nLongest Duration: " + longestDuration + " hours");
        }
    }
//method that searches for a task name
    public static void searchTaskByName() {
        boolean found = false;
        String taskToFind = JOptionPane.showInputDialog("Enter task name to search:");

        for (int i = 0; i <  size; i++) {
            if (taskToFind.equalsIgnoreCase(taskname[i])) {
                JOptionPane.showMessageDialog(null, "Task name: " + taskname[i]
                        + "\nDeveloper: " + developer[i]
                        + "\nTask status: " + Option[i]);
                found = true;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Task not found: " + taskToFind, "Task not found", JOptionPane.WARNING_MESSAGE);
        }
    }
//method that searches for a taskname using the developer's name
    public static void searchTasksByDeveloper() {
        boolean found = false;
        StringBuilder tasksByDeveloper = new StringBuilder();
        String developerToFind = JOptionPane.showInputDialog("Enter developer name to search tasks:");

        for (int i = 0; i <  size; i++) {
            if (developerToFind.equalsIgnoreCase(developer[i])) {
                tasksByDeveloper.append("Task name: ").append(taskname[i])
                        .append("\nTask status: ").append(Option[i]).append("\n\n");
                found = true;
            }
        }

        if (found) {
            JOptionPane.showMessageDialog(null, "Tasks created by " + developerToFind + ":\n" + tasksByDeveloper.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks assigned to this developer: " + developerToFind, "Task not found", JOptionPane.WARNING_MESSAGE);
        }
    }
//method that deletes a ceratin task
    public static void deleteTask() {
        boolean taskDeleted = false;
        String taskToDelete = JOptionPane.showInputDialog("Enter task name to delete:");

        for (int i = 0; i <  size; i++) {
            if (taskToDelete.equalsIgnoreCase(taskname[i])) {
                int confirmation = JOptionPane.showOptionDialog(null, "Do you want to delete the task: " + taskToDelete + "?", "Confirm Task Deletion",
                        JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, DELETE, null);

                if (confirmation == 0) {
                    Duration[i] = 0;
                    TASKID[i] = "  ";
                    taskname[i] = "  ";
                    developer[i] = "  ";
                    Option[i] = "  ";
                    TaskDescript[i] = "  ";
                    taskDeleted = true;
                }
            }
        }

        if (taskDeleted) {
            JOptionPane.showMessageDialog(null, "Task deleted successfully: " + taskToDelete);
        } else {
            JOptionPane.showMessageDialog(null, "Task not found: " + taskToDelete, "Task not found", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static int returnHours(int hours) {
        return hours; // You can expand this method if needed
    }

    
}
    
    

