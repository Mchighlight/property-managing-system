/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.AccountantDirectory;
import Business.Employee.CleaningStaffDirectory;
import Business.Employee.DecoratorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Employee.LandlordDirectory;
import Business.Employee.RealEstateAgentDirectory;
import Business.Employee.RepairSpecialistDirectory;
import Business.Employee.CustomerSupportDirectory;
import Business.Employee.TenantDirectory;
import Business.Employee.BuyerDirectory;
import Business.Employee.LeasingDirectory ;
import Business.Employee.MarketingDirectory;
import Business.Employee.ProporityCatalog;
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
    private CleaningStaffDirectory cleaningStaffDirectory;
    private DecoratorDirectory decoratorDirectory;
    private LandlordDirectory landlordDirectory;
    private RealEstateAgentDirectory realEstateAgentDirectory;
    private RepairSpecialistDirectory repairSpecialistDirectory;
    private CustomerSupportDirectory customerSupportDirectory;
    private LeasingDirectory leasingDirectory ;
    private TenantDirectory tenantDirectory;
    private BuyerDirectory buyerDirectory;
    private ProporityCatalog proporityDirectory;
    private MarketingDirectory marketingDirectory;
    private int organizationID;
    private static int counter = 0;

    public enum Type {
        Admin("Admin Organization"),
        Accounting("Accounting Organization"),
        Agent("Agent Organization"),
        Leasing("Leasing Organization"),
        AnalysisAndReport("AnalysisAndReport  Organization"),
        BoardMember("BoardMember Organization"),
        Cleaning("Cleaning Organization"),
        CustomerSupport("CustomerSupport Organization"),
        Furnishing("Furnishing Organization"),
        Repair("Repair Organization"),
        Marketing("Marketing Organization");
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
        cleaningStaffDirectory = new CleaningStaffDirectory();
        decoratorDirectory = new DecoratorDirectory();
        landlordDirectory=new LandlordDirectory();
        realEstateAgentDirectory = new  RealEstateAgentDirectory();
        repairSpecialistDirectory = new  RepairSpecialistDirectory();
        customerSupportDirectory = new  CustomerSupportDirectory();
        leasingDirectory = new LeasingDirectory() ;
        tenantDirectory = new  TenantDirectory();
        buyerDirectory = new  BuyerDirectory();
        proporityDirectory= new ProporityCatalog();
        marketingDirectory= new MarketingDirectory();
        
        organizationID = counter;
        ++counter;
    }

    public MarketingDirectory getMarketingDirectory() {
        return marketingDirectory;
    }

    public void setMarketingDirectory(MarketingDirectory marketingDirectory) {
        this.marketingDirectory = marketingDirectory;
    }
    
    

    public abstract ArrayList<Role> getSupportedRole();
    
    public AccountantDirectory getAccountantDirectory() {
        return accountantDirectory;
    }

    public void setAccountantDirectory(AccountantDirectory accountantDirectory) {
        this.accountantDirectory = accountantDirectory;
    }

    public LeasingDirectory getLeasingDirectory() {
        return leasingDirectory;
    }

    public void setLeasingDirectory(LeasingDirectory leasingDirectory) {
        this.leasingDirectory = leasingDirectory;
    }

    public ProporityCatalog getProporityDirectory() {
        return proporityDirectory;
    }

    public void setProporityDirectory(ProporityCatalog proporityDirectory) {
        this.proporityDirectory = proporityDirectory;
    }

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

    public CleaningStaffDirectory getCleaningStaffDirectory() {

        return cleaningStaffDirectory;
    }

    public DecoratorDirectory getDecoratorDirectory() {
        return decoratorDirectory;
    }
    
    public LandlordDirectory getLandlordDirectory() {
        return landlordDirectory;
    }
    
    public RealEstateAgentDirectory getRealEstateAgentDirectory() {
        return this.realEstateAgentDirectory;
    }
        
    public RepairSpecialistDirectory getRepairSpecialistDirectory() {
        return this.repairSpecialistDirectory;
    }
            
    public CustomerSupportDirectory getCustomerSupportDirectory() {
        return this.customerSupportDirectory;
    }
                
     public TenantDirectory getTenantDirectory() {
        return this.tenantDirectory;
    }
                    
    public BuyerDirectory getBuyerDirectory() {
        return this.buyerDirectory;
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
