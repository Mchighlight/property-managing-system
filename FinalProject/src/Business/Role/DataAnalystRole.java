package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.AnalysisAndReportOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.FinanceCompany.DataAnalystWorkAreaJPanel;


public class DataAnalystRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DataAnalystWorkAreaJPanel(userProcessContainer, account, (AnalysisAndReportOrganization)organization, enterprise, business);
    }
}
