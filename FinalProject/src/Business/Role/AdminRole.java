package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;


public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
