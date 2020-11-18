package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CleaningOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CleaningStaffRole.CleaningStaffWorkAreaJPanel;


public class CleaningStaffRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CleaningStaffWorkAreaJPanel(userProcessContainer, account, (CleaningOrganization)organization, enterprise, business);
    }
}
