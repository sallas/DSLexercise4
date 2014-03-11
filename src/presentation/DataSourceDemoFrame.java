/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.Controller;
import domain.Order;

/**
 *
 * @author jekm
 */
public class DataSourceDemoFrame extends javax.swing.JFrame {

    /**
     * Creates new form DataSourceDemoFrame
     */
    private Controller c = new Controller();

    public DataSourceDemoFrame() {
        initComponents();
    }
    
    private void clearOrderFields()
	  {
	    jTextFieldOrderNo.setText("");
	    jTextFieldCustomerNo.setText("");
	    jTextFieldEmplNo.setText("");
	    jTextFieldProductNo.setText("");
	    jTextFieldQuantity.setText("");
	    jTextAreaOrderDetails.setText("");
	    jLabelStatus.setText("");
	  }
	  private void clearOrderDetailFields()
	  {
	    jTextFieldProductNo.setText("");
	    jTextFieldQuantity.setText(""); 
	    jLabelStatus.setText("");
	  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelOrderNo = new javax.swing.JLabel();
        jLabelCustomerNo = new javax.swing.JLabel();
        jLabelEmployeeNo = new javax.swing.JLabel();
        jLabelOrderDetails = new javax.swing.JLabel();
        jLabelProductNo = new javax.swing.JLabel();
        jLabelQuantity = new javax.swing.JLabel();
        jTextFieldOrderNo = new javax.swing.JTextField();
        jTextFieldCustomerNo = new javax.swing.JTextField();
        jTextFieldEmplNo = new javax.swing.JTextField();
        jTextFieldProductNo = new javax.swing.JTextField();
        jTextFieldQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOrderDetails = new javax.swing.JTextArea();
        jButtonGetOrder = new javax.swing.JButton();
        jButtonNewOrder = new javax.swing.JButton();
        jButtonNewOrderdetail = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelOrderNo.setText("Order No");

        jLabelCustomerNo.setText("Customer No");

        jLabelEmployeeNo.setText("Employee No");

        jLabelOrderDetails.setText("Order Details");

        jLabelProductNo.setText("Product No");

        jLabelQuantity.setText("Quantity");

        jTextFieldOrderNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOrderNoActionPerformed(evt);
            }
        });

        jTextAreaOrderDetails.setColumns(20);
        jTextAreaOrderDetails.setRows(5);
        jScrollPane1.setViewportView(jTextAreaOrderDetails);

        jButtonGetOrder.setText("Get Order");
        jButtonGetOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGetOrderActionPerformed(evt);
            }
        });

        jButtonNewOrder.setText("New Order");
        jButtonNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewOrderActionPerformed(evt);
            }
        });

        jButtonNewOrderdetail.setText("New Order Detail");
        jButtonNewOrderdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewOrderdetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEmployeeNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelCustomerNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelOrderNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelProductNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldCustomerNo)
                                            .addComponent(jTextFieldEmplNo))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonNewOrder))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonGetOrder)))
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jTextFieldProductNo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonNewOrderdetail)
                                .addGap(51, 51, 51))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelOrderNo)
                    .addComponent(jTextFieldOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGetOrder))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCustomerNo)
                    .addComponent(jTextFieldCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewOrder))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmployeeNo)
                            .addComponent(jTextFieldEmplNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabelOrderDetails))
                    .addComponent(jLabelStatus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantity)
                    .addComponent(jTextFieldQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewOrderdetail))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldOrderNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOrderNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOrderNoActionPerformed

    private void jButtonGetOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetOrderActionPerformed
        int ono = Integer.parseInt(jTextFieldOrderNo.getText());
        clearOrderFields();
        Order o = c.getOrder(ono);
        if (o != null) {
            jTextFieldOrderNo.setText(o.getOno() + "");
            jTextFieldCustomerNo.setText(o.getCustomerNo() + "");
            jTextFieldEmplNo.setText(o.getEmployeeNo() + "");
            jTextAreaOrderDetails.setText(c.getOrderDetailsToString() + "");
        } else {
            jLabelStatus.setText("No matching order!");
        }

    }//GEN-LAST:event_jButtonGetOrderActionPerformed

    private void jButtonNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewOrderActionPerformed
        int cno = Integer.parseInt(jTextFieldCustomerNo.getText());
				    int eno = Integer.parseInt(jTextFieldEmplNo.getText());
				    clearOrderFields();
				    Order o = c.createNewOrder(cno, eno, null, null);
				    if (o != null)
				    {
				      jTextFieldOrderNo.setText(o.getOno() + "");
				      jTextFieldCustomerNo.setText(o.getCustomerNo() + "");
				      jTextFieldEmplNo.setText(o.getEmployeeNo() + "");
				      jLabelStatus.setText("New order created");
				    }
				    else
				      jLabelStatus.setText("No order created!");
    }//GEN-LAST:event_jButtonNewOrderActionPerformed

    private void jButtonNewOrderdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewOrderdetailActionPerformed
        	int partNo   = Integer.parseInt(jTextFieldProductNo.getText());
				    int quantity = Integer.parseInt(jTextFieldQuantity.getText());
				    clearOrderDetailFields();
				    boolean status = c.addOrderDetail(partNo, quantity);
				    if (status)
				    {
				      jTextAreaOrderDetails.setText(c.getOrderDetailsToString() + "");
				      jLabelStatus.setText("Order detail inserted");
				    }
				    else
				      jLabelStatus.setText("Order detail not inserted");
    }//GEN-LAST:event_jButtonNewOrderdetailActionPerformed
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
            java.util.logging.Logger.getLogger(DataSourceDemoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSourceDemoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSourceDemoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSourceDemoFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSourceDemoFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGetOrder;
    private javax.swing.JButton jButtonNewOrder;
    private javax.swing.JButton jButtonNewOrderdetail;
    private javax.swing.JLabel jLabelCustomerNo;
    private javax.swing.JLabel jLabelEmployeeNo;
    private javax.swing.JLabel jLabelOrderDetails;
    private javax.swing.JLabel jLabelOrderNo;
    private javax.swing.JLabel jLabelProductNo;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaOrderDetails;
    private javax.swing.JTextField jTextFieldCustomerNo;
    private javax.swing.JTextField jTextFieldEmplNo;
    private javax.swing.JTextField jTextFieldOrderNo;
    private javax.swing.JTextField jTextFieldProductNo;
    private javax.swing.JTextField jTextFieldQuantity;
    // End of variables declaration//GEN-END:variables
}
