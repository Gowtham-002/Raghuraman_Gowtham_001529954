/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.Item;
import Business.Menu.MenuDirectory;
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
public class MaintainMenuPanel extends javax.swing.JPanel {

    
    private final JPanel container;
    private final EcoSystem system;
    private final RestaurantDirectory restaurantDirectory;
    private final MenuDirectory menuDirectory;
    private final UserAccount account;
    /**
     * Creates new form MaintainMenuPanel
     */
    public MaintainMenuPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory) {
        initComponents();
        
         this.container = userProcessContainer;
        this.system = system;
        this.restaurantDirectory = restaurantDirectory;
        this.menuDirectory = menuDirectory;
        this.account = account;
        populateMenuItem();
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
        tblrestaurantmenulist = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnadditem = new javax.swing.JButton();
        btnupdateitem = new javax.swing.JButton();
        btndeleteitem = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 255, 255));

        tblrestaurantmenulist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Calories/grm", "Cuisine", "Price in $"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblrestaurantmenulist);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Restaurant Menu List");

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnadditem.setText("Add Item");
        btnadditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadditemActionPerformed(evt);
            }
        });

        btnupdateitem.setText("Update Item");
        btnupdateitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateitemActionPerformed(evt);
            }
        });

        btndeleteitem.setText("Delete Item");
        btndeleteitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteitemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addGap(100, 100, 100)
                                .addComponent(btnadditem)
                                .addGap(136, 136, 136)
                                .addComponent(btnupdateitem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndeleteitem))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnadditem)
                    .addComponent(btnupdateitem)
                    .addComponent(btndeleteitem))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateMenu() {
        DefaultTableModel model = (DefaultTableModel) tblrestaurantmenulist.getModel();
        model.setRowCount(0);
        for (Item item : menuDirectory.getMenuDirectory()) {
            if (item.getRestaurantID().equalsIgnoreCase(account.getEmployee().getName())) {
                Object[] row = new Object[5];
                row[0] = item.getItemID();
                row[1] = item.getItemName();
                row[2] = item.getItemcalories();
                row[3] = item.getItemcuisine();
                row[4] = item.getItemprice();
                model.addRow(row);
            }
        }
    }
    
    private void btnadditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadditemActionPerformed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout) container.getLayout();
        AddMenuItemPanel addMenuItem = new AddMenuItemPanel(container, account, system, restaurantDirectory, menuDirectory);
        container.add(addMenuItem);
        layout.next(container);
    }//GEN-LAST:event_btnadditemActionPerformed

    private void btndeleteitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteitemActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblrestaurantmenulist.getSelectedRow();
        int delectedRowCount = tblrestaurantmenulist.getSelectedRowCount();
        if (delectedRowCount == 1) {
            int confirmOptions = JOptionPane.YES_NO_OPTION;
            int response = JOptionPane.showConfirmDialog(null, "Are you sure want to delete this menu item?", "Warning", confirmOptions);
            if (response == JOptionPane.YES_OPTION) {
                String itemID = (String) tblrestaurantmenulist.getValueAt(selectedRow, 0);
                menuDirectory.deleteItem(itemID);
                populateMenu();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select Menu Item to delete");
        }
    }//GEN-LAST:event_btndeleteitemActionPerformed

    private void btnupdateitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateitemActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblrestaurantmenulist.getSelectedRow();
        int count = tblrestaurantmenulist.getSelectedRowCount();
        if (count == 1) {
            CardLayout layout = (CardLayout) container.getLayout();
            String itemID = (String) tblrestaurantmenulist.getValueAt(selectedRow, 0);
            Item item = menuDirectory.fetchItem(itemID);
            UpdateMenuItemPanel restaurantMenuItem = new UpdateMenuItemPanel(container, item, menuDirectory);
            container.add(restaurantMenuItem);
            layout.next(container);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
        }
    }//GEN-LAST:event_btnupdateitemActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
            container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadditem;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndeleteitem;
    private javax.swing.JButton btnupdateitem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblrestaurantmenulist;
    // End of variables declaration//GEN-END:variables

    public void populateMenuItem() {
        DefaultTableModel model = (DefaultTableModel) tblrestaurantmenulist.getModel();
        model.setRowCount(0);
        for (Item item : menuDirectory.getMenuDirectory()) {
            if (item.getRestaurantID().equalsIgnoreCase(account.getEmployee().getName())) {
                Object[] row = new Object[5];
                row[0] = item.getItemID();
                row[1] = item.getItemName();
                row[2] = item.getItemcalories();
                row[3] = item.getItemcuisine();
                row[4] = item.getItemprice();
                model.addRow(row);
            }
        }//To change body of generated methods, choose Tools | Templates.
    }
}
