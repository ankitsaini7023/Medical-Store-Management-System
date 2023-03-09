/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
//import javax.swing.JTextField;

/**
 *
 * 
 */
public class ProfileForm extends javax.swing.JFrame {

    /**
     * Creates new form ProfileForm
     */
    public ProfileForm() {
        initComponents();
        setTitle("ProfileForm");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pFirstNameFld = new javax.swing.JTextField();
        pMobileLbl = new javax.swing.JLabel();
        pMobileFld = new javax.swing.JTextField();
        pEmailLbl = new javax.swing.JLabel();
        pUserNameLbl = new javax.swing.JLabel();
        pFirstNameLbl = new javax.swing.JLabel();
        pEmailFld = new javax.swing.JTextField();
        pUserNameFld = new javax.swing.JTextField();
        pClearBtn = new javax.swing.JButton();
        pSaveBtn = new javax.swing.JButton();
        pLastNameLbl = new javax.swing.JLabel();
        pLastNameFld = new javax.swing.JTextField();
        pAddressLbl = new javax.swing.JLabel();
        iAmLbl = new javax.swing.JLabel();
        pDobLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pMaleRadioBtn = new javax.swing.JRadioButton();
        pFemaleRadioBtn = new javax.swing.JRadioButton();
        pPasswordLbl = new javax.swing.JLabel();
        pPasswordFld = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pAddressTextArea = new javax.swing.JTextArea();
        pDateChsr = new com.toedter.calendar.JDateChooser();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pMobileLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pMobileLbl.setText("Mobile:");

        pEmailLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pEmailLbl.setText("Email:");

        pUserNameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pUserNameLbl.setText("User Name:");

        pFirstNameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pFirstNameLbl.setText("First Name:");

        pEmailFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pEmailFldActionPerformed(evt);
            }
        });

        pClearBtn.setText("Clear");
        pClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pClearBtnActionPerformed(evt);
            }
        });

        pSaveBtn.setText("Save");
        pSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSaveBtnActionPerformed(evt);
            }
        });

        pLastNameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pLastNameLbl.setText("Last Name:");

        pAddressLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pAddressLbl.setText("Address:");

        iAmLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        iAmLbl.setText("I am:");

        pDobLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pDobLbl.setText("Date of Birth:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("                                                                                  Profile");

        buttonGroup1.add(pMaleRadioBtn);
        pMaleRadioBtn.setText("Male");
        pMaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pMaleRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(pFemaleRadioBtn);
        pFemaleRadioBtn.setText("Female");
        pFemaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pFemaleRadioBtnActionPerformed(evt);
            }
        });

        pPasswordLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pPasswordLbl.setText("Password:");

        pAddressTextArea.setColumns(20);
        pAddressTextArea.setRows(5);
        jScrollPane1.setViewportView(pAddressTextArea);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pMobileLbl)
                            .addComponent(pFirstNameLbl)
                            .addComponent(pEmailLbl)
                            .addComponent(pLastNameLbl)
                            .addComponent(pUserNameLbl)
                            .addComponent(pAddressLbl)
                            .addComponent(iAmLbl)
                            .addComponent(pDobLbl)
                            .addComponent(pPasswordLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(backBtn)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pEmailFld)
                            .addComponent(pFirstNameFld)
                            .addComponent(pUserNameFld)
                            .addComponent(pMobileFld)
                            .addComponent(pLastNameFld)
                            .addComponent(pPasswordFld)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pMaleRadioBtn)
                                .addGap(18, 18, 18)
                                .addComponent(pFemaleRadioBtn)
                                .addGap(0, 295, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pClearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pSaveBtn))
                            .addComponent(jScrollPane1))
                        .addGap(223, 223, 223))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pDateChsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pFirstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pFirstNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pLastNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pLastNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iAmLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pMaleRadioBtn)
                        .addComponent(pFemaleRadioBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pDobLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pDateChsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pMobileFld, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pMobileLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pEmailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEmailFld, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pUserNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pUserNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pPasswordLbl)
                    .addComponent(pPasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pAddressLbl)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pClearBtn)
                    .addComponent(pSaveBtn)
                    .addComponent(backBtn))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pEmailFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pEmailFldActionPerformed
       
    }//GEN-LAST:event_pEmailFldActionPerformed

    private void pSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSaveBtnActionPerformed
     
      Profileform();   
    }//GEN-LAST:event_pSaveBtnActionPerformed

    private void pMaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pMaleRadioBtnActionPerformed
    
        gender="male";
    }//GEN-LAST:event_pMaleRadioBtnActionPerformed

    private void pFemaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pFemaleRadioBtnActionPerformed
  
        gender="female";
    }//GEN-LAST:event_pFemaleRadioBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
      
        AdminPanel main=new AdminPanel();
        dispose();
        main.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void pClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pClearBtnActionPerformed
   
        Clear();
        
        
    }//GEN-LAST:event_pClearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileForm().setVisible(true);
            }
        });
    }
    
    public void Clear(){
        
        pUserNameFld.setText("");
        pPasswordFld.setText("");
        pFirstNameFld.setText("");
        pLastNameFld.setText("");
        buttonGroup1.clearSelection();
        pDateChsr.setCalendar(null);
        pAddressTextArea.setText("");
        pMobileFld.setText("");
        pEmailFld.setText("");
        
           
    }
    
    public void Profileform(){
        
        AdminPanel ap=new AdminPanel();
        Connection con;
        PreparedStatement ps;
        try{
            String  sql="INSERT INTO users (username,password,first_name,last_name,address,mobile,gender,dob,mail)"+" VALUES (?,?,?,?,?,?,?,?,?)";
            
            con =DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_store", "root", "040920ankit");
            ps=con.prepareStatement(sql);
            ps.setString(1,pUserNameFld.getText());
            ps.setString(2, String.valueOf(pPasswordFld.getPassword()));
            ps.setString(3,pFirstNameFld.getText());
            ps.setString(4,pLastNameFld.getText());
            ps.setString(5, pAddressTextArea.getText());
            ps.setString(6, pMobileFld.getText());
            ps.setString(7, gender);
           
            ps.setString(8, ((JTextField)pDateChsr.getDateEditor().getUiComponent()).getText());
            ps.setString(9, pEmailFld.getText());    
            
            int  save=ps.executeUpdate();   
            if(save>0){
           
                     JOptionPane.showMessageDialog(null, "User Added");
                     ap.updateTable();
                     ap.setVisible(true);
                     dispose();
            }
            else{
            
                JOptionPane.showMessageDialog(null, "User Not Added");
            }
                     
        }catch(SQLException  ex){
           
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
              
        } 
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel iAmLbl;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pAddressLbl;
    public javax.swing.JTextArea pAddressTextArea;
    private javax.swing.JButton pClearBtn;
    public com.toedter.calendar.JDateChooser pDateChsr;
    private javax.swing.JLabel pDobLbl;
    public javax.swing.JTextField pEmailFld;
    private javax.swing.JLabel pEmailLbl;
    public javax.swing.JRadioButton pFemaleRadioBtn;
    public javax.swing.JTextField pFirstNameFld;
    private javax.swing.JLabel pFirstNameLbl;
    public javax.swing.JTextField pLastNameFld;
    private javax.swing.JLabel pLastNameLbl;
    public javax.swing.JRadioButton pMaleRadioBtn;
    public javax.swing.JTextField pMobileFld;
    private javax.swing.JLabel pMobileLbl;
    public javax.swing.JPasswordField pPasswordFld;
    private javax.swing.JLabel pPasswordLbl;
    private javax.swing.JButton pSaveBtn;
    public javax.swing.JTextField pUserNameFld;
    private javax.swing.JLabel pUserNameLbl;
    // End of variables declaration//GEN-END:variables

   private String gender;

   public void updateUser() {
        AdminPanel ap = new AdminPanel();
        
        String sql="";

        Connection con;
        PreparedStatement ps;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_store", "root", "040920ankit");
            ps = con.prepareStatement(sql);

            int save = ps.executeUpdate();

            System.out.println("executeQuery");

            if (save > 0) {
                System.out.println("Inserted");
                JOptionPane.showMessageDialog(null, "saved");
                dispose();
                ap.updateTable();
                ap.setVisible(true);
                dispose();

            } else {
                System.out.println("Not Inserted");
                JOptionPane.showMessageDialog(null, "Not saved");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Insert Valid Data");
            dispose();
            ap.setVisible(true);
        }

    }
   
   
   
}