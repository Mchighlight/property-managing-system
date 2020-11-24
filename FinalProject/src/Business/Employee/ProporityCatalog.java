/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author abhishekashwathnarayanvenkat
 */
public class ProporityCatalog {
    
    private List<Propority> ProporityCatalog;

    public ProporityCatalog() {
    ProporityCatalog = new ArrayList<Propority>();
    }
    
    public List<Propority> getProporitycatalog(){
        return ProporityCatalog;
    }
    
    
    public Propority addPropority(){
        Propority p = new Propority();
        ProporityCatalog.add(p);
        return p;
    }
    
    public void removePropority(Propority p){
       ProporityCatalog.remove(p);
    }
    
    
   
    public Propority findPropority(String nickname){
        for (Propority propority :ProporityCatalog) {
            if(propority.getNickname()==nickname){
                return propority;
            }
        }
        return null;
    }
}
