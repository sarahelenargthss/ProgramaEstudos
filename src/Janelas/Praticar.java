package Janelas;

import ProgramaEstudos.QC;
import dto.QcDTO;
import dto.TemaDTO;
import java.util.ArrayList;
import java.util.Random;

public class Praticar extends javax.swing.JFrame {
//tela usada para estudar ou praticar os conteudos de determinado tema

    public Praticar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    ArrayList<QC> conteudos;
    //ArrayList<QC> jogando;
    int posicao;
    String resposta;
    private int codTema;
    private String anterior;

    Praticar(int codTema, String anterior) {
        initComponents();
        this.setLocationRelativeTo(null);
        QcDTO qcDTO = new QcDTO();
        conteudos = qcDTO.retornaQCsTema(codTema);
        //jogando = conteudos;
        resposta = "";
        this.anterior = anterior;
        this.codTema = codTema;
        posicao = 0;
        //no inicio o botao anterior está disenable
        btnAnterior.setEnabled(false);
        //chama-se método praticando
        praticando();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerResposta = new javax.swing.JButton();
        btnVoltarTema = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        termos = new java.awt.TextArea();
        resp = new java.awt.TextArea();
        btnProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerResposta.setBackground(new java.awt.Color(255, 255, 255));
        btnVerResposta.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnVerResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/check.png"))); // NOI18N
        btnVerResposta.setText("Ver Resposta");
        btnVerResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRespostaActionPerformed(evt);
            }
        });

        btnVoltarTema.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarTema.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnVoltarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnVoltarTema.setText("Voltar");
        btnVoltarTema.setToolTipText("Voltar ao tema");
        btnVoltarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTemaActionPerformed(evt);
            }
        });

        btnAnterior.setBackground(new java.awt.Color(255, 255, 255));
        btnAnterior.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setText("Termo / Pergunta");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel2.setText("Conceito / Resposta");

        termos.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        termos.setMaximumSize(new java.awt.Dimension(100, 80));

        resp.setMaximumSize(new java.awt.Dimension(100, 80));

        btnProximo.setBackground(new java.awt.Color(255, 255, 255));
        btnProximo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/next.png"))); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnVoltarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(termos, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resp, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(termos, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(resp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTemaActionPerformed
        //botão voltar orienta ao mostra tema
        TemaDTO tDTO = new TemaDTO();
        MostraTema tema = new MostraTema(tDTO.retornaTema(codTema), anterior);
        tema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarTemaActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        //para voltar um conteudo, a posição na ArrayList diminui em uma casa
        resp.setText("");
        posicao--;
        //se voltou-se para a primeira posição (no caso 0), o botão anterior é desabilitado
        if (posicao == 0) {
            btnAnterior.setEnabled(false);
        } else {
            btnAnterior.setEnabled(true);
        }
        //chama-se método praticando
        praticando();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnVerRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRespostaActionPerformed
        //ver resposta coloca a resposta para o termo ou pergunta na lista da direita
        resp.setText(conteudos.get(posicao).getConceitoResposta());
    }//GEN-LAST:event_btnVerRespostaActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        //botão próximo aumenta em uma casa a posição na ArrayLIst
        resp.setText("");
        posicao++;
        //se chegou-se na ultima casa, botão proximo é desabilitado
        if (posicao == conteudos.size() - 1) {
            btnProximo.setEnabled(false);
        } else {
            btnProximo.setEnabled(true);
        }
        praticando();
    }//GEN-LAST:event_btnProximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVerResposta;
    private javax.swing.JButton btnVoltarTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextArea resp;
    private java.awt.TextArea termos;
    // End of variables declaration//GEN-END:variables

    private void praticando() {
        //verifica posição na ArrayList para (des)habilitar os botões
        if (posicao == 0) {
            btnAnterior.setEnabled(false);
            btnProximo.setEnabled(true);
        } else if (posicao == conteudos.size() - 1) {
            btnProximo.setEnabled(false);
            btnAnterior.setEnabled(true);
        } else {
            btnProximo.setEnabled(true);
            btnAnterior.setEnabled(true);
        }
        //mostra-se o termo ou questão do conteudo na vez
        termos.setText(conteudos.get(posicao).getTermoPergunta());

    }
}
