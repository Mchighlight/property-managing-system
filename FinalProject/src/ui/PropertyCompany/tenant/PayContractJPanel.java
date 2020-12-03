/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;

import ui.PropertyCompany.leasing.*;
import ui.PropertyCompany.agent.*;
import ui.PropertyCompany.tenant.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerSupportOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FurnishingRequest;
import Business.WorkQueue.SignLeaseRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junyaoli
 */
public class PayContractJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
   
    public PayContractJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         populateRequestTable();
    }

    
     public void populateRequestTable() {

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        ArrayList<SignLeaseRequest> work = this.ua.getWorkQueue().getSignLeaseRequestList();

        if (work != null) {
            for (SignLeaseRequest s: work) {

                Object row[] = new Object[7];
                row[0] = s.getOrderID();
                row[1] = s.getTenant().getUsername();
                row[2] = s.getBuilding().toString();
                if ( s.getLease() == null )
                     row[3] = "Waiting for payment";
                else
                    row[3] = s.getLease().toString();
                row[4] = s.getStatus() ;
                /*
               if ( s.getNetworkName()== null )
                     row[5] = "Not set yet";
                else
                    row[5] = s.getNetworkName();
                                
                if ( s.getEnterpriseName()== null )
                     row[6] = "not Set yet";
                else
                    row[6] = s.getEnterpriseName();
                */
                dtm.addRow(row);
            }

        } else {
            JOptionPane.showMessageDialog(null, "null");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();
        btnPaymentRequest = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnPaymentRequest1 = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Tenant", "apartment", "Lease", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        jLabel5.setText("Lease Collection");

        btnDetail.setText("View Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnPaymentRequest.setText("Pay Lease");
        btnPaymentRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentRequestActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnPaymentRequest1.setText("Decline");
        btnPaymentRequest1.setToolTipText("");
        btnPaymentRequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentRequest1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnPaymentRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(btnPaymentRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(backJButton)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPaymentRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPaymentRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(328, 328, 328))))
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

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnPaymentRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaymentRequestActionPerformed

    private void btnPaymentRequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentRequest1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaymentRequest1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnPaymentRequest;
    private javax.swing.JButton btnPaymentRequest1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
