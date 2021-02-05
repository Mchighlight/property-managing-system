package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.RepairOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PropertyCompany.repair.RepairSpecialistWorkAreaJPanel;


public class RepairSpecialistRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new RepairSpecialistWorkAreaJPanel(userProcessContainer, account, (RepairOrganization)organization, enterprise, business);
    }
}
