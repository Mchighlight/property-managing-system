/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Propority;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;


public  class VisitRequest extends WorkRequest {
    UserAccount agent;
    UserAccount customer;
    Propority building;
    ArrayList<String> message;
    Date pointedDate;
    public VisitRequest(UserAccount agent, UserAccount customer, Propority building) {
        this.agent = agent;
        this.customer = customer;
        this.building = building;
        message=new ArrayList<>();
    }

    public Date getPointedDate() {
        return pointedDate;
    }

    public void setPointedDate(Date pointedDate) {
        this.pointedDate = pointedDate;
    }

    public ArrayList<String> getMessage() {
        return message;
    }

    public void addMessage(String message) {
        this.message.add(message);
    }
    
    public VisitRequest(){
        
    }

    public UserAccount getAgent() {
        return agent;
    }

    public void setAgent(UserAccount agent) {
        this.agent = agent;
    }

    public UserAccount getCustomer() {
        return customer;
    }

    public void setCustomer(UserAccount customer) {
        this.customer = customer;
    }

    public Propority getBuilding() {
        return building;
    }

    public void setBuilding(Propority building) {
        this.building = building;
    }
    
    @Override
    public String toString(){
        return customer.getUsername();
    }
    
}
