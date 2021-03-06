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
import java.awt.Component;
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
        populateTable();

    }

    public void populateTable() {
        Landlord landlord = userAccount.getLandlord();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        if (landlord.getProporityCatalog() != null) {
            List<Propority> prolist = landlord.getProporityCatalog();
            for (Propority p : prolist) {
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
        jLabel10 = new javax.swing.JLabel();

        setLayout(null);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Propority List :");
        add(enterpriseLabel);
        enterpriseLabel.setBounds(360, 10, 190, 30);

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

        add(jScrollPane1);
        jScrollPane1.setBounds(3, 62, 890, 230);

        addjButton.setText("add");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });
        add(addjButton);
        addjButton.setBounds(510, 480, 161, 51);

        deletejButton.setText("delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });
        add(deletejButton);
        deletejButton.setBounds(508, 298, 190, 52);

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        add(txtaddress);
        txtaddress.setBounds(347, 342, 80, 26);
        add(txtnickname);
        txtnickname.setBounds(347, 298, 80, 26);

        jLabel1.setText("Address");
        add(jLabel1);
        jLabel1.setBounds(118, 347, 51, 16);

        jLabel2.setText("Propority Nick Name");
        add(jLabel2);
        jLabel2.setBounds(118, 308, 130, 16);

        jLabel3.setText("Apt No.");
        add(jLabel3);
        jLabel3.setBounds(121, 388, 48, 16);

        jLabel4.setText("City");
        add(jLabel4);
        jLabel4.setBounds(121, 418, 25, 16);
        add(txtaptno);
        txtaptno.setBounds(347, 383, 80, 26);

        txtcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcityActionPerformed(evt);
            }
        });
        add(txtcity);
        txtcity.setBounds(347, 418, 80, 26);

        txtstate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstateActionPerformed(evt);
            }
        });
        add(txtstate);
        txtstate.setBounds(347, 462, 80, 26);

        txtzipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtzipcodeActionPerformed(evt);
            }
        });
        add(txtzipcode);
        txtzipcode.setBounds(347, 499, 80, 26);

        jLabel5.setText("State");
        add(jLabel5);
        jLabel5.setBounds(121, 467, 31, 16);

        jLabel6.setText("zipcode");
        add(jLabel6);
        jLabel6.setBounds(121, 504, 49, 16);

        jLabel7.setText("Monthly rent");
        add(jLabel7);
        jLabel7.setBounds(510, 370, 80, 16);

        txtrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentActionPerformed(evt);
            }
        });
        add(txtrent);
        txtrent.setBounds(650, 360, 105, 26);

        jLabel8.setText("selling price");
        add(jLabel8);
        jLabel8.setBounds(510, 410, 77, 16);

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        add(txtprice);
        txtprice.setBounds(650, 400, 105, 26);

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(70, 10, 66, 50);

        jLabel9.setText("square feet");
        add(jLabel9);
        jLabel9.setBounds(520, 440, 70, 27);

        txtfeet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfeetActionPerformed(evt);
            }
        });
        add(txtfeet);
        txtfeet.setBounds(650, 440, 105, 26);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        add(jLabel10);
        jLabel10.setBounds(0, -4, 900, 720);
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

            Landlord landlord = userAccount.getLandlord();
            Propority p = new Propority();
            landlord.getProporityCatalog().add(p);

            p.setAddress(Address);
            p.setNickname(nickname);
            p.setAptNo(aptno);
            p.setCity(city);
            p.setMonthlyrent(monthlyrent);
            p.setZipCode(zipcode);
            p.setState(state);
            p.setSellingprice(sellingprice);
            p.setSquareFeet(squarefeet);

            if (landlord.isIsAssignagent()) {
                List<Propority> prolist = landlord.getProporityCatalog();
                String propname = jTable1.getValueAt(0, 0).toString();
                for (Propority propority : prolist) {
                    if (propority.getNickname() == propname) {
                        Enterprise ent = propority.getEnterprise();
                        p.setEnterprise(ent);
                    }
                }
            }

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
            txtfeet.setText("");

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

        List<Propority> prolist = landlord.getProporityCatalog();
        for (Propority propority : prolist) {
            if (propority.getNickname() == propertynickname) {
                landlord.getProporityCatalog().remove(propority);
            }
        }

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
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LandlordWorkAreaJPanel dwjp = (LandlordWorkAreaJPanel) component;
        dwjp.populateproporityTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfeetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfeetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfeetActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
