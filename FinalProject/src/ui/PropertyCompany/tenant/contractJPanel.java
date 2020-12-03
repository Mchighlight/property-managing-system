/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;

import Business.EcoSystem;
import Business.Employee.Leasing;
import Business.Employee.Propority;
import Business.Enterprise.Enterprise;
import Business.Enterprise.RealEstateEnterprise;
import Business.Organization.AgentOrganization;
import Business.Organization.CustomerSupportOrganization;
import Business.Organization.LeasingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FurnishingRequest;
import Business.WorkQueue.SignLeaseRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author junyaoli
 */
public class contractJPanel extends javax.swing.JPanel {

    /**
     * Creates new form contractJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    Enterprise enterprise ;
   
    public contractJPanel(JPanel userProcessContainer, UserAccount account,  EcoSystem business, Enterprise enterprise) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         this.enterprise = enterprise ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnPayContract = new javax.swing.JButton();

        jButton1.setText("View contract");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Contracts");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Sign a contract");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jButton3.setText("View contract");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnPayContract.setText("pay contract");
        btnPayContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayContractActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel1))
                            .addComponent(btnPayContract, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(191, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(181, 181, 181)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnPayContract, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(221, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(169, 169, 169)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
//        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        // Choose Apt
        Propority apt = new Propority() ;
        apt.setAddress("123");
        apt.setAptNo("123");
        apt.setCity("Boston");
        apt.setMonthlyrent(1400);
        apt.setNickname("Lightview901");
        apt.setProporityNum(1500);
        apt.setSellingprice(800000);
        apt.setSquareFeet(760);
        apt.setState("MA");
        apt.setZipCode("02120");
        
        // Choose Leasing !FIX: need to have EnterpriseName & NetworkName
        RealEstateEnterprise ent =  (RealEstateEnterprise) this.ecosystem.findNetwork("henry").getEnterpriseDirectory().findenterprise("henryRealEstate");
        ArrayList<Leasing>  leasingList = new ArrayList() ;
        ArrayList<UserAccount>  leasingAccountList = new ArrayList() ;
        for(Organization org:ent.getOrganizationDirectory().getOrganizationList()){
            if (org instanceof LeasingOrganization) {
                for(UserAccount ua : org.getUserAccountDirectory().getUserAccountList())
                    leasingAccountList.add(ua);
                for(Leasing ls : org.getLeasingDirectory().getLeasingList())
                    leasingList.add(ls);
            }
        }
        
        // Assign Leasing 
        // Here I  pick the first leasing in the Enterprise
        for( UserAccount ls : leasingAccountList ){
            System.out.println(ls.getLeasing().getName());
        }
        UserAccount leasingAccount = leasingAccountList.get(0) ;
        
        SignLeaseRequest signLeaseRequest = new SignLeaseRequest(this.ua, leasingAccount, apt);
        if (leasingAccount != null) {

            signLeaseRequest.setStatus("Contract preparation");
            signLeaseRequest.setOrderID(leasingAccount.getWorkQueue().getSignLeaseRequestList().size()+1);
            signLeaseRequest.setEnterpriseName(this.enterprise.getName());
            signLeaseRequest.setNetworkName(this.enterprise.getNetworkName());

            if( leasingAccount.getWorkQueue().getSignLeaseRequestList() == null ){
                leasingAccount.getWorkQueue().setSignLeaseRequestList(new ArrayList<SignLeaseRequest>());
            }
            leasingAccount.getWorkQueue().getSignLeaseRequestList().add(signLeaseRequest);
            
            if(  this.ua.getWorkQueue().getSignLeaseRequestList() == null ){
                 this.ua.getWorkQueue().setSignLeaseRequestList(new ArrayList<SignLeaseRequest>());
            }
            this.ua.getWorkQueue().getSignLeaseRequestList().add(signLeaseRequest) ;
            
            signLeaseRequest.toString();
            JOptionPane.showMessageDialog(null, "Leasing peopole will prepare your lease, Please wait for further instruction on payment");
            
        } else {
            JOptionPane.showMessageDialog(null, "no Leasing office");
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnPayContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayContractActionPerformed
        // TODO add your handling code here:
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new PayContractJPanel( userProcessContainer,  ua,  ecosystem) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPayContractActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnPayContract;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
