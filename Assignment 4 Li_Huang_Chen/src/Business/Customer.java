/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String phNum;
    private String passportID;
    private ArrayList<Flight> flightBooked;
    private ArrayList<Ticket> ticketBooked;
    private String seatBooked;
    //private int price; 

    public Customer() {
        flightBooked=new ArrayList<>();
        ticketBooked=new ArrayList<>();
    }
    
    
    public ArrayList<Ticket> getTicketBooked() {
        return ticketBooked;
    }

    public void setTicketBooked(ArrayList<Ticket> ticketBooked) {
        this.ticketBooked = ticketBooked;
    }

    public String getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(String seatBooked) {
        this.seatBooked = seatBooked;
    }

    public ArrayList<Flight> getFlightBooked() {
        return flightBooked;
    }

    public void setFlightBooked(ArrayList<Flight> flightBooked) {
        this.flightBooked = flightBooked;
    }

    
    
    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }
    
}
