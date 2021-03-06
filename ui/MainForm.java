/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.poly.app.ui;

import com.mycompany.poly.app.helpers.ShareData;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author ADMIN
 */
public class MainForm extends javax.swing.JFrame {
    private StudentManagementPanel mStudentPanel;
    private GPAManamentPanel mGPAPanel;
    private TeacherManamentPanel mTeacherPanel;
    private ClassManamentPanel mClassPanel;
    private KhoaHocManamentPanel mKhoaHocPanel;
    private SubjectsManamentPanel mSubjectsPanel;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnQLSV = new javax.swing.JButton();
        btnQLD = new javax.swing.JButton();
        btnQLGV = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        tbrAboutUs = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblLoginName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuFile_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuManageStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuManageTeacher = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuManageGPA = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnuManageClass = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnuManageKhoaHoc = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnuManageSubjects = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuNote = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuAboutUs = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/logout-icon-32.png"))); // NOI18N
        tbrLogout.setText("????ng Xu???t");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator7);

        btnQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        btnQLSV.setText("Qu???n L?? Sinh Vi??n");
        btnQLSV.setFocusable(false);
        btnQLSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLSV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLSV);

        btnQLD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/gpa-icon-32.png"))); // NOI18N
        btnQLD.setText("Qu???n L?? ??i???m");
        btnQLD.setFocusable(false);
        btnQLD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLD.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLD);

        btnQLGV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Person-Male-Light-icon-48.png"))); // NOI18N
        btnQLGV.setText("Qu???n L?? Gi???ng Vi??n");
        btnQLGV.setFocusable(false);
        btnQLGV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLGV.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnQLGV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLGVActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLGV);
        jToolBar1.add(jSeparator6);

        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-help-about-icon-48.png"))); // NOI18N
        tbrAboutUs.setText("Gi???i Thi???u");
        tbrAboutUs.setFocusable(false);
        tbrAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAboutUs);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Help-icon-48.png"))); // NOI18N
        jButton1.setText("N???i dung");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        lblLoginName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLoginName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblRole.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginName, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("H??? Th???ng");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/logout-icon-16.png"))); // NOI18N
        jMenuItem1.setText("????ng Xu???t");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        mnuFile_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Button-Close-icon-16.png"))); // NOI18N
        mnuFile_Exit.setText(" Tho??t");
        mnuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuFile_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(" Qu???n L??");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mnuManageStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        mnuManageStudent.setText("Qu???n L?? Sinh Vi??n");
        mnuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageStudentActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageStudent);
        jMenu2.add(jSeparator2);

        mnuManageTeacher.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Person-Male-Light-icon-16.png"))); // NOI18N
        mnuManageTeacher.setText("Qu???n L?? Gi???ng Vi??n");
        mnuManageTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageTeacherActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageTeacher);
        jMenu2.add(jSeparator5);

        mnuManageGPA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageGPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/gpa-icon.png"))); // NOI18N
        mnuManageGPA.setText("Qu???n L?? ??i???m");
        mnuManageGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageGPAActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageGPA);
        jMenu2.add(jSeparator8);

        mnuManageClass.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Home-icon-16.png"))); // NOI18N
        mnuManageClass.setText("Qu???n L?? L???p H???c");
        mnuManageClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageClassActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageClass);
        jMenu2.add(jSeparator9);

        mnuManageKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Apps-preferences-desktop-user-password-icon-16.png"))); // NOI18N
        mnuManageKhoaHoc.setText("Qu???n L?? Kh??a H???c");
        mnuManageKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageKhoaHocActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageKhoaHoc);
        jMenu2.add(jSeparator10);

        mnuManageSubjects.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuManageSubjects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-view-choose-icon-24.png"))); // NOI18N
        mnuManageSubjects.setText("Qu???n L?? M??n H???c");
        mnuManageSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageSubjectsActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageSubjects);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tr??? Gi??p");

        mnuNote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Actions-help-about-icon-16.png"))); // NOI18N
        mnuNote.setText("N???i Dung");
        mnuNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNoteActionPerformed(evt);
            }
        });
        jMenu3.add(mnuNote);
        jMenu3.add(jSeparator3);

        mnuAboutUs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/poly/app/icons/Help-icon-16.png"))); // NOI18N
        mnuAboutUs.setText("Gi???i Thi???u");
        mnuAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutUsActionPerformed(evt);
            }
        });
        jMenu3.add(mnuAboutUs);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutUsActionPerformed
        tbrAboutUsActionPerformed(evt);
    }//GEN-LAST:event_mnuAboutUsActionPerformed

    private void mnuNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNoteActionPerformed
        NoteDiaLog note = new NoteDiaLog(this, true);
        note.setVisible(true);
    }//GEN-LAST:event_mnuNoteActionPerformed

    private void mnuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageStudentActionPerformed
        if(mStudentPanel  == null){
            mStudentPanel = new StudentManagementPanel();
            ImageIcon icon = new  ImageIcon(getClass()
                    .getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-16.png"));
            tplMainBoard.addTab("Qu???n l?? sinh vi??n", icon, mStudentPanel, "Qu???n l?? sinh vi??n");
        }
        tplMainBoard.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_mnuManageStudentActionPerformed

    private void mnuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_ExitActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_mnuFile_ExitActionPerformed

    private void mnuManageGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageGPAActionPerformed
        if(mGPAPanel == null){
            mGPAPanel = new GPAManamentPanel();
            ImageIcon icon = new  ImageIcon(getClass()
                    .getResource("/com/mycompany/poly/app/icons/gpa-icon.png"));
            tplMainBoard.addTab("Qu???n l?? ??i???m", icon, mGPAPanel, "Qu???n l?? ??i???m");
        }
        tplMainBoard.setSelectedComponent(mGPAPanel);
    }//GEN-LAST:event_mnuManageGPAActionPerformed

    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
        AboutUsDiaLog aboutUsDiaLog = new AboutUsDiaLog(this, true);
        aboutUsDiaLog.setVisible(true);
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed
        LoginDialog loginDialog = new LoginDialog(this, true);;
        mClassPanel   = null;
        mGPAPanel     = null;
        mKhoaHocPanel = null;
        mStudentPanel = null;
        mTeacherPanel = null;
        mSubjectsPanel= null;
        loginDialog.setVisible(true);
        
        processLoginSuccessful();
    }//GEN-LAST:event_tbrLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginDialog dialog = new LoginDialog(this, true);
        dialog.setVisible(true);    
        
        processLoginSuccessful();
    }//GEN-LAST:event_formWindowOpened

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mnuManageTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageTeacherActionPerformed
        if(mTeacherPanel == null){
            mTeacherPanel = new TeacherManamentPanel();
            ImageIcon icon = new  ImageIcon(getClass()
                    .getResource("/com/mycompany/poly/app/icons/10207-man-student-light-skin-tone-icon-16.png"));
            tplMainBoard.addTab("Qu???n l?? gi???ng vi??n", icon, mTeacherPanel, "Qu???n l?? gi???ng vi??n");
        }
        tplMainBoard.setSelectedComponent(mTeacherPanel);
    }//GEN-LAST:event_mnuManageTeacherActionPerformed

    private void btnQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSVActionPerformed
        mnuManageStudentActionPerformed(evt);
    }//GEN-LAST:event_btnQLSVActionPerformed

    private void btnQLGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLGVActionPerformed
        mnuManageTeacherActionPerformed(evt);
    }//GEN-LAST:event_btnQLGVActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tbrLogoutActionPerformed(evt);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnQLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDActionPerformed
        mnuManageGPAActionPerformed(evt);
    }//GEN-LAST:event_btnQLDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mnuNoteActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mnuManageClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageClassActionPerformed
        if(mClassPanel  == null){
            mClassPanel = new ClassManamentPanel();
            ImageIcon icon = new  ImageIcon(getClass()
                    .getResource("/com/mycompany/poly/app/icons/Home-icon-16.png"));
            tplMainBoard.addTab("Qu???n l?? l???p h???c", icon, mClassPanel, "Qu???n l?? l???p h???c");
        }
        tplMainBoard.setSelectedComponent(mClassPanel);
    }//GEN-LAST:event_mnuManageClassActionPerformed

    private void mnuManageKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageKhoaHocActionPerformed
        if(mKhoaHocPanel  == null){
            mKhoaHocPanel = new KhoaHocManamentPanel();
            ImageIcon icon = new  ImageIcon(getClass()
                    .getResource("/com/mycompany/poly/app/icons/Apps-preferences-desktop-user-password-icon-16.png"));
            tplMainBoard.addTab("Qu???n l?? kh??a h???c", icon, mKhoaHocPanel, "Qu???n l?? kh??a h???c");
        }
        tplMainBoard.setSelectedComponent(mKhoaHocPanel);
    }//GEN-LAST:event_mnuManageKhoaHocActionPerformed

    private void mnuManageSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageSubjectsActionPerformed
        if(mSubjectsPanel  == null){
            mSubjectsPanel = new SubjectsManamentPanel();
            ImageIcon icon = new  ImageIcon(getClass()
                    .getResource("/com/mycompany/poly/app/icons/Actions-view-choose-icon-24.png"));
            tplMainBoard.addTab("Qu???n l?? m??n h???c", icon, mSubjectsPanel, "Qu???n l?? m??n h???c");
        }
        tplMainBoard.setSelectedComponent(mSubjectsPanel);
    }//GEN-LAST:event_mnuManageSubjectsActionPerformed

    private void processLoginSuccessful(){
        lblLoginName.setText(ShareData.nguoiDangNhap.getTenDangNhap());
        lblRole.setText(ShareData.nguoiDangNhap.getVaiTro());
        tplMainBoard.removeAll();
        
        if(ShareData.nguoiDangNhap.getVaiTro().equals("Gi???ng vi??n")){
            mnuManageGPA.setEnabled(true);
            mnuManageTeacher.setEnabled(false);
            mnuManageStudent.setEnabled(false);
            mnuManageClass.setEnabled(false);
            mnuManageKhoaHoc.setEnabled(false);
            mnuManageSubjects.setEnabled(false);
        }else if(ShareData.nguoiDangNhap.getVaiTro().equals("????o t???o")){
            mnuManageGPA.setEnabled(true);
            mnuManageStudent.setEnabled(true);
            mnuManageTeacher.setEnabled(true);
            mnuManageClass.setEnabled(true);
            mnuManageKhoaHoc.setEnabled(true);
            mnuManageSubjects.setEnabled(true);
        }
        
        if(ShareData.nguoiDangNhap.getVaiTro().equals("Gi???ng vi??n")){
            btnQLD.setEnabled(true);
            btnQLSV.setEnabled(false);
            btnQLGV.setEnabled(false);
        }else if(ShareData.nguoiDangNhap.getVaiTro().equals("????o t???o")){
            btnQLD.setEnabled(true);
            btnQLGV.setEnabled(true);
            btnQLSV.setEnabled(true);
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLD;
    private javax.swing.JButton btnQLGV;
    private javax.swing.JButton btnQLSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblLoginName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JMenuItem mnuAboutUs;
    private javax.swing.JMenuItem mnuFile_Exit;
    private javax.swing.JMenuItem mnuManageClass;
    private javax.swing.JMenuItem mnuManageGPA;
    private javax.swing.JMenuItem mnuManageKhoaHoc;
    private javax.swing.JMenuItem mnuManageStudent;
    private javax.swing.JMenuItem mnuManageSubjects;
    private javax.swing.JMenuItem mnuManageTeacher;
    private javax.swing.JMenuItem mnuNote;
    private javax.swing.JButton tbrAboutUs;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
