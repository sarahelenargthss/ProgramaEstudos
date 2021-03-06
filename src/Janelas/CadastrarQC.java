package Janelas;

import ProgramaEstudos.QC;
import dto.QcDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Util;

public class CadastrarQC extends javax.swing.JFrame {
//faz o cadastro de novos conteudos para determinado tema

    public CadastrarQC() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostraLista(null);
    }

    private int codTemaCadastro;

    CadastrarQC(int codTema) {
        codTemaCadastro = codTema;
        initComponents();
        this.setLocationRelativeTo(null);
        mostraLista(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        labTermoPergunta = new javax.swing.JLabel();
        labConceitoResposta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        conceitoResposta = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        termoPergunta = new javax.swing.JTextArea();
        btnVoltarCadastro = new javax.swing.JButton();
        listQC = new java.awt.List();
        titulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(795, 495));
        setMinimumSize(new java.awt.Dimension(795, 495));

        titulo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        titulo.setText("Novo Conteúdo");

        btnSalvar.setBackground(new java.awt.Color(254, 254, 254));
        btnSalvar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        btnSalvar.setText("Salvar Conteúdo");
        btnSalvar.setToolTipText("");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        labTermoPergunta.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labTermoPergunta.setText("Termo / Pergunta");

        labConceitoResposta.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        labConceitoResposta.setText("Conceito / Resposta");

        conceitoResposta.setColumns(20);
        conceitoResposta.setRows(5);
        jScrollPane2.setViewportView(conceitoResposta);

        termoPergunta.setColumns(20);
        termoPergunta.setRows(5);
        termoPergunta.setToolTipText("");
        jScrollPane3.setViewportView(termoPergunta);

        btnVoltarCadastro.setBackground(new java.awt.Color(254, 254, 254));
        btnVoltarCadastro.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnVoltarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnVoltarCadastro.setText("Voltar");
        btnVoltarCadastro.setToolTipText("Voltar ao cadastro do tema");
        btnVoltarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroActionPerformed(evt);
            }
        });

        listQC.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        listQC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listQCActionPerformed(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        titulo1.setText("Já adicionados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(327, 327, 327))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(titulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(listQC, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labConceitoResposta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labTermoPergunta)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnVoltarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar)))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTermoPergunta)
                    .addComponent(titulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labConceitoResposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(listQC, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (Util.validaString(conceitoResposta.getText()) || Util.validaString(termoPergunta.getText())) {
            //valida para que todos os campos sejam preenchidos
            Util.mensagem("Algum campo não foi preenchido", "Preencha todos os campos!", JOptionPane.ERROR_MESSAGE);
        } else {
            int existe = 0;
            QC qc = new QC(termoPergunta.getText().trim(), conceitoResposta.getText().trim(), codTemaCadastro);
            QcDTO qcDTO = new QcDTO();
            //verifica se o conteudo foi cadastrado anteriormente nesse mesmo tema
            existe = qcDTO.verificaQC(qc);
            if (existe == 1) {
                //se ainda não há cdastrado o salva no BD
                if (qcDTO.salvaConteudo(qc)) {
                    Util.mensagem("Os dados foram salvos no Banco de Dados.", "Salvo com sucesso!", WIDTH);
                }
                //chama metodo mostraLista()
                mostraLista(qc);
            } else if (existe == 2) {
                //quando já existe no BD, mostra-se uma mensagem de erro
                Util.mensagem("Esse conteúdo já foi cadastrado anteriormente.", "Conteúdo já existente!", JOptionPane.ERROR_MESSAGE);
            }
            //ao fim, os campos são limpos
            termoPergunta.setText("");
            conceitoResposta.setText("");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroActionPerformed
//botão voltar orienta ao novo tema onde se tem o cadastro do tema a qual os conteudos pertencem
        NovoTema novoTema = new NovoTema(codTemaCadastro);
        novoTema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarCadastroActionPerformed

    private void listQCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listQCActionPerformed

    }//GEN-LAST:event_listQCActionPerformed

    private void mostraLista(QC qc) {
        //método mostraLista() mostra a lista de conteudos cadastrados para aquele determinado tema
        QcDTO qcDTO = new QcDTO();
        listQC.removeAll();
        ArrayList<QC> qcS = qcDTO.retornaQCsTema(codTemaCadastro);
        if (qcS != null) {
            for (QC qcObj : qcS) {
                listQC.add(qcObj.getTermoPergunta());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltarCadastro;
    private javax.swing.JTextArea conceitoResposta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labConceitoResposta;
    private javax.swing.JLabel labTermoPergunta;
    private java.awt.List listQC;
    private javax.swing.JTextArea termoPergunta;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables

}
