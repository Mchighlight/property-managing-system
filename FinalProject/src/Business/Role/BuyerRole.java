package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CustomerSupportOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BuyerRole.BuyerWorkAreaJPanel;


public class BuyerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BuyerWorkAreaJPanel(userProcessContainer, account, (CustomerSupportOrganization)organization, enterprise, business);
    }
}
