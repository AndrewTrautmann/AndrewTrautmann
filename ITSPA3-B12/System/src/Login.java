
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
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userPasswordText = new javax.swing.JPasswordField();
        logIn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(1200, 720));
        setSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(null);

        userNameText.setName("tFieldUser"); // NOI18N
        getContentPane().add(userNameText);
        userNameText.setBounds(519, 230, 150, 24);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        jLabel1.setName("lblUser"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(519, 195, 150, 29);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jLabel2.setName("lblPass"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(519, 284, 150, 29);

        userPasswordText.setName("tFieldPass"); // NOI18N
        getContentPane().add(userPasswordText);
        userPasswordText.setBounds(519, 319, 150, 22);

        logIn.setBackground(new java.awt.Color(255, 255, 255));
        logIn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        logIn.setText("Login");
        logIn.setName("btnLogin"); // NOI18N
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
        });
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        getContentPane().add(logIn);
        logIn.setBounds(541, 357, 100, 45);

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
            .addGap(0, 0, Short.MAX_VALUE)
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

    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
        
    }//GEN-LAST:event_logInMouseClicked

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // making a connection with the mysql database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chopGui?useSSL=false", "root", "andrew01");           
            Statement stmnt = con.createStatement();
            
            
            String username = userNameText.getText().trim();
            String userpassword = String.valueOf(userPasswordText.getPassword());
            int userID = 0;
            ResultSet rs = stmnt.executeQuery("SELECT * FROM Login");
            
            boolean b = false;
            while(rs.next()){
                userID = rs.getInt("loginID");
                String userName = rs.getString("userName");
                String userPass = rs.getString("pass");
                
                
                if (username.equals(userName) && userpassword.equals(userPass)) {
                    b = true;
                    break;
                }
            }
            if (b == true) {
               System.out.println("users ID = " + userID);
               this.dispose();
               Home hme = new Home();              
               hme.setVisible(true);
               
            }else{   
                 JOptionPane.showMessageDialog(null, "Unsuccessful Login, Please try again");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error at database connection: " + e);
        }
    }//GEN-LAST:event_logInActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logIn;
    private javax.swing.JTextField userNameText;
    private javax.swing.JPasswordField userPasswordText;
    // End of variables declaration//GEN-END:variables
}
