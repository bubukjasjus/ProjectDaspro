/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form PAGES2
     */
    public Login() {
        initComponents();
         txtrent = new javax.swing.JTextField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtrent = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtuser1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        txtuser2 = new javax.swing.JLabel();
        adressText = new javax.swing.JTextField();
        txtuser = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtuser3 = new javax.swing.JLabel();
        txtuser4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        txtrent.setBackground(new java.awt.Color(245, 155, 18));
        txtrent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtrent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrent.setText("berkah rent cars and motorbikes");
        txtrent.setBorder(null);
        txtrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txtuser1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        txtuser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtuser1.setText("MASUKKAN NAMA ANDA");
        jPanel1.add(txtuser1);
        txtuser1.setBounds(380, 170, 161, 18);

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        jPanel1.add(nameText);
        nameText.setBounds(380, 200, 161, 31);

        txtuser2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        txtuser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtuser2.setText("ALAMAT\n");
        jPanel1.add(txtuser2);
        txtuser2.setBounds(380, 250, 161, 18);

        adressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressTextActionPerformed(evt);
            }
        });
        jPanel1.add(adressText);
        adressText.setBounds(380, 280, 158, 31);

        txtuser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        txtuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtuser.setText("NOMOR HP");
        jPanel1.add(txtuser);
        txtuser.setBounds(380, 340, 161, 18);
        jPanel1.add(phoneText);
        phoneText.setBounds(380, 370, 158, 31);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(410, 440, 100, 27);

        txtuser3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 28)); // NOI18N
        txtuser3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtuser3.setText("RENTAL");
        jPanel1.add(txtuser3);
        txtuser3.setBounds(470, 70, 111, 38);

        txtuser4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 28)); // NOI18N
        txtuser4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtuser4.setText("BERKAH");
        jPanel1.add(txtuser4);
        txtuser4.setBounds(350, 30, 110, 40);

        jLabel3.setText("Rent The Vehicle ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 50, 100, 16);

        jLabel4.setText("Of Your Dream");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 80, 90, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\62821\\Downloads\\Untitled design (15).png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrentActionPerformed

    private void adressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adressTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        pricelist button = new pricelist();
        button.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JTextField txtrent;
    private javax.swing.JLabel txtuser;
    private javax.swing.JLabel txtuser1;
    private javax.swing.JLabel txtuser2;
    private javax.swing.JLabel txtuser3;
    private javax.swing.JLabel txtuser4;
    // End of variables declaration//GEN-END:variables
}
