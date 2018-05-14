package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * Created by Tatsunori on 13/05/2018.
 */
public class Bolsa {
    ArrayList<Cotacao> buffer = new ArrayList<Cotacao>();
    Cotacao cotacao;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public Bolsa(String path) throws IOException, ParseException {
        //
        BufferedReader br = new BufferedReader(new FileReader(path));

        while(br.ready()){
            String linha = br.readLine();
            //arraylist para salvar cada linha separada
            String[] aux = linha.split(" ");


            /*cotacao = new Cotacao();
            cotacao.setData(formato.parse(aux[0]));
            cotacao.setMin(Float.parseFloat(aux[1]));
            cotacao.setMin(Float.parseFloat(aux[2]));
            cotacao.setMax(Float.parseFloat(aux[3]));
            cotacao.setVar(Float.parseFloat(aux[4]));
            cotacao.setPvar(Float.parseFloat(aux[5]));
            cotacao.setVol(Float.parseFloat(aux[6]));

            //linha completa, palavras salvas separadamente
            buffer.add(cotacao);
            */
        }
    }
}
