package com.mycompany.berkahrentalkendaraan;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class orderPages extends javax.swing.JFrame {

    int harga;
    int totalHarga;
    /**
     * Creates new form pages3
     */
    public orderPages() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        transmisiSelection = new javax.swing.JComboBox<>();
        durationSelection = new javax.swing.JComboBox<>();
        hargaSementara = new javax.swing.JTextField();
        nextButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        finalHarga = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        transmisiSelection.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        transmisiSelection.setForeground(new java.awt.Color(71, 20, 25));
        transmisiSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Transmisi", "Manual", "Matic" }));
        transmisiSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmisiSelectionActionPerformed(evt);
            }
        });
        jPanel1.add(transmisiSelection);
        transmisiSelection.setBounds(390, 280, 150, 30);

        durationSelection.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        durationSelection.setForeground(new java.awt.Color(71, 20, 25));
        durationSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Durasi", "12 Jam", "1 Hari", "2 Hari", "3 Hari" }));
        durationSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationSelectionActionPerformed(evt);
            }
        });
        jPanel1.add(durationSelection);
        durationSelection.setBounds(390, 110, 150, 30);

        hargaSementara.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hargaSementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaSementaraActionPerformed(evt);
            }
        });
        jPanel1.add(hargaSementara);
        hargaSementara.setBounds(390, 160, 150, 30);

        nextButton.setBackground(new java.awt.Color(71, 20, 25));
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton);
        nextButton.setBounds(480, 420, 90, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ORDER NOW");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 30, 270, 50);

        backButton.setBackground(new java.awt.Color(71, 20, 25));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(370, 420, 90, 30);

        finalHarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        finalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalHargaActionPerformed(evt);
            }
        });
        jPanel1.add(finalHarga);
        finalHarga.setBounds(390, 330, 150, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\62821\\Downloads\\Untitled design (14).png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (durationSelection.getSelectedItem().toString().equals("Durasi") && transmisiSelection.getSelectedItem().toString().equals("Transmisi")){
            this.setVisible(true);
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Durasi & Transmisinya!");
        }
        else if (durationSelection.getSelectedItem().toString().equals("Durasi")) {
            this.setVisible(true);
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Durasinya!");
        }
        else if (transmisiSelection.getSelectedItem().toString().equals("Transmisi")) {
            this.setVisible(true);
            JOptionPane.showMessageDialog(null, "Silahkan Pilih Transmisinya!");
        }
        else {
        this.setVisible(false);
        output back = new output();
        back.setVisible(true);
        }

       
       // TODO add your handling code here:
    }//GEN-LAST:event_nextButtonActionPerformed

    private void transmisiSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmisiSelectionActionPerformed
        if (transmisiSelection.getSelectedItem().toString().equalsIgnoreCase("Transmisi")) {
            finalHarga.setText("Silahkan Pilih Transmisinya!");
        }
        else if (transmisiSelection.getSelectedItem().toString().equalsIgnoreCase("Manual")) {
            harga += 0;
            finalHarga.setText("Rp. "+ harga + " ,-");
        }
        else if (transmisiSelection.getSelectedItem().toString().equalsIgnoreCase("Matic")) {
            harga += 100000;
            finalHarga.setText("Rp. " + harga + " ,-");
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_transmisiSelectionActionPerformed

    private void hargaSementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaSementaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaSementaraActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        pricelist back = new pricelist();
        back.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void durationSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationSelectionActionPerformed
        
        if (durationSelection.getSelectedItem().toString().equalsIgnoreCase("Durasi")) {
            hargaSementara.setText ("Pilih Durasinya");
        }
        else if (durationSelection.getSelectedItem().toString().equalsIgnoreCase("12 Jam")) {
            hargaSementara.setText ("Rp. 500.000 ,-"); harga = 500000; 
        }
        else if (durationSelection.getSelectedItem().toString().equalsIgnoreCase("1 Hari")) {
            hargaSementara.setText ("Rp. 900.000 ,-"); harga = 900000; 
        }
        else if (durationSelection.getSelectedItem().toString().equalsIgnoreCase("2 Hari")) {
            hargaSementara.setText ("Rp. 1.500.000 ,-"); harga = 1500000; 
        }
        else if (durationSelection.getSelectedItem().toString().equalsIgnoreCase("3 Hari")) {
            hargaSementara.setText ("Rp. 2.250.000 ,-"); harga = 2250000; 
        }
    }//GEN-LAST:event_durationSelectionActionPerformed

    private void finalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalHargaActionPerformed

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
            java.util.logging.Logger.getLogger(orderPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderPages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderPages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> durationSelection;
    private javax.swing.JTextField finalHarga;
    private javax.swing.JTextField hargaSementara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JComboBox<String> transmisiSelection;
    // End of variables declaration//GEN-END:variables
}
