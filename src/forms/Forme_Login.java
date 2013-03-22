package forms;

import classes.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Forme_Login extends javax.swing.JFrame {

    public Forme_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lp_Login = new javax.swing.JLabel();
        lb_Senha = new javax.swing.JLabel();
        lb_imagem = new javax.swing.JLabel();
        bt_efetuar_login = new javax.swing.JButton();
        tf_Login = new javax.swing.JTextField();
        bt_limpar_login1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        tf_Senha = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login do sistema de compras");
        getContentPane().setLayout(null);

        lp_Login.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lp_Login.setText("Login do Usuário");
        getContentPane().add(lp_Login);
        lp_Login.setBounds(20, 220, 130, 16);

        lb_Senha.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lb_Senha.setText("Senha");
        getContentPane().add(lb_Senha);
        lb_Senha.setBounds(40, 260, 70, 16);

        lb_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_compras.gif"))); // NOI18N
        getContentPane().add(lb_imagem);
        lb_imagem.setBounds(40, 10, 480, 190);

        bt_efetuar_login.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bt_efetuar_login.setText("Efetuar Login");
        bt_efetuar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_efetuar_loginActionPerformed(evt);
            }
        });
        getContentPane().add(bt_efetuar_login);
        bt_efetuar_login.setBounds(70, 310, 120, 30);

        tf_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_LoginActionPerformed(evt);
            }
        });
        getContentPane().add(tf_Login);
        tf_Login.setBounds(150, 210, 140, 30);

        bt_limpar_login1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        bt_limpar_login1.setText("Limpar");
        bt_limpar_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_limpar_login1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt_limpar_login1);
        bt_limpar_login1.setBounds(270, 310, 100, 30);

        cancelar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(204, 0, 0));
        cancelar.setText("Sair");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(440, 340, 120, 30);

        tf_Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(tf_Senha);
        tf_Senha.setBounds(150, 250, 140, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-584)/2, (screenSize.height-420)/2, 584, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_LoginActionPerformed

    private void bt_efetuar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_efetuar_loginActionPerformed
        
            String u = tf_Login.getText();
            String s = tf_Senha.getText();
                    
            Usuario login = new Usuario();
            
            if(login.validarsenha(s) && login.validarusuario(u))
      
        {
            if(login.efetuarlogin(u, s) == true)
            {
                   JOptionPane.showMessageDialog(null ,"Login Correto","Atenção",JOptionPane.OK_CANCEL_OPTION );// primeiro campo é igual a posicao(null igual centrlizado), 
                                                   //2° param texto a exibir, 
                                                   //3° param titulo da caixa, 
                                                   //4° param. qual icone quer que aparece
                   //tf_Login.setText(null);
                   //tf_Senha.setText(null);
            } 
            else
                {
                   JOptionPane.showMessageDialog(null ,"Loguin incorreto!!","Atenção",JOptionPane.OK_CANCEL_OPTION );
                }
        }
           
            //tf_Login.setText(null);
            //tf_Senha.setText(null);
         
    }//GEN-LAST:event_bt_efetuar_loginActionPerformed

    private void bt_limpar_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_limpar_login1ActionPerformed
        tf_Login.setText(null);
        tf_Senha.setText(null);
        
        tf_Login.requestFocus();
    }//GEN-LAST:event_bt_limpar_login1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        tf_Login.setText(null);
        tf_Senha.setText(null);
        
        tf_Login.requestFocus();
        dispose();
        
         
    }//GEN-LAST:event_cancelarActionPerformed

    private void tf_SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_SenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forme_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forme_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forme_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forme_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forme_Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_efetuar_login;
    private javax.swing.JButton bt_limpar_login1;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lb_Senha;
    private javax.swing.JLabel lb_imagem;
    private javax.swing.JLabel lp_Login;
    private javax.swing.JTextField tf_Login;
    private javax.swing.JPasswordField tf_Senha;
    // End of variables declaration//GEN-END:variables
}
