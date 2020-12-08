/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Business.Employee.Propority;
import com.kingaspx.util.BrowserUtil;
import com.kingaspx.version.Version;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.dom.By;
import com.teamdev.jxbrowser.chromium.dom.DOMDocument;
import com.teamdev.jxbrowser.chromium.dom.DOMElement;
import com.teamdev.jxbrowser.chromium.dom.DOMInputElement;
import com.teamdev.jxbrowser.chromium.events.FinishLoadingEvent;
import com.teamdev.jxbrowser.chromium.events.LoadAdapter;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.PropertyCompany.tenant.viewAppointmentJPanel;

/**
 *
 * @author junyaoli
 */
public class MapJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MapJPanel
     */
    Propority propority;
    JPanel userProcessContainer;
    public MapJPanel(JPanel userProcessContainer,Propority p) {
        initComponents();
        propority = p;
        this.userProcessContainer=userProcessContainer;
        open_site();
        //searchApt();
    }
private void searchApt(){
        DOMDocument doc = browser.getDocument();

        DOMElement address_element = doc.findElement(By.id("address"));
        DOMElement search_element = doc.findElement(By.id("submit"));
        DOMElement button = (DOMElement) search_element;

        DOMInputElement address = (DOMInputElement) address_element;
        address.setValue(propority.getAddress());

        button.click();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        refreshjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Marker Felt", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(226, 140, 140));
        jLabel1.setText("Address:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 240, 85), 4, true));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 359, 32));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Luminari", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 51), 3));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 540));

        refreshjButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshjButton.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        refreshjButton.setForeground(new java.awt.Color(51, 0, 51));
        refreshjButton.setText("Refresh");
        refreshjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshjButtonActionPerformed(evt);
            }
        });
        jPanel1.add(refreshjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 10, 120, 45));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 141, 45));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void refreshjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshjButtonActionPerformed
        // TODO add your handling code here:
        open_site();
    }//GEN-LAST:event_refreshjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        viewAppointmentJPanel jpanel = (viewAppointmentJPanel) component;
//        jpanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         DOMDocument doc = browser.getDocument();

        DOMElement address_element = doc.findElement(By.id("address"));
        DOMElement search_element = doc.findElement(By.id("submit"));
        DOMElement button = (DOMElement) search_element;

        DOMInputElement address = (DOMInputElement) address_element;
        address.setValue(jTextField1.getText());

        button.click();
    }//GEN-LAST:event_jButton2ActionPerformed
    Browser browser;
    BrowserView view;
    
    private void open_site(){
        //System.setProperty("jxbrowser.license.key", "your_license_key");//Version.V6_22
       
        BrowserUtil.setVersion(Version.V6_22);
        browser =new Browser();
        view=new BrowserView(browser);
        jPanel2.add(view,BorderLayout.CENTER);
        
//        browser.addTitleListener((te) -> {
//           setTitle(te.getTitle());
//        });
        browser.addConsoleListener((ce) -> {
            System.out.println("Log: "+ ce.getMessage());
        });
        browser.addLoadListener(new LoadAdapter() {
            @Override
            public void onFinishLoadingFrame(FinishLoadingEvent evt){
                evt.getBrowser().setZoomLevel(-2);
            }
            });
        browser.loadURL("file:///Users/junyaoli/Desktop/HTMLMap/html/search.html");//testbb，marker版本，import,search
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton refreshjButton;
    // End of variables declaration//GEN-END:variables
}
