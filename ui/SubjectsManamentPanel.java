/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.poly.app.ui;

import com.mycompany.poly.app.dao.MonHocDao;
import com.mycompany.poly.app.helpers.DataValidator;
import com.mycompany.poly.app.helpers.MessageDialogHelper;
import com.mycompany.poly.app.model.MonHoc;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class SubjectsManamentPanel extends javax.swing.JPanel {
    private MainForm parentForm;
    private DefaultTableModel tblModel1;
    /**
     * Creates new form SubjectsManamentPanel
     */
    public SubjectsManamentPanel() {
        initComponents();
        
        initTable();
        
        loadMonHoc();
    }

    private void initTable(){
        tblModel1 = new DefaultTableModel();
        tblModel1.setColumnIdentifiers(new String[]{
            "Mã Môn Học", "Tên Môn Học"
        });
        
        tblSubjects.setModel(tblModel1);
    }
    
    private void loadMonHoc(){
        try {
            MonHocDao dao = new MonHocDao();
            List<MonHoc> list = dao.finlAll();
            tblModel1.setRowCount(0);
            
            for(MonHoc kh : list){
                tblModel1.addRow(new Object[]{
                    kh.getMaMonHoc(), kh.getTenMonHoc()
                });
            }
            tblModel1.fireTableDataChanged();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaMonHoc = new javax.swing.JTextField();
        txtTenMonHoc = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSubjects = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Quản Lý Môn Học");

        jLabel2.setText("Mã Môn Học:");

        jLabel3.setText("Tên Môn Học:");

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

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Button-Close-icon-16.png"))); // NOI18N
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

        tblSubjects.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSubjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSubjects);

        jLabel4.setText("Danh Sách Các Môn Hiện Có:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaMonHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(txtTenMonHoc)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNew)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnNew))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(txtMaMonHoc.getText().equals("")){
                MessageDialogHelper.showErrorDialog(parentForm, "Mã môn học cần phải nhập", "Lỗi");
                return;
            }
            
            MonHocDao dao = new MonHocDao();
            MonHoc kh = dao.findByMaMonHoc(txtMaMonHoc.getText());
            if(kh == null){
                MessageDialogHelper.showMessageDialog(parentForm, "Mã môn học không tồn tại", "Lỗi");
                return;
            }
            
            if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn xóa khóa học"
                    + " hay không", "Hỏi") == JOptionPane.NO_OPTION){
                return;
            }
            
            if(dao.deleteByMaMonHoc(txtMaMonHoc.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "Môn học đã được xóa", "Thông báo");
            }else{
                MessageDialogHelper.showMessageDialog(parentForm, "Môn học không thể xóa được", "Thông báo");
            }
            loadMonHoc();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtMaMonHoc.setText("");
        txtTenMonHoc.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaMonHoc, sb, "Mã Môn cần phải nhập");
        DataValidator.validateEmpty(txtTenMonHoc, sb, "Tên Môn cần phải nhập");
        if (sb.length() > 0) {
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {

            MonHoc kh = new MonHoc();
            kh.setMaMonHoc(txtMaMonHoc.getText());
            kh.setTenMonHoc(txtTenMonHoc.getText());

            MonHocDao dao = new MonHocDao();
            if (dao.findByMaMonHoc(txtMaMonHoc.getText()) != null) {
                if(MessageDialogHelper.showConfirmDialog(parentForm, "Bạn có muốn cập nhật môn học hay không?", "Hỏi") == JOptionPane.NO_OPTION){
                    return;
                }
                if (dao.update(kh)) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Môn học đã được cập nhật", "Thông bào");
                } else {
                    MessageDialogHelper.showMessageDialog(parentForm, "Không thể cập nhật môn học", "Thông báo");
                }
            } else {
                if (dao.insert(kh)) {
                    MessageDialogHelper.showMessageDialog(parentForm, "Môn học đã được lưu", "Thông bào");
                } else {
                    MessageDialogHelper.showMessageDialog(parentForm, "Không thể lưu môn học", "Thông báo");
                }
            }
            loadMonHoc();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnAddActionPerformed(evt);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblSubjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSubjectsMouseClicked
        try {
            int row = tblSubjects.getSelectedRow();

            if (row >= 0) {
                String id = (String) tblSubjects.getValueAt(row, 0);
                MonHocDao dao = new MonHocDao();
                MonHoc gv = dao.findByMaMonHoc(id);

                if (gv != null) {
                    txtMaMonHoc.setText(gv.getMaMonHoc());
                    txtTenMonHoc.setText(gv.getTenMonHoc());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                    e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tblSubjectsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblSubjects;
    private javax.swing.JTextField txtMaMonHoc;
    private javax.swing.JTextField txtTenMonHoc;
    // End of variables declaration//GEN-END:variables
}
