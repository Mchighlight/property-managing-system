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
public class MarketingDirectory {

    private ArrayList<Marketing>  marketingList;

    public MarketingDirectory() {
        marketingList = new ArrayList();
    }

    public ArrayList<Marketing> getMarketingList() {
        return marketingList;
    }

    public Marketing createMarketing(String name, String email) {
        Marketing m= new Marketing();
        m.setName(name);;
        m.setEmail(email);

        marketingList.add(m);
        return m;
    }
    
        public Marketing findMarketing(String username) {

        for (Marketing marketing :  marketingList) {
            if ( marketing.getName().equals(username)) {
                return marketing;
            }
        }
        return null;
    }
}
