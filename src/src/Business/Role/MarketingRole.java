/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.CustomerSupportOrganization;
import Business.Organization.MarketingOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PropertyCompany.Marketing.MarketingWorkAreaJPanel;

/**
 *
 * @author yiningchen
 */
public class MarketingRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MarketingWorkAreaJPanel(userProcessContainer, account, (MarketingOrganization) organization, enterprise, business);
    }
    
    
    
    
    
    
}
