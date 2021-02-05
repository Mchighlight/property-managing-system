/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.RealEstateAgent;
import java.util.ArrayList;

/**
 *
 * @author hung-chih huang
 */
public class RealEstateAgentDirectory {

    private ArrayList<RealEstateAgent> realEstateAgentList;

    public RealEstateAgentDirectory() {
        realEstateAgentList = new ArrayList();
    }

    public ArrayList< RealEstateAgent> getRealEstateAgentList() {
        return realEstateAgentList;
    }

    private String name;
    private String firstname;
    private String lastname;
    private int SSN;
    private String email;

    public RealEstateAgent createRealEstateAgent(String name, String email,
            String firstName, String lastName,
            int SSN) {
        RealEstateAgent realEstateAgent = new RealEstateAgent();
        realEstateAgent.setName(name);
        realEstateAgent.setEmail(email);
        realEstateAgent.setFirstname(firstName);
        realEstateAgent.setLastname(lastName);
        realEstateAgent.setSSN(SSN);

        realEstateAgentList.add(realEstateAgent);
        return realEstateAgent;
    }

    public RealEstateAgent findEealEstateAgent(String username) {

        for (RealEstateAgent realEstateAgent : realEstateAgentList) {
            if (realEstateAgent.getName().equals(username)) {
                return realEstateAgent;
            }
        }
        return null;
    }
}
