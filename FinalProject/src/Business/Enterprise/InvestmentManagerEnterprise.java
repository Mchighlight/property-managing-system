/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.InvestmentManagerAdminRole;
import Business.Role.LandlordRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class InvestmentManagerEnterprise extends Enterprise {
    
    public InvestmentManagerEnterprise(String name){
        super(name,EnterpriseType.InvestmentManager);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LandlordRole());
        roles.add(new InvestmentManagerAdminRole());
        return roles;
    }
    
}
