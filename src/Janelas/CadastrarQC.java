package Janelas;

import ProgramaEstudos.QC;
import dto.QcDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Util;

public class CadastrarQC extends javax.swing.JFrame {

    public CadastrarQC() {
        initComponents();
        mostraLista(null);
    }

    private int codTemaCadastro;

    CadastrarQC(int codTema) {
        codTemaCadastro = codTema;
        initComponents();
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

        titulo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        titulo.setText("Novo Conteúdo");

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
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

        btnVoltarCadastro.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarCadastro.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnVoltarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnVoltarCadastro.setText("Voltar");
        btnVoltarCadastro.setToolTipText("Voltar ao cadastro do tema");
        btnVoltarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(327, 327, 327))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(listQC, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(titulo1)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labConceitoResposta)
                    .addComponent(labTermoPergunta)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVoltarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labTermoPergunta)
                    .addComponent(titulo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labConceitoResposta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(listQC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (Util.validaString(conceitoResposta.getText()) || Util.validaString(termoPergunta.getText())) {
            Util.mensagemErro("Algum campo não foi preenchido", "Preencha todos os campos!", JOptionPane.ERROR_MESSAGE);
        } else {
            int existe = 0;
            QC qc = new QC(termoPergunta.getText().trim(), conceitoResposta.getText().trim(), codTemaCadastro);
            QcDTO qcDTO = new QcDTO();
            existe = qcDTO.verificaQC(qc);
            if (existe == 1) {
                qcDTO.salvaConteudo(qc);
                mostraLista(qc);
            } else if (existe == 2) {
                //já existe no BD
                Util.mensagemErro("Esse conteúdo já foi cadastrado anteriormente.", "Conteúdo já existente!", JOptionPane.ERROR_MESSAGE);
            }
            termoPergunta.setText("");
            conceitoResposta.setText("");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroActionPerformed

        NovoTema novoTema = new NovoTema(codTemaCadastro);
        novoTema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarCadastroActionPerformed

    private void listQCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listQCActionPerformed

    }//GEN-LAST:event_listQCActionPerformed

    private void mostraLista(QC qc) {
        QcDTO qcDTO = new QcDTO();
        ArrayList<QC> qcS = qcDTO.retornaQCs(codTemaCadastro);
        if (qcS != null) {
            for (QC qcObj : qcS) {
                listQC.add(qcObj.getTermoPergunta());
                System.out.println("termo: " + qcObj.getTermoPergunta());
                System.out.println("conceito : " + qcObj.getConceitoResposta());
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
