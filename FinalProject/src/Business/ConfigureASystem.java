package Business;

import Business.Employee.Accountant;
import Business.Employee.Employee;
import Business.Role.AccountantRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "123", employee, new SystemAdminRole());

        Accountant accountant = system.getaccountDirectory().createaccountant("acc", "acc");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("acc", "acc", accountant, new AccountantRole());

        return system;
    }
       

}
