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
public class DataAnalystDirectory {
    
    private ArrayList< DataAnalyst> dataAnalystList;

    public DataAnalystDirectory() {
         dataAnalystList = new ArrayList();
    }

    public ArrayList< DataAnalyst>  GetdataAnalystList() {
        return  dataAnalystList;
    }
    
     public DataAnalyst createdataAnalyst(String name,String email){
        DataAnalyst dataAnalyst = new DataAnalyst();
        dataAnalyst.setName(name);
        dataAnalyst.setEmail(email);
        dataAnalystList.add(dataAnalyst);
        return dataAnalyst;
    }
}