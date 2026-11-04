
package Vistas;

public class Login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelLogin = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Fondo1 = new javax.swing.JLabel();
        EtqPanaderia = new javax.swing.JLabel();
        EtqAcceso = new javax.swing.JLabel();
        EtqUsuario = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        EtqPassword = new javax.swing.JLabel();
        TxtPassword = new javax.swing.JPasswordField();
        BtnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(251, 245, 233));
        setPreferredSize(new java.awt.Dimension(907, 454));

        JPanelLogin.setBackground(new java.awt.Color(251, 245, 233));

        jPanel1.setBackground(new java.awt.Color(235, 191, 136));

        Fondo1.setToolTipText("");
        Fondo1.setMaximumSize(new java.awt.Dimension(454, 454));
        Fondo1.setMinimumSize(new java.awt.Dimension(454, 454));
        Fondo1.setPreferredSize(new java.awt.Dimension(454, 454));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        EtqPanaderia.setBackground(new java.awt.Color(251, 245, 233));
        EtqPanaderia.setFont(new java.awt.Font("French Script MT", 1, 90)); // NOI18N
        EtqPanaderia.setForeground(new java.awt.Color(235, 191, 136));
        EtqPanaderia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtqPanaderia.setText("Panaderia");

        EtqAcceso.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        EtqAcceso.setForeground(new java.awt.Color(136, 75, 44));
        EtqAcceso.setText("ACCESO");

        EtqUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        EtqUsuario.setForeground(new java.awt.Color(57, 65, 43));
        EtqUsuario.setText("Usuario:");

        TxtUsuario.setBackground(new java.awt.Color(215, 215, 191));
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        EtqPassword.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        EtqPassword.setForeground(new java.awt.Color(57, 65, 43));
        EtqPassword.setText("Contraseña:");

        TxtPassword.setBackground(new java.awt.Color(215, 215, 191));

        BtnLogin.setBackground(new java.awt.Color(235, 191, 136));
        BtnLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(251, 245, 233));
        BtnLogin.setText("Log in");
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelLoginLayout = new javax.swing.GroupLayout(JPanelLogin);
        JPanelLogin.setLayout(JPanelLoginLayout);
        JPanelLoginLayout.setHorizontalGroup(
            JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLoginLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(EtqAcceso))
                    .addGroup(JPanelLoginLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtqPassword)
                            .addComponent(EtqUsuario)
                            .addComponent(EtqPanaderia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtUsuario)
                            .addComponent(TxtPassword)))
                    .addGroup(JPanelLoginLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        JPanelLoginLayout.setVerticalGroup(
            JPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, Short.MAX_VALUE)
            .addGroup(JPanelLoginLayout.createSequentialGroup()
                .addComponent(EtqPanaderia)
                .addGap(0, 0, 0)
                .addComponent(EtqAcceso)
                .addGap(34, 34, 34)
                .addComponent(EtqUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(EtqPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(BtnLogin)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLoginActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JLabel EtqAcceso;
    private javax.swing.JLabel EtqPanaderia;
    private javax.swing.JLabel EtqPassword;
    private javax.swing.JLabel EtqUsuario;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JPanel JPanelLogin;
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
