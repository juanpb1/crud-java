/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfacegrafica;

import javabean.Aluno;
import dadosaluno.ControlaAluno;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Juan e Jarrel
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    ControlaAluno ca = new ControlaAluno();
    ArrayList<Aluno> alunos = ca.retornarDados();
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        UIManager.put("OptionPane.messageFont", new java.awt.Font("Segoe UI", 1, 14));
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
        btnCadastrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnDadosAlunos = new javax.swing.JButton();
        SistemaAlunotxt = new javax.swing.JLabel();
        Topo = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        setMaximumSize(new java.awt.Dimension(765, 580));
        setMinimumSize(new java.awt.Dimension(765, 580));
        setPreferredSize(new java.awt.Dimension(765, 580));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE ALUNO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 30, 450, 50);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 74, 127));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconADD.png"))); // NOI18N
        btnCadastrar.setText("CADASTRAR ALUNO");
        btnCadastrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 127), 2, true));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(200, 160, 350, 70);

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 74, 127));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconBuscar.png"))); // NOI18N
        btnBuscar.setText("BUSCAR ALUNO");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 127), 2, true));
        btnBuscar.setEnabled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(200, 240, 350, 70);

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 74, 127));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconSair.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 127), 2, true));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(560, 494, 140, 40);

        btnDadosAlunos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDadosAlunos.setForeground(new java.awt.Color(0, 74, 127));
        btnDadosAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconDados.png"))); // NOI18N
        btnDadosAlunos.setText("ALUNOS CADASTRADOS");
        btnDadosAlunos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 74, 127), 2, true));
        btnDadosAlunos.setEnabled(false);
        btnDadosAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosAlunosActionPerformed(evt);
            }
        });
        getContentPane().add(btnDadosAlunos);
        btnDadosAlunos.setBounds(200, 320, 350, 70);

        SistemaAlunotxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SistemaDeAluno.png"))); // NOI18N
        getContentPane().add(SistemaAlunotxt);
        SistemaAlunotxt.setBounds(120, 10, 100, 90);

        Topo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Topo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Topo.png"))); // NOI18N
        Topo.setText("SISTEMA DE ALUNO");
        Topo.setToolTipText("");
        getContentPane().add(Topo);
        Topo.setBounds(0, 0, 750, 130);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fundo.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 110, 750, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        TelaCadastro tc = new TelaCadastro(ca);
        btnBuscar.setEnabled(true);
        btnDadosAlunos.setEnabled(true);
        tc.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String nome;
        int nomeNaLista = 0;
        nome = JOptionPane.showInputDialog("Digite o nome que deseja buscar: ");
        
        try{
            for (int i = 0; i < alunos.size(); i++) {
                if (nome.toLowerCase().equals(alunos.get(i).getNome().toLowerCase())) {
                nomeNaLista = 1;
                }
            }
            if (nomeNaLista == 1) {
            JOptionPane.showMessageDialog(null, "Aluno cadastrado na lista.");
            } else {
            JOptionPane.showMessageDialog(null, "Aluno não cadastrado na lista.");
            }
        }catch(NullPointerException e){
        
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnDadosAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosAlunosActionPerformed
        DlgAlunos da = new DlgAlunos(null, true, ca);
        da.setVisible(true);
    }//GEN-LAST:event_btnDadosAlunosActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel SistemaAlunotxt;
    private javax.swing.JLabel Topo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDadosAlunos;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
