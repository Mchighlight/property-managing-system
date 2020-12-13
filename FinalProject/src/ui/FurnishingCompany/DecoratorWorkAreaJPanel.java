/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FurnishingCompany;

import Business.EcoSystem;
import Business.Employee.CleaningStaff;
import Business.Enterprise.Enterprise;
import Business.Organization.FurnishingOrganization;
import Business.Organization.Organization;
import static Business.Role.Role.RoleType.CleaningStaff;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FurnishingRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mchig
 */
public class DecoratorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private FurnishingOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;

    /**
     * Creates new form TenantWorkAreaJPanel
     */
    public DecoratorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FurnishingOrganization furnishingOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        // this.request = new CleaningRequest();
        valueLabel.setText(userAccount.getUsername());
        populateRequestTable();
        // populatCleanCombo();
    }

    public void populatchargefee(String net, String ent) {
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        String cleaning = CleaningStaffComboBox.getSelectedItem().toString();

        Enterprise enterprise = ecosystem.findNetwork(net).getEnterpriseDirectory().findenterprise(ent);
        Organization organization = enterprise.getOrganizationDirectory().findorganization("Cleaning Organization");
        // JOptionPane.showMessageDialog(null, organization.getName());
        int cleaningfee = organization.getCleaningStaffDirectory().findCleaningstaff(cleaning).getChargepresquarefee();
        int sqtfeet = Integer.parseInt(workRequestJTable.getValueAt(row, 5).toString());
        int total = sqtfeet * cleaningfee;
        txtfee.setText(Integer.toString(total));
        JOptionPane.showMessageDialog(null, "You cost for cleaning is " + total);

    }

    public void populateRequestTable() {

        DefaultTableModel dtm = (DefaultTableModel) workRequestJTable.getModel();
        dtm.setRowCount(0);
        ArrayList<FurnishingRequest> work = userAccount.getWorkQueue().getFurnishingRequestList();

        if (work != null) {
            for (FurnishingRequest f : work) {

                Object row[] = new Object[7];
                row[0] = f.getCustomerAccount().getUsername();
                row[1] = f.getRequirement();
                row[2] = f.getFeeString();
                row[3] = f.getStatus();
                row[4] = f.getTitle();
                row[5] = f.getSqtfeet();
                row[6] = f.getComment();
                dtm.addRow(row);
            }

        } else {
            JOptionPane.showMessageDialog(null, "null");
        }

    }

    public void populatEnterpriseCombo() {
        EnterpriseCombobox.removeAllItems();
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "please select a request");
        }
        String network = workRequestJTable.getValueAt(row, 6).toString();
        for (Enterprise enterprise : ecosystem.findNetwork(network).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Furnishing.getValue())) {
                EnterpriseCombobox.addItem(enterprise.getName());
            }

        }
    }

    public void populatCleanCombo(String enterprise) {
        CleaningStaffComboBox.removeAllItems();
        int row = workRequestJTable.getSelectedRow();
        String network = workRequestJTable.getValueAt(row, 6).toString();
        Enterprise enter = ecosystem.findNetwork(network).getEnterpriseDirectory().findenterprise(enterprise);
        Organization organization = enter.getOrganizationDirectory().findorganization("Cleaning Organization");
        for (CleaningStaff cleaning : organization.getCleaningStaffDirectory().getCleaningStaffList()) {
            CleaningStaffComboBox.addItem(cleaning.getName());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btndeny = new javax.swing.JButton();
        btnaccept = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        CleaningStaffComboBox = new javax.swing.JComboBox<>();
        assignjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtfee = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        EnterpriseCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("User :");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        valueLabel.setText("<value>");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer", "Requirement", "budget", "Status", "Title", "Sqt Feet", "From Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btndeny.setText("Decline");
        btndeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndenyActionPerformed(evt);
            }
        });

        btnaccept.setText("Accept");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.setEnabled(false);
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        CleaningStaffComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CleaningStaffComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleaningStaffComboBoxActionPerformed(evt);
            }
        });

        assignjButton.setText("Assign  to this Cleaning profession");
        assignjButton.setEnabled(false);
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Total Charges base on square feet");

        txtfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeeActionPerformed(evt);
            }
        });

        jButton2.setText("get Cost");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select a cleaning profession");

        jButton1.setText("Select a cleaning profession from the same network");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EnterpriseCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Select enterprise");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(397, 397, 397))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CleaningStaffComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EnterpriseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(assignjButton)
                            .addComponent(jButton1))
                        .addGap(334, 334, 334))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(466, 466, 466))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btndeny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnaccept, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btndeny, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnaccept, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterpriseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CleaningStaffComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(assignjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnFinish, btnaccept, btndeny});

    }// </editor-fold>//GEN-END:initComponents

    private void btndenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndenyActionPerformed
        // TODO add your handling code here:

        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        String pro = workRequestJTable.getValueAt(row, 1).toString();
        userAccount.getWorkQueue().findFurnishingrequest(pro).setStatus("Declined");
        JOptionPane.showMessageDialog(null, "Status updated!", "Info", JOptionPane.INFORMATION_MESSAGE);
        populateRequestTable();
        btnaccept.setEnabled(false);

    }//GEN-LAST:event_btndenyActionPerformed

    private void btnacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        String pro = workRequestJTable.getValueAt(row, 1).toString();
        userAccount.getWorkQueue().findFurnishingrequest(pro).setStatus("Accepted and proecssing");
        //userAccount.getWorkQueue().findrequest(orderId).setResult(inmessage);

        JOptionPane.showMessageDialog(null, "Status updated!", "Info", JOptionPane.INFORMATION_MESSAGE);
        populateRequestTable();
        btnFinish.setEnabled(true);
        btndeny.setEnabled(false);


    }//GEN-LAST:event_btnacceptActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        int row = workRequestJTable.getSelectedRow();
        if (row < 0) {
            return;
        }
        String pro = workRequestJTable.getValueAt(row, 1).toString();
        userAccount.getWorkQueue().findFurnishingrequest(pro).setStatus("Finished");
        JOptionPane.showMessageDialog(null, "Status updated!", "Info", JOptionPane.INFORMATION_MESSAGE);
        populateRequestTable();
        btnaccept.setEnabled(false);
        jButton1.setEnabled(true);

    }//GEN-LAST:event_btnFinishActionPerformed

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:

        String enter = EnterpriseCombobox.getSelectedItem().toString();
        int row = workRequestJTable.getSelectedRow();
        String network = workRequestJTable.getValueAt(row, 6).toString();

        String pro = workRequestJTable.getValueAt(row, 1).toString();
        String cleanname = CleaningStaffComboBox.getSelectedItem().toString();
        Enterprise enterprise1 = ecosystem.findNetwork(network).getEnterpriseDirectory().findenterprise(enter);
        Organization organization1 = enterprise1.getOrganizationDirectory().findorganization("Cleaning Organization");

        UserAccount cleaningaccount = organization1.getUserAccountDirectory().findUser(cleanname);
        FurnishingRequest request = userAccount.getWorkQueue().findFurnishingrequest(pro);
        if (cleaningaccount != null) {
            request.setStatus("Cleaning processing");
            cleaningaccount.getWorkQueue().getFurnishingRequestList().add(request);
            JOptionPane.showMessageDialog(null, "assign successfully");
            populateRequestTable();

        } else {
            JOptionPane.showMessageDialog(null, "null");
        }


    }//GEN-LAST:event_assignjButtonActionPerformed

    private void txtfeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String enter = EnterpriseCombobox.getSelectedItem().toString();
        int row = workRequestJTable.getSelectedRow();
        String network = workRequestJTable.getValueAt(row, 6).toString();
        populatchargefee(network, enter);
          assignjButton.setEnabled(true);

        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        populatEnterpriseCombo();
        jButton2.setEnabled(true);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void EnterpriseComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseComboboxActionPerformed

        String Enterprise = EnterpriseCombobox.getSelectedItem().toString();
        if (Enterprise != null) {
            populatCleanCombo(Enterprise);
        }

    }//GEN-LAST:event_EnterpriseComboboxActionPerformed

    private void CleaningStaffComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleaningStaffComboBoxActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_CleaningStaffComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CleaningStaffComboBox;
    private javax.swing.JComboBox<String> EnterpriseCombobox;
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnaccept;
    private javax.swing.JButton btndeny;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfee;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
