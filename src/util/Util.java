package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Util {

    public static boolean validaString(String text) {
        if (text.trim().equals("")) {
            return true;
        }
        return false;
    }

    public static int mensagemOpcao(String mensagem, String titulo) {
        return JOptionPane.showConfirmDialog(null, mensagem, titulo, JOptionPane.YES_NO_OPTION);
    }
    
    public static void mensagem(String mensagem, String titulo, int tipo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipo);
    }

    public static String retornaString(char[] senha) {
        String string = "";
        for (int i = 0; i < senha.length; i++) {
            if (senha[i] != ' ') {
                string += senha[i];
            }
        }
        return string;
    }

    public static PreparedStatement retornaConexao(String sql) {
        String str = "jdbc:mysql://localhost:3306/PE?" + "user=root&password=root";
        PreparedStatement p;
        try {
            Connection conn = (Connection) DriverManager.getConnection(str);
            p = conn.prepareStatement(sql);
        } catch (SQLException e) {
            mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return p;
    }

}
