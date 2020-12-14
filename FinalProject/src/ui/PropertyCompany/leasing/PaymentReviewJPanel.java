/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.leasing;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LeasingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Lease;
import Business.property.Rent;
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
public class PaymentReviewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    LeasingOrganization leaseOrganization;
    Enterprise enterprise;
    SignLeaseRequest slr;
   
    public PaymentReviewJPanel(JPanel userProcessContainer, UserAccount account, LeasingOrganization leaseOrganization, Enterprise enterprise, EcoSystem business, 
          SignLeaseRequest slr
    ) {
         initComponents();
         this. userProcessContainer = userProcessContainer;
         this.ua = account;
         this.leaseOrganization = leaseOrganization;
         this.enterprise = enterprise ;
         this.ecosystem=business;
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
            
            if(  this.slr.getLease().getRentList().size() == 0 ){
                txtRentalDate.setText(this.dateToString(lease.getRentalDate()));
                 txtDayToPay.setText(this.dateToString(lease.getStartDate()));
            }//
            else{
                ArrayList<Rent> rents = this.slr.getLease().getRentList();
                Rent currentRent = rents.get(rents.size()-1);
                txtRentalDate.setText(this.dateToString(currentRent.getDate()) );
                txtDayToPay.setText(this.dateToString(currentRent.getDate()));
            }
                
            if( lease.getBalance() != null )
                txtBalance.setText(String.valueOf(lease.getBalance()));
            
            
            Double security_pay = 0.0 ;
            ArrayList<Rent> rents = this.slr.getLease().getRentList();
            Rent reviewRent = rents.get(rents.size()-1);
            if(rents.size() ==1){
                security_pay = this.slr.getLease().getSecurityDeposit() ;
            }
            txtPayAmount.setText(String.valueOf(this.slr.getLease().getBuilding().getMonthlyrent()+security_pay));
            txtPayDate.setText(this.dateToString(reviewRent.getDateToPay()));
            txtTenant.setText(lease.getTenant().getUsername());
            txtPayMethod.setText(reviewRent.getPayment().getPayMethod());
               
           
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
        txtDayToPay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRentalDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPayMethod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPayAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPayDate = new javax.swing.JTextField();
        txtTenant = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        btnAcceptedPayment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);

        jLabel5.setText("Lease Detail");
        add(jLabel5);
        jLabel5.setBounds(420, 30, 159, 22);

        txtDayToPay.setEnabled(false);
        add(txtDayToPay);
        txtDayToPay.setBounds(470, 90, 80, 26);

        jLabel1.setText("Day To Pay");
        add(jLabel1);
        jLabel1.setBounds(370, 90, 69, 16);

        jLabel3.setText("Rental Date");
        add(jLabel3);
        jLabel3.setBounds(370, 140, 72, 16);

        txtRentalDate.setEnabled(false);
        add(txtRentalDate);
        txtRentalDate.setBounds(470, 130, 80, 26);

        jLabel4.setText("Pay Method");
        add(jLabel4);
        jLabel4.setBounds(370, 180, 72, 16);

        txtPayMethod.setEnabled(false);
        txtPayMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayMethodActionPerformed(evt);
            }
        });
        add(txtPayMethod);
        txtPayMethod.setBounds(470, 170, 80, 26);

        jLabel6.setText("Balance");
        add(jLabel6);
        jLabel6.setBounds(370, 220, 47, 16);

        txtBalance.setEnabled(false);
        add(txtBalance);
        txtBalance.setBounds(470, 220, 80, 26);

        jLabel7.setText("Pay Amount");
        add(jLabel7);
        jLabel7.setBounds(370, 270, 75, 16);

        txtPayAmount.setEnabled(false);
        add(txtPayAmount);
        txtPayAmount.setBounds(470, 260, 80, 26);

        jLabel8.setText("Pay Date");
        add(jLabel8);
        jLabel8.setBounds(370, 310, 54, 16);

        txtPayDate.setEnabled(false);
        add(txtPayDate);
        txtPayDate.setBounds(470, 310, 80, 26);

        txtTenant.setEnabled(false);
        add(txtTenant);
        txtTenant.setBounds(470, 350, 80, 26);

        jLabel9.setText("Tenant");
        add(jLabel9);
        jLabel9.setBounds(370, 360, 43, 16);

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1);
        backJButton1.setBounds(210, 40, 97, 29);

        btnAcceptedPayment.setText("Accept Payment");
        btnAcceptedPayment.setToolTipText("");
        btnAcceptedPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptedPaymentActionPerformed(evt);
            }
        });
        add(btnAcceptedPayment);
        btnAcceptedPayment.setBounds(620, 190, 140, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel10.setText("jLabel4");
        add(jLabel10);
        jLabel10.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new ViewLeaseJPanel(userProcessContainer,  ua,  leaseOrganization,  enterprise, ecosystem));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void btnAcceptedPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptedPaymentActionPerformed
        Double security_pay = 0.0 ;
        ArrayList<Rent> rents = this.slr.getLease().getRentList();
        Rent reviewRent = rents.get(rents.size()-1);
        if(rents.size() ==1){
            security_pay = this.slr.getLease().getSecurityDeposit() ;
        }
        Double payAmount = security_pay+ reviewRent.getPrice() +reviewRent.getLateFee() ;
        Double currentBalance = this.slr.getLease().getBalance() ;
        this.slr.getLease().setBalance(currentBalance - payAmount);
        this.slr.setStatus("Payment Completed");
        JOptionPane.showMessageDialog(null, "You Accepted Tenant Payment", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAcceptedPaymentActionPerformed

    private void txtPayMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayMethodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnAcceptedPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtDayToPay;
    private javax.swing.JTextField txtPayAmount;
    private javax.swing.JTextField txtPayDate;
    private javax.swing.JTextField txtPayMethod;
    private javax.swing.JTextField txtRentalDate;
    private javax.swing.JTextField txtTenant;
    // End of variables declaration//GEN-END:variables
}
