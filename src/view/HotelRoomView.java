/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//import java.util.HashSet;
import controller.HotelRoomDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HotelRoom;
import java.sql.ResultSet;
/**
 *
 * @author HP
 */


public class HotelRoomView extends javax.swing.JFrame {
    ResultSet result;
    
    private ArrayList<HotelRoom> list;
    DefaultTableModel model;
    private int selectedIndex;
    /**
     * Creates new form HotelRoom
     */
    public HotelRoomView() {
        initComponents();
        this.setLocationRelativeTo(null);
        HotelRoomDAO hotelRoomsDAO = new HotelRoomDAO();
        list = hotelRoomsDAO.getListRoom();
        model =  (DefaultTableModel) tblRoom.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT","ID","Name","Type","Bed","Price"
        });
        showTable();
    }
    
    public void showTable(){
        int i = 1;
        for(HotelRoom r: list)
        {            
            model.addRow(new Object[]{
            i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
        });
    }
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
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtType = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBed = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRoom = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();
        tbnReset = new javax.swing.JButton();
        cbbSX = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HotelRoom");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Mã Phòng:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Tên Phòng:");

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Loại Phòng:");

        txtType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTypeMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Số giường:");

        txtBed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBedMouseClicked(evt);
            }
        });

        txtPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPriceMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Giá Phòng(/đêm):");

        add.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        add.setText("Thêm Mới");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        edit.setText("Chỉnh Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        delete.setText("Xóa");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thông Tin Phòng Khách Sạn");
        jLabel6.setToolTipText("");
        jLabel6.setOpaque(true);

        tblRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblRoom);

        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        update.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        update.setText("Cập Nhật");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        Exit.setText("Về Trang Chủ");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        btnTK.setText("Tìm Kiếm");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        tbnReset.setText("ResetTable");
        tbnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnResetActionPerformed(evt);
            }
        });

        cbbSX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Từ thấp đến cao", "Từ cao đến thấp", "Số giường", "Giá phòng", "Loại phòng" }));
        cbbSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSXActionPerformed(evt);
            }
        });

        jLabel7.setText("SẮP XẾP THEO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add)
                                .addGap(18, 18, 18)
                                .addComponent(delete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edit)
                                .addGap(18, 18, 18)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tbnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbSX, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTK)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tbnReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cbbSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtBed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(delete)
                            .addComponent(edit)
                            .addComponent(update)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
       HotelRoomDAO hotelRoomsDAO = new HotelRoomDAO();
       if(txtID.getText().equals("") ||txtName.getText().equals("") ||txtType.getText().equals("") ||
               txtBed.getText().equals("") ||txtPrice.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Ban can nhap day du du lieu!!");
       }
        else{ 
            HotelRoom r = new HotelRoom();
            r.setID(txtID.getText());
            r.setName(txtName.getText());
            r.setType(txtType.getText());
            r.setNumberBed(Integer.parseInt(txtBed.getText()));
            r.setPrice(Float.parseFloat(txtPrice.getText())); 
            if(hotelRoomsDAO.addRoom(r)){
                JOptionPane.showMessageDialog(rootPane, "Add Success!");
                list.add(r);
            }else
            {
                JOptionPane.showMessageDialog(rootPane, "Add Fail!");
            }       
            showResult();
       }
    }//GEN-LAST:event_addActionPerformed
        
    public void showResult(){
        model.setRowCount(0);   
        int i = 1;     
        for(HotelRoom r : list){
            model.addRow(new Object[]{
                i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
            });
        }
    }
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
  
        HotelRoomDAO hotelRoomsDAO = new HotelRoomDAO();  
        String id = tblRoom.getValueAt(tblRoom.getSelectedRow(),1).toString();
        hotelRoomsDAO.deleteRoom(id);
        int DelIndex = tblRoom.getSelectedRow(); 
        list.remove(DelIndex);
        showResult();     
        JOptionPane.showMessageDialog(rootPane, "Delete Success!");        
    
    }//GEN-LAST:event_deleteActionPerformed
//
    private void clearAllFields()
    {
        HotelRoom r  = new HotelRoom();
        txtID.setText("");
        txtName.setText("");
        txtType.setText("");
        txtBed.setText("");
        txtPrice.setText("");
        tblRoom.clearSelection();
        
    }
    
    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTypeMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtTypeMouseClicked

    private void txtBedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBedMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtBedMouseClicked

    private void txtPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPriceMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtPriceMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:        
        HotelRoom roomSelect = new HotelRoom();      
        selectedIndex = tblRoom.getSelectedRow();
        roomSelect = list.get(selectedIndex);     
        txtID.setText(roomSelect.getID());
        txtName.setText(roomSelect.getName());
        txtType.setText(roomSelect.getType());
        txtBed.setText(String.valueOf(roomSelect.getNumberBed()));
        txtPrice.setText(String.valueOf(roomSelect.getPrice()));      
        showResult();
    }//GEN-LAST:event_editActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        HotelRoomDAO hotelRoomsDAO = new HotelRoomDAO(); 
        HotelRoom r = new HotelRoom();
        r.setID(txtID.getText());
        r.setName(txtName.getText());
        r.setType(txtType.getText());
        r.setNumberBed(Integer.parseInt(txtBed.getText()));
        r.setPrice(Float.parseFloat(txtPrice.getText())); 
        hotelRoomsDAO.editRoom(r, txtID.getText());
        JOptionPane.showMessageDialog(rootPane, "Update Success!");        
        list.clear();
        list = hotelRoomsDAO.getListRoom();
        showResult();
        //reset text field
        txtID.setText("");
        txtName.setText("");
        txtType.setText("");
        txtBed.setText("");
        txtPrice.setText(""); 
        
    }//GEN-LAST:event_updateActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(rootPane, "Bạn có chắc chắn muốn về trang chủ");
        this.dispose();
        HomeView home = new HomeView();
        home.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private ArrayList<HotelRoom> listTK;
    public void showResultTK(){
        model.setRowCount(0);   
        int i = 1;     
        for(HotelRoom r : listTK){
            model.addRow(new Object[]{
                i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
            });
        }
    }
    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        HotelRoomDAO hotelRoomsDAO = new HotelRoomDAO();               
            HotelRoom r = new HotelRoom();
            listTK = hotelRoomsDAO.getListTKRoom(txtID.getText(),txtType.getText(),txtBed.getText());
            showResultTK();
        
    }//GEN-LAST:event_btnTKActionPerformed

    private void tbnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnResetActionPerformed
        // TODO add your handling code here:
        showResult();
    }//GEN-LAST:event_tbnResetActionPerformed

    private ArrayList<HotelRoom> list1,list2,list3,list4;
    private void cbbSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSXActionPerformed
        // TODO add your handling code here:
         HotelRoomDAO SXDAO = new HotelRoomDAO(); 
        int index =  cbbSX.getSelectedIndex();
        //System.out.println(" index = "+ index);
        if(index == 0)
        {
            showResult();
        }
        else if(index == 1)
        {
            list1 = SXDAO.getListCBBSX1();
            model.setRowCount(0);   
            int i = 1;     
            for(HotelRoom r : list1){
                model.addRow(new Object[]{
                    i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
                });
            }
        }
        else if(index == 2)
        {
            list2 = SXDAO.getListCBBSX2();
            model.setRowCount(0);   
            int i = 1;     
            for(HotelRoom r : list2){
                model.addRow(new Object[]{
                    i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
                });
                }
        }
        else if(index == 3)
        {
            list3 = SXDAO.getListCBBSX3();
            model.setRowCount(0);   
            int i = 1;     
            for(HotelRoom r : list3){
                model.addRow(new Object[]{
                    i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
                });
                }
            }
        else if(index == 4)
        {
            list4 = SXDAO.getListCBBSX4();
            model.setRowCount(0);   
            int i = 1;     
            for(HotelRoom r : list4){
                model.addRow(new Object[]{
                    i++, r.getID(), r.getName(), r.getType(), r.getNumberBed(), r.getPrice()
                });
                }
            }
    }//GEN-LAST:event_cbbSXActionPerformed

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
            java.util.logging.Logger.getLogger(HotelRoomView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelRoomView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelRoomView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelRoomView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelRoomView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton add;
    private javax.swing.JButton btnTK;
    private javax.swing.JComboBox<String> cbbSX;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRoom;
    private javax.swing.JButton tbnReset;
    private javax.swing.JTextField txtBed;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtType;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
