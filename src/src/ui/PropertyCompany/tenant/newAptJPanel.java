/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;

import Business.EcoSystem;
import Business.Employee.Landlord;
import Business.Employee.Propority;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InvestmentManagerEnterprise;
import Business.Enterprise.RealEstateEnterprise;
import Business.Network.Network;
import Business.Organization.AgentOrganization;
import Business.Organization.BoardMemberOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.VisitRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author junyaoli
 */
public class newAptJPanel extends javax.swing.JPanel {

    /**
     * Creates new form newAptJPanel
     */
         JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    Date pointedDate;
//    datechooseJFrame datechooseJFrame=new datechooseJFrame(pointedDate);
    public newAptJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         populateNetworkBox();
        dateChooserPanel1.setVisible(false);
    }
    void populateNetworkBox(){
        networkJComboBox.removeAllItems();
        agentjComboBox.removeAllItems();
        aptjComboBox.removeAllItems();
        for (Network network : ecosystem.getNetworkList()){
            networkJComboBox.addItem(network);
        }
        
    }
    
    
    void populateAgentBox(Network net){
        agentjComboBox.removeAllItems();
        for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
            if (ent instanceof RealEstateEnterprise) {
                ent=(RealEstateEnterprise)ent;
                for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
                    if (org instanceof AgentOrganization) {
                        for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
                        agentjComboBox.addItem(ua);
                    }
                }
            }
        }    
    }
    void populateAptBox(UserAccount ua){
        aptjComboBox.removeAllItems();
        for(WorkRequest wq : ua.getWorkQueue().getWorkRequestList()){
            Landlord ll = wq.getSender().getLandlord();
            for(Propority pp : ll.getProporityCatalog()){
                aptjComboBox.addItem(pp);
            }
        }
        
//        for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
//            if (ent instanceof InvestmentManagerEnterprise) {
//                ent=(InvestmentManagerEnterprise)ent;
//                for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
//                    if (org instanceof BoardMemberOrganization) {
//                        for(Landlord ll : org.getLandlordDirectory().getlandlordList()){
//                            try{
//                                ArrayList<Propority>  tempCatelog = ll.getProporityCatalog() ;
//                                for (Propority object :tempCatelog) {
//                                aptjComboBox.addItem(object);
//                            }
//                            } //
//                            catch(Exception e){
//                            }
//
//                        }
//                    }
////                    else
////                        System.out.println("org:"+org);
//                }
//            }
////            else
//////                System.out.println("ent:"+ent);
//        }  
//        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aptjComboBox = new javax.swing.JComboBox();
        agentjComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Apply an appointmrnt");
        add(jLabel1);
        jLabel1.setBounds(290, 30, 256, 30);

        jLabel2.setText("Agent:");
        add(jLabel2);
        jLabel2.setBounds(260, 150, 41, 16);

        jLabel3.setText("Apartment:");
        add(jLabel3);
        jLabel3.setBounds(430, 80, 70, 16);

        aptjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(aptjComboBox);
        aptjComboBox.setBounds(430, 110, 96, 27);

        agentjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        agentjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentjComboBoxActionPerformed(evt);
            }
        });
        add(agentjComboBox);
        agentjComboBox.setBounds(250, 180, 96, 27);

        jLabel4.setText("NetWork");
        add(jLabel4);
        jLabel4.setBounds(260, 80, 54, 16);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(260, 110, 108, 27);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(140, 250, 50, 50);

        jLabel5.setText("Date:");
        add(jLabel5);
        jLabel5.setBounds(440, 150, 33, 16);
        add(jTextField1);
        jTextField1.setBounds(430, 180, 150, 26);

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(450, 210, 130, 29);

        dateChooserPanel1.setLocale(new java.util.Locale("en", "GB", ""));
        add(dateChooserPanel1);
        dateChooserPanel1.setBounds(250, 240, 370, 170);

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(300, 430, 271, 59);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-planner-100.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(580, 140, 100, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel6.setText("jLabel4");
        add(jLabel6);
        jLabel6.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserAccount agent =(UserAccount) agentjComboBox.getSelectedItem();
        Propority pp = (Propority) aptjComboBox.getSelectedItem();
        
        VisitRequest request = new VisitRequest(agent, ua, pp);
        request.setStatus("waiting processed");

        try {
            SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
            Date date = parserSDF.parse(jTextField1.getText());
            request.setPointedDate(date);agent.getWorkQueue().getVisitRequestList().add(request);
            ua.getWorkQueue().getVisitRequestList().add(request);
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return;
        }
        
        userProcessContainer.remove(this);
                Component[] componentArray = userProcessContainer.getComponents();
                Component component = componentArray[componentArray.length - 1];
                mgnaptJPanel jpanel = (mgnaptJPanel) component;
                jpanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateAgentBox(network);
        }
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
                Component[] componentArray = userProcessContainer.getComponents();
                Component component = componentArray[componentArray.length - 1];
                mgnaptJPanel jpanel = (mgnaptJPanel) component;
                jpanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//             datechooseJFrame.setVisible(true);
        
         try {
                pointedDate=dateChooserPanel1.getModel().getSelectedDate().getTime();
                jTextField1.setText(pointedDate.toString());
        } catch (Exception e) {
                 System.out.println(e.getMessage());
        }

//      JDatePickerImpl datePicker;
//
//      UtilDateModel model=new UtilDateModel();
//      Properties p = new Properties();
//        p.put("text.today", "Today");
//        p.put("text.month", "Month");
//        p.put("text.year", "Year");
//      JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
//      datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
//      datejPanel.add(datePicker);
//        datePicker.setBounds(0, 0, 200, 25);
//        model.setSelected(true);
//        datePicker.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         if (dateChooserPanel1.isVisible()==true) {
            dateChooserPanel1.setVisible(false);
        }else{
             dateChooserPanel1.setMinDate( Calendar.getInstance());
            dateChooserPanel1.setVisible(true);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void agentjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentjComboBoxActionPerformed
        // TODO add your handling code here:
        UserAccount agent =(UserAccount)agentjComboBox.getSelectedItem();
        if (agent != null){ 
            populateAptBox(agent);
        }
       
    }//GEN-LAST:event_agentjComboBoxActionPerformed

public class DateLabelFormatter extends AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox agentjComboBox;
    private javax.swing.JComboBox aptjComboBox;
    private javax.swing.JButton backJButton;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox networkJComboBox;
    // End of variables declaration//GEN-END:variables
}