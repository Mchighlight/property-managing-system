/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageMasterFlightSchedule;
import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.FlightDirectory;
import Images.StyledButton;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;




public class ManageMasterFlightScheduleJPanel extends javax.swing.JPanel {



    private JPanel cardSequenceJPanel;
    private FlightDirectory flightDir;
    DefaultTableModel  dtm;
    ArrayList<Flight> Multiflightlist;
    public ManageMasterFlightScheduleJPanel(JPanel cardSequenceJPanel, FlightDirectory flightDir) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flightDir = flightDir;
        Multiflightlist = new ArrayList<>();
        populateTable();
        bookjButton.setUI(new StyledButton());
        searchBtn.setUI(new StyledButton());
        addjButton.setUI(new StyledButton());
        multibookjButton.setUI(new StyledButton());
        flighterSelectDestinationComboBox();
        flighterSelectDepartingComboBox();
        flighterSelectTimeComboBox();
        flighterSelectDateComboBox();

        AutoCompleteDecorator.decorate(DestinationCombobox);
        AutoCompleteDecorator.decorate(DepartingCombobox);
        AutoCompleteDecorator.decorate(PreferredTimeCombobox);
        AutoCompleteDecorator.decorate(DateCombobox);

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tblMasterFlight.getModel());
        tblMasterFlight.setRowSorter(sorter);
        TableRowSorter<TableModel> sorter2 = new TableRowSorter<TableModel>(tblMultipleFlight.getModel());
        tblMultipleFlight.setRowSorter(sorter2);
    }
  
    public void flighterSelectDestinationComboBox(){
        ArrayList<String> airlinerArray = new ArrayList();
        DefaultComboBoxModel cBmodel = new DefaultComboBoxModel();
        cBmodel.addElement("Where to");
        for(Flight flighter: flightDir.getFlightDir()){
            if(airlinerArray.contains(flighter.getDestination())){continue;}
            else {
                airlinerArray.add(flighter.getDestination());
                cBmodel.addElement(flighter.getDestination());
            }
        }
        DestinationCombobox.setModel(cBmodel);
    }
    
    
        public void flighterSelectDepartingComboBox(){
        ArrayList<String> airlinerArray = new ArrayList();
        DefaultComboBoxModel cBmodel = new DefaultComboBoxModel();
        cBmodel.addElement("Departing from");
        for(Flight flighter: flightDir.getFlightDir()){
            if(airlinerArray.contains(flighter.getSource())){continue;}
            else {
                airlinerArray.add(flighter.getSource());
                cBmodel.addElement(flighter.getSource());
            }
        }
        DepartingCombobox.setModel(cBmodel);
    }
         public void flighterSelectTimeComboBox(){
        ArrayList<String> airlinerArray = new ArrayList();
        DefaultComboBoxModel cBmodel = new DefaultComboBoxModel();
        cBmodel.addElement("Preferred time");
        for(Flight flighter: flightDir.getFlightDir()){
            if(airlinerArray.contains(flighter.getOtod ())){continue;}
            else {
                airlinerArray.add(flighter.getOtod());
                cBmodel.addElement(flighter.getOtod());
            }
        }
        PreferredTimeCombobox.setModel(cBmodel);
    }
            public void flighterSelectDateComboBox(){
        ArrayList<String> airlinerArray = new ArrayList();
        DefaultComboBoxModel cBmodel = new DefaultComboBoxModel();
        cBmodel.addElement("Date");
        for(Flight flighter: flightDir.getFlightDir()){
            if(airlinerArray.contains(flighter.getDate ())){continue;}
            else {
               // airlinerArray.add(flighter.getDate());
                cBmodel.addElement(flighter.getDate());
            }
        }
        DateCombobox.setModel(cBmodel);
    }

        public void populateTable(){
        dtm = (DefaultTableModel)tblMasterFlight.getModel();
        dtm.setRowCount(0);
        
        for(Flight a : flightDir.getFlightDir()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a.getOwner();
            row[1] = a;
            row[2] = a.getSource();
            row[3] = a.getDestination();
            row[4] = a.getDepTime();
            row[5] = a.getArrTime();
            row[6] = a.getDuration();
            row[7] = a.getDate();
            row[8] = a.getOtod();
            dtm.addRow(row);
        }
    }
         public void populateTable(ArrayList<Flight> f){
        dtm = (DefaultTableModel)tblMultipleFlight.getModel();
        dtm.setRowCount(0);
        
        for(Flight a : f){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a.getOwner();
            row[1] = a;
            row[2] = a.getSource();
            row[3] = a.getDestination();
            row[4] = a.getDepTime();
            row[5] = a.getArrTime();
            row[6] = a.getDuration();
            row[7] = a.getDate();
            row[8] = a.getOtod();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMasterFlight = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        DestinationCombobox = new javax.swing.JComboBox<>();
        DepartingCombobox = new javax.swing.JComboBox<>();
        PreferredTimeCombobox = new javax.swing.JComboBox<>();
        DateCombobox = new javax.swing.JComboBox<>();
        bookjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMultipleFlight = new javax.swing.JTable();
        addjButton = new javax.swing.JButton();
        multibookjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblMasterFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Number", "Departing from", "Destination", "Departure Time", "Arrival Time", "Duration", "Date", "Time of Day"
            }
        ));
        jScrollPane1.setViewportView(tblMasterFlight);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MASTER FLIGHT INFORMATION");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        DestinationCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  " }));
        DestinationCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinationComboboxActionPerformed(evt);
            }
        });

        DepartingCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  " }));
        DepartingCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartingComboboxActionPerformed(evt);
            }
        });

        PreferredTimeCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  " }));
        PreferredTimeCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreferredTimeComboboxActionPerformed(evt);
            }
        });

        DateCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  " }));
        DateCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateComboboxActionPerformed(evt);
            }
        });

        bookjButton.setText("Single-Book");
        bookjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookjButtonActionPerformed(evt);
            }
        });

        tblMultipleFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight Number", "Departing from", "Destination", "Departure Time", "Arrival Time", "Duration", "Date", "Time of Day"
            }
        ));
        jScrollPane2.setViewportView(tblMultipleFlight);

        addjButton.setText("Add");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        multibookjButton.setText("Multi-Book");
        multibookjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multibookjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DepartingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DestinationCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PreferredTimeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(242, 242, 242))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(multibookjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DepartingCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PreferredTimeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bookjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DestinationCombobox, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(DateCombobox)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multibookjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(searchBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
       
        
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dtm);
        
      String Destination=DestinationCombobox.getSelectedItem().toString();
      String Departing= DepartingCombobox.getSelectedItem().toString();
      if (Destination=="Where to" ||Departing=="Departing from"){
          JOptionPane.showMessageDialog(null, "Please select Destination and departing");
      }else{
      
       //tblMasterFlight.setRowSorter(tr);
      
       List<String> list = new ArrayList<String>();
       //list.add (DepartingCombobox.getSelectedItem().toString());
       list.add(PreferredTimeCombobox.getSelectedItem().toString());
       list.add(DateCombobox.getSelectedItem().toString());
       //list.add(DestinationCombobox.getSelectedItem().toString());
       List <String> result=new ArrayList<>();
       for (String n:list){
            if (!n.contains("Preferred time") &&!n.contains("Date"))
            result.add(n); 
            tblMasterFlight.setRowSorter(tr);
       }
       List<RowFilter<TableModel,Object>> filters = new ArrayList<RowFilter<TableModel,Object>>(); 
       for(int j = 0; j < result.size(); j++) {
           filters.add(RowFilter.regexFilter(result.get(j)));
       }
           filters.add(RowFilter.regexFilter(Destination,3));
           filters.add(RowFilter.regexFilter(Departing,2));
           
       RowFilter<TableModel, Object> compoundRowFilter = null;
       compoundRowFilter = RowFilter.andFilter(filters);
       tblMasterFlight.setRowSorter(tr);
       tr.setRowFilter(compoundRowFilter);
      
        
        
        
        /*// TODO add your handling code here:
        if("".equals(destinationTxtField.getText())){
            destinationTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Destination");
            return;
        }
        else{
            destinationTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setForeground(Color.BLACK);
        }
        
        if("".equals(sourceTxtField.getText())){
            sourceTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Source");
            return;
        }
        else{
            sourceTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setForeground(Color.BLACK);
        }
        
        if(otodComboBox.getSelectedItem().equals("Select Option")){
            JOptionPane.showMessageDialog(null, "Please enter preferred time of the day");
            return;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");


        try {

            Date date = formatter.parse(dateTxtField.getText());
            dateTxtField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
            //System.out.println("Date format is correct");
        } catch (ParseException e) {
            e.printStackTrace();
            dateTxtField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter date in dd-MM-yyyy format");
            return;
        }
        ArrayList<Flight> flightDirFiltered = flightDir.searchMaster(destinationTxtField.getText(),sourceTxtField.getText(),otodComboBox.getSelectedItem().toString(),dateTxtField.getText());
        System.out.println(flightDirFiltered);
        FlightFoundJPanel panel = new FlightFoundJPanel(cardSequenceJPanel, flightDirFiltered);
        cardSequenceJPanel.add("FlightFoundJPanel",panel);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
        clearSearchFields();
        */
      }
    }//GEN-LAST:event_searchBtnActionPerformed

    
    private void DepartingComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartingComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartingComboboxActionPerformed

    private void DestinationComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinationComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinationComboboxActionPerformed

    private void PreferredTimeComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreferredTimeComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreferredTimeComboboxActionPerformed

    private void DateComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateComboboxActionPerformed

    private void bookjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookjButtonActionPerformed
        
        int selectedRow =tblMasterFlight.getSelectedRow();
        if (selectedRow>=0) {
            Flight result=  flightDir.Searchflight( tblMasterFlight.getModel().getValueAt(selectedRow,1).toString());
        if (result ==null){
             JOptionPane.showMessageDialog(null,"SearialNumber number you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
        }else{
            FlightFoundDetailJPanel panel = new FlightFoundDetailJPanel(cardSequenceJPanel, result);
           cardSequenceJPanel.add("FlightDetailJPanel",panel);
           CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
           layout.next(cardSequenceJPanel);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bookjButtonActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow=tblMasterFlight.getSelectedRow();
        if (selectedrow>=0) {
            Flight f=(Flight) tblMasterFlight.getValueAt(selectedrow,1);
            if (!Multiflightlist.contains(f)) {
                Multiflightlist.add(f);
            }else{
               JOptionPane.showMessageDialog(null, "Cannot add the same flight!","Warning",JOptionPane.WARNING_MESSAGE);
            }
            populateTable(Multiflightlist);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_addjButtonActionPerformed

    private void multibookjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multibookjButtonActionPerformed
        // TODO add your handling code here:
           FlightFoundDetailJPanel panel = new FlightFoundDetailJPanel(cardSequenceJPanel, Multiflightlist);
           cardSequenceJPanel.add("FlightDetailJPanel",panel);
           CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
           layout.next(cardSequenceJPanel);
        
    }//GEN-LAST:event_multibookjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DateCombobox;
    private javax.swing.JComboBox<String> DepartingCombobox;
    private javax.swing.JComboBox<String> DestinationCombobox;
    private javax.swing.JComboBox<String> PreferredTimeCombobox;
    private javax.swing.JButton addjButton;
    private javax.swing.JButton bookjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton multibookjButton;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTable tblMasterFlight;
    private javax.swing.JTable tblMultipleFlight;
    // End of variables declaration//GEN-END:variables
}
