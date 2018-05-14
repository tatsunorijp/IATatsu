package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tatsunori on 13/05/2018.
 */
public class Bolsa {

    //matriz, cada elemento de arraylist possui os 7 atributos do arquivo
    ArrayList<ArrayList> buffer = new ArrayList<ArrayList>();


    public Bolsa(String path) throws IOException {
        //
        BufferedReader br = new BufferedReader(new FileReader(path));

        while(br.ready()){
            String linha = br.readLine();
            String linhasSeparadas[] = linha.split(" ");

            //arraylist para salvar cada linha separada
            ArrayList aux = new ArrayList();
            for(String s: linhasSeparadas){
                aux.add(s);
            }

            //linha completa, palavras salvas separadamente
            buffer.add(aux);

        }
    }

    public ArrayList<ArrayList> getBuffer() {
        return buffer;
    }

    public void setBuffer(ArrayList<ArrayList> buffer) {
        this.buffer = buffer;
    }
}
