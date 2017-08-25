package Janelas;

import ProgramaEstudos.Tema;
import dto.TemaDTO;
import dto.UsuarioDTO;
import java.util.ArrayList;

public class Pesquisar extends javax.swing.JFrame {

    public Pesquisar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    Pesquisar(String anterior) {
        initComponents();
        this.setLocationRelativeTo(null);
        mostraListas(anterior);
        pesquisa.setText(anterior);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        listTemasPesquisa = new java.awt.List();
        jPanel3 = new javax.swing.JPanel();
        listUsuariosPesquisa = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(795, 495));
        setMinimumSize(new java.awt.Dimension(795, 495));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("Pesquisar");

        pesquisa.setToolTipText("");
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
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

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N

        listTemasPesquisa.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        listTemasPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTemasPesquisaMouseClicked(evt);
            }
        });
        listTemasPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTemasPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listTemasPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listTemasPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tema", jPanel1);

        listUsuariosPesquisa.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        listUsuariosPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listUsuariosPesquisaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listUsuariosPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listUsuariosPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Usuários", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addGap(12, 12, 12)
                .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed

    }//GEN-LAST:event_pesquisaActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String busca = pesquisa.getText().trim();
        mostraListas(busca);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void listTemasPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTemasPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listTemasPesquisaActionPerformed

    private void listTemasPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTemasPesquisaMouseClicked
        String buscaTema = evt.getComponent().toString();
        Tema tema = new Tema();
        tema.setTituloTema(buscaTema.substring(buscaTema.indexOf("=") + 1, buscaTema.indexOf(" (")));
        tema.setMateriaTema(buscaTema.substring(buscaTema.indexOf("(") + 1, buscaTema.indexOf(")")));
        UsuarioDTO uDTO = new UsuarioDTO();
        tema.setNomeUsuario(uDTO.retornaLogado());
        TemaDTO tDTO = new TemaDTO();
        tema = tDTO.retornaTema(tDTO.verificaTema(tema));
        MostraTema mTema = new MostraTema(tema, (pesquisa.getText()));
        mTema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listTemasPesquisaMouseClicked

    private void listUsuariosPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUsuariosPesquisaMouseClicked
        String buscaTema = evt.getComponent().toString();
        String nome = buscaTema.substring(buscaTema.indexOf("=") + 1, buscaTema.indexOf("]"));
        Perfil use = new Perfil(pesquisa.getText(), nome);
        use.setVisible(true);
        use.setVisible(false);
    }//GEN-LAST:event_listUsuariosPesquisaMouseClicked

    public void mostraListas(String busca) {
        if (!busca.equals("")) {
            TemaDTO tDTO = new TemaDTO();
            UsuarioDTO useDTO = new UsuarioDTO();
            ArrayList<Tema> temas = tDTO.pesquisaTemas(busca);
            listTemasPesquisa.removeAll();
            UsuarioDTO uDTO = new UsuarioDTO();
            String logado = uDTO.retornaLogado();
            if (temas.size() > 0) {
                for (Tema t : temas) {
                    if(logado.equals(t.getNomeUsuario()) || !t.isPrivado()){
                        listTemasPesquisa.add(t.getTituloTema() + " (" + t.getMateriaTema() + ")");
                    }
                }
            } else {
                listTemasPesquisa.add("Não foram encontrados resultados para '" + busca + "'");
            }
            listUsuariosPesquisa.removeAll();
            ArrayList<String> usuarios = useDTO.pesquisaTemas(busca);
            if (usuarios.size() > 0) {
                for (String u : usuarios) {
                    listUsuariosPesquisa.add(u);
                }
            } else {
                listUsuariosPesquisa.add("Não foram encontrados resultados para '" + busca + "'");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.List listTemasPesquisa;
    private java.awt.List listUsuariosPesquisa;
    private javax.swing.JTextField pesquisa;
    // End of variables declaration//GEN-END:variables
}
