/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.cinesync.project.Views;

import br.com.cinesync.project.Controllers.LoginController;
import br.com.cinesync.project.DAO.LoginDAO;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Csarp
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        
        
        
        // Centralizando a janela na tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);
        setLocation(centerX, centerY);
            
        // Obtém o ícone atual do JLabel
            Icon icon = imgLogin.getIcon();

            // Verifica se o ícone é uma instância de ImageIcon
            if (icon instanceof ImageIcon) {
                // Obtém a imagem do ImageIcon
                Image imagemOriginal = ((ImageIcon) icon).getImage();

                // Obtém as dimensões do JLabel
                int larguraLabel = imgLogin.getWidth();
                int alturaLabel = imgLogin.getHeight();

                // Redimensiona a imagem para o tamanho do JLabel
                Image imagemRedimensionada = imagemOriginal.getScaledInstance(larguraLabel, alturaLabel, Image.SCALE_SMOOTH);

                // Cria um novo ImageIcon com a imagem redimensionada
                ImageIcon novaIcone = new ImageIcon(imagemRedimensionada);

                // Define o novo ImageIcon para o JLabel
                imgLogin.setIcon(novaIcone);
            }
            
            // Obtém o ícone atual do JLabel
            Icon icon2 = imgLogoLogin.getIcon();

            // Verifica se o ícone é uma instância de ImageIcon
            if (icon instanceof ImageIcon) {
                // Obtém a imagem do ImageIcon
                Image imagemOriginal = ((ImageIcon) icon2).getImage();

                // Obtém as dimensões do JLabel
                int larguraLabel = imgLogoLogin.getWidth();
                int alturaLabel = imgLogoLogin.getHeight();

                // Redimensiona a imagem para o tamanho do JLabel
                Image imagemRedimensionada = imagemOriginal.getScaledInstance(larguraLabel, alturaLabel, Image.SCALE_SMOOTH);

                // Cria um novo ImageIcon com a imagem redimensionada
                ImageIcon novaIcone2 = new ImageIcon(imagemRedimensionada);

                // Define o novo ImageIcon para o JLabel
                imgLogoLogin.setIcon(novaIcone2);
            }
            
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jCheckBoxCustom1 = new br.com.cinesync.project.Utils.JCheckBoxCustom();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        imgLogoLogin = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        imgLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha:");

        jCheckBoxCustom1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxCustom1.setText("Lembrar de mim!");

        jButton1.setText("Logar-se");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Você ainda não tem uma conta?");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registre-se");

        txtSenha.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 450, 240));

        jPanel2.setBackground(new java.awt.Color(102, 6, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cinesync/project/Resources/Gray_and_White_Modern_Cinema_Logo-removebg-preview (2).png"))); // NOI18N
        jPanel2.add(imgLogoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 140));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("O melhor sistema para seu cinema! ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 260, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 0, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 60, 40));

        imgLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cinesync/project/Resources/img1.png"))); // NOI18N
        imgLogin.setText("jLabel1");
        jPanel1.add(imgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 0, 560, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Ação do botão logar-se:
        
        try {
        
        // Declaração de variáveis:
        String usuario = txtUsuario.getText();
        String senha = new String(txtSenha.getPassword());
        
        // Chamada de nova instância da classe:
        LoginController loginController = new LoginController();

        // Verifica as credenciais utilizando o LoginController
        boolean credenciaisValidas = loginController.verificarCredenciais(usuario, senha);

        // Se as credenciais forem válidas, faça algo:
        if (credenciaisValidas) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
        } else {
            JOptionPane.showMessageDialog(this, "Credenciais inválidas. Tente novamente.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Olha, tá dando erro nisso: " + ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgLogin;
    private javax.swing.JLabel imgLogoLogin;
    private javax.swing.JButton jButton1;
    private br.com.cinesync.project.Utils.JCheckBoxCustom jCheckBoxCustom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
