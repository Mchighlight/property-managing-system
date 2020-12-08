/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Propority;
import Business.UserAccount.UserAccount;
import Business.property.Lease;


public  class SignLeaseRequest extends WorkRequest {
    UserAccount tenant;
    UserAccount leasing ;
    Lease lease ;
    Propority apt;


    
    public SignLeaseRequest( UserAccount tenant, UserAccount leasing) {
        this.tenant = tenant;
        this.leasing = leasing ;
    }

    public void setApt( Propority apt){
        this.apt = apt ;
    }
    
    public UserAccount getTenant() {
        return tenant;
    }

    public void setTenant(UserAccount tenant) {
        this.tenant = tenant;
    }

    public UserAccount getLeasing() {
        return leasing;
    }

    public void setLeasing(UserAccount leasing) {
        this.leasing = leasing;
    }

    public Lease getLease() {
        return lease;
    }

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    public Propority getBuilding() {
        return this.apt;
    }

    
    @Override
    public String toString(){
        return "Tenant: " + this.tenant.getUsername()+ "\n" +
                     "Leasing: " + this.leasing.getLeasing().getName() + "\n" ;
                     
    }
    
}
