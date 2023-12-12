/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public Test() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_header = new javax.swing.JPanel();
        jPanel_buttons = new javax.swing.JPanel();
        jButton_cong = new javax.swing.JButton();
        jButton_tru = new javax.swing.JButton();
        jButton_nhan = new javax.swing.JButton();
        jButton_chia = new javax.swing.JButton();
        jPanel_center = new javax.swing.JPanel();
        jTextField_a = new javax.swing.JTextField();
        jLabel_a = new javax.swing.JLabel();
        jLabel_b = new javax.swing.JLabel();
        jTextField_b = new javax.swing.JTextField();
        jLabel_result = new javax.swing.JLabel();
        jTextField_result = new javax.swing.JTextField();
        jLabel_header = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_header.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel_header, java.awt.BorderLayout.PAGE_START);

        jPanel_buttons.setLayout(new java.awt.GridLayout(1, 4));

        jButton_cong.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton_cong.setText("+");
        jButton_cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_congActionPerformed(evt);
            }
        });
        jPanel_buttons.add(jButton_cong);

        jButton_tru.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton_tru.setText("-");
        jButton_tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_truActionPerformed(evt);
            }
        });
        jPanel_buttons.add(jButton_tru);

        jButton_nhan.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton_nhan.setText("x");
        jButton_nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nhanActionPerformed(evt);
            }
        });
        jPanel_buttons.add(jButton_nhan);

        jButton_chia.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton_chia.setText("/");
        jButton_chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_chiaActionPerformed(evt);
            }
        });
        jPanel_buttons.add(jButton_chia);

        getContentPane().add(jPanel_buttons, java.awt.BorderLayout.PAGE_END);

        jTextField_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_aActionPerformed(evt);
            }
        });

        jLabel_a.setText("Nhập vào a:");

        jLabel_b.setText("Nhập vào b:");

        jLabel_result.setText("Kết quả:");

        jLabel_header.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_header.setText("CHƯƠNG TRÌNH MÁY TÍNH ĐƠN GIẢN");

        javax.swing.GroupLayout jPanel_centerLayout = new javax.swing.GroupLayout(jPanel_center);
        jPanel_center.setLayout(jPanel_centerLayout);
        jPanel_centerLayout.setHorizontalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_a)
                    .addComponent(jTextField_b)
                    .addComponent(jTextField_result)))
            .addGroup(jPanel_centerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_header, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel_centerLayout.setVerticalGroup(
            jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_centerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_header)
                .addGap(18, 18, 18)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_a))
                .addGap(18, 18, 18)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_b)
                    .addComponent(jTextField_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel_centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_result)
                    .addComponent(jTextField_result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel_center, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_aActionPerformed

    private void jButton_nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nhanActionPerformed
        try {
            Double a = Double.valueOf(this.jTextField_a.getText());
            Double b = Double.valueOf(this.jTextField_b.getText());
            Double result = a * b;
            this.jTextField_result.setText(result + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn nhập vào sai kiểu dữ liệu", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_nhanActionPerformed

    private void jButton_chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_chiaActionPerformed
        try {
            Double a = Double.valueOf(this.jTextField_a.getText());
            Double b = Double.valueOf(this.jTextField_b.getText());
            Double result = a / b;
            this.jTextField_result.setText(result + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn nhập vào sai kiểu dữ liệu", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_chiaActionPerformed

    private void jButton_congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_congActionPerformed
        try {
            Double a = Double.valueOf(this.jTextField_a.getText());
            Double b = Double.valueOf(this.jTextField_b.getText());
            Double result = a + b;
            this.jTextField_result.setText(result + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn nhập vào sai kiểu dữ liệu", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_congActionPerformed

    private void jButton_truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_truActionPerformed
        try {
            Double a = Double.valueOf(this.jTextField_a.getText());
            Double b = Double.valueOf(this.jTextField_b.getText());
            Double result = a - b;
            this.jTextField_result.setText(result + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bạn nhập vào sai kiểu dữ liệu", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton_truActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_chia;
    private javax.swing.JButton jButton_cong;
    private javax.swing.JButton jButton_nhan;
    private javax.swing.JButton jButton_tru;
    private javax.swing.JLabel jLabel_a;
    private javax.swing.JLabel jLabel_b;
    private javax.swing.JLabel jLabel_header;
    private javax.swing.JLabel jLabel_result;
    private javax.swing.JPanel jPanel_buttons;
    private javax.swing.JPanel jPanel_center;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JTextField jTextField_a;
    private javax.swing.JTextField jTextField_b;
    private javax.swing.JTextField jTextField_result;
    // End of variables declaration//GEN-END:variables
}
