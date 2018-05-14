package model;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatsunori on 13/05/2018.
 */
public class Bolsa {

    private ArrayList<Cotacao> cotacaoList = new ArrayList<>();
    private Cotacao cotacao;

    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Bolsa(String path) throws IOException {

        cotacao = new Cotacao();

        final CSVParser parser = new CSVParserBuilder().withSeparator('\t').build();
        CSVReader reader = new CSVReaderBuilder(new FileReader(path)).withSkipLines(1).withCSVParser(parser).build();

        List<String[]> records = reader.readAll();
        for (String[] record : records) {
            cotacao.setData(record[0]);
            cotacao.setMin(Float.parseFloat(record[1]));
            cotacao.setMin(Float.parseFloat(record[2]));
            cotacao.setMax(Float.parseFloat(record[3]));
            cotacao.setVar(Float.parseFloat(record[4]));
            cotacao.setPvar(Float.parseFloat(record[5]));
            cotacao.setVol(Float.parseFloat(record[6]));
            cotacaoList.add(cotacao);
        }

    }

    public ArrayList<Cotacao> getCotacaoList() {
        return cotacaoList;
    }

    public void setCotacaoList(ArrayList<Cotacao> cotacaoList) {
        this.cotacaoList = cotacaoList;
    }

    public Cotacao getCotacao() {
        return cotacao;
    }

    public void setCotacao(Cotacao cotacao) {
        this.cotacao = cotacao;
    }

    public SimpleDateFormat getFormato() {
        return formato;
    }

    public void setFormato(SimpleDateFormat formato) {
        this.formato = formato;
    }
}
