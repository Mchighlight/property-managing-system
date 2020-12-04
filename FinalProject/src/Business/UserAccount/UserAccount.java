/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Accountant;
import Business.Employee.CleaningStaff;
import Business.Employee.DataAnalyst;
import Business.Employee.Decorator;
import Business.Employee.Employee;
import Business.Employee.Landlord;
import Business.Employee.RealEstateAgent;
import Business.Employee.RepairSpecialist;
import Business.Employee.CustomerSupport;
import Business.Employee.Buyer;
import Business.Employee.Leasing;
import Business.Employee.Tenant;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;


/**
 *
 * @author raunak
 */
public class UserAccount {

    private String username;
    private String password;
    private Employee employee;
    private Accountant accountant;
    private DataAnalyst dataanalyst;
    private CleaningStaff cleaningstaff;
    private RealEstateAgent realEstateAgent;
    private RepairSpecialist repairSpecialist;
    private CustomerSupport customerSupport;
    private Leasing leasing ;
    private Buyer buyer ;
    private Tenant tenant ;
            
    private Role role;
    private WorkQueue workQueue;
    private Decorator decorator;
    private Landlord landlord;
    

    public UserAccount( String username, String password, Employee employee, Role role, Accountant accountant,DataAnalyst dataanalyst, CleaningStaff cleaningstaff, Decorator decorator,Landlord landlord) {

        this.username = username;
        this.password = password;
        this.employee = employee;
        this.role = role;
        this.accountant=accountant;
        this.dataanalyst=dataanalyst;
        this.cleaningstaff=cleaningstaff;
        this.decorator=decorator;
        this.landlord=landlord;
        
    }
    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }
    

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }
    

    public CleaningStaff getCleaningstaff() {
        return cleaningstaff;
    }

    public void setCleaningstaff(CleaningStaff cleaningstaff) {
        this.cleaningstaff = cleaningstaff;
    }
    

    public DataAnalyst getDataanalyst() {
        return dataanalyst;
    }

    public Leasing getLeasing(){
        return this.leasing ;
    }
    
    public void setDataanalyst(DataAnalyst dataanalyst) {
        this.dataanalyst = dataanalyst;
    }

  
    public Tenant getTenant() {
        return tenant;
    }
    

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
    
     public void setRealEstateAgent(RealEstateAgent rea) {
        this.realEstateAgent = rea;
    }
        
    public void setRepairSpecialist(RepairSpecialist rs) {
        this.repairSpecialist = rs;
    }
    
    public void setCustomerSupport(CustomerSupport cs) {
        this.customerSupport = cs;
    }
    
    public void setLeasing(Leasing ls) {
        this.leasing = ls;
    }
    
     public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
    
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }


    @Override
    public String toString() {
        return username;
    }
    
    
    
}