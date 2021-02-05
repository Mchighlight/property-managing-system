/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Propority;
import Business.UserAccount.UserAccount;
import Business.property.Department;
import Business.property.message;
import java.util.ArrayList;
import java.util.Date;


public  class RepairRequest extends WorkRequest{
    private message meg;
    private Date pointedDate;
    private String requirement;
    private Propority department;
    private UserAccount customerAccount;
    private UserAccount RepairSpecialist;

    public RepairRequest(String requirement, Propority department, UserAccount customerAccount, UserAccount RepairSpecialist) {
        meg= new message();
        this.requirement = requirement;
        this.department = department;
        this.customerAccount = customerAccount;
        this.RepairSpecialist = RepairSpecialist;
    }
    
    
    public Date getPointedDate() {
        return pointedDate;
    }

    public void setPointedDate(Date pointedDate) {
        this.pointedDate = pointedDate;
    }

    public UserAccount getRepairSpecialist() {
        return RepairSpecialist;
    }

    public void setRepairSpecialist(UserAccount RepairSpecialist) {
        this.RepairSpecialist = RepairSpecialist;
    }

    public UserAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(UserAccount customerAccount) {
        this.customerAccount = customerAccount;
    }
    
    public Propority getDepartment() {
        return department;
    }

    public void setDepartment(Propority department) {
        this.department = department;
    }

    public message getMeg() {
        return meg;
    }

    public void setMeg(message meg) {
        this.meg = meg;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
   @Override
   public String toString(){
       return requirement;
   }
    
}
