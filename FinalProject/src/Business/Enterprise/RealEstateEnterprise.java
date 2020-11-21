/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.BuyerRole;
import Business.Role.LeasingRole;
import Business.Role.RealEstateAdminRole;
import Business.Role.RealEstateAgentRole;
import Business.Role.RepairSpecialistRole;
import Business.Role.Role;
import Business.Role.TenantRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class RealEstateEnterprise extends Enterprise {
    
    public RealEstateEnterprise(String name){
        super(name,EnterpriseType.RealEstate);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RealEstateAgentRole());
        roles.add(new RealEstateAdminRole());
        roles.add(new TenantRole());
        roles.add(new LeasingRole());
        roles.add(new BuyerRole());
        roles.add(new RepairSpecialistRole());
        return roles;
    }
    
}
