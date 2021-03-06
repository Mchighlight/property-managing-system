/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.repair;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.RepairOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.RepairRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.PropertyCompany.tenant.viewRepairmentJPanel;

/**
 *
 * @author Mchig
 */
public class RepairSpecialistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;

    public RepairSpecialistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,  RepairOrganization repairOrganization, Enterprise enterprise, EcoSystem business) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         populateRepTable();
    }
    
    public void populateRepTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        if(ua.getWorkQueue().getRepairRequestRequestList()==null){
            return;
        }
        for (RepairRequest wq : ua.getWorkQueue().getRepairRequestRequestList()) {
            Object[] row = new Object[jTable1.getColumnCount()];
            row[0] = wq.getPointedDate();
            row[1] = wq;
            row[2] = wq.getRepairSpecialist();
            row[3] = wq.getDepartment();
            row[4] = wq.getStatus();
            model.addRow(row);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-maintenance-50.png"))); // NOI18N
        jLabel1.setText("Repair Request");
        add(jLabel1);
        jLabel1.setBounds(310, 10, 280, 50);

        jButton1.setText("View & Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(380, 359, 150, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Requirement", "Repair Specialist", "Apartment", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 77, 880, 260);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"please select a row","Warning",JOptionPane.ERROR_MESSAGE);
            return;
        }
        RepairRequest request = (RepairRequest)jTable1.getValueAt(selectedRow, 1);
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ProcessJPanel(userProcessContainer, ua, ecosystem,request));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
