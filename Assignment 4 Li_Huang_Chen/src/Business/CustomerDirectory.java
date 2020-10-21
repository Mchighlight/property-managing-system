/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;


public class CustomerDirectory {
    //public static CustomerDirectory customerDirectory;
    public static List<Customer> customerList;
    
    public CustomerDirectory(){
       customerList= new ArrayList<Customer>();
    }
    


    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
    
    public void addCustomer(Customer c){
        customerList.add(c);
    }
    
    public void sayhi(){
        System.out.println(customerList.get(0).getFirstName());
    }
}
