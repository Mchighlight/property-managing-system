/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoDB;

import Business.EcoSystem;
import com.mongodb.client.MongoCollection;

/**
 *
 * @author yiningchen
 */
public class retrivesystem {
    
    

    private MongoCollection<EcoSystem> ecosystem ;
    private Connection conn;
    
    
    public void getCollection() {
        conn = Connection.getInstance();
        ecosystem = conn.database.getCollection("ecosystem", EcoSystem.class);
    }
  
}
