/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.*;

/**
 *
 * @author raunak
 */
public class CleaningStaff {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;
    private int chargepresquarefee;
    

    public CleaningStaff() {
        id = count;
        count++;
    }

    public int getChargepresquarefee() {
        return chargepresquarefee;
    }

    public void setChargepresquarefee(int chargepresquarefee) {
        this.chargepresquarefee = chargepresquarefee;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
