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
    void populateAptBox(Network net){
        aptjComboBox.removeAllItems();
        for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
            if (ent instanceof InvestmentManagerEnterprise) {
                ent=(InvestmentManagerEnterprise)ent;
                for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
                    if (org instanceof BoardMemberOrganization) {
                        for(Landlord ll : org.getLandlordDirectory().getlandlordList()){
                            try{
                                ArrayList<Propority>  tempCatelog = ll.getProporityCatalog() ;
                                for (Propority object :tempCatelog) {
                                aptjComboBox.addItem(object);
                            }
                            } //
                            catch(Exception e){
                            }

                        }
                    }
//                    else
//                        System.out.println("org:"+org);
                }
            }
//            else
////                System.out.println("ent:"+ent);
        }  
        
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Apply an appointmrnt");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 19, -1, -1));

        jLabel2.setText("Agent:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 140, -1, -1));

        jLabel3.setText("Apartment:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 66, -1, -1));

        aptjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(aptjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 94, -1, -1));

        agentjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(agentjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel4.setText("NetWork");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 66, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 94, 108, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 25, -1, -1));

        jLabel5.setText("Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 140, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 168, 150, -1));

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 130, -1));

        dateChooserPanel1.setLocale(new java.util.Locale("en", "GB", ""));
        add(dateChooserPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 370, 170));

        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 271, 59));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 30, 20));
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
            populateAptBox(network);
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox networkJComboBox;
    // End of variables declaration//GEN-END:variables
}
