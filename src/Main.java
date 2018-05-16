import model.*;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tatsunori on 19/04/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        ArrayList<Bolsa> bolsa_2016 = new ArrayList<>();
        ArrayList<Bolsa> bolsa_2014 = new ArrayList<>();
        int mes = 0, viraMes = 0;
        double ganho;

        Bolsa ciel3 = new Bolsa("resources/2014-2015/CIEL3.tsv");
        Bolsa grnd3 = new Bolsa("resources/2014-2015/GRND3.tsv");
        Bolsa jslg3 = new Bolsa("resources/2014-2015/JSLG3.tsv");
        Bolsa lren3 = new Bolsa("resources/2014-2015/LREN3.tsv");
        Bolsa natu3 = new Bolsa("resources/2014-2015/NATU3.tsv");
        Bolsa  prt4 = new Bolsa("resources/2014-2015/PTR4.tsv" );
        Bolsa sbsp3 = new Bolsa("resources/2014-2015/SBSP3.tsv");
        Bolsa timp3 = new Bolsa("resources/2014-2015/TIMP3.tsv");
        Bolsa vivt3 = new Bolsa("resources/2014-2015/VIVT3.tsv");
        Bolsa wege3 = new Bolsa("resources/2014-2015/WEGE3.tsv");
        bolsa_2014.add(ciel3);
        bolsa_2014.add(grnd3);
        bolsa_2014.add(jslg3);
        bolsa_2014.add(lren3);
        bolsa_2014.add(natu3);
        bolsa_2014.add( prt4);
        bolsa_2014.add(sbsp3);
        bolsa_2014.add(timp3);
        bolsa_2014.add(vivt3);
        bolsa_2014.add(wege3);

        Bolsa ciel3_2016 = new Bolsa("resources/2016/CIEL3.tsv");
        Bolsa grnd3_2016 = new Bolsa("resources/2016/GRND3.tsv");
        Bolsa jslg3_2016 = new Bolsa("resources/2016/JSLG3.tsv");
        Bolsa lren3_2016 = new Bolsa("resources/2016/LREN3.tsv");
        Bolsa natu3_2016 = new Bolsa("resources/2016/NATU3.tsv");
        Bolsa  prt4_2016 = new Bolsa("resources/2016/PTR4.tsv");
        Bolsa sbsp3_2016 = new Bolsa("resources/2016/SBSP3.tsv");
        Bolsa timp3_2016 = new Bolsa("resources/2016/TIMP3.tsv");
        Bolsa vivt3_2016 = new Bolsa("resources/2016/VIVT3.tsv");
        Bolsa wege3_2016 = new Bolsa("resources/2016/WEGE3.tsv");
        bolsa_2016.add(ciel3_2016);
        bolsa_2016.add(grnd3_2016);
        bolsa_2016.add(jslg3_2016);
        bolsa_2016.add(lren3_2016);
        bolsa_2016.add(natu3_2016);
        bolsa_2016.add( prt4_2016);
        bolsa_2016.add(sbsp3_2016);
        bolsa_2016.add(timp3_2016);
        bolsa_2016.add(vivt3_2016);
        bolsa_2016.add(wege3_2016);


        Integer dias = ciel3_2016.getCotacaoList().size() - 1;
        Integer hoje = 1;

        AG ag = new AG();
        ag.gerarPopulacao(bolsa_2016, bolsa_2014);
        ag.crossover(bolsa_2016, bolsa_2014, 0);


        //contagem de dias
        //loop de dias
        while(hoje < dias){
            ganho = ag.crossover(bolsa_2016, bolsa_2014, hoje);
            hoje++;
            viraMes++;

            if(viraMes >=20){
                System.out.println("Ganho do mes " + mes + ": " + ganho/1000);
                viraMes = 0;
                mes++;
            }
        }

    }

}
