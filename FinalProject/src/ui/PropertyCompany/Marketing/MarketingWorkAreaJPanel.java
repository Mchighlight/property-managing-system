/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.Marketing;

import Business.EcoSystem;
import Business.Employee.Landlord;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerSupportOrganization;
import Business.Organization.FurnishingOrganization;
import Business.Organization.MarketingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FurnishingRequest;
import Business.WorkQueue.MarketingRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mchig
 */
public class MarketingWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;

    private MarketingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;

    /**
     * Creates new form TenantWorkAreaJPanel
     */
    public MarketingWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, MarketingOrganization marketingorganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        ArrayList<FurnishingRequest> work = userAccount.getWorkQueue().getFurnishingRequestList();

        if (work != null) {
            for (FurnishingRequest f : work) {

                Object row[] = new Object[5];
                row[0] = f.getOrderID();
                row[1] = f.getCustomerAccount().getUsername();
                row[2] = f.getSender();
                row[3] = f.getRequirement();
                row[4] = f.getStatus();


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
        btnaccept = new javax.swing.JButton();
        txtURL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderID", "Customer", "Agent", "Property Nickname", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable);

        btnaccept.setText("Upload URL");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });

        txtURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtURLActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Enter URL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnaccept)
                            .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(btnaccept)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        String propertyname = workRequestJTable.getValueAt(row, 3).toString();
        String landlordname = workRequestJTable.getValueAt(row, 1).toString();
        userAccount.getWorkQueue().findFurnishingrequest(propertyname).setStatus("Finished");
        //userAccount.getWorkQueue().findrequest(orderId).setResult(inmessage);

        String URL = txtURL.getText();

        Enterprise enterprise1 = ecosystem.findNetwork("aa").getEnterpriseDirectory().findenterprise("investment");
        Organization organization1 = enterprise1.getOrganizationDirectory().findorganization("BoardMember Organization");
        Landlord landlord = organization1.getLandlordDirectory().findlandlord(landlordname);
        // landlord.getProporityCatalog().findPropority(propertyname).setPropertyURL(URL);

        JOptionPane.showMessageDialog(null, "URL added", "Info", JOptionPane.INFORMATION_MESSAGE);
        populateRequestTable();
    }//GEN-LAST:event_btnacceptActionPerformed

    private void txtURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtURLActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccept;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtURL;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
