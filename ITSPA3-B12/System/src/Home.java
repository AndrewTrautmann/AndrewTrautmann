
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author trist
 */
public class Home extends javax.swing.JFrame {

    ResultSet rs;
    Connection con;
    Statement stmnt;

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        manageProject = new javax.swing.JButton();
        manageEmployee = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        logOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(null);

        manageProject.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        manageProject.setText("Manage Projects");
        manageProject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageProject.setName("btnManageProjects"); // NOI18N
        manageProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProjectActionPerformed(evt);
            }
        });
        getContentPane().add(manageProject);
        manageProject.setBounds(442, 234, 308, 33);

        manageEmployee.setFont(manageProject.getFont());
        manageEmployee.setText("Manage Employees");
        manageEmployee.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageEmployee.setMaximumSize(new java.awt.Dimension(185, 33));
        manageEmployee.setMinimumSize(new java.awt.Dimension(185, 33));
        manageEmployee.setName("btnManageEmployees"); // NOI18N
        manageEmployee.setPreferredSize(new java.awt.Dimension(185, 33));
        manageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(manageEmployee);
        manageEmployee.setBounds(442, 289, 308, 33);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 10, 0, 0);

        jPanel5.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(180, 80, 831, 15);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(180, 30, 0, 0);

        logOut.setFont(manageProject.getFont());
        logOut.setText("Logout");
        logOut.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logOut.setName("btnManageEmployees"); // NOI18N
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut);
        logOut.setBounds(494, 344, 208, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 720);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sticker.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 10, 120, 110);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paragraph@1x.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 30, 830, 50);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 80, 830, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Installation of back up genators at Watershed in Waterfront 5.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1200, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProjectActionPerformed
        this.dispose();
        ManageProjects mp = new ManageProjects();
        mp.setVisible(true);
    }//GEN-LAST:event_manageProjectActionPerformed

    private void manageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeActionPerformed
        this.dispose();
        ManageEmployees me = new ManageEmployees();
        me.setVisible(true);
    }//GEN-LAST:event_manageEmployeeActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed

        new Database().disconnect();
        this.dispose();
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton logOut;
    private javax.swing.JButton manageEmployee;
    private javax.swing.JButton manageProject;
    // End of variables declaration//GEN-END:variables
}
