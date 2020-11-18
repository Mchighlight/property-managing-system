/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DataAnalystRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AnalysisAndReportOrganization extends Organization{

    public AnalysisAndReportOrganization() {
        super(Organization.Type.AnalysisAndReport.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DataAnalystRole());
        return roles;
    }
     
   
    
    
}
