/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoDB;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.Iterator;
import static javafx.scene.Cursor.cursor;
import org.bson.Document;
import org.bson.types.ObjectId;
import com.mongodb.Cursor;
import static javafx.scene.Cursor.cursor;
import com.mongodb.DBCursor;
import com.mongodb.client.model.Projections;
import static javafx.scene.Cursor.cursor;
import org.bson.codecs.configuration.CodecRegistry;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author yiningchen
 */
public class jdbcLauncher {
/*
    public MongoClient mongo;
    private String db;
    public MongoDatabase database;
    private static jdbcLauncher instance;

/*

       public static void main(String[] args) {
           
        //create collection, data
        
        
        //try {
        // code to create the connection
        //create new data
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // code to connect to the database
        MongoDatabase db = mongoClient.getDatabase("mongodb01");
      /*  MongoCollection<Document> userCollection1 = db.getCollection("UserAccount");
        Document doc1 = new Document("username", "sysadmin5")
                .append("password", "sysadmin5")
                .append("role", "Admin");
        userCollection1.insertOne(doc1);
       */
    /*
           MongoCollection<Document> empCollection1 = db.getCollection("employee");
        Document doc2 = new Document("no", "1")
                .append("name", "employee");

        empCollection1.insertOne(doc2);

    }

*/
    
}
