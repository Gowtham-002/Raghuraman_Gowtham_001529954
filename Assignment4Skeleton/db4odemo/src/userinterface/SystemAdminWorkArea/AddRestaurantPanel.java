/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gowth
 */
public class AddRestaurantPanel extends javax.swing.JPanel {

    private final RestaurantDirectory restaurantDirectory;
    private final JPanel container;
    private final EcoSystem system;
    /**
     * Creates new form AddRestaurantPanel
     */
    public AddRestaurantPanel(JPanel container, EcoSystem system, RestaurantDirectory restaurantDirectory) {
        initComponents();
        
        this.restaurantDirectory = restaurantDirectory;
        this.container = container;
        this.system = system;
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
        txtrestaurantname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtemailid = new javax.swing.JTextField();
        txtphonenumber = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtzipcode = new javax.swing.JTextField();
        txtpassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnsubmitrestaurant = new javax.swing.JButton();
        btnback = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Add New Restaurant");

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel2.setText("Restaurant Name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jLabel5.setText("Email ID:");

        jLabel6.setText("Address:");

        jLabel7.setText("Zipcode:");

        jLabel8.setText("Phone Number:");

        btnsubmitrestaurant.setText("Submit Restaurant");
        btnsubmitrestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitrestaurantActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jLabel3)
                                        .addGap(48, 48, 48))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtrestaurantname)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtemailid)
                            .addComponent(txtaddress)
                            .addComponent(txtzipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))))
                .addGap(359, 359, 359))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btnback)
                        .addGap(163, 163, 163)
                        .addComponent(btnsubmitrestaurant)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrestaurantname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmitrestaurant)
                    .addComponent(btnback))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageRestaurantPanel manageRestaurantPanel = (ManageRestaurantPanel) component;
        manageRestaurantPanel.populateRestaurants();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnsubmitrestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitrestaurantActionPerformed
        // TODO add your handling code here:
        String name = txtrestaurantname.getText();
        String address = txtaddress.getText();
        String phone = txtphonenumber.getText();
        String username = txtusername.getText();
        String password = txtpassword.getText();
        String zipcode = txtzipcode.getText();
        String email = txtemailid.getText();

        if (username.isEmpty() || password.isEmpty() || name.isEmpty() || address.isEmpty() || phone.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please Enter All Fields!");
        } else if (!system.checkValidPhoneFormat(phone)) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Phone No.");
        }else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        }  else if (!system.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            JOptionPane.showMessageDialog(null, "Username Already Exists!");
        } else if (!restaurantDirectory.isPhoneUnique(phone)) {
            JOptionPane.showMessageDialog(null, "Phone no Already Registered!");
        } else {
            Restaurant restaurant = new Restaurant();
            restaurant.setRestaurantName(name);
            restaurant.setStreetAddress(address);
            restaurant.setMobileNo(phone);
            restaurant.setEmail(email);
            restaurant.setZipcode(zipcode);
            restaurantDirectory.add(restaurant);
            system.setRestaurantDirectory(restaurantDirectory);
            Employee employee = system.getEmployeeDirectory().createEmployee(restaurant.getRestaurantID());
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
            JOptionPane.showMessageDialog(null, "New Restaurant has been added!");
            clearAllFields();
        }
        
    }//GEN-LAST:event_btnsubmitrestaurantActionPerformed

    
    public void clearAllFields() {
        txtrestaurantname.setText("");
        txtaddress.setText("");
        txtphonenumber.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        txtzipcode.setText("");
        txtemailid.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnsubmitrestaurant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JTextField txtrestaurantname;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtzipcode;
    // End of variables declaration//GEN-END:variables
}
