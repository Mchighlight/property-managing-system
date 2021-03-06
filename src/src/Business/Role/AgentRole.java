package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.AgentOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PropertyCompany.agent.RealEstateAgentWorkAreaJPanel;


public class AgentRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RealEstateAgentWorkAreaJPanel(userProcessContainer, account, (AgentOrganization)organization, enterprise, business);
    }
}
