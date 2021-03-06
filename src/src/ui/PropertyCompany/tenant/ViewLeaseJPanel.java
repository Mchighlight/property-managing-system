/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;

import ui.PropertyCompany.tenant.*;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junyaoli
 */
public class ViewLeaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
   
    public ViewLeaseJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
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
        btnPayLease = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        btnLeaseUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

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

        add(jScrollPane2);
        jScrollPane2.setBounds(9, 32, 890, 260);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Lease Collection");
        add(jLabel5);
        jLabel5.setBounds(360, 0, 159, 22);

        btnDetail.setText("View Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });
        add(btnDetail);
        btnDetail.setBounds(180, 320, 140, 49);

        btnPayLease.setText("Pay Lease");
        btnPayLease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayLeaseActionPerformed(evt);
            }
        });
        add(btnPayLease);
        btnPayLease.setBounds(700, 320, 140, 49);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(70, 310, 60, 60);

        btnDecline.setText("Decline");
        btnDecline.setToolTipText("");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });
        add(btnDecline);
        btnDecline.setBounds(530, 320, 150, 49);

        btnLeaseUpdate.setText("Lease Updated");
        btnLeaseUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaseUpdateActionPerformed(evt);
            }
        });
        add(btnLeaseUpdate);
        btnLeaseUpdate.setBounds(360, 320, 140, 49);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(5, -4, 900, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        int orderId = Integer.parseInt(workRequestJTable.getValueAt(row, 0).toString());
        SignLeaseRequest selectedSlr =  this.ua.getWorkQueue().findSignLeaseRequest(orderId) ;
        String status = workRequestJTable.getValueAt(row, 4).toString() ;
        if( status.equals("Accepted") || status.equals("Payment Request") || status.equals("Payment Completed")  ){
            CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add(new DetailLeaseJPanel( userProcessContainer,  ua,  ecosystem, selectedSlr) );
            layout.next(userProcessContainer);
        }//
        else{
            JOptionPane.showMessageDialog(null, "Your Leasing are not aprroved yet!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnPayLeaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayLeaseActionPerformed
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        int orderId = Integer.parseInt(workRequestJTable.getValueAt(row, 0).toString());
        SignLeaseRequest selectedSlr =  this.ua.getWorkQueue().findSignLeaseRequest(orderId) ;
        String status = workRequestJTable.getValueAt(row, 4).toString() ;
        if( status.equals("Payment Request") ){
            CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add(new PayLeaseJPanel( userProcessContainer,  ua,  ecosystem, selectedSlr) );
            layout.next(userProcessContainer);
        }//
        else{
            if( status.equals("Payment Completed") ){
                JOptionPane.showMessageDialog(null, "You had pay the rent this month", "Info", JOptionPane.INFORMATION_MESSAGE);
                return ;
            }
            JOptionPane.showMessageDialog(null, "Your Leasing are not aprroved yet!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }
    }//GEN-LAST:event_btnPayLeaseActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:

        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        int orderId = Integer.parseInt(workRequestJTable.getValueAt(row, 0).toString());
        SignLeaseRequest selectedSlr =  this.ua.getWorkQueue().findSignLeaseRequest(orderId) ;
        String status = workRequestJTable.getValueAt(row, 4).toString() ;
        if( status.equals("Decline") ){
             JOptionPane.showMessageDialog(null, "Leasing had been Declined!", "Info", JOptionPane.INFORMATION_MESSAGE);
        } // if
        else if ( status.equals("Contract preparation") ){
             selectedSlr.setStatus("Decline");
            JOptionPane.showMessageDialog(null, "Status updated!", "Info", JOptionPane.INFORMATION_MESSAGE);
            populateRequestTable();
        } // else if
        else{
             JOptionPane.showMessageDialog(null, "You had sign the contract, If you want to terminate Lease please contact our lease office", "Info", JOptionPane.INFORMATION_MESSAGE);
        } // else 
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnLeaseUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaseUpdateActionPerformed
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        int orderId = Integer.parseInt(workRequestJTable.getValueAt(row, 0).toString());
        SignLeaseRequest selectedSlr =  this.ua.getWorkQueue().findSignLeaseRequest(orderId) ;
        String status = workRequestJTable.getValueAt(row, 4).toString() ;
        if( status.equals("Renewal Request")  ){ // status.equals("Lease Expired")
            CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add(new UpdateLeaseJPanel( userProcessContainer,  ua,  ecosystem, selectedSlr) );
            layout.next(userProcessContainer);
        }//
        else{
            JOptionPane.showMessageDialog(null, "Your Leasing is not expired yet!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLeaseUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnLeaseUpdate;
    private javax.swing.JButton btnPayLease;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
