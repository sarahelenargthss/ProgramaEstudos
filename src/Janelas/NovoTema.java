package Janelas;

import ProgramaEstudos.QC;
import ProgramaEstudos.Tema;
import dto.TemaDTO;
import dto.UsuarioDTO;
import java.util.ArrayList;
import util.Util;

public class NovoTema extends javax.swing.JFrame {

    public NovoTema() {
        initComponents();
        btnSalvarTema.setEnabled(false);
    }

    public NovoTema(QC param) {
        initComponents();
    }
    
    NovoTema(Tema tema, ArrayList<QC> qcS) {
        initComponents();
        tituloNovoTema.setText(tema.getTituloTema());
        acessoPrivado.setSelected(tema.isPrivado());
        materiaNovoTema.setSelectedItem(tema.getMateriaTema());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        materiaNovoTema = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tituloNovoTema = new javax.swing.JTextField();
        acessoPrivado = new javax.swing.JCheckBox();
        btnNovoConceito = new javax.swing.JButton();
        btnSalvarTema = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 48)); // NOI18N
        jLabel1.setText("Novo Tema");

        materiaNovoTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        materiaNovoTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a Matéria>", "Matemática", "Biologia", "Geografia", "História", "Física", "Sociologia", "Química", "Português", "Literatura", "Espanhol", "Inglês", "Filosofia" }));
        materiaNovoTema.setToolTipText("Selecione a matéria");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel2.setText("Matérias");

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel3.setText("Título do Tema");

        tituloNovoTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        tituloNovoTema.setToolTipText("Digite o título do tema");
        tituloNovoTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloNovoTemaActionPerformed(evt);
            }
        });

        acessoPrivado.setBackground(new java.awt.Color(255, 255, 255));
        acessoPrivado.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        acessoPrivado.setText("Privado");
        acessoPrivado.setToolTipText("Padrão público, selecione para torná-lo privado");

        btnNovoConceito.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoConceito.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnNovoConceito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        btnNovoConceito.setText("Adicionar Conteúdo");
        btnNovoConceito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoConceitoActionPerformed(evt);
            }
        });

        btnSalvarTema.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvarTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnSalvarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        btnSalvarTema.setText("Salvar");
        btnSalvarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTemaActionPerformed(evt);
            }
        });

        btnVoltarMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarMenu.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnVoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/house (1).png"))); // NOI18N
        btnVoltarMenu.setText("Voltar");
        btnVoltarMenu.setToolTipText("Voltar ao menu");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloNovoTema)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acessoPrivado))
                            .addComponent(materiaNovoTema, 0, 289, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnNovoConceito, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(materiaNovoTema, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(acessoPrivado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovoConceito, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tituloNovoTema, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloNovoTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloNovoTemaActionPerformed

    }//GEN-LAST:event_tituloNovoTemaActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarMenuActionPerformed


    private void btnNovoConceitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoConceitoActionPerformed
        CadastrarQC cadastrarQC;
        String titulo = tituloNovoTema.getText().trim();
        if (!(materiaNovoTema.getSelectedItem().equals("<Selecione a Matéria>") && !Util.validaString(titulo))) {
            //se o usuário já tiver preenchido alguma coisa e quiser adicionar um novo conteúdo,
            //o que ele já cadastrou terá que ser salvo para que quando ele volte seus dados ainda "estejam la"
            UsuarioDTO useDTO = new UsuarioDTO();
            //então seus dados serão salvos no BD e serão depois identificados com uma cerquilha no começo do nome da matéria
            //o nome da matéia possui uma lista de dados possíveis, assim se pode ter certeza que não haverá outro tema com a cerquilha
            //objeto de tema é criado:
            Tema tema = new Tema(titulo, acessoPrivado.isSelected(), ("#" + (String) materiaNovoTema.getSelectedItem()), 0, useDTO.retornaLogado());
            TemaDTO temaDTO = new TemaDTO();
            //pré-tema é salvo no BD:
            temaDTO.salvaTema(tema);
        }
        cadastrarQC = new CadastrarQC();
        cadastrarQC.setVisible(true);
        cadastrarQC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNovoConceitoActionPerformed

    private void btnSalvarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTemaActionPerformed

    }//GEN-LAST:event_btnSalvarTemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox acessoPrivado;
    private javax.swing.JButton btnNovoConceito;
    private javax.swing.JButton btnSalvarTema;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> materiaNovoTema;
    private javax.swing.JTextField tituloNovoTema;
    // End of variables declaration//GEN-END:variables
}
