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
public class Termination {
    private Date leavingDate ;
    private String leavingReason ;
    private Lease lease ;
    private SecurityRefund refund ;
    
    public Termination(){
    }

    public Date getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(Date leavingDate) {
        this.leavingDate = leavingDate;
    }

    public String getLeavingReason() {
        return leavingReason;
    }

    public void setLeavingReason(String leavingReason) {
        this.leavingReason = leavingReason;
    }

    public Lease getLease() {
        return lease;
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    public SecurityRefund getRefund() {
        return refund;
    }

    public void setRefund(SecurityRefund refund) {
        this.refund = refund;
    }
}
