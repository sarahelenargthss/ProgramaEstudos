package Janelas;

import ProgramaEstudos.QC;
import dto.QcDTO;
import java.util.ArrayList;
import java.util.Random;

public class Praticar extends javax.swing.JFrame {

    public Praticar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    ArrayList<QC> conteudos;
    ArrayList<QC> jogando;
    String resposta;

    Praticar(int codTema) {
        initComponents();
        this.setLocationRelativeTo(null);
        QcDTO qcDTO = new QcDTO();
        conteudos = qcDTO.retornaQCsTema(codTema);
        jogando = conteudos;
        resposta = "";
        praticando();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerResposta = new javax.swing.JButton();
        btnVoltarTema = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        termos = new java.awt.TextArea();
        resp = new java.awt.TextArea();

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

        btnProximo.setBackground(new java.awt.Color(255, 255, 255));
        btnProximo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/next.png"))); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel1.setText("Termo / Pergunta");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        jLabel2.setText("Conceito / Resposta");

        termos.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        termos.setMaximumSize(new java.awt.Dimension(100, 80));

        resp.setMaximumSize(new java.awt.Dimension(100, 80));

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
                .addGap(24, 24, 24)
                .addComponent(btnVoltarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerResposta, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(termos, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnVerResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVoltarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTemaActionPerformed
        MostraTema tema = new MostraTema();
        tema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarTemaActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
       resp.setText("");
        praticando();
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnVerRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRespostaActionPerformed
       resp.setText(resposta);
    }//GEN-LAST:event_btnVerRespostaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVerResposta;
    private javax.swing.JButton btnVoltarTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.TextArea resp;
    private java.awt.TextArea termos;
    // End of variables declaration//GEN-END:variables

    private void praticando() {
        if (jogando.isEmpty()) {
            jogando = conteudos;
        }
        Random random = new Random();
        int num = random.nextInt(jogando.size());
        int contador = -1;
        for (QC qc : jogando) {
            contador++;
            if (contador == num) {
                termos.setText(qc.getTermoPergunta());
                resposta = qc.getConceitoResposta();
                jogando.remove(qc);
                break;
            }
            
        }

    }
}
