/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author abdiassantos
 */
public class TelaSobre extends javax.swing.JFrame {

    /**
     * Creates new form TelaSobre
     */
    public TelaSobre() {
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

        jButtonVoltarSobre = new javax.swing.JButton();
        jLabelLogoSobre = new javax.swing.JLabel();
        jLabelTituloSobre = new javax.swing.JLabel();
        jLabelContatosSobre = new javax.swing.JLabel();
        jLabelEmailSobre = new javax.swing.JLabel();
        jLabelTelefoneSobre = new javax.swing.JLabel();
        jLabelHaGerenciaSobre = new javax.swing.JLabel();
        jLabelVersaoSobre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("HA Gerencia");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVoltarSobre.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jButtonVoltarSobre.setText("VOLTAR");
        jButtonVoltarSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarSobreActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltarSobre);
        jButtonVoltarSobre.setBounds(200, 450, 90, 33);

        jLabelLogoSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoHA.jpg"))); // NOI18N
        getContentPane().add(jLabelLogoSobre);
        jLabelLogoSobre.setBounds(80, 10, 140, 120);

        jLabelTituloSobre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelTituloSobre.setText("Heads Apps Soluções Tecnológicas");
        getContentPane().add(jLabelTituloSobre);
        jLabelTituloSobre.setBounds(30, 140, 250, 17);

        jLabelContatosSobre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelContatosSobre.setText("CONTATOS:");
        getContentPane().add(jLabelContatosSobre);
        jLabelContatosSobre.setBounds(110, 360, 120, 17);

        jLabelEmailSobre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelEmailSobre.setText("abdviana@gmail.com");
        getContentPane().add(jLabelEmailSobre);
        jLabelEmailSobre.setBounds(80, 390, 170, 17);

        jLabelTelefoneSobre.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabelTelefoneSobre.setText("(86) 9 9968 - 5966");
        getContentPane().add(jLabelTelefoneSobre);
        jLabelTelefoneSobre.setBounds(90, 410, 160, 17);

        jLabelHaGerenciaSobre.setText("HA Gerencia");
        getContentPane().add(jLabelHaGerenciaSobre);
        jLabelHaGerenciaSobre.setBounds(120, 210, 80, 12);

        jLabelVersaoSobre.setText("Versão 1.0.0");
        getContentPane().add(jLabelVersaoSobre);
        jLabelVersaoSobre.setBounds(120, 240, 80, 12);

        setSize(new java.awt.Dimension(309, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarSobreActionPerformed
        TelaLogin telaLoginObject = new TelaLogin();
        telaLoginObject.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltarSobre;
    private javax.swing.JLabel jLabelContatosSobre;
    private javax.swing.JLabel jLabelEmailSobre;
    private javax.swing.JLabel jLabelHaGerenciaSobre;
    private javax.swing.JLabel jLabelLogoSobre;
    private javax.swing.JLabel jLabelTelefoneSobre;
    private javax.swing.JLabel jLabelTituloSobre;
    private javax.swing.JLabel jLabelVersaoSobre;
    // End of variables declaration//GEN-END:variables
}