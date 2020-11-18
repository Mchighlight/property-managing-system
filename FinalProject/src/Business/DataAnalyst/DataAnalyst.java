/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DataAnalyst;

import Business.Employee.*;

/**
 *
 * @author raunak
 */
public class DataAnalyst {
    
    private String name;
    private int id;
    private static int count = 1;

    public DataAnalyst() {
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
