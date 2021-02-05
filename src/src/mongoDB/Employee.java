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
public class Employee {
    


    private long no;
    private String name;

    public Employee(long no, String name) {
        this.no = no;
        this.name = name;
    }

    
    public Employee() {
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
