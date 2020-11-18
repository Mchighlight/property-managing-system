package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.AccountingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AccountantRole.AccountantWorkAreaJPanel;


public class AccountantRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (AccountingOrganization)organization, enterprise, business);
    }
}
