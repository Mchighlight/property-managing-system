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
import org.bson.types.ObjectId;

public class Person {

    public Person() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    private ObjectId id;

    public Person(String username, String email, String password, String fname, String lname) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    private String username;
    private String email;
    private String password;
    private String fname;
    private String lname;
}

