package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.AgentOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LeasingRole.LeasingWorkAreaJPanel;


public class LeasingRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LeasingWorkAreaJPanel(userProcessContainer, account, (AgentOrganization)organization, enterprise, business);
    }
}
