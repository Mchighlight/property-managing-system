/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.property;

import java.util.Date;
import Business.property.Lease ;

/**
 *
 * @author hung-chih 
 */
public class Rent {
    private Double price ;
    private Double lateFee ;
    private Date date ;
    private Date dateToPay ;
    private Lease lease ;
    private Payment payment ;
    
     public Rent() {
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getLateFee() {
        return lateFee;
    }

    public void setLateFee(Double lateFee) {
        this.lateFee = lateFee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateToPay() {
        return dateToPay;
    }

    public void setDateToPay(Date dateToPay) {
        this.dateToPay = dateToPay;
    }

    public Lease getLease() {
        return lease;
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
}
