package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CustomerSupportOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PropertyCompany.cutomerSupport.CustomerSupportWorkAreaJPanel;


public class CustomerSupportRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerSupportWorkAreaJPanel(userProcessContainer, account, (CustomerSupportOrganization)organization, enterprise, business);
    }
}
