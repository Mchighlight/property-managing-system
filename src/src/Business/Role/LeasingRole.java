package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.LeasingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PropertyCompany.leasing.LeasingWorkAreaJPanel;


public class LeasingRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LeasingWorkAreaJPanel(userProcessContainer, account, (LeasingOrganization)organization, enterprise, business);
    }
}
