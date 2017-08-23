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
        int cod = 0;
        try {
            PreparedStatement p = Util.retornaConexao("SELECT COD_TEMA FROM TEMA WHERE (TERMO_PERGUNTA = ?) AND (CONCEITO_RESPOSTA = ?)");
            p.setString(1, qc.getTermoPergunta());
            p.setString(1, qc.getConceitoResposta());
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                cod = rs.getInt(1);
            }
            if (cod == qc.getCodTema()) {
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
            PreparedStatement p = Util.retornaConexao("SELECT * FROM QC WHERE COD_TEMA = ?");
            p.setInt(1, cod);
            ResultSet rs = p.executeQuery();
            QC qc = new QC();
            if (rs.next()) {
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
