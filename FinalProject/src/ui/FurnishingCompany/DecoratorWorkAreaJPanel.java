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
        valueLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setLayout(null);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("User :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(330, 10, 53, 30);

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(390, 10, 158, 26);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 43, 760, 180);

        btndeny.setText("Decline");
        btndeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndenyActionPerformed(evt);
            }
        });
        add(btndeny);
        btndeny.setBounds(790, 50, 91, 43);

        btnaccept.setText("Accept");
        btnaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptActionPerformed(evt);
            }
        });
        add(btnaccept);
        btnaccept.setBounds(790, 100, 91, 43);

        btnFinish.setText("Finish");
        btnFinish.setEnabled(false);
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        add(btnFinish);
        btnFinish.setBounds(790, 150, 91, 43);

        CleaningStaffComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CleaningStaffComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleaningStaffComboBoxActionPerformed(evt);
            }
        });
        add(CleaningStaffComboBox);
        CleaningStaffComboBox.setBounds(291, 322, 134, 27);

        assignjButton.setText("Assign  to this Cleaning profession");
        assignjButton.setEnabled(false);
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });
        add(assignjButton);
        assignjButton.setBounds(100, 410, 266, 42);

        jLabel2.setText("Total Charges base on square feet");
        add(jLabel2);
        jLabel2.setBounds(109, 368, 214, 26);

        txtfee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeeActionPerformed(evt);
            }
        });
        add(txtfee);
        txtfee.setBounds(329, 368, 105, 26);

        jButton2.setText("get Cost");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(431, 321, 135, 29);

        jLabel3.setText("Select a cleaning profession");
        add(jLabel3);
        jLabel3.setBounds(109, 326, 176, 16);

        jButton1.setText("Select a cleaning profession from the same network");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(109, 228, 370, 39);

        EnterpriseCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboboxActionPerformed(evt);
            }
        });
        add(EnterpriseCombobox);
        EnterpriseCombobox.setBounds(291, 273, 134, 30);

        jLabel4.setText("Select enterprise");
        add(jLabel4);
        jLabel4.setBounds(109, 279, 104, 16);

        valueLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        valueLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-christmas-tree-50.png"))); // NOI18N
        add(valueLabel1);
        valueLabel1.setBounds(730, 240, 50, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel5.setText("jLabel4");
        add(jLabel5);
        jLabel5.setBounds(5, -4, 930, 710);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtfee;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JLabel valueLabel1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
