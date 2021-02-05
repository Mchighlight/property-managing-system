/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.property;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author junyaoli
 */
public class message {
    ArrayList<String> messageList;
    
    public message() {
        messageList=new ArrayList<>();
    }

    public ArrayList<String> getMessageList() {
        return messageList;
    }

    public void setMessageList(ArrayList<String> messageList) {
        this.messageList = messageList;
    }

    public void addmessage(UserAccount senderAccount,String meg){
        String m =new Date().toString()+"\n";
            m =m+senderAccount.getUsername()+": ";
            m=m+meg+"";
            System.out.println(meg);
            messageList.add(m);
    }
    
    
}
