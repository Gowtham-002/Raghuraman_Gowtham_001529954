/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

    import Business.DeliveryMan.DeliveryMan ;
    import Business.DeliveryMan.DeliveryManDirectory ;
    import Business.EcoSystem ;
    import Business.Employee.Employee ;
    import Business.Role.DeliverManRole ;
    import Business.UserAccount.UserAccount ;
    import java.awt.CardLayout ;
    import java.awt.Component ;
    import javax.swing.JOptionPane ;
    import javax.swing.JPanel ;
/**
 *
 * @author gowth
 */
public class AddDeliveryExecutive extends javax.swing.JPanel {

    private final DeliveryManDirectory deliveryManDirectory;
    private final EcoSystem system;
    private final JPanel container;
    /**
     * Creates new form AddDeliveryExecutive
     */
    public AddDeliveryExecutive(JPanel container, EcoSystem system, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.deliveryManDirectory = deliveryManDirectory;
        this.system = system;
        this.container = container;
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
        txtdeliveryname = new javax.swing.JTextField();
        txtdeliveryusername = new javax.swing.JTextField();
        txtdeliverypassword = new javax.swing.JTextField();
        txtdeliveryemailid = new javax.swing.JTextField();
        txtdeliveryphonenumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btndeliveryexecutive = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Add Delivery Executive");

        jLabel2.setText("Delivery Exec Name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jLabel5.setText("Email ID:");

        jLabel6.setText("Phone Number:");

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btndeliveryexecutive.setText("Add Delivery Executive");
        btndeliveryexecutive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveryexecutiveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdeliveryname)
                                    .addComponent(txtdeliveryusername)
                                    .addComponent(txtdeliverypassword, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtdeliveryphonenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(txtdeliveryemailid)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(btndeliveryexecutive))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeliveryname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdeliveryemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdeliveryusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtdeliveryphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdeliverypassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btndeliveryexecutive))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeliveryexecutiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliveryexecutiveActionPerformed
        // TODO add your handling code here:
        String name = txtdeliveryname.getText();
        String phone = txtdeliveryphonenumber.getText();
        String username = txtdeliveryusername.getText();
        String password = txtdeliverypassword.getText();
        String email = txtdeliveryemailid.getText();
        
        if(name.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!system.checkValidPhoneFormat(phone))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        } 
        else if(!deliveryManDirectory.isPhoneUnique(phone)){
            JOptionPane.showMessageDialog(null, "Sorry! Delivery man with this phone already exists!");
        }
        else if(!deliveryManDirectory.isEmailUnique(email)){
            JOptionPane.showMessageDialog(null, "Sorry! Delivery man with this email already exists!");
        }
        else if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
        else{
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryMan.setName(name);
            deliveryMan.setPhoneNo(phone);
            deliveryMan.setEmail(email);
            deliveryManDirectory.addDeliveryExecutive(deliveryMan);
            system.setDeliveryManDirectory(deliveryManDirectory);
            Employee employee = system.getEmployeeDirectory().createEmployee(deliveryMan.getDeliveryId());
            
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new DeliverManRole());
            JOptionPane.showMessageDialog(null, "Delivery Man added!");
            clearAllFields();
        }
    }//GEN-LAST:event_btndeliveryexecutiveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        
         container.remove(this);
         Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryExecutive manageDeliveryJPanel = (ManageDeliveryExecutive) component;
        manageDeliveryJPanel.populateDeliveryManList();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btndeliveryexecutive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtdeliveryemailid;
    private javax.swing.JTextField txtdeliveryname;
    private javax.swing.JTextField txtdeliverypassword;
    private javax.swing.JTextField txtdeliveryphonenumber;
    private javax.swing.JTextField txtdeliveryusername;
    // End of variables declaration//GEN-END:variables

    public void clearAllFields() {
        txtdeliveryname.setText("");        
        txtdeliveryemailid.setText("");
        txtdeliverypassword.setText("");
        txtdeliveryphonenumber.setText("");
        txtdeliveryusername.setText("");//To change body of generated methods, choose Tools | Templates.
    }
}
