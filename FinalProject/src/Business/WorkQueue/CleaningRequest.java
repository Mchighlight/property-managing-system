/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import Business.property.Department;


public  class CleaningRequest extends WorkRequest {

    private String comment;
    private String requirement;
    private Double feeString;
    private Department department;
    private UserAccount customerAccount;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Double getFeeString() {
        return feeString;
    }

    public void setFeeString(Double feeString) {
        this.feeString = feeString;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public UserAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(UserAccount customerAccount) {
        this.customerAccount = customerAccount;
    }
    

}
