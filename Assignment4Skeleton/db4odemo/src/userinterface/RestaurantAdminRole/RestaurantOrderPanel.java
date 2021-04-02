/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author gowth
 */
public class RestaurantOrderPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final UserAccount account;
    private final EcoSystem business;
    private final DeliveryManDirectory deliveryManDirectory;
    /**
     * Creates new form RestaurantOrderPanel
     */
    public RestaurantOrderPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.deliveryManDirectory = deliveryManDirectory;
        populateOrderList();
        populateDeliveryManList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorderview = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldeliveryexecutivelist = new javax.swing.JTable();
        btnconfirmorder = new javax.swing.JButton();
        btnassigndeliveryexe = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Restaurant Order List");

        tblorderview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order No", "Ordered By", "Delivered By", "Order Status", "Restaurant Name", "Delivery Man Msg", "Item Name", "Quantity", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(tblorderview);

        tbldeliveryexecutivelist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery Executive ID", "Delivery Executive Name", "Contact Number", "Email ID"
            }
        ));
        jScrollPane2.setViewportView(tbldeliveryexecutivelist);

        btnconfirmorder.setText("Confirm Order");
        btnconfirmorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmorderActionPerformed(evt);
            }
        });

        btnassigndeliveryexe.setText("Assign Delivery Executive");
        btnassigndeliveryexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassigndeliveryexeActionPerformed(evt);
            }
        });

        btnback.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnconfirmorder)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addGap(112, 112, 112)
                                .addComponent(btnassigndeliveryexe))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 918, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconfirmorder)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnassigndeliveryexe)
                    .addComponent(btnback))
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnassigndeliveryexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassigndeliveryexeActionPerformed
        // TODO add your handling code here:
        
        int row = tblorderview.getSelectedRow();
        int orderCount = tblorderview.getSelectedRowCount();
        int deliveryRow = tbldeliveryexecutivelist.getSelectedRow();
        int deliverCount = tbldeliveryexecutivelist.getSelectedRowCount();
        if(orderCount ==1 && deliverCount == 1){
            if (row >= 0) {
                String orderId = (String) tblorderview.getValueAt(row,0);
            Order order = business.getOrderDirectory().fetchOrder(orderId);
            System.out.println(order.getStatus().trim());
            if (order.getStatus().trim().equalsIgnoreCase("Confirmed")) {
                if(deliverCount == 1){
                    if (deliveryRow >= 0) {
                        System.out.println("In here"+ deliveryRow);
                    order.setDeliveryMan(deliveryManDirectory.getDeliveryManDirectory().get(deliveryRow));
                    String empId = (String) tbldeliveryexecutivelist.getValueAt(deliveryRow,3);
                    UserAccount user = business.getUserAccountDirectory().getUserByEmployeeNo(empId);
                    order.setReceiver(user);
                    order.setStatus("Preparing Order");
                    JOptionPane.showMessageDialog(null, "Delivery Man Assigned!");
                    populateOrderList();
                }
                }
                 else {
                    JOptionPane.showMessageDialog(null, "Select a delivery man to assign from table!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Order has not been confirmed! Please confirm the order before assigning!");
            }
        }
        
        }
        else{
            JOptionPane.showMessageDialog(null, "Select one order and one deliveryman!");
        }
    }//GEN-LAST:event_btnassigndeliveryexeActionPerformed

    private void btnconfirmorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmorderActionPerformed
        // TODO add your handling code here:
        
          int row = tblorderview.getSelectedRow();
        int count = tblorderview.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                String id = (String) tblorderview.getValueAt(row, 0);
                Order order = business.getOrderDirectory().fetchOrder(id);
                order.setStatus("Confirmed");
                JOptionPane.showMessageDialog(null, "Order Confirmed!");
                populateOrderList();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select one order at a time!");
        }
    }//GEN-LAST:event_btnconfirmorderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnassigndeliveryexe;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnconfirmorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbldeliveryexecutivelist;
    private javax.swing.JTable tblorderview;
    // End of variables declaration//GEN-END:variables

    public void populateOrderList() {
         DefaultTableModel model = (DefaultTableModel) tblorderview.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            if (order.getRestaurant().getRestaurantID().equalsIgnoreCase(account.getEmployee().getName())) {
                Object[] row = new Object[10];
                row[0] = order.getOrderNo();
                row[1] = order.getSender();
                row[2] = (order.getDeliveryMan() == null) ? "Awaiting Confirmation" : order.getDeliveryMan().getName();
                row[3] = order.getMessage();
                row[4] = order.getStatus();
                row[5] = order.getRestaurant().getRestaurantName();
                row[6] = (order.getOrderConfimation() == null ? "Waiting" : order.getOrderConfimation());
                row[7] = order.getItem().getItemName();
                row[8] = order.getQuantity();
                row[9] = order.getQuantity() * order.getItem().getItemprice();
                
                model.addRow(row);
            }
        } //To change body of generated methods, choose Tools | Templates.
    }

    public void populateDeliveryManList() {
        DefaultTableModel model = (DefaultTableModel) tbldeliveryexecutivelist.getModel();
        model.setRowCount(0);
        for (DeliveryMan deliveryMan : deliveryManDirectory.getDeliveryManDirectory()) {
                Object[] row = new Object[4];
                row[0] = deliveryMan.getName();
                row[1] = deliveryMan.getPhoneNo();
                row[2] = deliveryMan.getDeliveryId();
                row[3] = deliveryMan.getEmail();
                model.addRow(row);
        } //To change body of generated methods, choose Tools | Templates.
    }
}
