package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.FurnishingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.FurnishingCompany.DecoratorWorkAreaJPanel;


public class DecoratorRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DecoratorWorkAreaJPanel(userProcessContainer, account, (FurnishingOrganization)organization, enterprise, business);
    }
}
