//Brenna Corine Struck 
//Nathalia Fernanda Tiedt
//Sara Helena Régis Theiss
//Turma 302

/*Banco de Dados
CREATE DATABASE PE CHARSET LATIN1 COLLATE LATIN1_GENERAL_CS;
USE PE;

CREATE TABLE USUARIO(
	NOME_USUARIO VARCHAR(60) PRIMARY KEY,
    SENHA_USUARIO VARCHAR(60) NOT NULL,
    USUARIO_LOGADO BOOLEAN NOT NULL
);

CREATE TABLE TEMA(
	COD_TEMA INT AUTO_INCREMENT PRIMARY KEY,
    TITULO_TEMA VARCHAR(60) NOT NULL,
    MATERIA_TEMA VARCHAR(20) NOT NULL,
    PRIVADO BOOLEAN NOT NULL,
    NOME_USUARIO VARCHAR(60) NOT NULL,
    FOREIGN KEY(NOME_USUARIO) REFERENCES USUARIO(NOME_USUARIO)
);

CREATE TABLE QC(
	TERMO_PERGUNTA VARCHAR(2000) NOT NULL,
    CONCEITO_RESPOSTA VARCHAR(2000) NOT NULL,
    COD_TEMA INT NOT NULL,
    FOREIGN KEY(COD_TEMA) REFERENCES TEMA(COD_TEMA)
);
 */
package Janelas;

import dto.UsuarioDTO;

public class Menu extends javax.swing.JFrame {
//primeira tela a ser executada, que possui todas as opções de menu

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        UsuarioDTO useDTO = new UsuarioDTO();
        //atribui usuario logado a nome
        String nome = useDTO.retornaLogado();
        if (!nome.equals("")) {
            //se houver usuario logado o botão de login fica disanable
            btnLogin.setEnabled(false);
            //mostra-se no canto da tela o nome do usuario logado
            String pLetra = String.valueOf(nome.charAt(0));
            nomeLogado.setText(nome.replaceFirst(pLetra, pLetra.toUpperCase()));
        } else {
            //se não houver usuário logado, os botões perfil e cadastrar tema ficam disenable
            btnPerfil.setEnabled(false);
            btnCadastrarTema.setEnabled(false);
            //nada é mostrado no lugar de nome
            nomeLogado.setText("");
        }
    }

    Menu(String nome) {
        initComponents();
        this.setLocationRelativeTo(null);
        //nome do usuario logado é mostrado na tela após feito o cadastro e botão login fica disenable
        String pLetra = String.valueOf(nome.charAt(0));
        nomeLogado.setText(nome.replaceFirst(pLetra, pLetra.toUpperCase()));
        btnLogin.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPerfil = new javax.swing.JButton();
        btnCadastrarTema = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeLogado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPerfil.setBackground(new java.awt.Color(255, 255, 255));
        btnPerfil.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        btnPerfil.setText("Perfil");
        btnPerfil.setToolTipText("Ver perfil");
        btnPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerfilActionPerformed(evt);
            }
        });

        btnCadastrarTema.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrarTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        btnCadastrarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        btnCadastrarTema.setText("Cadastrar Tema");
        btnCadastrarTema.setToolTipText("Cadastrar Novo Tema");
        btnCadastrarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarTemaActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setToolTipText("Pesquisar tema / matéria / usuário");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/heart.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setToolTipText("Logar na conta de usuário");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("Programa de Estudos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/library (1).png"))); // NOI18N

        nomeLogado.setText("nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3)
                        .addGap(114, 114, 114))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastrarTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addGap(247, 247, 247))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeLogado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeLogado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnCadastrarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerfilActionPerformed
        //vai para tela perfil, passando a String "menu" para que seja identificado o lugar que a chamou
        //passa-se também o nome do usuario logado
        Perfil perfil = new Perfil("menu", nomeLogado.getText());
        perfil.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPerfilActionPerformed

    private void btnCadastrarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarTemaActionPerformed
        //chama-se a tela de cadastrar tema
        NovoTema novoTema = new NovoTema();
        novoTema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCadastrarTemaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        //chama-se a tela de pesquisa
        Pesquisar pesquisar = new Pesquisar();
        pesquisar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //chama-se a tela de login (que terá as opções de login ou novos cadastros)
        NovoLogin telaLogin = new NovoLogin(this, true);
        telaLogin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarTema;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPerfil;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nomeLogado;
    // End of variables declaration//GEN-END:variables

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

}
