/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.RealEstateAdminRole;
import Business.Role.Role;
import Business.Employee.BuyerDirectory;
import Business.Employee.TenantDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class RealEstateEnterprise extends Enterprise {
    
    private BuyerDirectory buyerDirectory;
    private TenantDirectory tenantDirectory;
    private UserAccountDirectory customerAcccountDirectory ;
    
    public RealEstateEnterprise(String name){
        super(name,EnterpriseType.RealEstate);
        buyerDirectory = new BuyerDirectory() ;
        tenantDirectory = new TenantDirectory();
        customerAcccountDirectory = new UserAccountDirectory() ; 
    }

    public UserAccountDirectory getCustomerAcccountDirectory() {
        return customerAcccountDirectory;
    }

    public void setCustomerAcccountDirectory(UserAccountDirectory customerAcccountDirectory) {
        this.customerAcccountDirectory = customerAcccountDirectory;
    }

    public BuyerDirectory getBuyerDirectory() {
        return buyerDirectory;
    }

    public void setBuyerDirectory(BuyerDirectory buyerDirectory) {
        this.buyerDirectory = buyerDirectory;
    }

    public TenantDirectory getTenantDirectory() {
        return tenantDirectory;
    }

    public void setTenantDirectory(TenantDirectory tenantDirectory) {
        this.tenantDirectory = tenantDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RealEstateAdminRole());
        return roles;
    }
    
}
