package Janelas;

import ProgramaEstudos.Tema;
import dto.QcDTO;
import dto.TemaDTO;
import dto.UsuarioDTO;
import javax.swing.JOptionPane;
import util.Util;

public class NovoTema extends javax.swing.JFrame {

    private int codigoTema;

    public NovoTema() {
        initComponents();
        this.setLocationRelativeTo(null);
        //altera TooLTipText e põe botão salvar como disenable pois é necessário ter,
        //pelo menos, um conteúdo por tema
        btnSalvarTema.setToolTipText("É necessário cadastrar  pelo menos dois conteúdos....");
        btnSalvarTema.setEnabled(false);
        codigoTema = 0;
    }

    public NovoTema(int cod) {
        initComponents();
        this.setLocationRelativeTo(null);
        QcDTO qcDTO = new QcDTO();
        if (qcDTO.retornaQCsTema(cod).size() >= 1) {
            //se o tema tem pelo menos um conteudo salvo
            btnSalvarTema.setToolTipText("Salvar Tema...");
            btnSalvarTema.setEnabled(true);
        } else {
            //senão, altera TooLTipText e põe botão salvar como disenable pois é necessário ter,
            //pelo menos, um conteúdo por tema
            btnSalvarTema.setToolTipText("É necessário cadastrar  pelo menos um conteúdo....");
            btnSalvarTema.setEnabled(false);
        }
        TemaDTO temaDTO = new TemaDTO();
        //coloca novamente os dados do tema que etá sendo cadastrado
        Tema tema = temaDTO.retornaTema(cod);
        acessoPrivado.setSelected(tema.isPrivado());
        if (tema.getTituloTema().equals("#")) {
            tema.setTituloTema("");
        }
        tituloNovoTema.setText(tema.getTituloTema());
        materiaNovoTema.setSelectedIndex(retornaNumeroMateria(tema.getMateriaTema()));
        this.codigoTema = cod;
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

        materiaNovoTema.setBackground(new java.awt.Color(254, 254, 254));
        materiaNovoTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        materiaNovoTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione a Matéria>", "Matemática", "Biologia", "Geografia", "História", "Física", "Sociologia", "Química", "Português", "Literatura", "Espanhol", "Inglês", "Filosofia" }));
        materiaNovoTema.setToolTipText("Selecione a matéria");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel2.setText("Matérias");

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        jLabel3.setText("Título do Tema");

        tituloNovoTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        tituloNovoTema.setToolTipText("Título do tema (30 caracteres)");
        tituloNovoTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloNovoTemaActionPerformed(evt);
            }
        });

        acessoPrivado.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        acessoPrivado.setText("Privado");
        acessoPrivado.setToolTipText("Padrão público, selecione para torná-lo privado");

        btnNovoConceito.setBackground(new java.awt.Color(254, 254, 254));
        btnNovoConceito.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnNovoConceito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        btnNovoConceito.setText("Adicionar Conteúdo");
        btnNovoConceito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoConceitoActionPerformed(evt);
            }
        });

        btnSalvarTema.setBackground(new java.awt.Color(254, 254, 254));
        btnSalvarTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnSalvarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        btnSalvarTema.setText("Salvar Tema");
        btnSalvarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarTemaActionPerformed(evt);
            }
        });

        btnVoltarMenu.setBackground(new java.awt.Color(254, 254, 254));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tituloNovoTema)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(acessoPrivado))
                        .addComponent(materiaNovoTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalvarTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoConceito, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
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
                    .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tituloNovoTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloNovoTemaActionPerformed

    }//GEN-LAST:event_tituloNovoTemaActionPerformed

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        //botão voltar orienta ao menu, mas, antes verifica, se algu tema estava sendo cadastrado
        //e não foi salvo, oferecendo essa opção ao usuario
        boolean salvouExcluiu = true;
        if (materiaNovoTema.getSelectedIndex() != 0 || !Util.validaString(tituloNovoTema.getText().trim())) {
            if (Util.mensagemOpcao("Deseja salvar esse tema antes de sair?", "Salvar tema?") == 0) {
                QcDTO qcDTO = new QcDTO();
                if (qcDTO.retornaQCsTema(codigoTema).size() != 0) {
                    salvarTema();
                } else {
                    Util.mensagem("Você precisa cadastrar pelo menos um conteúdo.", "Ação inválida!", JOptionPane.ERROR_MESSAGE);
                    salvouExcluiu = false;
                }
            } else if (codigoTema != 0) {
                TemaDTO tDTO = new TemaDTO();
                tDTO.excluiTema(codigoTema);
            }
        }
        if (salvouExcluiu) {
            Menu menu = new Menu();
            menu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVoltarMenuActionPerformed


    private void btnNovoConceitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoConceitoActionPerformed
        String titulo = tituloNovoTema.getText().trim();
        String materia = (String) materiaNovoTema.getSelectedItem();
        CadastrarQC cadastrarQC;
        UsuarioDTO useDTO = new UsuarioDTO();
        Tema tema;
        //quando o botão novo conceito é acionado é preciso salvar o tema
        //que está seno cadastrado para que se possa continuar seu casdastro posteriormente
        if (!(materia.equals("<Selecione a Matéria>") || Util.validaString(titulo))) {
            //se o usuário já tiver preenchido alguma coisa e quiser adicionar um novo conteúdo,
            //o que ele já cadastrou terá que ser salvo para que quando ele volte seus dados ainda "estejam la"
            //então seus dados serão salvos no BD e serão depois identificados com uma cerquilha no começo do nome da matéria
            //o nome da matéia possui uma lista de dados possíveis, assim se pode ter certeza que não haverá outro tema com a cerquilha
            //objeto de tema é criado: 
            tema = new Tema(titulo, acessoPrivado.isSelected(), materia, codigoTema, useDTO.retornaLogado());
        } else {
            //se o usuario não digitou nada ainda
            //salva um tema com valores que no futuro serão modificados
            //para quando for salvar os conteúdos já existir um código e não dar erro na hora de inserir os conteúdos 
            tema = new Tema("#", false, "", 0, useDTO.retornaLogado());
        }
        TemaDTO temaDTO = new TemaDTO();
        //pré-tema é salvo no BD:
        if (tema.getTituloTema().length() <= 30) {
            //verifica se o tema já foi cadastrado em outro momento por esse usuario
            if (temaDTO.verificaTema(tema) == 0) {
                tema.setMateriaTema("#" + tema.getMateriaTema());
                boolean salvou;
                if (codigoTema == 0) {
                    salvou = temaDTO.salvaTema(tema);
                } else {
                    //se já há um pré-tema salvo desse tema no BD, os dados são somente atualizados
                    salvou = temaDTO.atualizaTema(tema);
                }
                if (salvou) {
                    tema.retornaCod();
                    cadastrarQC = new CadastrarQC(tema.getCodTema());
                    cadastrarQC.setVisible(true);
                    cadastrarQC.setVisible(true);
                    this.setVisible(false);
                }
            } else {
                Util.mensagem("Esse tema já foi cadastrado em sua conta.", "Tema já cadastrado!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Util.mensagem("O título não pode ter mais de 30 caracteres.", "Título inválido!", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnNovoConceitoActionPerformed

    private void btnSalvarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarTemaActionPerformed
        //botao salvar chama metodo salvarTema()
        salvarTema();
    }//GEN-LAST:event_btnSalvarTemaActionPerformed

    private void salvarTema() {
        String titulo = tituloNovoTema.getText().trim();
        String materia = (String) materiaNovoTema.getSelectedItem();
        //valida dados
        if (materia.equals("<Selecione a Matéria>") || Util.validaString(titulo)) {
            Util.mensagem("Todos os campos devem ser preenchidos!", "Entrada inválida!", JOptionPane.ERROR_MESSAGE);
        } else {
            UsuarioDTO uDTO = new UsuarioDTO();
            TemaDTO tDTO = new TemaDTO();
            Tema tema = new Tema(titulo, acessoPrivado.isSelected(), materia, codigoTema, uDTO.retornaLogado());
            //salva os dados, atualizando seu pré-tema
            if (tDTO.atualizaTema(tema)) {
                Util.mensagem("O novo tema foi salvo no BD.", "Salvo com sucesso!", JOptionPane.INFORMATION_MESSAGE);
                tituloNovoTema.setText("");
                materiaNovoTema.setSelectedIndex(0);
                acessoPrivado.setSelected(false);
            }
        }
        codigoTema = 0;
        btnSalvarTema.setToolTipText("É necessário cadastrar  pelo menos um conteúdo....");
        btnSalvarTema.setEnabled(false);
    }

    private int retornaNumeroMateria(String materiaTema) {
        //busca o numero da materia que fora selecionada 
        //para pô-la como selecionada novamente
        String[] materias = new String[13];

        int numMat = 0;
        materiaNovoTema.getItemAt(6);
        for (int i = 0; i <= 12; i++) {
            materias[i] = materiaNovoTema.getItemAt(i);
        }
        for (int i = 0; i <= materias.length - 1; i++) {
            if (materiaTema.replace("#", "").equals(materias[i])) {
                numMat = i;
            }
        }
        return numMat;
    }

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
