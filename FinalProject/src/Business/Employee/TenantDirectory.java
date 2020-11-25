/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.Tenant;
import java.util.ArrayList;

/**
 *
 * @author hung-chih huang
 */
public class TenantDirectory {
    
    private ArrayList<Tenant> tenantList;

    public TenantDirectory() {
        tenantList = new ArrayList();
    }

    public ArrayList<Tenant> getTenantList() {
        return tenantList;
    }
    
    public Tenant createTenant(String name, String email, 
                                                        String firstName, String lastName,
                                                        int SSN) {
        
        Tenant tenant = new Tenant();
        
        tenant.setName(name);
        tenant.setEmail(email);
        tenant.setFirstname(firstName);
        tenant.setLastname(lastName);
        tenant.setSSN(SSN);
        
        tenantList.add(tenant);
        return tenant;
    }
}