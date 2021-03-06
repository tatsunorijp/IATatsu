package model;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Estado implements Comparable <Estado> {
    public Double saldoLiquido;
    /*  ciel3
        grnd3
        jslg3
        lren3
        natu3
        prt4
        sbsp3
        timp3
        vivt3
        wege3*/
    public ArrayList<Integer> acoes;
    public Double aptidao = 0.0;

    public Estado(Double saldoLiquido, ArrayList<Integer> acoes) {
        this.saldoLiquido = saldoLiquido;
        this.acoes = acoes;
    }

    public Double getSaldoLiquido() {
        return saldoLiquido;
    }

    public void setAptidao(ArrayList<Bolsa> bolsa_2014){
        int i;
        for(i = 0; i < 10; i++){
            aptidao = aptidao + acoes.get(i) * Math.abs(bolsa_2014.get(i).mediaAptidao);
        }
    }

    @Override
    public int compareTo(Estado estado) {
        if (this.aptidao > estado.aptidao) {
            return 1;
        }
        if (this.aptidao < estado.aptidao) {
            return -1;
        }
        return 0;
    }
}
