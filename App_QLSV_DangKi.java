import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class App_QLSV_DangKi extends javax.swing.JFrame {
    People[] people;
    
    public App_QLSV_DangKi() {
        initComponents();
        this.setTitle("Admin");
        
        initDay();
        initMonth();
        initYear();
        
        initNationalities();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDepart = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        cbxDepart = new javax.swing.JComboBox<>();
        btnCancer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaSo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbtFemale = new javax.swing.JRadioButton();
        rbtMale = new javax.swing.JRadioButton();
        lbBirthDay = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        cbxDay = new javax.swing.JComboBox<>();
        cbxYear = new javax.swing.JComboBox<>();
        cbxMonth = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFirstName.setText("FirstName:");

        lblLastName.setText("LastName");

        lblDepart.setText("Chức Vụ");

        cbxDepart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbxDepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDepartActionPerformed(evt);
            }
        });

        btnCancer.setText("Close");
        btnCancer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancerActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã số:");

        txtMaSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSoActionPerformed(evt);
            }
        });

        jLabel2.setText("SĐT");

        lbDiaChi.setText("Địa chỉ");

        jLabel4.setText("Giới tính");

        buttonGroup1.add(rbtFemale);
        rbtFemale.setText("Female");

        buttonGroup1.add(rbtMale);
        rbtMale.setText("Male");

        lbBirthDay.setText("Ngày sinh");

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        cbxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                    .addComponent(btnCancer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(txtMaSo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbDiaChi)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDepart)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtFemale)
                                        .addGap(11, 11, 11)
                                        .addComponent(rbtMale))
                                    .addComponent(cbxDepart, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblLastName))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(txtFirstName)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbBirthDay)
                                .addGap(47, 47, 47)
                                .addComponent(cbxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBirthDay)
                    .addComponent(cbxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbtFemale)
                    .addComponent(rbtMale))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepart)
                    .addComponent(cbxDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnNext)
                .addGap(18, 18, 18)
                .addComponent(btnCancer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ngày tháng năm
    private void initDay(){
        DefaultComboBoxModel<String> model  = new DefaultComboBoxModel<>();
        int i;
        String Day;
        
        for(i = 1; i<=31 ; i++){
            Day = String.valueOf(i);
            model.addElement(Day);
        }
        cbxDay.setModel(model);
    }
    
    private void initMonth(){
        DefaultComboBoxModel<String> model  = new DefaultComboBoxModel<>();
        int i;
        String Month;
        
        for(i = 1; i<=12 ; i++){
            Month = String.valueOf(i);
            model.addElement(Month);
        }
        
        cbxMonth.setModel(model);
    }
    
    private void initYear(){
        DefaultComboBoxModel<String> model  = new DefaultComboBoxModel<>();
        int i;
        String Year;
        
        for(i = 1980; i<=2021 ; i++){
            Year = String.valueOf(i);
            model.addElement(Year);
        }
        
        cbxYear.setModel(model);
    }
    
    //Chức vụ
    private void initNationalities(){
        DefaultComboBoxModel<String> model  = new DefaultComboBoxModel<>();
        model.addElement("Admin");
        model.addElement("Teacher");
        model.addElement("Student");
        
        cbxDepart.setModel(model);
    }
    
    // EXIT
    private void btnCancerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancerActionPerformed
        int choice  = JOptionPane.showConfirmDialog(this, "Do you want to exit?", "Close", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(choice == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancerActionPerformed
    
    private void cbxDepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDepartActionPerformed

    }//GEN-LAST:event_cbxDepartActionPerformed

    private void txtMaSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSoActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    // DISPLAY
    private void displayEmail(){
        
    }
    
    // MAIN
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_QLSV_DangKi().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancer;
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxDay;
    private javax.swing.JComboBox<String> cbxDepart;
    private javax.swing.JComboBox<String> cbxMonth;
    private javax.swing.JComboBox<String> cbxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JLabel lbBirthDay;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lblDepart;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private java.awt.Panel panel1;
    private javax.swing.JRadioButton rbtFemale;
    private javax.swing.JRadioButton rbtMale;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMaSo;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
    
    
}
