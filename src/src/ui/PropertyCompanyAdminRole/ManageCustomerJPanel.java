package ui.PropertyCompanyAdminRole;

import Business.Organization.OrganizationDirectory;
// Employee
import Business.Employee.Buyer;
import Business.Employee.BuyerDirectory;
import Business.Employee.Tenant;
import Business.Employee.TenantDirectory;
import Business.Organization.Organization;
// Role

import Business.Role.TenantRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
// UI package
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hung-chih huang
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private BuyerDirectory buyerDirectory;
    private TenantDirectory tenantDirectory;
    private UserAccountDirectory customerAccountDirectory;

    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageCustomerJPanel(JPanel userProcessContainer, BuyerDirectory buyerDirectory, TenantDirectory tenantDirectory, UserAccountDirectory customerAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerAccountDirectory = customerAccountDirectory;
        this.buyerDirectory = buyerDirectory;
        this.tenantDirectory = tenantDirectory;

        populateOrganizationComboBox();
    }

    public void populateOrganizationComboBox() {
        customerRoleJComboBox.removeAllItems();

        customerRoleJComboBox.addItem("Tenant");
    }

    private void populateBuyerTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Buyer buyer : this.buyerDirectory.getBuyerList()) {
            Object[] row = new Object[6];
            row[0] = buyer.getId();
            row[1] = buyer.getName();
            row[2] = buyer.getEmail();
            row[3] = buyer.getFirstname();
            row[4] = buyer.getLastname();
            row[5] = String.valueOf(buyer.getSSN());
            model.addRow(row);
        }
    }

    private void populateTenantTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Tenant tenant : this.tenantDirectory.getTenantList()) {
            Object[] row = new Object[6];
            row[0] = tenant.getId();
            row[1] = tenant.getName();
            row[2] = tenant.getEmail();
            row[3] = tenant.getFirstname();
            row[4] = tenant.getLastname();
            row[5] = String.valueOf(tenant.getSSN());
            model.addRow(row);
        }
    }

    private boolean emailPatternCorrect() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtemail.getText());
        boolean b = m.matches();
        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addJButton = new javax.swing.JButton();
        customerRoleJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtfn = new javax.swing.JTextField();
        txtln = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);

        addJButton.setText("Create Tenant");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton);
        addJButton.setBounds(530, 300, 170, 60);

        customerRoleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        customerRoleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerRoleJComboBoxActionPerformed(evt);
            }
        });
        add(customerRoleJComboBox);
        customerRoleJComboBox.setBounds(410, 20, 127, 27);

        jLabel1.setText("Customer Role");
        jLabel1.setToolTipText("");
        add(jLabel1);
        jLabel1.setBounds(280, 20, 92, 16);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(130, 180, 60, 50);

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "email", "Firstname", "Lastname", "SSN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(3).setResizable(false);
            organizationJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 860, 92);

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        add(txtemail);
        txtemail.setBounds(320, 290, 126, 26);

        jLabel4.setText("email");
        add(jLabel4);
        jLabel4.setBounds(240, 290, 34, 16);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername);
        txtUsername.setBounds(320, 190, 126, 26);
        add(txtpassword);
        txtpassword.setBounds(320, 240, 126, 26);

        jLabel5.setText("Username");
        add(jLabel5);
        jLabel5.setBounds(240, 200, 62, 16);

        jLabel6.setText("password");
        add(jLabel6);
        jLabel6.setBounds(240, 250, 60, 16);

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });
        add(txtSSN);
        txtSSN.setBounds(320, 340, 129, 26);

        jLabel9.setText("SSN");
        add(jLabel9);
        jLabel9.setBounds(240, 350, 24, 16);

        txtfn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnActionPerformed(evt);
            }
        });
        add(txtfn);
        txtfn.setBounds(600, 190, 126, 26);

        txtln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnActionPerformed(evt);
            }
        });
        add(txtln);
        txtln.setBounds(600, 240, 126, 26);

        jLabel7.setText("Firstname");
        add(jLabel7);
        jLabel7.setBounds(530, 190, 62, 16);

        jLabel8.setText("Lastname");
        add(jLabel8);
        jLabel8.setBounds(530, 240, 60, 16);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel10.setText("jLabel4");
        add(jLabel10);
        jLabel10.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        String customerRole = (String) customerRoleJComboBox.getSelectedItem();

        String email = txtemail.getText();
        String Username = txtUsername.getText();
        String password = txtpassword.getText();
        String ssn = txtSSN.getText();
        String fn = txtfn.getText();
        String ln = txtln.getText();

        if (password.equals("") || Username.equals("") || email.equals("") || ssn.equals("") || fn.equals("") || ln.equals("")) {
            JOptionPane.showMessageDialog(null, "Input can not be empty", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!this.customerAccountDirectory.checkIfUsernameIsUnique(Username)) {
            JOptionPane.showMessageDialog(null, "Username must be unique", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!emailPatternCorrect()) {
            txtemail.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Please enter valid Username in the format of xx@xx.xx", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Tenant tenant = this.tenantDirectory.createTenant(Username, email, ssn, fn, ln);
            this.customerAccountDirectory.createUserAccount(Username, password, tenant, new TenantRole());
            JOptionPane.showMessageDialog(null, " Tenant added,user added");
            populateTenantTable();
            txtemail.setText("");
            txtUsername.setText("");
            txtpassword.setText("");
            txtSSN.setText("");
            txtfn.setText("");
            txtln.setText("");
            txtemail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel4.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_addJButtonActionPerformed

    private void customerRoleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerRoleJComboBoxActionPerformed
        String customerRole = (String) customerRoleJComboBox.getSelectedItem();
        if (customerRole != null) {
            if (customerRole.equals("Buyer")) {
                //JOptionPane.showMessageDialog(null, organization.getName());
                if (this.buyerDirectory.getBuyerList() != null && this.buyerDirectory.getBuyerList().size() != 0) {
                    populateBuyerTable();
                }
            } else if (customerRole.equals("Tenant")) {
                if (this.tenantDirectory.getTenantList() != null && this.tenantDirectory.getTenantList().size() != 0) {
                    populateTenantTable();
                }
            }
        }
    }//GEN-LAST:event_customerRoleJComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtfnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnActionPerformed

    private void txtlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox customerRoleJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfn;
    private javax.swing.JTextField txtln;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
