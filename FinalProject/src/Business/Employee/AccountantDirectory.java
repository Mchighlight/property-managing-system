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
public class AccountantDirectory {
    
    private ArrayList<Accountant> accountantList;

    public AccountantDirectory() {
        accountantList = new ArrayList();
    }

    public ArrayList<Accountant> getAccountantList() {
        return accountantList;
    }
    
    public Accountant createaccountant(String name){
        Accountant accountant = new Accountant();
        accountant.setName(name);
        accountantList.add(accountant);
        return accountant;
    }
}