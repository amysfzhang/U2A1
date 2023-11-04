/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u2a1_amyzhang;

import java.util.*;
import javax.swing.table.*;
import javax.swing.*;

/**
 *
 * @author Amy Zhang
 * Date: November 3, 2023
 * Utilizing Vehicles Class for a trip planner
 * 
 */
public class VehicleApp extends javax.swing.JFrame {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    /**
     * Creates new form NewJFrame
     */
    public VehicleApp() {
        initComponents();
        tableVehicles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//only one row can be selected at a time
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
        tableVehicles = new javax.swing.JTable();
        txtCompare = new javax.swing.JTextField();
        btnCompare = new javax.swing.JButton();
        comboVehicle2 = new javax.swing.JComboBox<>();
        comboVehicle1 = new javax.swing.JComboBox<>();
        txtPassengers = new javax.swing.JTextField();
        txtFare = new javax.swing.JTextField();
        lblFare = new javax.swing.JLabel();
        lblPassengers = new javax.swing.JLabel();
        txtFuel = new javax.swing.JTextField();
        txtLicensePlate = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        lblFuel = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblErrorAdd = new javax.swing.JLabel();
        lblGasPrice = new javax.swing.JLabel();
        txtGasPrice = new javax.swing.JTextField();
        lblDistance = new javax.swing.JLabel();
        txtDistance = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCalculate = new javax.swing.JButton();
        lblErrorCalculate = new javax.swing.JLabel();
        lblErrorCompare = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trip Planner");

        tableVehicles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "License Plate", "Revenue ($)", "Total Cost ($)", "Profit ($)", "Profitable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVehicles.setShowVerticalLines(true);
        tableVehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVehiclesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVehicles);
        if (tableVehicles.getColumnModel().getColumnCount() > 0) {
            tableVehicles.getColumnModel().getColumn(0).setPreferredWidth(25);
            tableVehicles.getColumnModel().getColumn(1).setPreferredWidth(150);
            tableVehicles.getColumnModel().getColumn(3).setPreferredWidth(80);
        }

        txtCompare.setEditable(false);

        btnCompare.setText("Compare");
        btnCompare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompareActionPerformed(evt);
            }
        });

        lblFare.setText("Fare per Passenger ($)");

        lblPassengers.setText("# of Passengers");

        lblModel.setText("License Plate");

        lblFuel.setText("Fuel Efficiency (L/km)");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblErrorAdd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblErrorAdd.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorAdd.setText(" ");

        lblGasPrice.setText("Gas Price ($/L)");

        lblDistance.setText("Distance (km)");

        lblTitle.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        lblTitle.setText("Trip Planner");
        lblTitle.setToolTipText("");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblErrorCalculate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblErrorCalculate.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCalculate.setText(" ");

        lblErrorCompare.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblErrorCompare.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCompare.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblErrorCompare, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCompare))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblErrorAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboVehicle1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboVehicle2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCompare))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblFuel, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblModel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFuel)
                                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFare, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPassengers, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                            .addComponent(txtFare))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblGasPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGasPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDistance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(lblTitle)))
                .addGap(41, 106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFuel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassengers)
                            .addComponent(txtPassengers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFare))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(lblErrorAdd))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGasPrice)
                        .addComponent(txtGasPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblDistance))
                        .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(lblErrorCalculate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCompare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboVehicle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboVehicle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompare)
                    .addComponent(lblErrorCompare))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Creates new Vehicle from user input, adds it to table
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        lblErrorAdd.setText("");//resetting error message
        
        //Create new Vehicle using input values
        int passengerNum;
        double fuelEfficency, fare;
        
        //checking # of Passengers
        try {
            passengerNum = Integer.parseInt(txtPassengers.getText());
            if (passengerNum < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            lblErrorAdd.setText("Number of passengers is not a positive integer");
            return;
        }
        //checking Fuel Efficiency        
        try {
            fuelEfficency = Double.parseDouble(txtFuel.getText());
            if (fuelEfficency < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) { 
           lblErrorAdd.setText("Fuel Efficiency is not a positive decimal");
            return;
        }
        //checking Fare per Passenger    
        try {
            fare = Double.parseDouble(txtFare.getText());
            if (fare < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            lblErrorAdd.setText("Fare per Passenger is not a positive decimal");
            return;
        }

        //checking Fare per Passenger            
        String licensePlate = txtLicensePlate.getText().toUpperCase();
        //runs different constructors depending on if licensePlate is empty
        if (licensePlate.equals("")) {
            vehicles.add(new Vehicle(passengerNum, fare, fuelEfficency));   
        } else {
            //checking if license plate already exists
            for (Vehicle vehicle : vehicles) {
                if (licensePlate.equals(vehicle.getLicensePlate())) {
                    lblErrorAdd.setText("Another vehicle with the same license plate already exists");
                    return;
                }
            }
            vehicles.add(new Vehicle(licensePlate, passengerNum, fare, fuelEfficency));      
        }

        //Add vehicle to arraylist and table
        Object[] array = {tableVehicles.getRowCount() + 1, vehicles.get(vehicles.size()-1).getLicensePlate(), 0, 0, 0, false};
        DefaultTableModel model = (DefaultTableModel)tableVehicles.getModel(); //gets model for column names
        model.addRow(array);//add array as a row (notifies tableVehicles in GUI)

        //Add vehicle index as option in comboboxes
        comboVehicle1.addItem(String.valueOf(tableVehicles.getRowCount()));
        comboVehicle2.addItem(String.valueOf(tableVehicles.getRowCount()));
    }//GEN-LAST:event_btnAddActionPerformed

    //Update each vehicle's values according to newly entered distance and gas price 
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        lblErrorCalculate.setText("");//resetting error message
        
        //checking if gas price is valid
        try {
            double gasPrice = Double.parseDouble(txtGasPrice.getText());
            if (gasPrice < 0) {
                throw new NumberFormatException();
            }
            Vehicle.setGasPrice(gasPrice);
        } catch (NumberFormatException e) {
            lblErrorCalculate.setText("Gas Price is not a positive decimal value");
            return;
        }
        //checking if distance is valid
        try {
            double distance = Double.parseDouble(txtDistance.getText());
            if (distance < 0) {
                throw new NumberFormatException();
            }
            Vehicle.setDistance(distance);
        } catch (NumberFormatException e) {
            lblErrorCalculate.setText("Distance is not a positive decimal value");
            return;
        }

        //Creates model from table to edit
        DefaultTableModel model = (DefaultTableModel)tableVehicles.getModel();
        //removes all rows
        while (model.getRowCount() != 0) {
            model.removeRow(model.getRowCount() - 1);
        }
        //adds all rows back using gasprice and distance as parameters
        for (int i = 0; i < vehicles.size(); i ++) {
            Object[] array = {tableVehicles.getRowCount() + 1, vehicles.get(i).getLicensePlate(), vehicles.get(i).revenue(), vehicles.get(i).totalCost(), vehicles.get(i).calculateProfit(), vehicles.get(i).isProfitable()}; //calculates each column
            model.addRow(array);//add array as a row
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    //Compares the profit of two vehicles selected by the user
    private void btnCompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompareActionPerformed
        lblErrorCompare.setText("");//resetting error message
        txtCompare.setText("");//resetting error message 
        
        //checking if gas price is valid
        try {
            double gasPrice = Double.parseDouble(txtGasPrice.getText());
            if (gasPrice < 0) {
                throw new NumberFormatException();
            }
            Vehicle.setGasPrice(gasPrice);
        } catch (NumberFormatException e) {
            lblErrorCompare.setText("Gas Price is not a decimal value");
            return;
        }
        //checking if distance is valid
        try {
            double distance = Double.parseDouble(txtDistance.getText());
            if (distance < 0) {
                throw new NumberFormatException();
            }
            Vehicle.setDistance(distance);
        } catch (NumberFormatException e) {
            lblErrorCompare.setText("Distance is not a decimal value");
            return;
        }

        //check if vehicle is selected from combo box
        if (comboVehicle1.getSelectedIndex() == -1 || comboVehicle2.getSelectedIndex() == -1) {
            lblErrorCompare.setText("Please select two vehicles for comparison");
            return;
        }
        //Get items from each combo box
        Vehicle a = vehicles.get(comboVehicle1.getSelectedIndex());
        Vehicle b = vehicles.get(comboVehicle2.getSelectedIndex());
        //checking if selection is the same
        if (comboVehicle1.getSelectedIndex() == comboVehicle2.getSelectedIndex()) {
            lblErrorCompare.setText("Please select two different vehicles for comparison");
            return;
        }
        //checking if they are equal, displays result
        if (Vehicle.compareTo(a, b) == null) {
            txtCompare.setText("Both vehicles are equally profitable"); 
        } else {
            txtCompare.setText("Vehicle " + (vehicles.indexOf(Vehicle.compareTo(a, b)) + 1) + " is more profitable");                
        }
    }//GEN-LAST:event_btnCompareActionPerformed

    //Sets tool tip of table when a row is selected
    private void tableVehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVehiclesMouseClicked
        if (tableVehicles.getSelectedRow() == -1) {
            return; //if no row is selected
        } else {
            //shows all entered info in tool tip of selected row
            tableVehicles.setToolTipText(vehicles.get(tableVehicles.getSelectedRow()).toString());      
        }
    }//GEN-LAST:event_tableVehiclesMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCompare;
    private javax.swing.JComboBox<String> comboVehicle1;
    private javax.swing.JComboBox<String> comboVehicle2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDistance;
    private javax.swing.JLabel lblErrorAdd;
    private javax.swing.JLabel lblErrorCalculate;
    private javax.swing.JLabel lblErrorCompare;
    private javax.swing.JLabel lblFare;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblGasPrice;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPassengers;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tableVehicles;
    private javax.swing.JTextField txtCompare;
    private javax.swing.JTextField txtDistance;
    private javax.swing.JTextField txtFare;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JTextField txtGasPrice;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtPassengers;
    // End of variables declaration//GEN-END:variables
}
