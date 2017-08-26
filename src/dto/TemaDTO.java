package dto;

import ProgramaEstudos.Tema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import util.Util;

public class TemaDTO {
//trabalha com os temas, os relacionando ao BD

    public boolean salvaTema(Tema tema) {
        //salva tema recebido por parâmetro
        try {
            PreparedStatement p = Util.retornaConexao("INSERT INTO TEMA (TITULO_TEMA, MATERIA_TEMA, PRIVADO, NOME_USUARIO) VALUES (?, ?, ?, ?);");
            p.setString(1, tema.getTituloTema());
            p.setString(2, tema.getMateriaTema());
            p.setBoolean(3, tema.isPrivado());
            p.setString(4, tema.getNomeUsuario());
            p.execute();
        } catch (SQLException e) {
            Util.mensagem("Opção inviável no momento.", "Erro de conexão com o Banco de Dados!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public Tema retornaTema(int cod) {
        //retorn o tema com determinado codigo ou um pré-tema(verificar pré-tema no NovoTema)
        Tema tema = new Tema();
        UsuarioDTO uDTO = new UsuarioDTO();
        PreparedStatement p;
        try {
            if (cod == 0) {
                p = Util.retornaConexao("SELECT * FROM TEMA WHERE MATERIA_TEMA LIKE ? AND NOME_USUARIO = ?");
                p.setString(1, "#%");
                p.setString(2, uDTO.retornaLogado());
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
            Util.mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return tema;
    }

    public boolean atualizaTema(Tema tema) {
        //atualiza o tema
        try {
            PreparedStatement p = Util.retornaConexao("UPDATE TEMA SET TITULO_TEMA = ?, MATERIA_TEMA = ?, PRIVADO = ? WHERE COD_TEMA = ?;");
            p.setString(1, tema.getTituloTema());
            p.setString(2, tema.getMateriaTema());
            p.setBoolean(3, tema.isPrivado());
            p.setInt(4, tema.getCodTema());
            p.execute();
        } catch (SQLException e) {
            Util.mensagem("Erro de Conexão com o Banco de Dados.", "Não foi possível concluir a ação!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean excluiTema(int codigoTema) {
        //exclui o tema
        QcDTO qcDTO = new QcDTO();
        qcDTO.excluiQCs(codigoTema);
        try {
            PreparedStatement p = Util.retornaConexao("DELETE FROM TEMA WHERE COD_TEMA = ?");
            p.setInt(1, codigoTema);
            p.execute();
        } catch (SQLException e) {
            Util.mensagem("Erro de Conexão com o Banco de Dados.", "Não foi possível concluir a ação!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public ArrayList<Tema> retornaTemasUsuario() {
        //retorna o tem de um usuario
        ArrayList<Tema> temas = new ArrayList();
        try {
            PreparedStatement p = Util.retornaConexao("SELECT * FROM TEMA WHERE NOME_USUARIO = ?;");
            UsuarioDTO uDTO = new UsuarioDTO();
            p.setString(1, uDTO.retornaLogado());
            ResultSet rs = p.executeQuery();
            Tema tema;
            while (rs.next()) {
                tema = new Tema();
                tema.setCodTema(rs.getInt(1));
                tema.setTituloTema(rs.getString(2));
                tema.setMateriaTema(rs.getString(3));
                tema.setPrivado(rs.getBoolean(4));
                tema.setNomeUsuario(rs.getString(5));
                temas.add(tema);
            }
        } catch (SQLException e) {
            Util.mensagem("Não foi possível buscar os temas.", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return temas;
    }

    public int verificaTema(Tema tema) {
        int cod = 0;
        try {
            PreparedStatement p = Util.retornaConexao("SELECT COD_TEMA FROM TEMA WHERE NOME_USUARIO = ? AND TITULO_TEMA = ? AND MATERIA_TEMA = ?;");
            UsuarioDTO uDTO = new UsuarioDTO();
            p.setString(1, uDTO.retornaLogado());
            p.setString(2, tema.getTituloTema());
            p.setString(3, tema.getMateriaTema());
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                cod = rs.getInt(1);
            }
        } catch (SQLException e) {
            Util.mensagem("Não foi possível concluir a ação.", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return -8;
        }
        return cod;
    }

    public ArrayList<Tema> pesquisaTemas(String busca) {
        //pesquisa tema
        ArrayList<Tema> temas = new ArrayList();
        try {
            PreparedStatement p = Util.retornaConexao("SELECT * FROM TEMA WHERE lower(TITULO_TEMA) LIKE ? OR lower(MATERIA_TEMA) LIKE ?;");
            UsuarioDTO uDTO = new UsuarioDTO();
            p.setString(1, "%" + busca.toLowerCase() + "%");
            p.setString(2, "%" + busca.toLowerCase() + "%");
            ResultSet rs = p.executeQuery();
            Tema tema;
            while (rs.next()) {
                tema = new Tema();
                tema.setCodTema(rs.getInt(1));
                tema.setTituloTema(rs.getString(2));
                tema.setMateriaTema(rs.getString(3));
                tema.setPrivado(rs.getBoolean(4));
                tema.setNomeUsuario(rs.getString(5));
                temas.add(tema);
            }
        } catch (SQLException e) {
            Util.mensagem("Não foi possível buscar os temas.", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return temas;
    }

}
