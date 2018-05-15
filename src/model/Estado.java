package model;

import java.util.ArrayList;

public class Estado {

    private Double saldoLiquido;
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
    private ArrayList<Integer> acoes;
    private String data;


    public Estado(Double saldoLiquido, ArrayList<Integer> acoes) {
        this.saldoLiquido = saldoLiquido;
        this.acoes = acoes;
    }

    public Double getSaldoLiquido() {
        return saldoLiquido;
    }

    public void setSaldoLiquido(Double saldoLiquido) {
        this.saldoLiquido = saldoLiquido;
    }

    public ArrayList<Integer> getAcoes() {
        return acoes;
    }

    public void setAcoes(ArrayList<Integer> acoes) {
        this.acoes = acoes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
