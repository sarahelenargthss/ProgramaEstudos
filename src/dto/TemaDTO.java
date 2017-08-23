package dto;

import ProgramaEstudos.Tema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Util;

public class TemaDTO {

    public boolean salvaTema(Tema tema) {
        try {
            PreparedStatement p = Util.retornaConexao("INSERT INTO TEMA (TITULO_TEMA, MATERIA_TEMA, PRIVADO, NOME_USUARIO) VALUES (?, ?, ?, ?);");
            p.setString(1, tema.getTituloTema());
            p.setString(2, tema.getMateriaTema());
            p.setBoolean(3, tema.isPrivado());
            p.setString(4, tema.getNomeUsuario());
            p.execute();
        } catch (SQLException e) {
            Util.mensagemErro("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public Tema retornaTema(int cod) {
        Tema tema = new Tema();
        PreparedStatement p;
        try {
            if (cod == 0) {
                p = Util.retornaConexao("SELECT * FROM TEMA WHERE MATERIA_TEMA = ?");
                p.setString(1, "#%");
            } else {
                p = Util.retornaConexao("SELECT * FROM TEMA WHERE COD_TEMA = ?");
                p.setInt(1, cod);
            }
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
        return tema;
    }

}
