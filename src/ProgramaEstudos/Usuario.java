package ProgramaEstudos;

import dto.UsuarioDTO;
import javax.swing.JOptionPane;
import util.Util;

public class Usuario {

    private String nome;
    private String senha;

//armazena e manipula dados dos usuarios
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario() {

    }

    public boolean verificaLogin() {
        //verificar se o usuário está cadastrado
        int aux = verificaUsuario();
        String senhaUsuario;
        UsuarioDTO useDTO = new UsuarioDTO();
        if (aux == 1) {
            //se o usuário for encontrado
            //compara a senha do usuário com a senha digitada
            senhaUsuario = useDTO.retornaUsuario(this.nome);
            if (!senhaUsuario.equals("")) {
                if (!senhaUsuario.equals(this.senha)) {
                    //se a senha estiver incorreta 
                    //return false;
                    JOptionPane.showMessageDialog(null, "A senha informada não é correspondente ao usuário informado!", "Senha Incorreta!", JOptionPane.INFORMATION_MESSAGE);
                    return false;
                } else {
                    //se a senha estiver correta 
                    //return true
                    return useDTO.loginLogout(nome, true);
                }
            } else {
                return false;
            }
        } else if (aux == 2) {
            //se o usuário não for encontrado
            Util.mensagem("Esse usuário ainda não está cadastrado!", "Usuário não cadastrado!", JOptionPane.ERROR_MESSAGE);
            return false;

        } else {
            Util.mensagem("Não foi possível fazer a conexão com o Banco de Dados!", "Erro de Conexão!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean cadastraUsuario() {
        //verificar se há um usuário cadastrado com este nome
        boolean verifica = true;
        UsuarioDTO dtoUsuario = new UsuarioDTO();
        int retorno = verificaUsuario();
        if (retorno == 1) {
            verifica = false;
            Util.mensagem("Já existe um usuário com esse nome!", "Usuário já existente!", JOptionPane.INFORMATION_MESSAGE);
        } else if (retorno == 2) {
            verifica = dtoUsuario.salvaUsuario(this);
        }
        return verifica;

    }

    public int verificaUsuario() {
        String nomUsuario = "";
        UsuarioDTO usuario = new UsuarioDTO();
        return usuario.verificaUsuario(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
