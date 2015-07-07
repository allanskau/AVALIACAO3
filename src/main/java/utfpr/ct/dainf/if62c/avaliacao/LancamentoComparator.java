package utfpr.ct.dainf.if62c.avaliacao;

/**
 * IF62C Fundamentos de Programação 2
 * Avaliação parcial.
 * @author 
 */
public class LancamentoComparator {
    private int ano;
    private int mes;
    private int dia;
    private int conta;

    public LancamentoComparator() {
    }

    public LancamentoComparator(int ano, int mes, int dia, int conta) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.conta = conta;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    private int comparaConta(int c1, int c2) {
        if(c1 > c2){
            return (c1 - c2);
        }else if(c1 < c2){
            return -(c1 - c2);
        }else
            return 0;
    }
}
