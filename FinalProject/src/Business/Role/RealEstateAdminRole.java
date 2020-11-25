package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import ui.PropertyCompanyAdminRole.RealEstateAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class RealEstateAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RealEstateAdminWorkAreaJPanel(userProcessContainer,business, enterprise);
    }
    
}
