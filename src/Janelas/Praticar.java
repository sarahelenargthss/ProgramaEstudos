package Janelas;

public class Praticar extends javax.swing.JFrame {

    public Praticar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerResposta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTermoPergunta = new java.awt.List();
        jScrollPane2 = new javax.swing.JScrollPane();
        listConceitoResposta = new java.awt.List();
        btnVoltarTema = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerResposta.setBackground(new java.awt.Color(255, 255, 255));
        btnVerResposta.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnVerResposta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/check.png"))); // NOI18N
        btnVerResposta.setText("Ver Resposta");

        jScrollPane1.setViewportView(listTermoPergunta);

        jScrollPane2.setViewportView(listConceitoResposta);

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

        btnAnterior.setBackground(new java.awt.Color(255, 255, 255));
        btnAnterior.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnAnterior.setText("Anterior");

        jLabel1.setText("*Abaixo aparecerão as perguntas / termos");

        jLabel2.setText("*Abaixo aparecerão as respostas / conceitos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarTema)
                .addGap(119, 119, 119)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerResposta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProximo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnVoltarTema, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerResposta)
                            .addComponent(btnAnterior)
                            .addComponent(btnProximo))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTemaActionPerformed
        Tema tema = new Tema();
        tema.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarTemaActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        
    }//GEN-LAST:event_btnProximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVerResposta;
    private javax.swing.JButton btnVoltarTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.List listConceitoResposta;
    private java.awt.List listTermoPergunta;
    // End of variables declaration//GEN-END:variables
}
