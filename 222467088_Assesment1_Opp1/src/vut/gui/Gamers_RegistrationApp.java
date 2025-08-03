
package vut.gui;
/**
 * 
 * 
 * @author 222467088 TS Jiyane
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vut.AmGamer;
import vut.Gamer;
import vut.ProGamer;


public class Gamers_RegistrationApp extends javax.swing.JFrame {
    
    private static final int AMATEUR_FEE = 100;   
    private static final int PROFESSIONAL_FEE = 500; 
    private ArrayList<Gamer> gamerArrList = new ArrayList<>();

   
    public Gamers_RegistrationApp() {
        initComponents();
        populateAgeComboBox();
        populateRankComboBox();
        populateCategoryComboBox();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmboAge = new javax.swing.JComboBox<>();
        cmboRank = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taGamer = new javax.swing.JTextArea();
        btnRegisterGamer = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radProfessional = new javax.swing.JRadioButton();
        radAmateur = new javax.swing.JRadioButton();
        cmboCategory = new javax.swing.JComboBox<>();
        txtRegisteredYrs = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Gamer ID-Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Gamer name: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gamer age");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Resgistered years:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Rank:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Category:");

        txtID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        cmboAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmboAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Age" }));

        cmboRank.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmboRank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Display Gamers:");

        taGamer.setColumns(20);
        taGamer.setRows(5);
        jScrollPane1.setViewportView(taGamer);

        btnRegisterGamer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegisterGamer.setText("Register Gamer");
        btnRegisterGamer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterGamerActionPerformed(evt);
            }
        });

        btnViewAll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gamer Status"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        radProfessional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radProfessional.setText("Professional");
        radProfessional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radProfessionalActionPerformed(evt);
            }
        });

        radAmateur.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radAmateur.setText("Amateur");
        radAmateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAmateurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radProfessional)
                    .addComponent(radAmateur))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(radProfessional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radAmateur))
        );

        cmboCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmboCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
        cmboCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmboCategoryActionPerformed(evt);
            }
        });

        txtRegisteredYrs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmboAge, 0, 303, Short.MAX_VALUE)
                                        .addComponent(txtRegisteredYrs)
                                        .addComponent(cmboRank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmboCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegisterGamer, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(cmboAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtRegisteredYrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmboRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmboCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegisterGamer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void populateAgeComboBox() {
        for (int i = 10; i <= 80; i++) {
            cmboAge.addItem(String.valueOf(i));
        }
    }

    
    private void populateRankComboBox() {
        for (int i = 0; i <= 99; i++) {
            cmboRank.addItem(String.valueOf(i));
        }
    }
    
    private void populateCategoryComboBox() {
        cmboCategory.addItem("2");
        cmboCategory.addItem("3");
    }
    
    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
         taGamer.setText(""); // Clear the text area first
        for (Gamer gamer : gamerArrList) {
            taGamer.append(gamer.toString() + "\n\n");
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnRegisterGamerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterGamerActionPerformed
          String id = txtID.getText();
        String name = txtName.getText();
        String age = cmboAge.getSelectedItem().toString();
        String registeredYrs = txtRegisteredYrs.getText();
        String rank = cmboRank.getSelectedItem().toString();
        String category = cmboCategory.getSelectedItem().toString();

        if (id.isEmpty() || name.isEmpty() || registeredYrs.isEmpty() || age.equals("Select Age") || rank.equals("Select Rank") || category.equals("Select Category")) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Gamer gamer = null;

        try {
            int intAge = Integer.parseInt(age);
            int intRegisteredYrs = Integer.parseInt(registeredYrs);
            int intRank = Integer.parseInt(rank);
            int intCategory = Integer.parseInt(category);

            if (radAmateur.isSelected()) {
                gamer = new AmGamer(id, name, intAge, intCategory);
            } else if (radProfessional.isSelected()) {
                gamer = new ProGamer(id, name, intAge, intRegisteredYrs, intRank);
            }

            gamerArrList.add(gamer);
            taGamer.append(gamer.toString() + "\n\n");
            JOptionPane.showMessageDialog(this, "Gamer successfully registered!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Clear the fields after registration
            txtID.setText("");
            txtName.setText("");
            txtRegisteredYrs.setText("");
            cmboAge.setSelectedIndex(0);
            cmboRank.setSelectedIndex(0);
            cmboCategory.setSelectedIndex(0);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterGamerActionPerformed

    private void radProfessionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radProfessionalActionPerformed
        txtRegisteredYrs.setEnabled(true);
        cmboRank.setEnabled(true);
        cmboCategory.setEnabled(false);
    }//GEN-LAST:event_radProfessionalActionPerformed

    private void radAmateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAmateurActionPerformed
        txtRegisteredYrs.setEnabled(false);
        cmboRank.setEnabled(false);
        cmboCategory.setEnabled(true);
    }//GEN-LAST:event_radAmateurActionPerformed

    private void cmboCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmboCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmboCategoryActionPerformed

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
            java.util.logging.Logger.getLogger(Gamers_RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gamers_RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gamers_RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gamers_RegistrationApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gamers_RegistrationApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterGamer;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> cmboAge;
    private javax.swing.JComboBox<String> cmboCategory;
    private javax.swing.JComboBox<String> cmboRank;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radAmateur;
    private javax.swing.JRadioButton radProfessional;
    private javax.swing.JTextArea taGamer;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRegisteredYrs;
    // End of variables declaration//GEN-END:variables
}
