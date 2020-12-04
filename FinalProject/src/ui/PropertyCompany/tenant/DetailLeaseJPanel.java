/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;

import ui.PropertyCompany.leasing.*;
import ui.PropertyCompany.agent.*;
import ui.PropertyCompany.tenant.*;
import Business.EcoSystem;
import Business.Employee.RealEstateAgent;
import Business.Enterprise.Enterprise;
import Business.Organization.CustomerSupportOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FurnishingRequest;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Lease;
import Business.property.Rent;
import java.awt.CardLayout;
import java.awt.Component;
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
public class DetailLeaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    SignLeaseRequest slr;
   
    public DetailLeaseJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, SignLeaseRequest slr) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         this.slr = slr ;
         populateTextField();
    }

   public String dateToString(Date date){
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
         String strDate = dateFormat.format(date);  
         return strDate ;
   }
    
   private void populateTextField(){
            Lease lease =  this.slr.getLease() ;
            txtStartDate.setText(this.dateToString(lease.getStartDate()));
            
            txtEndDate.setText(this.dateToString(lease.getEndDate()));
            if(lease.getRentalDate() != null)
                txtRentalDate.setText(this.dateToString(lease.getRentalDate()));
            else
                txtRentalDate.setText("Not Pay Yet");
                
            if( lease.getBalance() != null )
                txtBalance.setText(String.valueOf(lease.getBalance()));
            txtSecurityDeposit.setText(String.valueOf(lease.getSecurityDeposit()));
            txtBuilding.setText(lease.getBuilding().toString());
            txtTenant.setText(lease.getTenant().getUsername());
            if( lease.getTermination() != null )
                txtTerminationDate.setText(dateToString(lease.getTermination().getLeavingDate()));
            else
                txtTerminationDate.setText("No Termination");
            
            // populate rental list
           if( lease.getRentList().size() != 0 ){
                RentsCombobox.removeAllItems();
                ArrayList<Rent> rentList = lease.getRentList() ;
                for (Rent r : rentList ) {
                    RentsCombobox.addItem(this.dateToString(r.getDate()));
                }
           }//
           else{
               RentsCombobox.removeAllItems();
               RentsCombobox.addItem("No Payment");
           }
               
           
   }//
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        RentDetailJButton = new javax.swing.JButton();
        txtStartDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRentalDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSecurityDeposit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBuilding = new javax.swing.JTextField();
        txtTenant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTerminationDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        RentsCombobox = new javax.swing.JComboBox<>();

        jLabel5.setText("Lease Detail");

        RentDetailJButton.setText("View Alll Rents Details");
        RentDetailJButton.setToolTipText("");
        RentDetailJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentDetailJButtonActionPerformed(evt);
            }
        });

        txtStartDate.setEnabled(false);

        jLabel1.setText("Start Date");

        jLabel3.setText("End Date");

        txtEndDate.setEnabled(false);

        jLabel4.setText("Rental Date");

        txtRentalDate.setEnabled(false);

        jLabel6.setText("Balance");

        txtBalance.setEnabled(false);

        jLabel7.setText("Security Deposit");

        txtSecurityDeposit.setEnabled(false);

        jLabel8.setText("Building");

        txtBuilding.setEnabled(false);

        txtTenant.setEnabled(false);

        jLabel9.setText("Tenant");

        jLabel10.setText("Termination Date");

        txtTerminationDate.setEnabled(false);

        jLabel11.setText("Rent History");

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        RentsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1))
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRentalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSecurityDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenant, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(RentsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTerminationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                        .addGap(49, 49, 49)
                                        .addComponent(RentDetailJButton)))))))
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(backJButton1)
                    .addContainerGap(758, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRentalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSecurityDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTenant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTerminationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RentDetailJButton)
                    .addComponent(RentsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(backJButton1)
                    .addContainerGap(531, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RentDetailJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentDetailJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new DetaiRentJPanel( userProcessContainer,  ua,  ecosystem, slr) );
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RentDetailJButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RentDetailJButton;
    private javax.swing.JComboBox<String> RentsCombobox;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtBuilding;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtRentalDate;
    private javax.swing.JTextField txtSecurityDeposit;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTenant;
    private javax.swing.JTextField txtTerminationDate;
    // End of variables declaration//GEN-END:variables
}
