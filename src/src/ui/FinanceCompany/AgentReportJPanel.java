/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FinanceCompany;

import ui.PropertyCompany.tenant.*;
import Business.EcoSystem;
import Business.Employee.Propority;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AccountingOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SignLeaseRequest;
import Business.property.Rent;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ScrollPane;
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
        private final static ObservableList<PieChart.Data> details =   FXCollections.observableArrayList();
    private static PieChart pieChart;
    final JFXPanel dataPaneel = new JFXPanel();
    private AccountingOrganization organization;
    
    public AgentReportJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, Enterprise enterprise, AccountingOrganization organization) {
         initComponents();
         this.organization = organization;
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
        AgentComboBox = new javax.swing.JComboBox<>();
        NetWorkCombobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EnterpriseCombobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAptVisualization = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(null);

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

        add(jScrollPane2);
        jScrollPane2.setBounds(10, 80, 880, 200);

        jLabel5.setText("Apartment Report");
        add(jLabel5);
        jLabel5.setBounds(400, 10, 159, 22);

        AgentComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentComboBoxActionPerformed(evt);
            }
        });
        add(AgentComboBox);
        AgentComboBox.setBounds(420, 390, 186, 18);

        NetWorkCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetWorkComboboxActionPerformed(evt);
            }
        });
        add(NetWorkCombobox);
        NetWorkCombobox.setBounds(420, 300, 186, 20);

        jLabel4.setText("Network");
        add(jLabel4);
        jLabel4.setBounds(330, 310, 40, 14);

        jLabel6.setText("Enterprise");
        add(jLabel6);
        jLabel6.setBounds(330, 350, 49, 14);

        EnterpriseCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpriseComboboxActionPerformed(evt);
            }
        });
        add(EnterpriseCombobox);
        EnterpriseCombobox.setBounds(420, 340, 186, 20);

        jLabel7.setText("Agent");
        jLabel7.setToolTipText("");
        add(jLabel7);
        jLabel7.setBounds(330, 390, 29, 14);

        btnAptVisualization.setText("Apt Visualization");
        btnAptVisualization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAptVisualizationActionPerformed(evt);
            }
        });
        add(btnAptVisualization);
        btnAptVisualization.setBounds(420, 420, 190, 47);

        backJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        backJButton2.setBorderPainted(false);
        backJButton2.setContentAreaFilled(false);
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });
        add(backJButton2);
        backJButton2.setBounds(20, 10, 60, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.jpg"))); // NOI18N
        jLabel8.setText("jLabel4");
        add(jLabel8);
        jLabel8.setBounds(0, 0, 930, 710);
    }// </editor-fold>//GEN-END:initComponents

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

    private void drawPieChart( String agentName,  HashMap<Propority, Integer> aptPercentage ){
        
        setLayout( new BorderLayout());
        
        ScrollPane sp = new ScrollPane();
        for (Map.Entry<Propority, Integer> entry : aptPercentage.entrySet())  {
            String aptName = entry.getKey().getNickname();
            int percentage = entry.getValue();
            details.add( new PieChart.Data(aptName, percentage) );
        } // for
        
        pieChart = new PieChart();
        pieChart.setData(details);
        pieChart.setTitle(  agentName + "'s apartment sales" );
        pieChart.setLegendSide(Side.BOTTOM);
        pieChart.setLabelsVisible(true);
        sp.setContent(pieChart);
        Scene scene = new Scene(sp, 400, 300);
        dataPaneel.setScene(scene);
     
        add( dataPaneel);
        add( dataPaneel);
        dataPaneel.setVisible(true);
    }
    
    
    private void btnAptVisualizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAptVisualizationActionPerformed
        // TODO add your handling code here:
                DefaultTableModel model = (DefaultTableModel) ApartmentJTable.getModel();
        model.setRowCount(0);
        UserAccount agent= (UserAccount)this.AgentComboBox.getSelectedItem();
        // Create an empty hash map 
        HashMap<Propority, Double> aptTotalRent= new HashMap<>(); 
        if( this.slr.size() != 0 ){
            for( SignLeaseRequest sl : this.slr ){
                if( sl.getAgent().getUsername().equals(agent.getUsername()) ){
                    if( sl.getLease() != null ){
                       if(   sl.getLease().getRentList().size() == 0 ){
                           aptTotalRent.put(sl.getBuilding(), 0.0);
                        } // if
                        else{
                           Double totalRent = 0.0 ;
                           for( Rent rent : sl.getLease().getRentList() ){      
                               totalRent = totalRent + rent.getPayment().getPayAmount();
                            } // for
                           aptTotalRent.put(sl.getBuilding(), totalRent - sl.getLease().getSecurityDeposit());
                        } // else
                    } // if
                } //if             
            } // for
        } // if
        
         /*
            System.out.println("Size of map is:- "
                               + aptTotalRent.size()); 
            System.out.println(aptTotalRent); 
        */
        
         // using for-each loop for iteration over Map.entrySet() 
        Double sales =  0.0 ;
        for (Map.Entry<Propority, Double> entry : aptTotalRent.entrySet())  
            sales = sales + entry.getValue();
        
        HashMap<Propority, Integer> aptPercentage= new HashMap<>(); 
        for (Map.Entry<Propority, Double> entry : aptTotalRent.entrySet())  {
            int percentage = (int) Math.round(entry.getValue()/sales *100);
            aptPercentage.put(  entry.getKey(), percentage ) ;
        } // for
        System.out.println(aptPercentage); 
     Platform.runLater(new Runnable() {
            @Override
            public void run() {
                        Double sales =  0.0 ;
        for (Map.Entry<Propority, Double> entry : aptTotalRent.entrySet())  
            sales = sales + entry.getValue();
                aptReportJFrame testFrame = new aptReportJFrame(agent.getUsername(),  aptPercentage,
                 userProcessContainer,  ua,  ecosystem,  enterprise,  organization, sales) ;
                testFrame.setVisible(true);
                
            }
        });
        //drawPieChart( agent.getUsername(),  aptPercentage);
    }//GEN-LAST:event_btnAptVisualizationActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed

        CardLayout layout =  (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(new AccountantWorkAreaJPanel(userProcessContainer,  this.ua,  organization,   enterprise, ecosystem));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> AgentComboBox;
    private javax.swing.JTable ApartmentJTable;
    private javax.swing.JComboBox<Object> EnterpriseCombobox;
    private javax.swing.JComboBox<String> NetWorkCombobox;
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnAptVisualization;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
