/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Accounting.getValue())) {
            organization = new AccountingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Agent.getValue())) {
            organization = new AgentOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.AnalysisAndReport.getValue())) {
            organization = new AnalysisAndReportOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.BoardMember.getValue())) {
            organization = new BoardMemberOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Cleaning.getValue())) {
            organization = new CleaningOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.CustomerSupport.getValue())) {
            organization = new CustomerSupportOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Furnishing.getValue())) {
            organization = new FurnishingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Repair.getValue())) {
            organization = new RepairOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Leasing.getValue())) {
            organization = new LeasingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Marketing.getValue())) {
            organization = new MarketingOrganization();
            organizationList.add(organization);
        } 
        return organization;
    }

    public Organization findorganization(String name) {

        for (Organization organization : organizationList) {
            if (organization.getName().equals(name)) {
                return organization;
            }
        }
        return null;
    }

}
