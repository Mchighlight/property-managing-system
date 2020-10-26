/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author junyaoli
 */
public class Ticket {
   
    private String seat;
    private String customerName ;
    private Flight flight;
 
    public Ticket( ){
    } 
    
    public Ticket(   String sSeat, String sCustomerName, Flight oFlight ){
        this.seat = sSeat ;
        this.customerName = sCustomerName ;
        this.flight = oFlight ;
    } 
    
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String toString(){
        return flight.toString();
    }
    
}