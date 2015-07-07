package utfpr.ct.dainf.if62c.avaliacao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.exit;
import java.sql.Date;
import java.util.List;

/**
 * IF62C Fundamentos de Programação 2 Avaliação parcial.
 *
 * @author
 */
public class ProcessaLancamentos {

    private BufferedReader reader;

    public ProcessaLancamentos() {
    }
/*
    public ProcessaLancamentos(File f) {
        if (f == null) {
            System.out.println("Arquivo invalido");
            exit(0);
        }
        try{
            reader = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Arquivo não encontrado: ");
        } 
        
    }

    public ProcessaLancamentos(String s) {
        if (s == null) {
            System.out.println("Arquivo invalido");
            exit(0);
        }
        try {
            reader = new BufferedReader(new FileReader(new File(s)));
        } catch (FileNotFoundException fnfe) {
            System.out.println("Arquivo não encontrado: ");
        } 
    }
*/
    public ProcessaLancamentos(File arquivo) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(arquivo));
        throw new UnsupportedOperationException("Não implementado");
    }
    
    public ProcessaLancamentos(String path) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(new File(path)));
        throw new UnsupportedOperationException("Não implementado");
    }

    private String getNextLine() throws IOException {
        try{
            return reader.readLine();
        }catch(IOException ioe){
            throw new UnsupportedOperationException("Não implementado");
        }
    }

    private Lancamento processaLinha(String linha) {
        Integer conta;
        Date data;
        String descricao;
        Double valor;
        conta = Integer.valueOf(linha.substring(0, 7));
        data = Date.valueOf(linha.substring(7, 15));
        descricao = linha.substring(15, 76);
        valor = Double.valueOf(linha.substring(76, 87));
        return (new Lancamento(conta, data, descricao, valor));
    }

    private Lancamento getNextLancamento() throws IOException {
        String linha = this.reader.readLine();
        return  processaLinha(linha);
        //throw new UnsupportedOperationException("Não implementado");
    }

    public List<Lancamento> getLancamentos() throws IOException {
        
        throw new UnsupportedOperationException("Não implementado");
    }

}
