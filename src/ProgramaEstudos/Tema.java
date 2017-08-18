package ProgramaEstudos;

public class Tema {
    private String tituloTema;
    private boolean privado;
    private String materiaTema;
    private int codTema;
    private String nomeUsuario;

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
}
