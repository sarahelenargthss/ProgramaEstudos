package dto;

import ProgramaEstudos.QC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Util;

public class QcDTO {

    public boolean verificaQC(QC qc) {
        try {
            PreparedStatement p = Util.retornaConexao("SELECT COD_TEMA FROM TEMA ");
            p.setString(1, "#%");
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                tema.setCodTema(rs.getInt(1));
                tema.setTituloTema(rs.getString(2));
                tema.setMateriaTema(rs.getString(3));
                tema.setPrivado(rs.getBoolean(4));
                tema.setNomeUsuario(rs.getString(5));
            }
        } catch (SQLException e) {
            Util.mensagemErro("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
