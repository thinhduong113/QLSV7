import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class App_QLSV_Student extends javax.swing.JFrame {
    
    public App_QLSV_Student() {
        initComponents();
        this.setTitle("Student");
        display();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDepart = new javax.swing.JLabel();
        btnCancer = new javax.swing.JButton();
        labelDepart = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDisplay = new javax.swing.JTable();
        labelFirstName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        labelSDT = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelMaSo = new javax.swing.JLabel();
        lblMaSo = new javax.swing.JLabel();
        lblKhoaHoc = new javax.swing.JLabel();
        labelKhoaHoc = new javax.swing.JLabel();
        lblTB = new javax.swing.JLabel();
        labelTB = new javax.swing.JLabel();
        lblXepLoai = new javax.swing.JLabel();
        labelXepLoai = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFirstName.setText("FirstName:");

        lblLastName.setText("LastName:");

        lblDepart.setText("Depart:");

        btnCancer.setText("Close");
        btnCancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancerActionPerformed(evt);
            }
        });

        labelDepart.setText("Student");

        tbDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Môn học", "Điểm CC", "Điểm GK", "ĐIểm CK", "Điểm TB", "Thang 4đ"
            }
        ));
        jScrollPane1.setViewportView(tbDisplay);

        labelFirstName.setText("jLabel2");

        labelLastName.setText("jLabel3");

        lblSDT.setText("SĐT:");

        lbEmail.setText("Email:");

        labelSDT.setText("jLabel1");

        labelEmail.setText("jLabel2");

        labelMaSo.setText("jLabel3");

        lblMaSo.setText("Mã Số");

        lblKhoaHoc.setText("Khóa học");

        labelKhoaHoc.setText("jLabel1");

        lblTB.setText("Trung bình kì: ");

        labelTB.setText("jLabel1");

        lblXepLoai.setText("Xếp loại: ");

        labelXepLoai.setText("jLabel1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(btnCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTB)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelLastName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelFirstName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDepart)
                                    .addComponent(lblKhoaHoc))
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelKhoaHoc)
                                    .addComponent(labelDepart))))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSDT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelSDT))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelEmail))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblMaSo)
                                .addGap(18, 18, 18)
                                .addComponent(labelMaSo))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblXepLoai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelXepLoai)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(labelFirstName)
                    .addComponent(lblSDT)
                    .addComponent(labelSDT))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(labelLastName)
                    .addComponent(lbEmail)
                    .addComponent(labelEmail))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepart)
                    .addComponent(labelDepart)
                    .addComponent(lblMaSo)
                    .addComponent(labelMaSo))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhoaHoc)
                    .addComponent(labelKhoaHoc))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTB)
                    .addComponent(labelTB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblXepLoai)
                    .addComponent(labelXepLoai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnCancer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   
    // EXIT
    private void btnCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancerActionPerformed
        int choice  = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(choice == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancerActionPerformed
    
    // DISPLAY
    private void display(){
        String[][] data = {{"1","2","3"},
                           {"1","2","3"},
                           {"1","2","3"}};
        String[] column = {"Môn 1", 
                           "Môn 2", 
                           "Môn 3"};
        tbDisplay = new JTable(data, column);
//        JScrollPane sp = new JScrollPane(tbDisplay);
    }
    
    // MAIN
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_QLSV_Student().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDepart;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelKhoaHoc;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelMaSo;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelTB;
    private javax.swing.JLabel labelXepLoai;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lblDepart;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaSo;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblTB;
    private javax.swing.JLabel lblXepLoai;
    private javax.swing.JTable tbDisplay;
    // End of variables declaration//GEN-END:variables
    
    
}
