package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CustomerSupportOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PropertyCompany.tenant.TenantWorkAreaJPanel;


public class TenantRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TenantWorkAreaJPanel(userProcessContainer, account, (CustomerSupportOrganization)organization, enterprise, business);
    }
}
