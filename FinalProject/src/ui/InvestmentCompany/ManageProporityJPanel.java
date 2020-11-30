/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.InvestmentCompany;

import Business.EcoSystem;
import Business.Employee.Landlord;
import Business.Employee.Propority;
import Business.Enterprise.Enterprise;
import Business.Organization.BoardMemberOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yiningchen
 */
public class ManageProporityJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EcoSystem ecosystem;

    /**
     * Creates new form ManageProporityJPanel
     */
    public ManageProporityJPanel(JPanel userProcessContainer, UserAccount account, BoardMemberOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        //JOptionPane.showMessageDialog(null,organization.getName() );
        // JOptionPane.showMessageDialog(null, organization.getName());
        populateTable();

    }

    public void populateTable() {
        String landlordname = userAccount.getUsername();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        Organization organization = enterprise.getOrganizationDirectory().findorganization("BoardMember Organization");
        dtm.setRowCount(0);
        List<Propority> prolist = organization.getLandlordDirectory().findlandlord(landlordname).getProporityCatalog().getProporitycatalog();
        if (prolist != null) {
            for (Propority p : organization.getLandlordDirectory().findlandlord(landlordname).getProporityCatalog().getProporitycatalog()) {
                Object row[] = new Object[10];
                row[0] = p.getNickname();
                row[1] = p.getProporityNum();
                row[2] = p.getAddress();
                row[3] = p.getAptNo();
                row[4] = p.getCity();
                row[5] = p.getState();
                row[6] = p.getZipCode();
                row[7] = p.getMonthlyrent();
                row[8] = p.getSellingprice();
                row[9] = p.getSquareFeet();
                dtm.addRow(row);
            }
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

        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addjButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        txtaddress = new javax.swing.JTextField();
        txtnickname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtaptno = new javax.swing.JTextField();
        txtcity = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        txtzipcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtrent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtfeet = new javax.swing.JTextField();

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Propority List :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Propority name", "ID", "Address", "apartment number", " City", "State", "zipcode", "monthlyrent", "Selling price", "square feet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        addjButton.setText("add");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        deletejButton.setText("delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Address");

        jLabel2.setText("Propority Nick Name");

        jLabel3.setText("Apt No.");

        jLabel4.setText("City");

        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });

        txtstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstateActionPerformed(evt);
            }
        });

        txtzipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzipcodeActionPerformed(evt);
            }
        });

        jLabel5.setText("State");

        jLabel6.setText("zipcode");

        jLabel7.setText("Monthly rent");

        txtrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentActionPerformed(evt);
            }
        });

        jLabel8.setText("selling price");

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setText("square feet");

        txtfeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtaptno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(addjButton)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel8)))
                                            .addGap(34, 34, 34)
                                            .addComponent(deletejButton)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(93, 93, 93)
                                    .addComponent(txtnickname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(195, 195, 195)
                                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtrent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtfeet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(335, 335, 335))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtaptno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addjButton)
                    .addComponent(deletejButton))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed

        String nickname = txtnickname.getText();
        String Address = txtaddress.getText();
        String aptno = txtaptno.getText();
        String city = txtcity.getText();
        String state = txtstate.getText();
        String zipcode = txtzipcode.getText();
        int squarefeet = Integer.parseInt(txtfeet.getText());
        int monthlyrent = Integer.parseInt(txtrent.getText());
        int sellingprice = Integer.parseInt(txtprice.getText());

        String Stprice = txtprice.getText();
        if (nickname.equals("") || Address.equals("")
                || aptno.equals("") || city.equals("")
                || state.equals("") || zipcode.equals("")) {
            JOptionPane.showMessageDialog(null, "Input should not be null.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String landlordname = userAccount.getUsername();
            Organization organization = enterprise.getOrganizationDirectory().findorganization("BoardMember Organization");

            Landlord landlord = organization.getLandlordDirectory().findlandlord(landlordname);
            Propority p = landlord.getProporityCatalog().addPropority();
            p.setAddress(Address);
            p.setNickname(nickname);
            p.setAptNo(aptno);
            p.setCity(city);
            p.setMonthlyrent(monthlyrent);
            p.setZipCode(zipcode);
            p.setState(state);
            p.setSellingprice(sellingprice);
            p.setSquareFeet(squarefeet);

            JOptionPane.showMessageDialog(null, "Propority added!", "Info", JOptionPane.INFORMATION_MESSAGE);

            populateTable();

            txtnickname.setText("");
            txtaddress.setText("");
            txtaptno.setText("");
            txtcity.setText("");
            txtstate.setText("");
            txtzipcode.setText("");
            txtrent.setText("");
            txtprice.setText("");
        }

    }//GEN-LAST:event_addjButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String propertynickname = jTable1.getValueAt(row, 0).toString();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!", "get Request", JOptionPane.ERROR_MESSAGE);
        }

        String landlordname = userAccount.getUsername();
        Organization organization = enterprise.getOrganizationDirectory().findorganization("BoardMember Organization");
        Landlord landlord = organization.getLandlordDirectory().findlandlord(landlordname);
        String propname = jTable1.getValueAt(row, 0).toString();
        Propority propority =landlord.getProporityCatalog().findPropority(propname);
        landlord.getProporityCatalog().removePropority(propority);
        populateTable();
        JOptionPane.showMessageDialog(null, "property deleted");

    }//GEN-LAST:event_deletejButtonActionPerformed

    private void txtcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcityActionPerformed

    private void txtstateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstateActionPerformed

    private void txtzipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtzipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtzipcodeActionPerformed

    private void txtrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrentActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtaptno;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtfeet;
    private javax.swing.JTextField txtnickname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtrent;
    private javax.swing.JTextField txtstate;
    private javax.swing.JTextField txtzipcode;
    // End of variables declaration//GEN-END:variables
}
