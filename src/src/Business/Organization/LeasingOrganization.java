package Business.Organization;

import Business.Role.LeasingRole;
import Business.Role.Role;
import java.util.ArrayList;


public class LeasingOrganization extends Organization{

    public LeasingOrganization() {
        super(Organization.Type.Leasing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LeasingRole());
        return roles;
    }
     
   
    
    
}
