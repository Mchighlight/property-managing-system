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
import Business.Organization.BoardMemberOrganization;
import Business.Organization.Organization;
import Business.Organization.RepairOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RepairRequest;
import Business.WorkQueue.SignLeaseRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author junyaoli
 */
public class newRepairmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form newRepairmentJPanel
     */

    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    public newRepairmentJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         populateNetworkBox();
         populateAptBox();
         dateChooserPanel1.setVisible(false);
    }
    
     void populateReparePeopletBox(Network net){
        agentjComboBox.removeAllItems();
//        for(Network net : ecosystem.getNetworkList()){
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
                if (ent instanceof RealEstateEnterprise) {
                    ent=(RealEstateEnterprise)ent;
                    for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
                        
                        if (org instanceof RepairOrganization) {
                            for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
                            agentjComboBox.addItem(ua);
                        }
                    }
                }
            } 
        //}
    }
     
    void populateAptBox(){
        aptjComboBox.removeAllItems();
        for(SignLeaseRequest sq:ua.getWorkQueue().getSignLeaseRequestList()){
                    aptjComboBox.addItem(sq.getBuilding());
        }
        
//        for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
//            if (ent instanceof InvestmentManagerEnterprise) {
//                ent=(InvestmentManagerEnterprise)ent;
//                for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
//                    if (org instanceof BoardMemberOrganization) {
//                        for(Landlord ll : org.getLandlordDirectory().getlandlordList())
//                            for (Propority object : ll.getProporityCatalog()) {
//                                aptjComboBox.addItem(object);
//                            }
//                    }
//                }
//            }
//        }
    }
    
    void populateNetworkBox( ){
        netjComboBox1.removeAllItems();
        for (Network net : ecosystem.getNetworkList()){
        netjComboBox1.addItem(net);
                           
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

        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        aptjComboBox = new javax.swing.JComboBox();
        agentjComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();
        createjButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        netjComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(null);

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(37, 47, 97, 29);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("RepairmentRequest");
        add(jLabel1);
        jLabel1.setBounds(283, 15, 224, 30);

        jLabel2.setText("Repaispecialist");
        add(jLabel2);
        jLabel2.setBounds(339, 76, 94, 16);

        jLabel3.setText("Apartment:");
        add(jLabel3);
        jLabel3.setBounds(483, 76, 70, 16);

        aptjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(aptjComboBox);
        aptjComboBox.setBounds(483, 98, 96, 27);

        agentjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(agentjComboBox);
        agentjComboBox.setBounds(339, 98, 96, 27);

        jLabel5.setText("Date:");
        add(jLabel5);
        jLabel5.setBounds(367, 181, 33, 16);
        add(jTextField1);
        jTextField1.setBounds(406, 176, 150, 26);

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(462, 208, 130, 29);

        dateChooserPanel1.setLocale(new java.util.Locale("en", "GB", ""));
        add(dateChooserPanel1);
        dateChooserPanel1.setBounds(222, 243, 370, 170);

        createjButton.setText("Send");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });
        add(createjButton);
        createjButton.setBounds(272, 452, 271, 59);

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(562, 180, 30, 20);

        jLabel6.setText("Requirement:");
        add(jLabel6);
        jLabel6.setBounds(191, 137, 83, 16);
        add(jTextField2);
        jTextField2.setBounds(280, 132, 312, 26);

        netjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        netjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netjComboBox1ActionPerformed(evt);
            }
        });
        add(netjComboBox1);
        netjComboBox1.setBounds(191, 98, 96, 27);

        jLabel4.setText("Network");
        add(jLabel4);
        jLabel4.setBounds(200, 76, 53, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel7.setText("jLabel4");
        add(jLabel7);
        jLabel7.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        customerServiceJPanel jpanel = (customerServiceJPanel) component;
        jpanel.populateRepTable();
        jpanel.populateFeedbackTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            Date pointedDate =dateChooserPanel1.getModel().getSelectedDate().getTime();
            jTextField1.setText(pointedDate.toString());
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        // TODO add your handling code here:
        
            UserAccount agent =(UserAccount) agentjComboBox.getSelectedItem();
            Propority pp = (Propority) aptjComboBox.getSelectedItem();
            //确定property的位置，在tenant还是在leasing上

            RepairRequest request = new RepairRequest(jTextField2.getText(),pp,ua, agent);
            request.setStatus("waiting processed");
            //String requirement, Propority department, UserAccount customerAccount, UserAccount RepairSpecialist

        try {
           
            Date date=new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy").parse(jTextField1.getText());
            request.setPointedDate(date);
            agent.getWorkQueue().getRepairRequestRequestList().add(request);
            ua.getWorkQueue().getRepairRequestRequestList().add(request);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            return;
        }
            
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        customerServiceJPanel jpanel = (customerServiceJPanel) component;
        jpanel.populateRepTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_createjButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (dateChooserPanel1.isVisible()==true) {
            dateChooserPanel1.setVisible(false);
        }else{
            dateChooserPanel1.setMinDate( Calendar.getInstance());
            dateChooserPanel1.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void netjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netjComboBox1ActionPerformed
        // TODO add your handling code here:
        try {
            if (netjComboBox1.getSelectedItem()!=null) {
                Network net =(Network) netjComboBox1.getSelectedItem();
//                populateAptBox(net);
                populateReparePeopletBox(net);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_netjComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox agentjComboBox;
    private javax.swing.JComboBox aptjComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createjButton;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox netjComboBox1;
    // End of variables declaration//GEN-END:variables
}
