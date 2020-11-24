/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.*;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LandlordDirectory {

    private ArrayList<Landlord> landlordList;
    public LandlordDirectory() {
        landlordList = new ArrayList();
    }


    public ArrayList<Landlord> getlandlordList() {
        return landlordList;
    }

    public Landlord createLandlord( String firstname, String lastname, String email, String ssn) {
        Landlord landlord = new Landlord();
        landlord.setFirstname(firstname);
        landlord.setLastname(lastname);
        landlord.setEmail(email);
        landlord.setSSN(ssn);
        landlordList.add(landlord);
        return landlord;
    }
        public Landlord findLandlord(String name) {
        for (Landlord lord : landlordList)
            if (lord.getFirstname().equals(name)){
                return lord;
        }
        return null;
        
    }
}
