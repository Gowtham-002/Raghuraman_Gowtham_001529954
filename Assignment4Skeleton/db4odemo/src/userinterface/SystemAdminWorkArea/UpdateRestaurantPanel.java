/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;


import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gowth
 */
public class UpdateRestaurantPanel extends javax.swing.JPanel {

    
    private final JPanel container;
    private final Restaurant restaurant;
    /**
     * Creates new form UpdateRestaurantPanel
     */
    public UpdateRestaurantPanel(JPanel container, Restaurant restaurant) {
        initComponents();
        
        this.container = container;
        this.restaurant = restaurant;
        txtrestaurantid.setText(restaurant.getRestaurantID());
        txtrestaurantaddress.setText(restaurant.getStreetAddress());
        txtrestaurantphonenumber.setText(restaurant.getMobileNo());
        txtrestaurantemailid.setText(restaurant.getEmail());
        txtrestaurantname.setText(restaurant.getRestaurantName());
        txtrestaurantzipcode.setText(restaurant.getZipcode());
        disableRestaurantEditing();
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
        txtrestaurantid = new javax.swing.JTextField();
        txtrestaurantaddress = new javax.swing.JTextField();
        txtrestaurantzipcode = new javax.swing.JTextField();
        txtrestaurantname = new javax.swing.JTextField();
        txtrestaurantphonenumber = new javax.swing.JTextField();
        txtrestaurantemailid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btneditrestaurant = new javax.swing.JButton();
        btnsavechanges = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Update Restaurant Details");

        jLabel2.setText("Restaurant ID:");

        jLabel3.setText("Address:");

        jLabel4.setText("Zipcode:");

        jLabel5.setText("Restaurant Name:");

        jLabel6.setText("Phone Number:");

        jLabel7.setText("Email ID:");

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btneditrestaurant.setText("Edit Restaurant");
        btneditrestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditrestaurantActionPerformed(evt);
            }
        });

        btnsavechanges.setText("Save Changes");
        btnsavechanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavechangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneditrestaurant)
                        .addGap(73, 73, 73)
                        .addComponent(btnsavechanges))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtrestaurantaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(txtrestaurantid)
                                    .addComponent(txtrestaurantzipcode))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtrestaurantemailid))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtrestaurantphonenumber))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                        .addComponent(txtrestaurantname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(314, 314, 314))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrestaurantid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrestaurantname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrestaurantaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrestaurantphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrestaurantzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrestaurantemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btneditrestaurant)
                    .addComponent(btnsavechanges))
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btneditrestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditrestaurantActionPerformed
        // TODO add your handling code here:
        
    enableRestaurantEditing();
    }//GEN-LAST:event_btneditrestaurantActionPerformed

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

    private void btnsavechangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavechangesActionPerformed
        // TODO add your handling code here:
        
         if (txtrestaurantname.getText().isEmpty() || txtrestaurantaddress.getText().isEmpty() || txtrestaurantphonenumber.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields!");
        } else if (!checkPhoneNumberValidation(txtrestaurantphonenumber.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Phone No!");
                    } else {
            restaurant.setRestaurantName(txtrestaurantname.getText());
            restaurant.setStreetAddress(txtrestaurantaddress.getText());
            restaurant.setMobileNo(txtrestaurantphonenumber.getText());
            restaurant.setEmail(txtrestaurantemailid.getText());
            restaurant.setZipcode(txtrestaurantzipcode.getText());
            JOptionPane.showMessageDialog(null, "Changes Saved Sucessfully!");
            disableRestaurantEditing();
        }
    }//GEN-LAST:event_btnsavechangesActionPerformed

    
    public boolean checkPhoneNumberValidation(String phoneNo) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btneditrestaurant;
    private javax.swing.JButton btnsavechanges;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtrestaurantaddress;
    private javax.swing.JTextField txtrestaurantemailid;
    private javax.swing.JTextField txtrestaurantid;
    private javax.swing.JTextField txtrestaurantname;
    private javax.swing.JTextField txtrestaurantphonenumber;
    private javax.swing.JTextField txtrestaurantzipcode;
    // End of variables declaration//GEN-END:variables

    
        public void disableRestaurantEditing() {
        txtrestaurantid.setEditable(false);
        txtrestaurantphonenumber.setEditable(false);
        txtrestaurantname.setEditable(false);
        txtrestaurantaddress.setEditable(false);
        txtrestaurantzipcode.setEditable(false);
        txtrestaurantemailid.setEditable(false);
    } //To change body of generated methods, choose Tools | Templates.

    public void enableRestaurantEditing() {
         txtrestaurantid.setEditable(true);
        txtrestaurantphonenumber.setEditable(true);
        txtrestaurantname.setEditable(true);
        txtrestaurantaddress.setEditable(true);
        txtrestaurantzipcode.setEditable(true);
        txtrestaurantemailid.setEditable(true); //To change body of generated methods, choose Tools | Templates.
    }
    
}
