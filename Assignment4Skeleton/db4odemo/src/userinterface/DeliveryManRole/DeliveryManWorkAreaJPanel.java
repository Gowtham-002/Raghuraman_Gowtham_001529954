/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gowtham
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

//    private JPanel userProcessContainer;
//    private EcoSystem business;
//    private UserAccount userAccount;
    
    private final UserAccount account;
    private final EcoSystem business;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
         
        this.account = account;
        this.business = business;
        populateTable();
      
        
        populateTable();
    }
    
    public void populateTable(){
         DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            if (order.getDeliveryMan() != null) {
                if (order.getDeliveryMan().getDeliveryId().equalsIgnoreCase(account.getEmployee().getName())) {
                    Object[] row = new Object[6];
                    row[0] = order.getSender();
                    row[1] = order.getStatus();
                    row[2] = order.getOrderNo();
                    row[3] = order.getCustomer().getCustomerAddress();
                    row[4] = order.getRestaurant().getStreetAddress();
                    row[5] = order.getCustomer().getCustomerZipcode();
                    model.addRow(row);
                }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnconfirmorderpckup = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ordered By", "Order Status", "Order No", "Customer Address", "Restaurant Address", "Customer Zipcode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 630, 100));

        btnconfirmorderpckup.setText("Confirm Order Pickup");
        btnconfirmorderpckup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmorderpckupActionPerformed(evt);
            }
        });
        add(btnconfirmorderpckup, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        processJButton.setText("Confirm Order Delivery");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Delivery Executive Order Page");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 260, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnconfirmorderpckupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmorderpckupActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 2);
        Order order = business.getOrderDirectory().fetchOrder(selectedOrderId);

        order.setStatus("Out For Delivery");
        JOptionPane.showMessageDialog(null, "Order updated successfully!");
        populateTable();
        
    }//GEN-LAST:event_btnconfirmorderpckupActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
               int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 2);
        Order order = business.getOrderDirectory().fetchOrder(selectedOrderId);

        if (order.getStatus().trim().equalsIgnoreCase("Out For Delivery")) {
            
            order.setStatus("Completed");
           
            JOptionPane.showMessageDialog(null, "Order updated!");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please confirm order pick up before confirming delivery!");
        }
        
    }//GEN-LAST:event_processJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirmorderpckup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
