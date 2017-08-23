package ProgramaEstudos;

public class QC {
    private String termoPergunta;
    private String conceitoResposta;

    public QC(String trmPrg, String cntRsp) {
        this.termoPergunta = trmPrg;
        this.conceitoResposta = cntRsp;
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
