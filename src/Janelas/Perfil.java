package Janelas;

import ProgramaEstudos.Tema;
import dto.TemaDTO;
import dto.UsuarioDTO;
import java.util.ArrayList;

public class Perfil extends javax.swing.JFrame {

    private String anterior;

    public Perfil(String anterior, String usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.anterior = anterior;
        if(!anterior.equals("menu")){
            btnDeslogar.setVisible(false);
        }
        String pLetra = String.valueOf(usuario.charAt(0));
        labNomeUsuario.setText(usuario.replaceFirst(pLetra, pLetra.toUpperCase()));
        montaPerfil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNomeUsuario = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        listTemasUsuario = new java.awt.List();
        btnDeslogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labNomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        labNomeUsuario.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        labNomeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user (2).png"))); // NOI18N

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        listTemasUsuario.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        listTemasUsuario.setMaximumSize(new java.awt.Dimension(40, 80));
        listTemasUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTemasUsuarioMouseClicked(evt);
            }
        });
        listTemasUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTemasUsuarioActionPerformed(evt);
            }
        });

        btnDeslogar.setBackground(new java.awt.Color(255, 255, 255));
        btnDeslogar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/error.png"))); // NOI18N
        btnDeslogar.setText("Logout");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(labNomeUsuario)
                .addGap(0, 484, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeslogar))
                    .addComponent(listTemasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(labNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(listTemasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montaPerfil() {
        //puxar temas e colocar na área de texto
        TemaDTO tDTO = new TemaDTO();
        listTemasUsuario.removeAll();
        UsuarioDTO uDTO = new UsuarioDTO();
        String logado = uDTO.retornaLogado();
        ArrayList<Tema> temas = tDTO.retornaTemasUsuario();
        if (temas != null) {
            for (Tema t : temas) {
                if (logado.equals(t.getNomeUsuario()) || !t.isPrivado()) {
                    listTemasUsuario.add(t.getTituloTema() + " (" + t.getMateriaTema() + ")");
                }
            }
        }
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if (anterior.equals("menu")) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        } else {
            Pesquisar pesquisar = new Pesquisar(anterior);
            pesquisar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        UsuarioDTO aux = new UsuarioDTO();
        String nomeLogado = aux.retornaLogado();
        if (!nomeLogado.equals("")) {
            if (aux.loginLogout(nomeLogado, false)) {
                Menu menu = new Menu();
                menu.setVisible(true);
                this.setVisible(false);
            }

        }
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void listTemasUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTemasUsuarioActionPerformed

    }//GEN-LAST:event_listTemasUsuarioActionPerformed

    private void listTemasUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTemasUsuarioMouseClicked
        String buscaTema = evt.getComponent().toString();
        Tema tema = new Tema();
        tema.setTituloTema(buscaTema.substring(buscaTema.indexOf("=") + 1, buscaTema.indexOf(" (")));
        tema.setMateriaTema(buscaTema.substring(buscaTema.indexOf("(") + 1, buscaTema.indexOf(")")));
        UsuarioDTO uDTO = new UsuarioDTO();
        tema.setNomeUsuario(uDTO.retornaLogado());
        TemaDTO tDTO = new TemaDTO();
        tema = tDTO.retornaTema(tDTO.verificaTema(tema));
        MostraTema mTema = new MostraTema(tema, (anterior + "/perfil"));
        mTema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_listTemasUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeslogar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel labNomeUsuario;
    private java.awt.List listTemasUsuario;
    // End of variables declaration//GEN-END:variables

}
