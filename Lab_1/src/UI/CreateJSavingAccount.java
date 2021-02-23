/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import Model.BankAccountInfo;
import Model.ViewReport;
import javax.swing.JOptionPane;
/**
 *
 * @author gowth
 */
public class CreateJSavingAccount extends javax.swing.JPanel {

    BankAccountInfo savingsaccountinfo;
    BankAccountInfo checkingsaccountinfo;
    ViewReport viewreport;
    /**
     * Creates new form CreateJSavingAccount
     * @param savingsaccountinfo
     */
    public CreateJSavingAccount(BankAccountInfo savingsaccountinfo,BankAccountInfo checkingsaccountinfo,ViewReport viewreport) {
        initComponents();
        this.savingsaccountinfo =  savingsaccountinfo;
        this.checkingsaccountinfo = checkingsaccountinfo;
        this.viewreport = viewreport;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsavingbankname = new javax.swing.JTextField();
        txtsavingbankroutingnumber = new javax.swing.JTextField();
        txtsavingbankaccountnumber = new javax.swing.JTextField();
        txtsavingaccountbalance = new javax.swing.JTextField();
        btnsavingbanksave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtcheckingbankname = new javax.swing.JTextField();
        txtcheckingbankroutingnumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcheckingbankaccountnumber = new javax.swing.JTextField();
        txtcheckingaccountbalance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setText("Savings Account Information");

        jLabel2.setText("Bank Name:");

        jLabel3.setText("Bank Account Number:");

        jLabel4.setText("Bank Routing Number:");

        jLabel6.setText("Account Balance:");

        txtsavingbankname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsavingbanknameActionPerformed(evt);
            }
        });

        btnsavingbanksave.setText("Save");
        btnsavingbanksave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavingbanksaveActionPerformed(evt);
            }
        });

        jLabel8.setText("Bank Name:");

        txtcheckingbankname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckingbanknameActionPerformed(evt);
            }
        });

        txtcheckingbankroutingnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckingbankroutingnumberActionPerformed(evt);
            }
        });

        jLabel9.setText("Bank Routing Number:");

        jLabel10.setText("Bank Account Number:");

        jLabel11.setText("Account Balance:        ");

        txtcheckingbankaccountnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckingbankaccountnumberActionPerformed(evt);
            }
        });

        txtcheckingaccountbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcheckingaccountbalanceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel12.setText("Checkings Account Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcheckingaccountbalance)
                            .addComponent(txtcheckingbankaccountnumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcheckingbankroutingnumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcheckingbankname, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtsavingbankroutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(25, 25, 25)
                                            .addComponent(txtsavingbankname, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtsavingbankaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(txtsavingaccountbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(177, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnsavingbanksave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsavingbankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsavingbankroutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsavingbankaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsavingaccountbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcheckingbankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcheckingbankroutingnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcheckingbankaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcheckingaccountbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnsavingbanksave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsavingbanknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsavingbanknameActionPerformed
    
     
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsavingbanknameActionPerformed

    private void btnsavingbanksaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavingbanksaveActionPerformed
     savingsaccountinfo.setBankName(txtsavingbankname.getText());
     savingsaccountinfo.setBankRoutingNumber(txtsavingbankroutingnumber.getText());
     savingsaccountinfo.setBankAccountNumber(txtsavingbankaccountnumber.getText());
     savingsaccountinfo.setAccountBalance(txtsavingaccountbalance.getText());
     
     //viewreport.setBankaccount(savingsaccountinfo);
     
     checkingsaccountinfo.setBankName(txtcheckingbankname.getText());
     checkingsaccountinfo.setBankRoutingNumber(txtcheckingbankroutingnumber.getText());
     checkingsaccountinfo.setBankAccountNumber(txtcheckingbankaccountnumber.getText());
     checkingsaccountinfo.setAccountBalance(txtcheckingaccountbalance.getText());
     
      viewreport.setBankaccount_chk(checkingsaccountinfo);
      viewreport.setBankaccount(savingsaccountinfo);
     
     JOptionPane.showMessageDialog(this,"Savings Account Information is Saved");  // TODO add your handling code here:
    }//GEN-LAST:event_btnsavingbanksaveActionPerformed

    private void txtcheckingbanknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckingbanknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckingbanknameActionPerformed

    private void txtcheckingbankroutingnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckingbankroutingnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckingbankroutingnumberActionPerformed

    private void txtcheckingbankaccountnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckingbankaccountnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckingbankaccountnumberActionPerformed

    private void txtcheckingaccountbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcheckingaccountbalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcheckingaccountbalanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsavingbanksave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcheckingaccountbalance;
    private javax.swing.JTextField txtcheckingbankaccountnumber;
    private javax.swing.JTextField txtcheckingbankname;
    private javax.swing.JTextField txtcheckingbankroutingnumber;
    private javax.swing.JTextField txtsavingaccountbalance;
    private javax.swing.JTextField txtsavingbankaccountnumber;
    private javax.swing.JTextField txtsavingbankname;
    private javax.swing.JTextField txtsavingbankroutingnumber;
    // End of variables declaration//GEN-END:variables
}