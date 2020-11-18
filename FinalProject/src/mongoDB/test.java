/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongoDB;

/**
 *
 * @author yiningchen
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

public class test {
    private MongoCollection<Person> person;
    Connection conn;
    
    
    
    public void getCollection() {
        conn = Connection.getInstance();
        person = conn.database.getCollection("person", Person.class);
    }
  
    public static void main(String[] args) throws Exception {
        test t = new test();
        t.getCollection();
        Person p = new Person();
        p.setEmail("test@test.com1");
        p.setFname("ftest1");
        p.setLname("ltest1");
        p.setPassword("testtest1");
        p.setUsername("test123");


        // insert person type objects in database
        t.insertPerson(p);


        // get all persons from database
        List<Person> pp = t.getAllPersons();
        Person pt = pp.get(0);
        System.out.println(pt.getEmail());
        System.out.println(pt.getId());


        // get one person from database by username filter

                 // pass username of person in method argument
        Person ph = t.getOnePerson("test123");
        System.out.println(ph.getEmail());
        System.out.println(ph.getId());


        // update/edit person by username filter
                // pass username of person in method argument
        t.updatePerson("test123");


        // delete person by username filter
               // pass username of person in method argument
      //  t.removePerson("updatetest123");

    }


    public void insertPerson(Person p) {

        person.insertOne(p);
    }

    public List<Person> getAllPersons() {
        FindIterable<Person> iterable = person.find();
        Iterator it = iterable.iterator();
        List<Person> allPersons = new ArrayList<>();
        while (it.hasNext()) {
            Person per = (Person) it.next();
            allPersons.add(per);
        }
        return allPersons;
    }

    public Person getOnePerson(String username) {
        return person.find(eq("username", username)).first();
    }

    public void updatePerson(String username) {
        Person p = new Person();
        p.setEmail("update@test.com");
        p.setFname("updateftest");
        p.setLname("updateltest");
        p.setPassword("updatetesttest");
        p.setUsername("updatetest123");
        person.replaceOne(eq("username", username), p);

    }

    public void removePerson(String username) {
        person.deleteOne(eq("username", username));
    }



}
