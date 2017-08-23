package ProgramaEstudos;

public class QC {
    private String termoPergunta;
    private String conceitoResposta;
    private int codTema;

    public QC() {
       
    }

    public int getCodTema() {
        return codTema;
    }

    public void setCodTema(int codTema) {
        this.codTema = codTema;
    }


    public QC(String trmPrg, String cntRsp, int codTemaCadastro) {
        this.termoPergunta = trmPrg;
        this.conceitoResposta = cntRsp;
        this.codTema = codTemaCadastro;
    }

    public String getTermoPergunta() {
        return termoPergunta;
    }

    public void setTermoPergunta(String termoPergunta) {
        this.termoPergunta = termoPergunta;
    }

    public String getConceitoResposta() {
        return conceitoResposta;
    }

    public void setConceitoResposta(String conceitoResposta) {
        this.conceitoResposta = conceitoResposta;
    }

}
