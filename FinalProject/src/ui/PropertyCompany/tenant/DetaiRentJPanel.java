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
import Business.property.Rent;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;


/**
 *
 * @author junyaoli
 */
public class DetaiRentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form customerServiceJPanel
     */
     JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem ecosystem;
    SignLeaseRequest slr;
    Rent rent ;
   
    public DetaiRentJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, SignLeaseRequest slr, Rent sr) {
         initComponents();
         this.ecosystem=business;
         this.ua = account;
         this. userProcessContainer = userProcessContainer;
         this.slr = slr ;
         this.rent = sr;
         populateTextField();
    }

       public  String dateToString(Date date){
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
         String strDate = dateFormat.format(date);  
         return strDate ;
   }
   
    private void populateTextField(){
            Lease lease =  this.slr.getLease() ;
            txtDayToPay.setText(this.dateToString(this.rent.getDateToPay()));
            
            txtRentaldate.setText(this.dateToString(this.rent.getDate()));
                
            if( lease.getBalance() != null )
                txtBalance.setText(String.valueOf(lease.getBalance()));
            
            

            txtPayAmount.setText(String.valueOf(this.rent.getPayment().getPayAmount()));
            txtPayDate.setText(this.dateToString(this.rent.getDateToPay()));
            txtPayMethod.setText(this.rent.getPayment().getPayMethod());
               
           
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
        backJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDayToPay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRentaldate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPayMethod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBalance = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPayAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPayDate = new javax.swing.JTextField();

        setEnabled(false);

        jLabel5.setText("Rent  Detail");

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Day To Pay");

        txtDayToPay.setEnabled(false);

        jLabel3.setText("Rental Date");

        txtRentaldate.setEnabled(false);

        jLabel4.setText("Pay Method");

        txtPayMethod.setEnabled(false);
        txtPayMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayMethodActionPerformed(evt);
            }
        });

        jLabel6.setText("Balance");

        txtBalance.setEnabled(false);

        jLabel7.setText("Pay Amount");

        txtPayAmount.setEnabled(false);

        jLabel8.setText("Pay Date");

        txtPayDate.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDayToPay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRentaldate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPayMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(541, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(backJButton1)
                    .addContainerGap(758, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDayToPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRentaldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPayMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(backJButton1)
                    .addContainerGap(531, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void txtPayMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayMethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayMethodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtDayToPay;
    private javax.swing.JTextField txtPayAmount;
    private javax.swing.JTextField txtPayDate;
    private javax.swing.JTextField txtPayMethod;
    private javax.swing.JTextField txtRentaldate;
    // End of variables declaration//GEN-END:variables
}