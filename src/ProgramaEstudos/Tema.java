package ProgramaEstudos;

import dto.TemaDTO;

public class Tema {

    private String tituloTema;
    private boolean privado;
    private String materiaTema;
    private int codTema;
    private String nomeUsuario;

//armazena e manipula dados dos temas
    public Tema(String titulo, boolean privado, String materia, int codigo, String usuarioLogado) {
        this.tituloTema = titulo;
        this.privado = privado;
        this.materiaTema = materia;
        this.codTema = codigo;
        this.nomeUsuario = usuarioLogado;
    }

    public Tema() {

    }

    public String getTituloTema() {
        return tituloTema;
    }

    public void setTituloTema(String tituloTema) {
        this.tituloTema = tituloTema;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public String getMateriaTema() {
        return materiaTema;
    }

    public void setMateriaTema(String materiaTema) {
        this.materiaTema = materiaTema;
    }

    public int getCodTema() {
        return codTema;
    }

    public void setCodTema(int codTema) {
        this.codTema = codTema;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void retornaCod() {
        TemaDTO temaDTO = new TemaDTO();
        codTema = temaDTO.retornaTema(0).getCodTema();
    }
}
