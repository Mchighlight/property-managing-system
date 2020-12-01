/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.property;

import java.util.Date;

/**
 *
 * @author junyaoli
 */
public class Renewal {
    private String renwalID ;
    private Date renewalDate ;
    
    Renewal(){
    }

    public String getRenwalID() {
        return renwalID;
    }

    public void setRenwalID(String renwalID) {
        this.renwalID = renwalID;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }
}
