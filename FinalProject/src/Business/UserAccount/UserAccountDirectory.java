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
import Business.Employee.Tenant;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public UserAccount createUserAccount(String username, String password, Accountant accountant, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setAccountant(accountant);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createUserAccount(String username, String password, DataAnalyst dataanalyst, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setDataanalyst(dataanalyst);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;

    }

    public UserAccount createUserAccount(String username, String password, CleaningStaff cleaningstaff, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCleaningstaff(cleaningstaff);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    
    public UserAccount createUserAccount(String username, String password, Decorator decorator, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setDecorator(decorator);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
      public UserAccount createUserAccount(String username, String password, Landlord landlord, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setLandlord(landlord);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
      
    public UserAccount createUserAccount(String username, String password, RealEstateAgent rsa, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRealEstateAgent(rsa);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
            
    public UserAccount createUserAccount(String username, String password, RepairSpecialist repairSpecialist, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRepairSpecialist(repairSpecialist);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
                  
     public UserAccount createUserAccount(String username, String password, CustomerSupport cs, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCustomerSupport(cs);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
                        
    public UserAccount createUserAccount(String username, String password, Buyer buyer, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBuyer(buyer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
                              
     public UserAccount createUserAccount(String username, String password, Tenant tenant, Role role) {

        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setTenant(tenant);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

}
