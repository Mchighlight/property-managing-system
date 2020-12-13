/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.InvestmentCompany;

import Business.EcoSystem;
import Business.Employee.Decorator;
import Business.Employee.Landlord;
import Business.Employee.Propority;
import Business.Employee.RealEstateAgent;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BoardMemberOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Agent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BoardMemberRequest;
import Business.WorkQueue.FurnishingRequest;
import Business.WorkQueue.WorkRequest;
import Util.Map;
import Util.Map_1;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.InvestmentCompany.FindFurnishingJPanel;

/**
 *
 * @author Mchig
 */
public class LandlordWorkAreaJPanel extends javax.swing.JPanel {

    private BoardMemberRequest request;
    private JPanel userProcessContainer;
    private BoardMemberOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    Map_1 maojframe;

    /**
     * Creates new form TenantWorkAreaJPanel
     */
    public LandlordWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, BoardMemberOrganization boardMemberOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.request = new BoardMemberRequest();
        populateproporityTable();
        populateRequestTable();
        for (Network network : ecosystem.getNetworkList()) {
            NetWorkCombobox.addItem(network.getName());
        }
        if (userAccount.getLandlord().isIsAssignagent()) {
            jButton4.setEnabled(false);
            value.setText(userAccount.getLandlord().getAgent());

        }

        //  maojframe=new Map_1(userProcessContainer, "jjj");
        //  maojframe.setVisible(false);
    }

    public void populateproporityTable() {

        Landlord landlord = userAccount.getLandlord();

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        List<Propority> prolist = landlord.getProporityCatalog();
        if (prolist != null) {
            for (Propority p : prolist) {
                Object row[] = new Object[5];
                row[0] = p.getNickname();
                row[1] = p.getAddress();
                row[2] = p.getAptNo();
                row[3] = p.getMonthlyrent();
                row[4] = p.getURL();
            
                dtm.addRow(row);
            }
        }

    }

    public void populatAgentCombo() {
        AgentCombobox.removeAllItems();
        String network = NetWorkCombobox.getSelectedItem().toString();
        String enterprise = EnterpriseCombobox.getSelectedItem().toString();
        Enterprise enterprise1 = ecosystem.findNetwork(network).getEnterpriseDirectory().findenterprise(enterprise);
        Organization org = enterprise1.getOrganizationDirectory().findorganization("Agent Organization");
        if (org.getRealEstateAgentDirectory().getRealEstateAgentList() != null) {
            for (RealEstateAgent agent : org.getRealEstateAgentDirectory().getRealEstateAgentList()) {
                AgentCombobox.addItem(agent.getName());
            }

        }
    }

    public void populatEnterpriseCombo(String net) {
        EnterpriseCombobox.removeAllItems();
        for (Enterprise enterprise : ecosystem.findNetwork(net).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.RealEstate.getValue())) {
                EnterpriseCombobox.addItem(enterprise.getName());
            }

        }
    }

    public void populateRequestTable() {

        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        ArrayList<WorkRequest> work = userAccount.getWorkQueue().getWorkRequestList();
        if (work != null) {
            for (WorkRequest r : work) {
                Object row[] = new Object[3];
                row[0] = r.getReceiver().getUsername();
                row[1] = r.getStatus();
                row[2] = r.getTitle();

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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        AgentCombobox = new javax.swing.JComboBox<>();
        NetWorkCombobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        value = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EnterpriseCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        jButton1.setText("create new propority");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Find Furnishing Company");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "receiver", "Status", "Title"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton3.setText("Pick Agent");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        AgentCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentComboboxActionPerformed(evt);
            }
        });

        NetWorkCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetWorkComboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("work with agent :");

        value.setText("<value>");

        jLabel2.setText("Network");

        jLabel3.setText("Enterprise");

        EnterpriseCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Agent");

        jButton4.setText("Find Agent");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Property nickName", "Address", "apt No", "Monthy rent", "URL (opt)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton5.setText("View Peoperty webpage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(23, 23, 23))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(AgentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(33, 33, 33)
                                    .addComponent(value))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(EnterpriseCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(NetWorkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(673, 673, 673))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NetWorkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EnterpriseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgentCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(value)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        ManageProporityJPanel manageOrganizationJPanel = new ManageProporityJPanel(userProcessContainer, userAccount, organization, enterprise, ecosystem);
        userProcessContainer.add("manageProporityJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        FindFurnishingJPanel findFurnishingJPanel = new FindFurnishingJPanel(userProcessContainer, userAccount, enterprise, ecosystem);
        userProcessContainer.add("findFurnishingJPanel", findFurnishingJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //find agent user account
        String network = NetWorkCombobox.getSelectedItem().toString();
        String enterprisename = EnterpriseCombobox.getSelectedItem().toString();
        Enterprise enterprise = ecosystem.findNetwork(network).getEnterpriseDirectory().findenterprise(enterprisename);
        Organization organization = enterprise.getOrganizationDirectory().findorganization("Agent Organization");
        String Agentname = AgentCombobox.getSelectedItem().toString();
        UserAccount Agentaccount = organization.getUserAccountDirectory().findUser(Agentname);
        //add request to landlord and agent
        if (Agentaccount != null) {
            request.setReceiver(Agentaccount);
            request.setSender(userAccount);
            request.setStatus("Success");
            request.setTitle("Request agent");
            userAccount.getWorkQueue().getWorkRequestList().add(request);
            Agentaccount.getWorkQueue().getWorkRequestList().add(request);
            //add enterprise to propority
            String LandlordName = userAccount.getUsername();
            for (Propority propority : userAccount.getLandlord().getProporityCatalog()) {
                propority.setEnterprise(enterprise);
            }
            userAccount.getLandlord().setIsAssignagent(true);
            userAccount.getLandlord().setAgent(Agentname);

            JOptionPane.showMessageDialog(null, "assign successfully");
            value.setText(Agentname);
            populateRequestTable();
            jButton4.setEnabled(false);

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void AgentComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentComboboxActionPerformed
        // TODO add your handling code here:

        // populatchargefee();
    }//GEN-LAST:event_AgentComboboxActionPerformed

    private void NetWorkComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetWorkComboboxActionPerformed
        // TODO add your handling code here:
        String network = NetWorkCombobox.getSelectedItem().toString();
        if (network != null) {
            populatEnterpriseCombo(network);
        }

    }//GEN-LAST:event_NetWorkComboboxActionPerformed

    private void EnterpriseComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseComboboxActionPerformed

    }//GEN-LAST:event_EnterpriseComboboxActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        populatAgentCombo();
        jButton3.setEnabled(true);


    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgentCombobox;
    private javax.swing.JComboBox<String> EnterpriseCombobox;
    private javax.swing.JComboBox<String> NetWorkCombobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel value;
    // End of variables declaration//GEN-END:variables
}
