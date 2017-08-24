package dto;

import ProgramaEstudos.QC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Util;

public class QcDTO {

    public int verificaQC(QC qc) {
        String tp = "";
        String cr = "";
        try {
            PreparedStatement p = Util.retornaConexao("SELECT TERMO_PERGUNTA, CONCEITO_RESPOSTA FROM QC WHERE COD_TEMA = ?");
            p.setInt(1, qc.getCodTema());
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                tp = rs.getString(1);
                cr = rs.getString(2);
            }
            if (qc.getTermoPergunta().equals(tp) && qc.getConceitoResposta().equals(cr)) {
                return 2;
            } else {
                return 1;
            }
        } catch (SQLException e) {
            Util.mensagemErro("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return 3;
        }
    }

    public void salvaConteudo(QC qc) {
        try {
            PreparedStatement p = Util.retornaConexao("INSERT INTO QC VALUES (? , ?, ?);");
            p.setString(1, qc.getTermoPergunta());
            p.setString(2, qc.getConceitoResposta());
            p.setInt(3, qc.getCodTema());
            p.execute();
        } catch (SQLException e) {
            Util.mensagemErro("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<QC> retornaQCs(int cod) {
        ArrayList<QC> qcS = new ArrayList();
        try {
            PreparedStatement p = Util.retornaConexao("SELECT * FROM QC WHERE COD_TEMA = ?;");
            p.setInt(1, cod);
            ResultSet rs = p.executeQuery();
            QC qc = new QC();
            while(rs.next()){
                qc = new QC();
                qc.setTermoPergunta(rs.getString(1));
                qc.setConceitoResposta(rs.getString(2));
                qc.setCodTema(rs.getInt(3));
                qcS.add(qc);
            }
        } catch (SQLException e) {
            Util.mensagemErro("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return qcS;
    }

}
