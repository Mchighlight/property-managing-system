/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.property;

import Business.Employee.Leasing;
import Business.Employee.Propority;
import Business.Employee.Tenant;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author junyaoli
 */
public class Lease {
    private Date startDate ;
    private Date endDate ;
    private Double balance ;
    private Double securityDeposit ;
    private Date rentalDate ;
    private Propority apt;
    private UserAccount tenant ;
    private UserAccount  leasePeople ;
    private Termination termination ;
    private ArrayList<Renewal> renewalList ; 
    private ArrayList<Rent> rentList ;
    
     public Lease() {
        renewalList = new ArrayList<Renewal>() ;
        rentList = new ArrayList<Rent>() ;
    }
     
    @Override
    public String toString() {
        return this.tenant.getUsername() + "'s lease "; //To change body of generated methods, choose Tools | Templates.
    }
     
     
     public void addRent( Rent oRent ){
         this.rentList.add(oRent) ;
     }
     
     public void removeRent( Rent oRent ){
         this.rentList.remove(oRent) ;
     }
     
     public void addRenewal ( Rent oRent ){
         this.rentList.add(oRent) ;
     }
     
     public void removeRenewal( Rent oRent ){
         this.rentList.remove(oRent) ;
     }
     
     public UserAccount getTenant() {
        return tenant;
    }

    public void setTenant(UserAccount tenant) {
        this.tenant = tenant;
    }

    public UserAccount getLeasing() {
        return this.leasePeople;
    }

    public void setLeasing(UserAccount leasing) {
        this.leasePeople = leasing;
    }

     
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(Double securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Propority getBuilding() {
        return this.apt;
    }

    public void setBuilding(Propority apt) {
        this.apt = apt;
    }

    public Termination getTermination() {
        return termination;
    }

    public void setTermination(Termination termination) {
        this.termination = termination;
    }

    public ArrayList<Renewal> getRenewalList() {
        return renewalList;
    }

    public void setRenewalList(ArrayList<Renewal> renewalList) {
        this.renewalList = renewalList;
    }

    public ArrayList<Rent> getRentList() {
        return rentList;
    }

    public void setRentList(ArrayList<Rent> rentList) {
        this.rentList = rentList;
    }
    
}
