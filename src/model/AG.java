package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AG {
    ArrayList<Estado> populacaoAntiga = new ArrayList();
    ArrayList<Estado> populacaoNova = new ArrayList<>();
    EstadoAtual estadoAtual = new EstadoAtual(1000.0, new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
    NumerosAleatorios n = new NumerosAleatorios();
    int aleatorio;

    public void gerarPopulacao(ArrayList<Bolsa> empresa_2016, ArrayList<Bolsa> empresa_2014){
        for (int i = 0; i < 1000; i++){
            populacaoAntiga.add(gerarIndividuo(empresa_2016, empresa_2014));
        }
        Collections.sort(populacaoAntiga);
//        for(Estado e: populacaoAntiga){
//            System.out.println(e.saldoLiquido);
//            System.out.println(e.acoes);
//            System.out.println();
//        }
        //crossover(empresa_2016, empresa_2014, 0);
//        crossover(empresa_2016, empresa_2014, 0);

    }

    public Estado gerarIndividuo(ArrayList<Bolsa> empresa_2016, ArrayList<Bolsa> empresa_2014){
        Estado carteira = new Estado(1000.00 , new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
        aleatorio = n.numero(10);
        while(carteira.saldoLiquido - empresa_2016.get(aleatorio).getCotacaoList().get(0).getQuo() > 0){
            //if((carteira.saldoLiquido - empresa_2016.get(aleatorio).getCotacaoList().get(0).getQuo()) > 0) {
            carteira.saldoLiquido = carteira.saldoLiquido - empresa_2016.get(aleatorio).getCotacaoList().get(0).getQuo();
            carteira.acoes.set(aleatorio, carteira.acoes.get(aleatorio) + 1);
            //}
            aleatorio = n.numero(10);
        }
        carteira.setAptidao(empresa_2014);
        return carteira;
    }

    public void crossover(ArrayList<Bolsa> empresa_2016, ArrayList<Bolsa> empresa_2014, int hoje){
        Estado carteiraPai, carteiraMae, carteiraFilho;
        int i, quantAcoes, j;

        for(i = 0; i < 200; i = i+2){
            carteiraFilho = new Estado(estadoAtual.saldoLiquido, new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0)));
            carteiraPai = populacaoAntiga.get(i);
            carteiraMae = populacaoAntiga.get(i+1);

            for(j = 0; j < 10; j++){
                aleatorio = n.numero(2);

                if(aleatorio == 0){
                    carteiraFilho.acoes.set(j, carteiraPai.acoes.get(j));
                }else{
                    carteiraFilho.acoes.set(j, carteiraMae.acoes.get(j));
                }
            }

            vender(carteiraFilho, empresa_2016, hoje);
            comprar(carteiraFilho, empresa_2016, hoje);
            carteiraFilho.setAptidao(empresa_2014);

            populacaoNova.add(carteiraFilho);

        }
            for(i = 0; i < 100; i++){
                populacaoNova.add(populacaoAntiga.get(i));
            }

        Collections.sort(populacaoNova);
        populacaoAntiga = populacaoNova;
        populacaoNova = new ArrayList<>();

        estadoAtual.saldoLiquido = populacaoAntiga.get(0).saldoLiquido;
        estadoAtual.acoes = populacaoAntiga.get(0).acoes;
        estadoAtual.aptidao = populacaoAntiga.get(0).aptidao;

//        System.out.println(estadoAtual.saldoLiquido);
//        System.out.println(estadoAtual.dindin(empresa_2016, hoje));
//        System.out.println(estadoAtual.acoes);
//        System.out.println(estadoAtual.aptidao);
//        System.out.println();

    }

    public void vender(Estado carteiraFilho, ArrayList<Bolsa> empresa_2016, int hoje){
        int i, quantAcoes;
        float reais = 0;
        for (i = 0; i < 10; i++){
            quantAcoes = estadoAtual.acoes.get(i) - carteiraFilho.acoes.get(i);

            if(quantAcoes > 0){
                reais = quantAcoes * empresa_2016.get(i).getCotacaoList().get(hoje).getQuo();
                carteiraFilho.saldoLiquido = reais + carteiraFilho.saldoLiquido;
            }
        }
    }
    public void comprar(Estado carteiraFilho, ArrayList<Bolsa> empresa_2016, int hoje){
        int i, quantAcoes;
        float reais = 0;

        for (i = 0; i < 10; i++){
            quantAcoes = carteiraFilho.acoes.get(i) - estadoAtual.acoes.get(i);

            while(quantAcoes > 0){
                if(carteiraFilho.saldoLiquido - empresa_2016.get(i).cotacaoList.get(hoje).getQuo() > 0){
                    carteiraFilho.saldoLiquido = carteiraFilho.saldoLiquido - empresa_2016.get(i).cotacaoList.get(hoje).getQuo();
                }else{
                    carteiraFilho.acoes.set(i, carteiraFilho.acoes.get(i) -1 );
                }
                quantAcoes--;
            }
        }

        //mutacao
        aleatorio = n.numero(10);
        while (carteiraFilho.saldoLiquido - empresa_2016.get(aleatorio).cotacaoList.get(hoje).getQuo() > 0){
            carteiraFilho.saldoLiquido = carteiraFilho.saldoLiquido - empresa_2016.get(aleatorio).cotacaoList.get(hoje).getQuo();
            carteiraFilho.acoes.set(aleatorio, carteiraFilho.acoes.get(aleatorio) + 1);
            aleatorio = n.numero(10);
        }

    }
}
