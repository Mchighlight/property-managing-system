package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.inverstmentAdminRole.InvestAdminWorkAreaJPanel;


public class InvestmentManagerAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InvestAdminWorkAreaJPanel(userProcessContainer,business, enterprise);
    }

    
    
}
