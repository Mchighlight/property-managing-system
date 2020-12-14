/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.tenant;


import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Lease;
import Business.property.Payment;
import Business.property.Rent;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junyaoli
 */
public class PayLeaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    SignLeaseRequest slr;
   
    public PayLeaseJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, SignLeaseRequest slr) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         this.slr = slr ;
         txtBalance.setEditable(true);
         txtBalance.setEnabled(true);
         populateTextField();
    }

       public  String dateToString(Date date){
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
         String strDate = dateFormat.format(date);  
         return strDate ;
   }
    
   private void populateTextField(){
            Lease lease =  this.slr.getLease() ;
            txtStartDate.setText(this.dateToString(lease.getStartDate()));
            
            txtEndDate.setText(this.dateToString(lease.getEndDate()));             
            if( lease.getBalance() != null )
                txtBalance.setText(String.valueOf(lease.getBalance()));
            txtSecurityDeposit.setText(String.valueOf(lease.getSecurityDeposit()));
            txtBuilding.setText(lease.getBuilding().toString());
            txtRentPrice.setText(String.valueOf(lease.getBuilding().getMonthlyrent()));
            
            
            Double minimumBalance = Double.valueOf(lease.getBuilding().getMonthlyrent())  ;
            if(  this.slr.getLease().getRentList().size() == 0 ){
                minimumBalance = minimumBalance +  this.slr.getLease().getSecurityDeposit() ;
                txtRentalDate.setText(this.dateToString(lease.getRentalDate()));
            }//
            else{
                ArrayList<Rent> rents = this.slr.getLease().getRentList();
                Rent currentRent = rents.get(rents.size()-1);
                txtRentalDate.setText(this.dateToString(this.getNextMonth(currentRent.getDate())) );
            }
            txtMinimumBalance.setText(String.valueOf(minimumBalance));       
                                          
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
        jLabel11 = new javax.swing.JLabel();
        btnSubmitPayment = new javax.swing.JButton();
        RentsCombobox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtRentPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMinimumBalance = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Lease Detail");
        add(jLabel5);
        jLabel5.setBounds(390, 30, 159, 22);

        txtStartDate.setEnabled(false);
        add(txtStartDate);
        txtStartDate.setBounds(450, 90, 90, 20);

        jLabel1.setText("Start Date");
        add(jLabel1);
        jLabel1.setBounds(330, 90, 50, 14);

        jLabel3.setText("End Date");
        add(jLabel3);
        jLabel3.setBounds(330, 130, 44, 14);

        txtEndDate.setEnabled(false);
        add(txtEndDate);
        txtEndDate.setBounds(450, 130, 90, 20);

        jLabel4.setText("Rental Date");
        add(jLabel4);
        jLabel4.setBounds(330, 180, 57, 14);

        txtRentalDate.setEnabled(false);
        add(txtRentalDate);
        txtRentalDate.setBounds(450, 170, 90, 20);

        jLabel6.setText("Balance");
        add(jLabel6);
        jLabel6.setBounds(330, 430, 37, 14);

        txtBalance.setEnabled(false);
        add(txtBalance);
        txtBalance.setBounds(450, 420, 93, 20);

        jLabel7.setText("Security Deposit");
        add(jLabel7);
        jLabel7.setBounds(330, 260, 78, 14);

        txtSecurityDeposit.setEnabled(false);
        add(txtSecurityDeposit);
        txtSecurityDeposit.setBounds(450, 260, 90, 20);

        jLabel8.setText("Building");
        add(jLabel8);
        jLabel8.setBounds(330, 220, 36, 14);

        txtBuilding.setEnabled(false);
        add(txtBuilding);
        txtBuilding.setBounds(450, 220, 90, 20);

        jLabel11.setText("Pay Method");
        add(jLabel11);
        jLabel11.setBounds(330, 390, 57, 14);

        btnSubmitPayment.setText("Submit Payment");
        btnSubmitPayment.setToolTipText("");
        btnSubmitPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitPaymentActionPerformed(evt);
            }
        });
        add(btnSubmitPayment);
        btnSubmitPayment.setBounds(580, 250, 130, 80);

        RentsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Method", "Check", "Credit Card", "Cash" }));
        RentsCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentsComboboxActionPerformed(evt);
            }
        });
        add(RentsCombobox);
        RentsCombobox.setBounds(450, 380, 93, 20);

        jLabel12.setText("Rent Price");
        add(jLabel12);
        jLabel12.setBounds(330, 300, 49, 14);

        txtRentPrice.setEnabled(false);
        txtRentPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRentPriceActionPerformed(evt);
            }
        });
        add(txtRentPrice);
        txtRentPrice.setBounds(450, 300, 90, 20);

        jLabel13.setText("Minimum Balance");
        add(jLabel13);
        jLabel13.setBounds(330, 350, 80, 14);

        txtMinimumBalance.setToolTipText("");
        txtMinimumBalance.setEnabled(false);
        txtMinimumBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinimumBalanceActionPerformed(evt);
            }
        });
        add(txtMinimumBalance);
        txtMinimumBalance.setBounds(450, 340, 90, 20);

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(160, 260, 60, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        add(jLabel9);
        jLabel9.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

      public  Date getNextMonth(Date date){
          Calendar cal=Calendar.getInstance();
          cal.setTime(date);
          cal.set(Calendar.MONTH, date.getMonth()+1);
          Date dueDate = new Date(cal.getTimeInMillis());
         return dueDate ;
     } //
    
    private void btnSubmitPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitPaymentActionPerformed
        // TODO add your handling code here:
        
        Double minBalance = Double.valueOf(this.slr.getBuilding().getMonthlyrent())  ;
        if(  this.slr.getLease().getRentList().size() == 0 )
           minBalance = minBalance +  this.slr.getLease().getSecurityDeposit() ;
        
        String payMethod = RentsCombobox.getSelectedItem().toString();
        Double balance ;
        // 
        if ( payMethod == null || payMethod.equals("Select Method") ) {
            JOptionPane.showMessageDialog(null, "Please Select Pay Method", "Info", JOptionPane.INFORMATION_MESSAGE);
            return ;
        } // if
        try{
            balance =  Double.valueOf(txtBalance.getText())  ;
            if( balance >= minBalance  ){
                // First Rent
                Rent rent = new Rent() ;
                rent.setPrice(Double.valueOf(this.slr.getBuilding().getMonthlyrent()));
                rent.setLateFee(0.0);
                rent.setLease(this.slr.getLease());
                if(  this.slr.getLease().getRentList().size() != 0 ){
                    ArrayList<Rent> rents = this.slr.getLease().getRentList();
                   Rent currentRent = rents.get(rents.size()-1);
                    rent.setDate( this.getNextMonth(currentRent.getDate()) );
                    rent.setDateToPay( this.getNextMonth(currentRent.getDate()) );
                } // if
                else{
                    rent.setDate(this.slr.getLease().getStartDate());
                    rent.setDateToPay(this.slr.getLease().getStartDate());
                }
                // Payment
                Payment payment = new Payment();
                payment.setPayAmount(Double.valueOf(minBalance));
                payment.setPayDate(rent.getDateToPay());
                payment.setPayMethod(payMethod);
                payment.setRent(rent);
                rent.setPayment(payment);
                //Lease
                this.slr.getLease().addRent(rent);
                // Set Status.
                this.slr.setStatus("Payment Reviewing");
                this.slr.getLease().setBalance(balance);
                
                JOptionPane.showMessageDialog(null, "Your Payment Is Under Reviewing, Please wait for our leasing office", "Info", JOptionPane.INFORMATION_MESSAGE);
            } // if
            else{
                JOptionPane.showMessageDialog(null, "Please Pay more minimum balance", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
          
        }
        catch(Exception e ){
             JOptionPane.showMessageDialog(null, "Please Input Correct Integer Balance", "Info", JOptionPane.INFORMATION_MESSAGE);
             return ;
        }
    }//GEN-LAST:event_btnSubmitPaymentActionPerformed

    private void txtMinimumBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinimumBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimumBalanceActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void RentsComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentsComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentsComboboxActionPerformed

    private void txtRentPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRentPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRentPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RentsCombobox;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSubmitPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField txtMinimumBalance;
    private javax.swing.JTextField txtRentPrice;
    private javax.swing.JTextField txtRentalDate;
    private javax.swing.JTextField txtSecurityDeposit;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
