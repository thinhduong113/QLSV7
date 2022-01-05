/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.poly.app.ui;

import com.mycompany.poly.app.dao.KhoaHocDao;
import com.mycompany.poly.app.helpers.DataValidator;
import com.mycompany.poly.app.helpers.MessageDialogHelper;
import com.mycompany.poly.app.model.KhoaHoc;
import com.mycompany.poly.app.model.SinhVien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class KhoaHocManamentPanel extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tblModel1;
    private DefaultTableModel tblModel2;
    /**
     * Creates new form KhoaHocManamentPanel
     */
    public KhoaHocManamentPanel() {
        initComponents();
        
        initTable();
        initTableSinhVien();
        
        loadKhoaHoc();
    }

    private void initTable(){
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{
            "Mã Khóa Học", "Tên Khóa Học"
        });
        
        tblDanhSachKhoaHoc.setModel(tblModel1);
    }
    
    private void loadKhoaHoc(){
        try {
            KhoaHocDao dao = new KhoaHocDao();
            List<KhoaHoc> list = dao.finlAll();
            tblModel1.setRowCount(0);
            
            for(KhoaHoc kh : list){
                tblModel1.addRow(new Object[]{
                    kh.getMaKhoaHoc(), kh.getTenKhoaHoc()
                });
            }
            tblModel1.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    //Thông tin sinh viên thuộc lớp
    private void initTableSinhVien() {
        tblModel2 = new DefaultTableModel();
        tblModel2.setColumnIdentifiers(new String[]{
            "Mã Sinh Viên", "Họ Tên", "Mã Lớp Học", "Mã Khóa Học", "Email", "Số ĐT", "Giới Tính", "Địa Chỉ"
        });
        tblThongTinKhoaHoc.setModel(tblModel2);
    }

    private void loadDataToTableSV() {
        try {
            KhoaHocDao dao = new KhoaHocDao();
            List<SinhVien> list = dao.findStudentsInKhoaHoc(txtMaKhoaHocSearch.getText());
            tblModel2.setRowCount(0);
            for (SinhVien it : list) {
                tblModel2.addRow(new Object[]{
                    it.getMaSinhVien(), it.getHoTen(), it.getMaLopHoc(), it.getMaKhoaHoc(), 
                    it.getEmail(), it.getSoDT(),
                    it.getGioiTinh() == 1 ? "Nam" : "Nữ", it.getDiaChi()
                });
            }
            tblModel2.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaKhoaHoc = new javax.swing.JTextField();
        txtTenKhoaHoc = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachKhoaHoc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKhoaHocSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTinKhoaHoc = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Quản Lí Khóa Học");

        jLabel2.setText("Mã Khóa Học:");

        jLabel3.setText("Tên Khóa Học: ");

        txtTenKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhoaHocActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Save-icon.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-document-edit-icon-16.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("Làm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel5.setText("Danh Sách Khóa Học Hiện Có:");

        tblDanhSachKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDanhSachKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachKhoaHoc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(txtMaKhoaHoc)
                    .addComponent(txtTenKhoaHoc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setText("Nhập Mã Khóa Học: ");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/search-icon-24.png"))); // NOI18N
        btnSearch.setText("Tìm Kiếm");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setText("Thông Tin Khóa Học:");

        tblThongTinKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblThongTinKhoaHoc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearch))
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaKhoaHocSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaKhoaHocSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhoaHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhoaHocActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnAddActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaKhoaHoc, sb, "Mã Khóa cần phải nhập");
        DataValidator.validateEmpty(txtTenKhoaHoc, sb, "Tên Khóa cần phải nhập");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {

            KhoaHoc kh = new KhoaHoc();
            kh.setMaKhoaHoc(txtMaKhoaHoc.getText());
            kh.setTenKhoaHoc(txtTenKhoaHoc.getText());

            KhoaHocDao dao = new KhoaHocDao();
            if (dao.findByMaKhoaHoc(txtMaKhoaHoc.getText()) != null) {
                if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật khóa học hay không?", "Hỏi") == JOptionPane.NO_OPTION){
                    return;
                }
                if (dao.update(kh)) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Khóa học đã được cập nhật", "Thông bào");
                } else {
                    MessageDialogHelper.showMessageDialog(parentForm, "Không thể cập nhật khóa học", "Thông báo");
                }
            } else {
                if (dao.insert(kh)) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Khóa học đã được lưu", "Thông bào");
                } else {
                    MessageDialogHelper.showMessageDialog(parentForm, "Không thể lưu khóa học", "Thông báo");
                }
            }
            loadKhoaHoc();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(txtMaKhoaHoc.getText().equals("")){
                MessageDialogHelper.showErrorDialog(parentForm, "Mã khóa học cần phải nhập", "Lỗi");
                return;
            }
            
            KhoaHocDao dao = new KhoaHocDao();
            KhoaHoc kh = dao.findByMaKhoaHoc(txtMaKhoaHoc.getText());
            if(kh == null){
                MessageDialogHelper.showMessageDialog(parentForm, "Mã khóa học không tồn tại", "Lỗi");
                return;
            }
            
            if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa khóa học"
                    + " hay không", "Hỏi") == JOptionPane.NO_OPTION){
                return;
            }
            
            if(dao.deleteByMaKhoaHoc(txtMaKhoaHoc.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Khóa học đã được xóa", "Thông báo");
            }else{
                MessageDialogHelper.showMessageDialog(parentForm, "Khóa học không thể xóa được", "Thông báo");
            }
            loadKhoaHoc();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtMaKhoaHoc.setText("");
        txtTenKhoaHoc.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void tblDanhSachKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachKhoaHocMouseClicked
        try {
            int row = tblDanhSachKhoaHoc.getSelectedRow();

            if (row >= 0) {
                String id = (String) tblDanhSachKhoaHoc.getValueAt(row, 0);
                KhoaHocDao dao = new KhoaHocDao();
                KhoaHoc gv = dao.findByMaKhoaHoc(id);

                if (gv != null) {
                    txtMaKhoaHoc.setText(gv.getMaKhoaHoc());
                    txtTenKhoaHoc.setText(gv.getTenKhoaHoc());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                    e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblDanhSachKhoaHocMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        loadDataToTableSV();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblDanhSachKhoaHoc;
    private javax.swing.JTable tblThongTinKhoaHoc;
    private javax.swing.JTextField txtMaKhoaHoc;
    private javax.swing.JTextField txtMaKhoaHocSearch;
    private javax.swing.JTextField txtTenKhoaHoc;
    // End of variables declaration//GEN-END:variables
}
