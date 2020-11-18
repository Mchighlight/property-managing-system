package Business.Organization;

import Business.Role.AccountantRole;
import Business.Role.Role;
import java.util.ArrayList;


public class AccountingOrganization extends Organization{

    public AccountingOrganization() {
        super(Organization.Type.Accounting.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AccountantRole());
        return roles;
    }
     
   
    
    
}
