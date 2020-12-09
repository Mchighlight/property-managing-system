/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FinanceCompany;

import ui.PropertyCompany.tenant.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Rent;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junyaoli
 */
public class AgentReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    Enterprise enterprise ;
    ArrayList<SignLeaseRequest> slr ;
    
    public AgentReportJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         this.enterprise = enterprise;
         
         for (Network network : ecosystem.getNetworkList()) {
            NetWorkCombobox.addItem(network.getName());
        } // for
    } // Constructor

    
    public void populatEnterpriseCombo(String net) {
        EnterpriseCombobox.removeAllItems();
        for (Enterprise enterprise : ecosystem.findNetwork(net).getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.RealEstate.getValue())) {
                EnterpriseCombobox.addItem(enterprise);
            } // if
        } // for
    } // populatEnterpriseCombo
    
    /*
    public void populateOrganizationCombo(Enterprise ept) {
        OrganizationCombobox.removeAllItems();
        for (Organization og : ept.getOrganizationDirectory().getOrganizationList()) {
            System.out.println();
            if (og.getOrganizationType().getValue().equals(Organization.Type.Agent.getValue())) {
                OrganizationCombobox.addItem(og.getName());
            } // if
        } // for
    } // populateOrganizationCombo
    */
     public  String dateToString(Date date){
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
         String strDate = dateFormat.format(date);  
         return strDate ;
   }
    
    public void populateAptTable(UserAccount slr) {

        DefaultTableModel model = (DefaultTableModel) ApartmentJTable.getModel();
        model.setRowCount(0);
        if( this.slr.size() != 0 ){
            for( SignLeaseRequest sl : this.slr ){
                if( sl.getAgent().getUsername().equals(slr.getUsername()) ){
                    if( sl.getLease() != null ){
                       if(   sl.getLease().getRentList().size() == 0 ){
                            Object row[] = new Object[5];
                            row[0] = sl ;
                            row[2] = sl.getLease().getBuilding().getMonthlyrent();
                            row[4] = sl.getTenant();
                            row[5] = sl.getAgent();
                            model.addRow(row);
                        } // if
                        else{
                           for( Rent rent : sl.getLease().getRentList() ){
                                Object row[] = new Object[6];
                                row[0] = sl ;
                                row[1] = dateToString(rent.getDateToPay()) ;
                                row[2] = sl.getLease().getBuilding().getMonthlyrent();
                                row[3] = rent.getPayment().getPayMethod() ;
                                row[4] = sl.getTenant();
                                row[5] = sl.getAgent();
                                model.addRow(row);                   
                            } // for
                        } // else
                    } // if
                } //if             
            } // for
        } // if

    } // populateAptTable

    
  public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) 
    { 
  
        // Create a new ArrayList 
        ArrayList<T> newList = new ArrayList<T>(); 
  
        // Traverse through the first list 
        for (T element : list) { 
  
            // If this element is not present in newList 
            // then add it 
            if (!newList.contains(element)) { 
  
                newList.add(element); 
            } 
        } 
  
        // return the new list 
        return newList; 
    } 
    
    public void populateAgentCombo( Enterprise enter) {
        AgentComboBox.removeAllItems();
        this.slr = new ArrayList<SignLeaseRequest>() ;
        ArrayList<UserAccount> agents = new ArrayList<UserAccount>() ;
        Organization org = enter.getOrganizationDirectory().findorganization("Leasing Organization");
        if (org.getRealEstateAgentDirectory().getRealEstateAgentList() != null) {
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getLeasing() != null ){
                    for(  SignLeaseRequest sl : ua.getWorkQueue().getSignLeaseRequestList() ){
                        this.slr.add(sl);
                        agents.add(sl.getAgent());                     
                    } //for                                      
                } // if                   
            } // for
        } // if
        
        if( agents.size() != 0 ){
            ArrayList<UserAccount> newAgents = removeDuplicates(agents); 
            for( UserAccount ua : newAgents ){
                AgentComboBox.addItem(ua);
            }
        }
    } // populateApartmentCombo
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ApartmentJTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        AgentComboBox = new javax.swing.JComboBox<>();
        NetWorkCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EnterpriseCombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        ApartmentJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Apartment", "Rental Date", "Rent Price", "Payment Method", "Tenant", "Agent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ApartmentJTable);

        jLabel5.setText("Apartment Report");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        AgentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentComboBoxActionPerformed(evt);
            }
        });

        NetWorkCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetWorkComboboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Network");

        jLabel6.setText("Enterprise");

        EnterpriseCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboboxActionPerformed(evt);
            }
        });

        jLabel7.setText("Agent");
        jLabel7.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(394, 394, 394))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NetWorkCombobox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 142, Short.MAX_VALUE)
                                    .addComponent(EnterpriseCombobox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(AgentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NetWorkCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(EnterpriseCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(284, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void AgentComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentComboBoxActionPerformed
        UserAccount agent = (UserAccount)AgentComboBox.getSelectedItem() ;      
        if (agent != null) {
            populateAptTable(agent);
        }
    }//GEN-LAST:event_AgentComboBoxActionPerformed

    private void NetWorkComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetWorkComboboxActionPerformed
        // TODO add your handling code here:
        String network = NetWorkCombobox.getSelectedItem().toString();
        if (network != null) {
            populatEnterpriseCombo(network);
        }
    }//GEN-LAST:event_NetWorkComboboxActionPerformed

    private void EnterpriseComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpriseComboboxActionPerformed
        Enterprise enter = (Enterprise) EnterpriseCombobox.getSelectedItem();
        if (enter != null) {
            populateAgentCombo(enter) ;
        } // if
        
    }//GEN-LAST:event_EnterpriseComboboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> AgentComboBox;
    private javax.swing.JTable ApartmentJTable;
    private javax.swing.JComboBox<Object> EnterpriseCombobox;
    private javax.swing.JComboBox<String> NetWorkCombobox;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
