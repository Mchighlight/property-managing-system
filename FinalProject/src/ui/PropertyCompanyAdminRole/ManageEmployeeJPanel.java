package ui.PropertyCompanyAdminRole;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
// Employee
import Business.Employee.RealEstateAgent;
import Business.Employee.RepairSpecialist;
import Business.Employee.CustomerSupport;
import Business.Employee.Leasing;
import Business.Employee.Marketing;
// Role
import Business.Role.AgentRole;
import Business.Role.RepairSpecialistRole;
import Business.Role.CustomerSupportRole;
import Business.Role.LeasingRole;
import Business.Role.MarketingRole;
import Business.UserAccount.UserAccount;
// UI package
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import sun.management.Agent;

/**
 *
 * @author hung-chih huang
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageEmployeeJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        populateOrganizationComboBox();

    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    private void populateRealEstateAgentTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (RealEstateAgent reg : organization.getRealEstateAgentDirectory().getRealEstateAgentList()) {
            Object[] row = new Object[3];
            row[0] = reg.getId();
            row[1] = reg.getName();
            row[2] = reg.getEmail();
            model.addRow(row);
        }
    }

    private void populateRepairSpecialistTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (RepairSpecialist rs : organization.getRepairSpecialistDirectory().getRepairSpecialist()) {
            Object[] row = new Object[3];
            row[0] = rs.getId();
            row[1] = rs.getName();
            row[2] = rs.getEmail();
            model.addRow(row);
        }
    }

    private void populateCustomerSupportTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (CustomerSupport cs : organization.getCustomerSupportDirectory().getCustomerSupportList()) {
            Object[] row = new Object[3];
            row[0] = cs.getId();
            row[1] = cs.getName();
            row[2] = cs.getEmail();
            model.addRow(row);
        }
    }

    private void populateLeasingTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Leasing ls : organization.getLeasingDirectory().getLeasingList()) {
            Object[] row = new Object[3];
            row[0] = ls.getId();
            row[1] = ls.getName();
            row[2] = ls.getEmail();
            model.addRow(row);
        }
    }

    private void populateMarketTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        for (Marketing ma : organization.getMarketingDirectory().getMarketingList()) {
            Object[] row = new Object[3];
            row[0] = ma.getId();
            row[1] = ma.getName();
            row[2] = ma.getEmail();
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

        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        addJButton.setText("Create Employee");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Organization");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel4.setText("email");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel5.setText("Username");

        jLabel6.setText("password");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addJButton)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addJButton)
                            .addComponent(backJButton))
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        //  JOptionPane.showMessageDialog(null, organizationJComboBox.getSelectedItem().toString());
        String name = nameJTextField.getText();
        String email = txtemail.getText();
        String Username = txtUsername.getText();
        String password = txtpassword.getText();

        if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Agent.getValue())) {

            RealEstateAgent realEstateAgent = organization.getRealEstateAgentDirectory().createRealEstateAgent(name, email, "", "", 0);
            organization.getUserAccountDirectory().createUserAccount(Username, password, realEstateAgent, new AgentRole());
            JOptionPane.showMessageDialog(null, " Real Estate Agent added,user added");

            populateRealEstateAgentTable(organization);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Repair.getValue())) {

            RepairSpecialist repairSpecialist = organization.getRepairSpecialistDirectory().createRepairSpecialist(name, email);
            organization.getUserAccountDirectory().createUserAccount(Username, password, repairSpecialist, new RepairSpecialistRole());
            JOptionPane.showMessageDialog(null, " Repair specialist added,user added");

            populateRepairSpecialistTable(organization);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.CustomerSupport.getValue())) {

            CustomerSupport cs = organization.getCustomerSupportDirectory().createCustomerSupport(name, email);
            organization.getUserAccountDirectory().createUserAccount(Username, password, cs, new CustomerSupportRole());
            JOptionPane.showMessageDialog(null, " Customer support added,user added");

            populateCustomerSupportTable(organization);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Leasing.getValue())) {

            Leasing ls = organization.getLeasingDirectory().createLeasing(name, email, "");
            organization.getUserAccountDirectory().createUserAccount(Username, password, ls, new LeasingRole());
            JOptionPane.showMessageDialog(null, " Leasing  added,user added");

            populateLeasingTable(organization);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Marketing.getValue())) {
            Marketing marketing = organization.getMarketingDirectory().createMarketing(name, email);
            organization.getUserAccountDirectory().createUserAccount(Username, password, marketing, new MarketingRole());
            JOptionPane.showMessageDialog(null, " Marketing added,user added");

            populateMarketTable(organization);
        }

    }//GEN-LAST:event_addJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            if (organization.getName().equals(Organization.Type.Agent.getValue())) {
                //JOptionPane.showMessageDialog(null, organization.getName());
                populateRealEstateAgentTable(organization);
            } else if (organization.getName().equals(Organization.Type.Repair.getValue())) {
                populateRepairSpecialistTable(organization);
            } else if (organization.getName().equals(Organization.Type.CustomerSupport.getValue())) {
                populateCustomerSupportTable(organization);
            } else if (organization.getName().equals(Organization.Type.Leasing.getValue())) {
                populateLeasingTable(organization);
            } else if (organization.getName().equals(Organization.Type.Marketing.getValue())) {
                populateMarketTable(organization);
            }
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

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

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        int row = organizationJTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!", "get Request", JOptionPane.ERROR_MESSAGE);
        }
        String name = organizationJTable.getValueAt(row, 1).toString();

        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Agent.getValue())) {

            //find cleaningstaff via user name
            RealEstateAgent agent = organization.getRealEstateAgentDirectory().findEealEstateAgent(name);

            //remove this clean from list
            organization.getRealEstateAgentDirectory().getRealEstateAgentList().remove(agent);
            populateRealEstateAgentTable(organization);

            //remove this clean from userAccount so that the user couldn't log in
            UserAccount use = organization.getUserAccountDirectory().findUser(name);
            organization.getUserAccountDirectory().deleteUserAccount(use);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Marketing.getValue())) {

            //find cleaningstaff via user name
            Marketing marketing = organization.getMarketingDirectory().findMarketing(name);

            //remove this customer from list
            organization.getMarketingDirectory().getMarketingList().remove(marketing);
            populateMarketTable(organization);

            //remove this customer from userAccount so that the user couldn't log in
            UserAccount use = organization.getUserAccountDirectory().findUser(name);
            organization.getUserAccountDirectory().deleteUserAccount(use);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Leasing.getValue())) {

            //find cleaningstaff via user name
            Leasing leasing = organization.getLeasingDirectory().findLeasing(name);
            //remove this customer from list
            organization.getLeasingDirectory().getLeasingList().remove(leasing);
            populateLeasingTable(organization);

            //remove this customer from userAccount so that the user couldn't log in
            UserAccount use = organization.getUserAccountDirectory().findUser(name);
            organization.getUserAccountDirectory().deleteUserAccount(use);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.CustomerSupport.getValue())) {

            //find cleaningstaff via user name
            CustomerSupport cusp = organization.getCustomerSupportDirectory().findCustomerSupport(name);
            //remove this customer from list
            organization.getCustomerSupportDirectory().getCustomerSupportList().remove(cusp);
            populateCustomerSupportTable(organization);

            //remove this customer from userAccount so that the user couldn't log in
            UserAccount use = organization.getUserAccountDirectory().findUser(name);
            organization.getUserAccountDirectory().deleteUserAccount(use);
        } else if (organizationJComboBox.getSelectedItem().toString().equals(Organization.Type.Repair.getValue())) {

            //find cleaningstaff via user name
            RepairSpecialist rep = organization.getRepairSpecialistDirectory().findRepairSpecialist(name);
            //remove this customer from list
            organization.getRepairSpecialistDirectory().getRepairSpecialist().remove(rep);
            populateRepairSpecialistTable(organization);

            //remove this customer from userAccount so that the user couldn't log in
            UserAccount use = organization.getUserAccountDirectory().findUser(name);
            organization.getUserAccountDirectory().deleteUserAccount(use);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
