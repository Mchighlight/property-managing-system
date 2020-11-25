/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.CustomerSupport;
import java.util.ArrayList;

/**
 *
 * @author hung-chih huang
 */
public class CustomerSupportDirectory {
    
    private ArrayList<CustomerSupport> customerSupportList;

    public CustomerSupportDirectory() {
        customerSupportList = new ArrayList();
    }

    public ArrayList<CustomerSupport> getCustomerSupportList() {
        return customerSupportList;
    }
    
    public CustomerSupport createCustomerSupport(String name, String email){
        CustomerSupport cs = new CustomerSupport();
        cs.setName(name);
        cs.setEmail(email);
        
        customerSupportList.add(cs);
        return cs;
    }
}