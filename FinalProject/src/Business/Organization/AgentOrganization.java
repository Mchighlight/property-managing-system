package Business.Organization;

import Business.Role.AgentRole;
import Business.Role.LeasingRole;
import Business.Role.Role;
import java.util.ArrayList;


public class AgentOrganization extends Organization{

    public AgentOrganization() {
        super(Organization.Type.Agent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AgentRole());
        roles.add(new LeasingRole()) ;
        return roles;
    }
     
   
    
    
}
