package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {

        initComponents();
        PlanoDeSaudeDAO.criarPlanosDeSaudeTeste();
        initPanels();

    }

    // Atributos da classe
    PanelPlanosDeSaude panelPlanosDeSaude;

    // Constantes da classe
    private final int POSICAO_X = 10;
    private final int POSICAO_Y = 170;
    private final int LARGURA = 945;
    private final int ALTURA = 370;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanosDeSaude = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPlanosDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonhome = new javax.swing.JButton();

        tablePlanosDeSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTablePlanosDeSaude.setViewportView(tablePlanosDeSaude);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 69, 69));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 20, 740, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 970, 80);

        buttonSair.setBackground(new java.awt.Color(228, 69, 69));
        buttonSair.setForeground(new java.awt.Color(51, 0, 255));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/saida-de-emergencia.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do sistema");
        getContentPane().add(buttonSair);
        buttonSair.setBounds(875, 100, 80, 60);

        buttonAgenda.setBackground(new java.awt.Color(228, 69, 69));
        buttonAgenda.setForeground(new java.awt.Color(51, 0, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda_1.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(100, 100, 80, 60);

        buttonPlanosDeSaude.setBackground(new java.awt.Color(228, 69, 69));
        buttonPlanosDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanosDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/plano-de-saude.png"))); // NOI18N
        buttonPlanosDeSaude.setToolTipText("Planos de saúde");
        buttonPlanosDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanosDeSaude);
        buttonPlanosDeSaude.setBounds(460, 100, 80, 60);

        buttonEspecialidades.setBackground(new java.awt.Color(228, 69, 69));
        buttonEspecialidades.setForeground(new java.awt.Color(51, 0, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/menu-button-of-three-horizontal-lines.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(370, 100, 80, 60);

        buttonPacientes.setBackground(new java.awt.Color(228, 69, 69));
        buttonPacientes.setForeground(new java.awt.Color(51, 0, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(190, 100, 80, 60);

        buttonMedicos.setBackground(new java.awt.Color(228, 69, 69));
        buttonMedicos.setForeground(new java.awt.Color(51, 0, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(280, 100, 80, 60);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setText("SISACON");
        panelHome.add(jLabel4);
        jLabel4.setBounds(50, 50, 320, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Sistema para Agendamento de Consultas");
        panelHome.add(jLabel3);
        jLabel3.setBounds(50, 110, 360, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Dados para Contanto:");
        panelHome.add(jLabel5);
        jLabel5.setBounds(50, 200, 270, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("E-mail: teren64421@canyona.com");
        panelHome.add(jLabel6);
        jLabel6.setBounds(50, 240, 250, 20);

        jLabel7.setText("Telefone: (11) 94002-0054");
        panelHome.add(jLabel7);
        jLabel7.setBounds(50, 260, 180, 20);

        jLabel8.setText("Site: www.sisacon.com.br");
        panelHome.add(jLabel8);
        jLabel8.setBounds(50, 280, 170, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 170, 945, 370);

        buttonhome.setBackground(new java.awt.Color(228, 69, 69));
        buttonhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/silhueta-de-icone-de-casa.png"))); // NOI18N
        buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonhome);
        buttonhome.setBounds(10, 100, 80, 60);

        setBounds(0, 0, 983, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhomeActionPerformed
        panelHome.setVisible(true);
        panelPlanosDeSaude.setVisible(false);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(250, 250, 250));
        buttonhome.setBackground(new java.awt.Color(228, 69, 69));


    }//GEN-LAST:event_buttonhomeActionPerformed

    private void buttonPlanosDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosDeSaudeActionPerformed

        panelHome.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        buttonPlanosDeSaude.setBackground(new java.awt.Color(228, 69, 69));
        buttonhome.setBackground(new java.awt.Color(250, 250, 250));
    }//GEN-LAST:event_buttonPlanosDeSaudeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanosDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonhome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelHome;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tablePlanosDeSaude;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(POSICAO_X,
                POSICAO_Y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(true);

    }

}
