/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        SystemAdmin("SystemAdmin"),
        FinanceAdmin("FinanceAdmin"),
        FurnishingAdmin("FurnishingAdmin"),
        InvestmentManagerAdmin("InvestmentManagerAdmin"),
        RealEstateAdmin("RealEstateAdmin"),
        Accountant("Accountant"),
        Buyer("Buyer"),
        CleaningStaff("CleaningStaff"),
        CustomerSuppor("CustomerSuppor"),
        DataAnalyst("DataAnalyst"),
        Decorator("Decorator"),
        Landlord("Landlord"),
        Leasing("Leasing"),
        RealEstateAgent("RealEstateAgent"),
        RepairSpecialist("RepairSpecialist"),
        Tenant("Tenant");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}