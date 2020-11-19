/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoDB;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author yiningchen
 */
public class Connection {

    public MongoClient mongo;
    private String db;
    public MongoDatabase database;
    private static Connection instance;

    private MongoDatabase createConnection() {
        db = "mongodb01";

        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoClientSettings settings = MongoClientSettings.builder()
                //.applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
        MongoClient mongoClient = (MongoClient) MongoClients.create(settings);
        database = mongoClient.getDatabase("mongodb01");
        return database;
        //  MongoCollection<Person> person= database.getCollection("person", Person.class);
    }

    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
            return instance;
        } else {
            return instance;
        }
    }

   /* public EcoSystem retrieveSystem() {
        MongoDatabase mongodb = createConnection();
        MongoCollection<EcoSystem> systems = mongodb.getCollection("Ecosystem", EcoSystem.class);

        EcoSystem system;
 if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        return system;
    }*/

}
