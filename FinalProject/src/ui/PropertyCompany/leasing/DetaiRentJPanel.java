/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PropertyCompany.leasing;


import ui.PropertyCompany.tenant.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LeasingOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Lease;
import Business.property.Rent;
import java.awt.CardLayout;
import java.awt.Component;
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
    EcoSystem eco;
    LeasingOrganization  leaseOrganization ;
    Enterprise enterprise ;
    SignLeaseRequest slr;
    Rent rent ;
   
    public DetaiRentJPanel(JPanel userProcessContainer, UserAccount account, LeasingOrganization leaseOrganization, Enterprise enterprise, EcoSystem business,
            SignLeaseRequest slr, Rent sr
    ) {
         initComponents();
         this. userProcessContainer = userProcessContainer;
         this.ua = account;
         this.leaseOrganization = leaseOrganization;
         this.enterprise = enterprise ;
         this.eco=business;
         this.slr = slr ;
         this.rent = sr;
         populateTextField();
    }

    public static String dateToString(Date date){
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
         String strDate = dateFormat.format(date);  
         return strDate ;
   }
   
    private void populateTextField(){
            Lease lease =  this.slr.getLease() ;
            txtDayToPay.setText(this.dateToString(this.rent.getDateToPay()));
            
            txtRentaldate.setText(this.dateToString(this.rent.getDate()));
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
        jLabel7 = new javax.swing.JLabel();
        txtPayAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPayDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setEnabled(false);
        setLayout(null);

        jLabel5.setText("Rent  Detail");
        add(jLabel5);
        jLabel5.setBounds(390, 70, 159, 22);

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1);
        backJButton1.setBounds(139, 46, 73, 23);

        jLabel1.setText("Day To Pay");
        add(jLabel1);
        jLabel1.setBounds(350, 130, 55, 14);

        txtDayToPay.setEnabled(false);
        add(txtDayToPay);
        txtDayToPay.setBounds(450, 130, 80, 20);

        jLabel3.setText("Rental Date");
        add(jLabel3);
        jLabel3.setBounds(350, 170, 57, 14);

        txtRentaldate.setEnabled(false);
        add(txtRentaldate);
        txtRentaldate.setBounds(450, 170, 80, 20);

        jLabel4.setText("Pay Method");
        add(jLabel4);
        jLabel4.setBounds(350, 210, 57, 14);

        txtPayMethod.setEnabled(false);
        txtPayMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayMethodActionPerformed(evt);
            }
        });
        add(txtPayMethod);
        txtPayMethod.setBounds(450, 210, 80, 20);

        jLabel7.setText("Pay Amount");
        add(jLabel7);
        jLabel7.setBounds(350, 250, 58, 14);

        txtPayAmount.setEnabled(false);
        add(txtPayAmount);
        txtPayAmount.setBounds(450, 250, 80, 20);

        jLabel8.setText("Pay Date");
        add(jLabel8);
        jLabel8.setBounds(350, 290, 44, 14);

        txtPayDate.setEnabled(false);
        add(txtPayDate);
        txtPayDate.setBounds(450, 290, 80, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel9.setText("jLabel4");
        add(jLabel9);
        jLabel9.setBounds(5, -4, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new DetailLeaseJPanel(userProcessContainer,  ua,  leaseOrganization,  enterprise, eco, slr));
        layout.next(userProcessContainer);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDayToPay;
    private javax.swing.JTextField txtPayAmount;
    private javax.swing.JTextField txtPayDate;
    private javax.swing.JTextField txtPayMethod;
    private javax.swing.JTextField txtRentaldate;
    // End of variables declaration//GEN-END:variables
}
