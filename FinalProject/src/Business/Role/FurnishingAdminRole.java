package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.admin.FurnishingAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class FurnishingAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FurnishingAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
