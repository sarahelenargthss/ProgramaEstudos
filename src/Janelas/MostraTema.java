package Janelas;

import ProgramaEstudos.QC;
import ProgramaEstudos.Tema;
import dto.QcDTO;
import java.util.ArrayList;

public class MostraTema extends javax.swing.JFrame {

    public MostraTema() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private Tema tema;

    private String anterior;
    
    MostraTema(Tema tema, String anterior) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tema = tema;
        this.anterior = anterior;
        labNomeTema.setText(tema.getTituloTema());
        privado.setVisible(tema.isPrivado());
        labMateriaTema.setText(tema.getMateriaTema());
        QcDTO qcDTO = new QcDTO();
        listConteudos.removeAll();
        ArrayList<QC> qcS = qcDTO.retornaQCsTema(tema.getCodTema());
        if (qcS != null) {
            for (QC qcObj : qcS) {
                listConteudos.add(qcObj.getTermoPergunta());
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labNomeTema = new javax.swing.JLabel();
        labMateriaTema = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        privado = new javax.swing.JLabel();
        btnPraticar = new javax.swing.JButton();
        lab = new javax.swing.JLabel();
        listConteudos = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(795, 495));
        setMinimumSize(new java.awt.Dimension(795, 495));

        labNomeTema.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        labNomeTema.setText("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

        labMateriaTema.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        labMateriaTema.setText("Matéria do Tema ");

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/previous.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        privado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/padlockt.png"))); // NOI18N
        privado.setText("jLabel2");

        btnPraticar.setBackground(new java.awt.Color(255, 255, 255));
        btnPraticar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 18)); // NOI18N
        btnPraticar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/books.png"))); // NOI18N
        btnPraticar.setText("Praticar");

        lab.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        lab.setText("Conteúdos Cadastrados:");

        listConteudos.setBackground(new java.awt.Color(254, 254, 254));
        listConteudos.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labMateriaTema)
                            .addComponent(lab)
                            .addComponent(listConteudos, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(privado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(labNomeTema, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPraticar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labNomeTema)
                    .addComponent(btnPraticar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(privado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labMateriaTema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lab)
                .addGap(19, 19, 19)
                .addComponent(listConteudos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        if(anterior.indexOf("/") > 0){
            String[] ant = anterior.split("/");
            Perfil perfil = new Perfil(ant[0], tema.getNomeUsuario());
            perfil.setVisible(true);
            perfil.setVisible(false);
        }else{
            Pesquisar pesquisar = new Pesquisar(anterior);
            pesquisar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPraticar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel labMateriaTema;
    private javax.swing.JLabel labNomeTema;
    private java.awt.List listConteudos;
    private javax.swing.JLabel privado;
    // End of variables declaration//GEN-END:variables
}
