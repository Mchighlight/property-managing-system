/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.AccountantRole;
import Business.Role.FinanceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class FinanceEnterprise extends Enterprise {
   
    public FinanceEnterprise(String name){
        super(name,EnterpriseType.Finance);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FinanceAdminRole());
        return roles;
    }
    
}
