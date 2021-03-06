/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.leasing;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LeasingOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mchig
 */
public class LeasingWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem eco;
    LeasingOrganization  leaseOrganization ;
    Enterprise enterprise ;
    
    public LeasingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, LeasingOrganization leaseOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer ;
        this.ua = account ;
        this.leaseOrganization = leaseOrganization ;
        this.enterprise = enterprise ;
        this.eco = business ;
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
        btnLeaseCollection = new javax.swing.JButton();
        btnRenewal = new javax.swing.JButton();
        btnTermination1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-office-100 (1).png"))); // NOI18N
        jLabel1.setText("Lease Office");
        add(jLabel1);
        jLabel1.setBounds(310, 10, 290, 100);

        btnLeaseCollection.setText("Lease Collection");
        btnLeaseCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaseCollectionActionPerformed(evt);
            }
        });
        add(btnLeaseCollection);
        btnLeaseCollection.setBounds(370, 140, 184, 51);

        btnRenewal.setText("Renewal");
        btnRenewal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewalActionPerformed(evt);
            }
        });
        add(btnRenewal);
        btnRenewal.setBounds(370, 220, 184, 52);

        btnTermination1.setText("Termination");
        btnTermination1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermination1ActionPerformed(evt);
            }
        });
        add(btnTermination1);
        btnTermination1.setBounds(370, 300, 184, 47);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaseCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaseCollectionActionPerformed
        // TODO add your handling code here:
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ViewLeaseJPanel(userProcessContainer,  ua,  leaseOrganization,  enterprise, eco) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLeaseCollectionActionPerformed

    private void btnRenewalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewalActionPerformed
        // TODO add your handling code here:
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new RenewalJPanel(userProcessContainer,  ua,  leaseOrganization,  enterprise, eco));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRenewalActionPerformed

    private void btnTermination1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermination1ActionPerformed
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new TerminationJPanel(userProcessContainer,  ua,  leaseOrganization,  enterprise, eco));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTermination1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeaseCollection;
    private javax.swing.JButton btnRenewal;
    private javax.swing.JButton btnTermination1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
