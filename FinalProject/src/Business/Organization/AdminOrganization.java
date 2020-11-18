/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.FinanceAdminRole;
import Business.Role.FurnishingAdminRole;
import Business.Role.InvestmentManagerAdminRole;
import Business.Role.RealEstateAdminRole;
       
import Business.Role.Role;
import java.util.ArrayList;

public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        roles.add(new FinanceAdminRole());
        roles.add(new FurnishingAdminRole());
        roles.add(new InvestmentManagerAdminRole());
        roles.add(new RealEstateAdminRole());
        return roles;
    }
     
}
