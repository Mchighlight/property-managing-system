/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FurnishingCompany;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CleaningOrganization;
import Business.Organization.FurnishingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FurnishingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mchig
 */
public class CleaningStaffWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TenantWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private FurnishingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;

    public CleaningStaffWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CleaningOrganization accountingOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        // this.request = new CleaningRequest();
        valueLabel.setText(userAccount.getUsername());
        populateRequestTable();
        //populatCleanCombo();
    }

    public void populateRequestTable() {

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<FurnishingRequest> work = userAccount.getWorkQueue().getFurnishingRequestList();

        if (work != null) {
            for (FurnishingRequest f : work) {

                Object row[] = new Object[5];
                row[0] = f.getCustomerAccount().getUsername();
                row[1] = f.getRequirement();
                row[2] = f.getFeeString();
                row[3] = f.getStatus();
                row[4] = f.getTitle();
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

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        btnaccept = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("User :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(240, 60, 127, 30);

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(400, 60, 158, 26);

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer", "Requirement", "budget", "Status", "Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);

        add(jScrollPane2);
        jScrollPane2.setBounds(154, 118, 499, 118);

        btnaccept.setText("Finished");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });
        add(btnaccept);
        btnaccept.setBounds(330, 270, 154, 61);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dec11.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-10, -90, 1000, 810);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable1.getSelectedRow();
        if (row < 0) {
            return;
        }
        String pro = workRequestJTable1.getValueAt(row, 1).toString();
        String title = workRequestJTable1.getValueAt(row, 4).toString();
        String landlordname = workRequestJTable1.getValueAt(row, 0).toString();
        
        FurnishingRequest req = userAccount.getWorkQueue().findFurnishingrequest(pro);
        req.setStatus("Cleaning Finished");

        UserAccount landlordaccount = req.getCustomerAccount();

        WorkRequest request = landlordaccount.getWorkQueue().findWorkRequestList(title);
        request.setStatus("Cleaning Finished");
        JOptionPane.showMessageDialog(null, "Status updated!", "Info", JOptionPane.INFORMATION_MESSAGE);
        populateRequestTable();
    }//GEN-LAST:event_btnacceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccept;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
