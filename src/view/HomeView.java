/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author khacc
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public HomeView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnBookHR = new javax.swing.JButton();
        btnCheckin = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnBookService = new javax.swing.JButton();
        btnServicce = new javax.swing.JButton();
        btnCustumer = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnStatistical = new javax.swing.JButton();
        btnRooms = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRANG CHỦ");

        btnExit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBill.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBill.setText("HÓA ĐƠN");

        btnBookHR.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBookHR.setText("ĐẶT PHÒNG");
        btnBookHR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookHRActionPerformed(evt);
            }
        });

        btnCheckin.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCheckin.setText("CHECK IN");
        btnCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckinActionPerformed(evt);
            }
        });

        btnCheckOut.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCheckOut.setText("CHECK OUT ");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });

        btnBookService.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnBookService.setText("ĐẶT DỊCH VỤ");

        btnServicce.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnServicce.setText("DỊCH VỤ");

        btnCustumer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnCustumer.setText("THÔNG TIN KHÁCH HÀNG");

        btnEmployee.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnEmployee.setText("THÔNG TIN NHÂN VIÊN");

        btnStatistical.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnStatistical.setText("THỐNG KÊ");

        btnRooms.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnRooms.setText("PHÒNG KHÁCH SẠN");
        btnRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBookHR, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheckOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(btnRooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustumer, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBookService, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnServicce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBill, btnBookHR, btnBookService, btnCheckOut, btnCheckin, btnCustumer, btnEmployee, btnRooms, btnServicce, btnStatistical});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookHR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnServicce, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnBookService, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustumer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBill, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(btnStatistical, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBill, btnCheckOut, btnEmployee, btnServicce});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn thoát");
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBookHRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookHRActionPerformed
        this.dispose();
        new BookHotelRoomView().setVisible(true);
    }//GEN-LAST:event_btnBookHRActionPerformed

    private void btnCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckinActionPerformed
         this.dispose();     
        new CheckInView().setVisible(true);
    }//GEN-LAST:event_btnCheckinActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        this.dispose();
        new CheckOutView().setVisible(true);
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomsActionPerformed
        this.dispose();
        new HotelRoomView().setVisible(true);
    }//GEN-LAST:event_btnRoomsActionPerformed

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnBookHR;
    private javax.swing.JButton btnBookService;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnCheckin;
    private javax.swing.JButton btnCustumer;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRooms;
    private javax.swing.JButton btnServicce;
    private javax.swing.JButton btnStatistical;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
