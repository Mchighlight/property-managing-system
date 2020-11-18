package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.InvestmentManagerAdminRole.InvestmentManagerAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class InvestmentManagerAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InvestmentManagerAdminWorkAreaJPanel(userProcessContainer, enterprise);
    }

    
    
}
