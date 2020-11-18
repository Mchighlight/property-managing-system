package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.BoardMemberOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.LandlordRole.LandlordWorkAreaJPanel;


public class LandlordRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LandlordWorkAreaJPanel(userProcessContainer, account, (BoardMemberOrganization)organization, enterprise, business);
    }
}
