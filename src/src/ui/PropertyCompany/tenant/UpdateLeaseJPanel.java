/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;

import ui.PropertyCompany.leasing.*;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Lease;
import Business.property.Renewal;
import Business.property.Rent;
import Business.property.SecurityRefund;
import Business.property.Termination;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author junyaoli
 */
public class UpdateLeaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    SignLeaseRequest slr;
   
    public UpdateLeaseJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, SignLeaseRequest slr) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         this.slr = slr ;
         populateTextField();
    }

       public  String dateToString(Date date){
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
         String strDate = dateFormat.format(date);  
         return strDate ;
   }
  
    public  Date getNextMonth(Date date){
          Calendar cal=Calendar.getInstance();
          cal.setTime(date);
          cal.set(Calendar.MONTH, date.getMonth()+1);
          Date dueDate = new Date(cal.getTimeInMillis());
         return dueDate ;
     } //    
       
   private void populateTextField(){
            Lease lease =  this.slr.getLease() ;
            Date startDate = getNextMonth(lease.getEndDate()) ;
            // EndDate
             Calendar cal=Calendar.getInstance();
            cal.setTime(startDate);
            cal.set(Calendar.MONTH,startDate.getMonth()+2);
            Date leaseEndDate =  cal.getTime() ;
            txtStartDate.setText(this.dateToString(startDate));
            
            txtEndDate.setText(this.dateToString(leaseEndDate));
            txtRentalDate.setText(this.dateToString(startDate));
                
            if( lease.getBalance() != null )
                txtBalance.setText(String.valueOf(lease.getBalance()));
            txtSecurityDeposit.setText(String.valueOf(0.0));
            txtBuilding.setText(lease.getBuilding().toString());
            txtTenant.setText(lease.getTenant().getUsername());
            if( lease.getTermination() != null )
                txtTerminationDate.setText(dateToString(lease.getTermination().getRefund().getLeavingDate()));
            else
                txtTerminationDate.setText("No Termination");                     
        
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
        backJButton1 = new javax.swing.JButton();
        btnTermination = new javax.swing.JButton();
        btnRenewal = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setLayout(null);

        jLabel5.setText("Renewal Detail");
        add(jLabel5);
        jLabel5.setBounds(400, 40, 159, 22);

        txtStartDate.setEnabled(false);
        add(txtStartDate);
        txtStartDate.setBounds(490, 100, 80, 20);

        jLabel1.setText("Start Date");
        add(jLabel1);
        jLabel1.setBounds(360, 100, 120, 14);

        jLabel3.setText("End Date");
        add(jLabel3);
        jLabel3.setBounds(360, 140, 120, 14);

        txtEndDate.setEnabled(false);
        add(txtEndDate);
        txtEndDate.setBounds(490, 140, 80, 20);

        jLabel4.setText("Rental Date");
        add(jLabel4);
        jLabel4.setBounds(360, 190, 110, 14);

        txtRentalDate.setEnabled(false);
        add(txtRentalDate);
        txtRentalDate.setBounds(490, 180, 80, 20);

        jLabel6.setText("Balance");
        add(jLabel6);
        jLabel6.setBounds(360, 230, 110, 14);

        txtBalance.setEnabled(false);
        add(txtBalance);
        txtBalance.setBounds(490, 230, 80, 20);

        jLabel7.setText("Security Deposit");
        add(jLabel7);
        jLabel7.setBounds(360, 270, 120, 14);

        txtSecurityDeposit.setEnabled(false);
        add(txtSecurityDeposit);
        txtSecurityDeposit.setBounds(490, 270, 80, 20);

        jLabel8.setText("Building");
        add(jLabel8);
        jLabel8.setBounds(360, 310, 110, 14);

        txtBuilding.setEnabled(false);
        add(txtBuilding);
        txtBuilding.setBounds(490, 310, 80, 20);

        txtTenant.setEnabled(false);
        add(txtTenant);
        txtTenant.setBounds(490, 350, 80, 20);

        jLabel9.setText("Tenant");
        add(jLabel9);
        jLabel9.setBounds(360, 350, 120, 14);

        jLabel10.setText("Termination Date");
        add(jLabel10);
        jLabel10.setBounds(360, 390, 120, 14);

        txtTerminationDate.setEnabled(false);
        add(txtTerminationDate);
        txtTerminationDate.setBounds(490, 390, 80, 20);

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        backJButton1.setBorderPainted(false);
        backJButton1.setContentAreaFilled(false);
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1);
        backJButton1.setBounds(150, 210, 50, 50);

        btnTermination.setText("Terminate Lease");
        btnTermination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminationActionPerformed(evt);
            }
        });
        add(btnTermination);
        btnTermination.setBounds(630, 180, 150, 50);

        btnRenewal.setText("Renewal Lease");
        btnRenewal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenewalActionPerformed(evt);
            }
        });
        add(btnRenewal);
        btnRenewal.setBounds(630, 290, 150, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel11.setText("jLabel4");
        add(jLabel11);
        jLabel11.setBounds(5, -4, 900, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    
    public Date setLeaveDate(Date date){
           Calendar cal=Calendar.getInstance();
          cal.setTime(date);
          cal.set(Calendar.DAY_OF_MONTH, 30);
          Date dueDate = new Date(cal.getTimeInMillis());
         return dueDate ;
    }
    
    private void btnTerminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminationActionPerformed
        // TODO add your handling code here:
        this.slr.setStatus("Termination");
        Termination termination = new Termination();
        termination.setLease(this.slr.getLease());
        termination.setLeavingReason("");
        // Security Refund
        SecurityRefund sr = new SecurityRefund() ;
        sr.setRefundAmount(this.slr.getLease().getSecurityDeposit());
        Date leaveDate = this.setLeaveDate(this.slr.getLease().getRentalDate()) ;
        sr.setLeavingDate(leaveDate);
        sr.setTermination(termination);
        termination.setRefund(sr);
        termination.setLeavingDate(leaveDate);
        this.slr.getLease().setTermination(termination);
        JOptionPane.showMessageDialog(null, "Terminate the Lease, we have give back your security fee " +  String.valueOf(this.slr.getLease().getSecurityDeposit() + " dollars"), "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTerminationActionPerformed

    private void btnRenewalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenewalActionPerformed

           this.slr.setStatus("Renewal Reviewing");
           JOptionPane.showMessageDialog(null, "your Renewal has been under reviewing ", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRenewalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnRenewal;
    private javax.swing.JButton btnTermination;
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
