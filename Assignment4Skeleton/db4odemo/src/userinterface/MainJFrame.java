/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.EmployeeDirectory;

import Business.Organization;
import Business.Order.*;
import Business.Menu.*;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Gowtham
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
     private final EcoSystem system;
    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private final CustomerDirectory customerDirectory;
    private final RestaurantDirectory restaurantDirectory;
    private final DeliveryManDirectory deliveryManDirectory;
    private final EmployeeDirectory employeeDirectory;
    private final MenuDirectory menuDirectory;
    private final OrderDirectory orderDirectory;

    public MainJFrame() throws IOException {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        if(system.getMenuDirectory() == null)
        {           
            this.menuDirectory = new MenuDirectory();

        } else {
            this.menuDirectory = system.getMenuDirectory();
        }
        if (system.getCustomerDirectory() == null) {
            this.customerDirectory = new CustomerDirectory();

        } else {
            this.customerDirectory = system.getCustomerDirectory();
        }
        if (system.getRestaurantDirectory() == null) {
            this.restaurantDirectory = new RestaurantDirectory();

        } else {
            this.restaurantDirectory = system.getRestaurantDirectory();
        }
        if (system.getDeliveryManDirectory() == null) {
            deliveryManDirectory = new DeliveryManDirectory();

        } else {
            this.deliveryManDirectory = system.getDeliveryManDirectory();
        }
        if (system.getOrderDirectory() == null) {
            orderDirectory = new OrderDirectory();

        } else {
            this.orderDirectory = system.getOrderDirectory();
        }
        if (system.getEmployeeDirectory() == null) {
            employeeDirectory = new EmployeeDirectory();

        } else {
            this.employeeDirectory = system.getEmployeeDirectory();
        }
        
        
     File f = new File("Images/zomato.jpg");
JLabel imgLabel = new JLabel(new ImageIcon(f.getName()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        textusername = new javax.swing.JTextField();
        textpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cardlayout = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(200, 450));

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        textusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textusernameActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        btnlogout.setText("Logout");
        btnlogout.setEnabled(false);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Login Credentials");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textusername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginJLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin)
                    .addComponent(btnlogout))
                .addGap(37, 37, 37)
                .addComponent(loginJLabel)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        cardlayout.setBackground(new java.awt.Color(153, 255, 255));
        cardlayout.setLayout(new java.awt.CardLayout());
        cardlayout.add(jLabel4, "card2");

        jSplitPane1.setRightComponent(cardlayout);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        btnlogout.setEnabled(false);
        textusername.setEnabled(true);
        textpassword.setEnabled(true);
        btnlogin.setEnabled(true);

        textusername.setText("");
        textpassword.setText("");

        cardlayout.removeAll();
        JPanel blankJP = new JPanel();
        cardlayout.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) cardlayout.getLayout();
        crdLyt.next(cardlayout);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // Get Application user name
        String userName = textusername.getText();
        // Get Application Password
        char[] passwordCharArray = textpassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        if (userAccount != null) {
            CardLayout layout = (CardLayout) cardlayout.getLayout();
            cardlayout.add("GetUserWorkArea", userAccount.getRole().createWorkArea(cardlayout, userAccount, system, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory));
            layout.next(cardlayout);
            textusername.setText("");
            textpassword.setText("");
            btnlogout.setEnabled(true);
            textusername.setEnabled(false);
            textpassword.setEnabled(false);
            btnlogin.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Entered Username or password is incorrect. Please try again.");
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void textusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textusernameActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainJFrame frame = new MainJFrame();
                    frame.dispose();
                    frame.setSize(1200, 650);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel cardlayout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField textpassword;
    private javax.swing.JTextField textusername;
    // End of variables declaration//GEN-END:variables
}
