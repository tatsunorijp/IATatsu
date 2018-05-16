package model;

import java.util.Random;

public class NumerosAleatorios {
    public int numero(int max){
        Random gerador = new Random();
        return gerador.nextInt(max);
    }
}
