import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class App_QLSV_Teacher extends javax.swing.JFrame {
    
    public App_QLSV_Teacher() {
        initComponents();
        this.setTitle("Teacher");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDepart = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMonDay = new javax.swing.JLabel();
        labelMonDay = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSĐT = new javax.swing.JLabel();
        lblMaSo = new javax.swing.JLabel();
        labelSĐT = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelMaSo = new javax.swing.JLabel();
        labelTeacher = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        lblFirstName1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelFirstName.setText("FirstName");

        lblLastName.setText("LastName:");

        lblDepart.setText("Chức vụ:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Tên", "Điểm CC", "Điểm GK", "Điểm CK", "Điểm TB", "Thang 4đ"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblMonDay.setText("Môn dạy:");

        labelMonDay.setText("môn dạy");

        lblEmail.setText("Email:");

        lblSĐT.setText("SĐT:");

        lblMaSo.setText("Mã số:");

        labelSĐT.setText("123456");

        labelEmail.setText("hhhhh@.gmail");

        labelMaSo.setText("lj1214241");

        labelTeacher.setText("Teacher");

        labelLastName.setText("LastName");

        lblFirstName1.setText("FirstName:");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDepart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaSo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelMaSo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSĐT)
                                .addGap(18, 18, 18)
                                .addComponent(labelSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMonDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelMonDay, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSĐT)
                    .addComponent(labelSĐT)
                    .addComponent(lblFirstName1)
                    .addComponent(labelFirstName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(labelLastName)
                    .addComponent(lblEmail)
                    .addComponent(labelEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepart)
                    .addComponent(labelTeacher)
                    .addComponent(lblMaSo)
                    .addComponent(labelMaSo))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonDay)
                    .addComponent(labelMonDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
   
    // DISPLAY
    private void displayEmail(){
        
    }
    
    // MAIN
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_QLSV_Teacher().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelMaSo;
    private javax.swing.JLabel labelMonDay;
    private javax.swing.JLabel labelSĐT;
    private javax.swing.JLabel labelTeacher;
    private javax.swing.JLabel lblDepart;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMaSo;
    private javax.swing.JLabel lblMonDay;
    private javax.swing.JLabel lblSĐT;
    // End of variables declaration//GEN-END:variables
   
    
}
