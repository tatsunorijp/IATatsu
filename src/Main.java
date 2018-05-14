import model.Bolsa;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by Tatsunori on 19/04/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException{
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

    }

}
