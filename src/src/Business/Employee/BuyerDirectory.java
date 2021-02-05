/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.Buyer;
import java.util.ArrayList;

/**
 *
 * @author hung-chih huang
 */
public class BuyerDirectory {
    
    private ArrayList<Buyer> buyerList;

    public BuyerDirectory() {
        buyerList = new ArrayList();
    }

    public ArrayList<Buyer> getBuyerList() {
        return buyerList;
    }
    
    public Buyer createBuyer(String name, String email, 
                                                   String firstName, String lastName,
                                                   int SSN ){
        Buyer buyer = new Buyer();
        
        buyer.setName(name);
        buyer.setEmail(email);
        buyer.setFirstname(firstName);
        buyer.setLastname(lastName);
        buyer.setSSN(SSN);
        
        buyerList.add(buyer);
        return buyer;
    }
}