// Create a class named Employee2 with a static variable companyName and instance variables empName and empId.
// Print the company name using the static variable and employee details using instance variables.

package Simply;

public class Employee2 {
    static String companyName = "Tech Solutions Inc.";
    String empName;
    int empId;

    // Constructor to initialize instance variables
    public Employee2(String name, int id) {
        this.empName = name;
        this.empId = id;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
    }

    public static void main(String[] args) {
        // Creating an Employee2 object
        Employee2 employee = new Employee2("John Doe", 101);
        // Displaying employee details
        employee.displayEmployeeDetails();
    }
}
