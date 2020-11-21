/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CleaningStaffRole;
import Business.Role.DecoratorRole;
import Business.Role.FurnishingAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class FurnishingEnterprise extends Enterprise {
    
    public FurnishingEnterprise(String name){
        super(name,EnterpriseType.Furnishing);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CleaningStaffRole());
        roles.add(new FurnishingAdminRole());
        roles.add(new DecoratorRole());
        return roles;
    }
    
}
