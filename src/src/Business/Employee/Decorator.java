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
public class Decorator {
    
    private String name;
    private int id;
    private static int count = 1;
    private String email;
    private int feepersquarefeet;
    

    public Decorator() {
        id = count;
        count++;
    }

    public int getFeepersquarefeet() {
        return feepersquarefeet;
    }

    public void setFeepersquarefeet(int feepersquarefeet) {
        this.feepersquarefeet = feepersquarefeet;
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
