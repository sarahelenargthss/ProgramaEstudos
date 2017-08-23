package ProgramaEstudos;

public class QC {
    private String termoPergunta;
    private String conceitoResposta;
    private int codTema;

    public QC(String trmPrg, String cntRsp) {
        this.termoPergunta = trmPrg;
        this.conceitoResposta = cntRsp;
        
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
