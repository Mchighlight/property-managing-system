/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.AccountantDirectory;
import Business.Employee.CleaningStaffDirectory;
import Business.Employee.DataAnalystDirectory;
import Business.Employee.Decorator;
import Business.Employee.DecoratorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Employee.LandlordDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private AccountantDirectory accountantDirectory;
    private DataAnalystDirectory dataAnalystDirectory;
    private CleaningStaffDirectory cleaningStaffDirectory;
    private DecoratorDirectory decoratorDirectory;
    private LandlordDirectory landlordDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization"),
        Accounting("Accounting Organization"),
        Agent("Agent Organization"),
        AnalysisAndReport("AnalysisAndReport  Organization"),
        BoardMember("BoardMember Organization"),
        Cleaning("Cleaning Organization"),
        CustomerSupport("CustomerSupport Organization"),
        Furnishing("Furnishing Organization"),
        Repair("Repair Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        accountantDirectory = new AccountantDirectory();
        dataAnalystDirectory = new DataAnalystDirectory();
        cleaningStaffDirectory = new CleaningStaffDirectory();
        decoratorDirectory = new DecoratorDirectory();
        landlordDirectory=new LandlordDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public AccountantDirectory getAccountDirectory() {

        return accountantDirectory;
    }

    public DataAnalystDirectory getDataAnalystDirectory() {

        return dataAnalystDirectory;
    }

    public CleaningStaffDirectory getCleaningStaffDirectory() {

        return cleaningStaffDirectory;
    }

    public DecoratorDirectory getDecoratorDirectory() {
        return decoratorDirectory;
    }
        public LandlordDirectory getLandlordDirectory() {
        return landlordDirectory;
    }


    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
