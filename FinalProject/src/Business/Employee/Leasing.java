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
public class Leasing {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;
    

    public Leasing() {
        id = count;
        count++;
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
