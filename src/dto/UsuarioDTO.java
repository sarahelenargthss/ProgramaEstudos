package dto;

import ProgramaEstudos.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.Util;

public class UsuarioDTO {

    public int verificaUsuario(String nome) {
        String nomUsuario = "";
        try {
            PreparedStatement p = Util.retornaConexao("SELECT NOME_USUARIO " + "FROM USUARIO " + "WHERE NOME_USUARIO = ?;");
            p.setString(1, nome);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                nomUsuario = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            Util.mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return 3;
        }
        if (nome.equals(nomUsuario)) {
            return 1;
        } else {
            return 2;
        }
    }

    public String retornaUsuario(String nomeUsuario) {
        String senha = "";
        try {
            PreparedStatement p = Util.retornaConexao("SELECT SENHA_USUARIO FROM USUARIO WHERE NOME_USUARIO = ?;");
            p.setString(1, nomeUsuario);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                senha = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            Util.mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return "";
        }
        return senha;
    }

    public boolean salvaUsuario(Usuario usuario) {
        try {
            boolean logado;
            if(Util.mensagemOpcao("Deseja continuar logado com esse cadastro?", "Deseja logar?") == 0){
                logado = true;
            }else{
                logado = false;
            }
            PreparedStatement p = Util.retornaConexao("INSERT INTO USUARIO VALUES (? , ?, ?);");
            p.setString(1, usuario.getNome());
            p.setString(2, usuario.getSenha());
            p.setBoolean(3, logado);
            p.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            Util.mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean loginLogout(String nome, boolean estado) {
        try{
            PreparedStatement p = Util.retornaConexao("UPDATE USUARIO SET USUARIO_LOGADO = ? WHERE NOME_USUARIO = ?");
            p.setBoolean(1, estado);
            p.setString(2, nome);
            p.execute();
        }catch(SQLException e){
            Util.mensagem("Não foi possível fazer a conexão com o BD!", "Erro no BD!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public String retornaLogado() {
        String nome = "";
        try {
            PreparedStatement p = Util.retornaConexao("SELECT NOME_USUARIO FROM USUARIO WHERE USUARIO_LOGADO = ?;");
            p.setBoolean(1, true);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                nome = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            Util.mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return "";
        }
        if (nome.equals(null)) {
            return "";
        } else {
            return nome;
        }
    }
}
