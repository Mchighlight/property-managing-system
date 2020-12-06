/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Propority;
import Business.UserAccount.UserAccount;
import Business.property.message;
import java.util.Date;

public  class CustomerSupportRequest extends WorkRequest {
    private message meg;
    private Date updateDate;
    private String requirement;
    private Propority department;
    private UserAccount customerAccount;
    private UserAccount Assistant;

    public CustomerSupportRequest( UserAccount customerAccount) {
        this.meg = new message();
        this.updateDate = new Date();
        this.customerAccount = customerAccount;
    }

    public message getMeg() {
        return meg;
    }

    public void setMeg(message meg) {
        this.meg = meg;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Propority getDepartment() {
        return department;
    }

    public void setDepartment(Propority department) {
        this.department = department;
    }

    public UserAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(UserAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public UserAccount getAssistant() {
        return Assistant;
    }

    public void setAssistant(UserAccount Assistant) {
        this.Assistant = Assistant;
    }
    
    @Override
    public String toString (){
        return getTitle();
    }
    
}
