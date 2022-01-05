/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.poly.app.ui;

import com.mycompany.poly.app.dao.LopHocDao;
import com.mycompany.poly.app.helpers.DataValidator;
import com.mycompany.poly.app.helpers.MessageDialogHelper;
import com.mycompany.poly.app.model.GiangVien;
import com.mycompany.poly.app.model.LopHoc;
import com.mycompany.poly.app.model.SinhVien;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ClassManamentPanel extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tblModel1;
    private DefaultTableModel tblModel2;
    private DefaultTableModel tblModel3;
    /**
     * Creates new form LopHoc
     */
    public ClassManamentPanel() {
        initComponents();
        
        initTable();
        initTableGiangVien();
        initTableSinhVien();
        
        loadLopHoc();
    }

    private void initTable(){
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{
            "Mã Lớp Học", "Tên Lớp Học"
        });
        
        tblDanhSachMaLop.setModel(tblModel1);
    }
    
    private void loadLopHoc(){
        try {
            LopHocDao dao = new LopHocDao();
            List<LopHoc> list = dao.finlAll();
            tblModel1.setRowCount(0);
            
            for(LopHoc lh : list){
                tblModel1.addRow(new Object[]{
                    lh.getMaLopHoc(), lh.getTenLopHoc()
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
        tblThongTinSinhVien.setModel(tblModel2);
    }

    private void loadDataToTableSV() {
        try {
            LopHocDao dao = new LopHocDao();
            List<SinhVien> list = dao.findStudentsInClass(txtMaLopSearch.getText());
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
    
    // Thông tin giảng viên của lớp
    private void initTableGiangVien() {
        tblModel3 = new DefaultTableModel();
        tblModel3.setColumnIdentifiers(new String[]{
            "Mã Giảng Viên", "Họ Tên", "Mã Lớp Dạy", "Email", "Số ĐT", "Giới Tính", "Địa Chỉ"
        });
        tblThongTinGiangVien.setModel(tblModel3);
    }

    private void loadDataToTableGV() {
        try {
            LopHocDao dao = new LopHocDao();
            List<GiangVien> list = dao.findTeachersInClass(txtMaLopSearch.getText());
            tblModel3.setRowCount(0);
            for (GiangVien it : list) {
                tblModel3.addRow(new Object[]{
                    it.getMaGiangVien(), it.getMaLopHoc(), it.getHoTen(), it.getEmail(), it.getSoDT(),
                    it.getGioiTinh() == 1 ? "Nam" : "Nữ", it.getDiaChi()
                });
            }
            tblModel3.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDanhSachMaLop = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtMaLop = new javax.swing.JTextField();
        txtTenLopHoc = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnNew = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThongTinGiangVien = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtMaLopSearch = new javax.swing.JTextField();
        btnMLH_search = new javax.swing.JButton();
        lblTenLopSearch = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThongTinSinhVien = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Quản Lí Lớp Học");

        tblDanhSachMaLop.setModel(new javax.swing.table.DefaultTableModel(
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
        tblDanhSachMaLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachMaLopMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDanhSachMaLop);

        jLabel7.setText("Danh Sách Mã Lớp:");

        jLabel3.setText("Mã Lớp:");

        jLabel4.setText("Tên Lớp:");

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

        txtMaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLopActionPerformed(evt);
            }
        });

        txtTenLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenLopHocActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/new-icon-16.png"))); // NOI18N
        btnNew.setText("Làm Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaLop)
                    .addComponent(txtTenLopHoc)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tblThongTinGiangVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblThongTinGiangVien);

        jLabel5.setText("Nhập Mã Lớp Học:");

        btnMLH_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/search-icon-16.png"))); // NOI18N
        btnMLH_search.setText("Tìm Kiếm");
        btnMLH_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMLH_searchActionPerformed(evt);
            }
        });

        tblThongTinSinhVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblThongTinSinhVien);

        jLabel10.setText("Thông tin giảng viên:");

        jLabel11.setText("Thông tin sinh viên:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaLopSearch)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTenLopSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(420, 420, 420))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnMLH_search))
                            .addComponent(jSeparator3))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLopSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMLH_search)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblTenLopSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMLH_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMLH_searchActionPerformed
        loadDataToTableGV();
        loadDataToTableSV();
    }//GEN-LAST:event_btnMLH_searchActionPerformed

    private void txtMaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLopActionPerformed

    private void txtTenLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenLopHocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenLopHocActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaLop, sb, "Mã lớp cần phải nhập");
        DataValidator.validateEmpty(txtTenLopHoc, sb, "Tên lớp cần phải nhập");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {

            LopHoc lh = new LopHoc();
            lh.setMaLopHoc(txtMaLop.getText());
            lh.setTenLopHoc(txtTenLopHoc.getText());

            LopHocDao dao = new LopHocDao();
            if (dao.findByMaLopHoc(txtMaLop.getText()) != null) {
                if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật lớp học hay không?", "Hỏi") == JOptionPane.NO_OPTION){
                    return;
                }
                if (dao.update(lh)) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Lớp học đã được cập nhật", "Thông bào");
                } else {
                    MessageDialogHelper.showMessageDialog(parentForm, "Không thể cập nhật Lớp học", "Thông báo");
                }
            } else {
                if (dao.insert(lh)) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Lớp học đã được lưu", "Thông bào");
                } else {
                    MessageDialogHelper.showMessageDialog(parentForm, "Không thể lưu lớp học", "Thông báo");
                }
            }
            loadLopHoc();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtMaLop.setText("");
        txtTenLopHoc.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnAddActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(txtMaLop.getText().equals("")){
                MessageDialogHelper.showErrorDialog(parentForm, "Mã lớp học cần phải nhập", "Lỗi");
                return;
            }
            
            LopHocDao dao = new LopHocDao();
            LopHoc lh = dao.findByMaLopHoc(txtMaLop.getText());
            if(lh == null){
                MessageDialogHelper.showMessageDialog(parentForm, "Mã lớp học không tồn tại", "Lỗi");
                return;
            }
            
            if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa lớp học"
                    + " hay không", "Hỏi") == JOptionPane.NO_OPTION){
                return;
            }
            
            if(dao.deleteByMaLopHoc(txtMaLop.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Lớp học  đã được xóa", "Thông báo");
            }else{
                MessageDialogHelper.showMessageDialog(parentForm, "Lớp học không thể xóa được", "Thông báo");
            }
            loadLopHoc();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblDanhSachMaLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachMaLopMouseClicked
        try {
            int row = tblDanhSachMaLop.getSelectedRow();

            if (row >= 0) {
                String id = (String) tblDanhSachMaLop.getValueAt(row, 0);
                LopHocDao dao = new LopHocDao();
                LopHoc gv = dao.findByMaLopHoc(id);

                if (gv != null) {
                    txtMaLop.setText(gv.getMaLopHoc());
                    txtTenLopHoc.setText(gv.getTenLopHoc());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                    e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblDanhSachMaLopMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMLH_search;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblTenLopSearch;
    private javax.swing.JTable tblDanhSachMaLop;
    private javax.swing.JTable tblThongTinGiangVien;
    private javax.swing.JTable tblThongTinSinhVien;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtMaLopSearch;
    private javax.swing.JTextField txtTenLopHoc;
    // End of variables declaration//GEN-END:variables
}
