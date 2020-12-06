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
     
    void populateAptBox(Network net){
        aptjComboBox.removeAllItems();
        for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()){
            if (ent instanceof InvestmentManagerEnterprise) {
                ent=(InvestmentManagerEnterprise)ent;
                for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
                    if (org instanceof BoardMemberOrganization) {
                        for(Landlord ll : org.getLandlordDirectory().getlandlordList())
                            for (Propority object : ll.getProporityCatalog().getProporitycatalog()) {
                                aptjComboBox.addItem(object);
                            }
                    }
                }
            }
        }
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

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("RepairmentRequest");

        jLabel2.setText("Repaispecialist");

        jLabel3.setText("Apartment:");

        aptjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agentjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Date:");

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dateChooserPanel1.setLocale(new java.util.Locale("en", "GB", ""));

        createjButton.setText("Send");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Requirement:");

        netjComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        netjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netjComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Network");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateChooserPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel4))
                                    .addComponent(netjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agentjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aptjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(netjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agentjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aptjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(backJButton)
                        .addGap(22, 22, 22)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateChooserPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(createjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
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
            System.out.println(e.getMessage());
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
                populateAptBox(net);
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox netjComboBox1;
    // End of variables declaration//GEN-END:variables
}
