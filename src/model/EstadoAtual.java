package model;

import java.util.ArrayList;

public class EstadoAtual {
    public Double saldoLiquido = 1000.00;
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

    public EstadoAtual(Double saldoLiquido, ArrayList<Integer> acoes) {
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

    public double dindin(ArrayList<Bolsa> empresa_2016, int dia){
        double total = 0.0;
        int j = 0;
        for(Integer i: acoes){
            total = total + (i * empresa_2016.get(j).cotacaoList.get(dia).getQuo());
            j++;
        }

        return total;
    }
}
