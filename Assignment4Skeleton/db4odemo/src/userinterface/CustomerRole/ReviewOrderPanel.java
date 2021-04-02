
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.CustomerDirectory;
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
import userinterface.RestaurantAdminRole.MaintainMenuPanel;
/**
 *
 * @author gowth
 */
public class ReviewOrderPanel extends javax.swing.JPanel {

    
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final OrderDirectory orderDirectory;
    /**
     * Creates new form ReviewOrderPanel
     */
    public ReviewOrderPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CustomerDirectory customerDirectory, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.system = system;
        this.userAccount = account;
        this.orderDirectory = orderDirectory;
        populateRequestTable();
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
        tblorderreview = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtcomments = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Review Order History");

        tblorderreview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Delivery Exec", "Status", "Restaurant Name", "Item", "Quantity", "Total Cost", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblorderreview);

        jButton1.setText("Insert Comments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Provide Your Comments for theselected Order:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtcomments, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtcomments, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int row = tblorderreview.getSelectedRow();
        int count = tblorderreview.getSelectedRowCount();
        if (count == 1) {
            if (row >= 0) {
                String orderId = tblorderreview.getValueAt(row, 0).toString();
                Order order = orderDirectory.fetchOrder(orderId);
                if (order.getStatus().equalsIgnoreCase("Completed")) {
                    String comment = txtcomments.getText();
                    if (!comment.isEmpty()) {
                        order.setMessage(comment);
                        txtcomments.setText("");
                        JOptionPane.showMessageDialog(null, "Thank you for your Comments");
                        populateRequestTable();
                    } else {
                        JOptionPane.showMessageDialog(null, "Comments cannot be empty!");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select one order to provide Comments");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblorderreview;
    private javax.swing.JTextField txtcomments;
    // End of variables declaration//GEN-END:variables

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblorderreview.getModel();
        model.setRowCount(0);
        for (Order order : orderDirectory.getOrderDirectory()) {
            if (order.getCustomer().getCustomerID().equalsIgnoreCase(userAccount.getEmployee().getName())) {
                Object[] row = new Object[8];
                row[0] = order.getOrderNo();
                row[1] = (order.getDeliveryMan() == null) ? "Awaiting Confirmation" : order.getDeliveryMan().getName();
                row[2] = order.getStatus();
                row[3] = order.getRestaurant().getRestaurantName();
                row[4] = order.getItem().getItemName();
                row[5] = order.getQuantity();
                row[6] = order.getQuantity() * order.getItem().getItemprice();
                row[7] = order.getMessage();
                model.addRow(row);
            }
        } //To change body of generated methods, choose Tools | Templates.
    }
}