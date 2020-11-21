/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoDB;

//import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.util.JSON;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;

/**
 *
 * @author yiningchen
 */
public class test {
/*
    public static void main(String[] args) {
        //connect to db
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase db = mongoClient.getDatabase("mongodb01");

        //get db employee
        MongoCollection<org.bson.Document> coll = db.getCollection("employee");

        // get method
        Document doc = (Document) coll.find().first();
        Gson gson = new Gson();
        Employee model = gson.fromJson(doc.toJson(), Employee.class);
        System.out.println(model.getName());
        System.out.println(model.getNo());

        //create method
        Employee employee = new Employee(); // Create java object
        employee.setNo(2);
        employee.setName("employee2");
        String json = gson.toJson(employee);
        Document doc2 = Document.parse(json);
        coll.insertOne(doc2);

        //update data
        String name = "employee";
        String update = "emp";
        coll.updateOne(Filters.eq("name", name), Updates.combine(Updates.set("name", update)));

        //delete method
        coll.findOneAndDelete(Filters.eq("name", "emp"));

    }
*/
}
