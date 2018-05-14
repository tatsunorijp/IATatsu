import model.Bolsa;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 * Created by Tatsunori on 19/04/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Bolsa ciel3 = new Bolsa("resources\\CIEL3.tsv");
        Bolsa grnd3 = new Bolsa("resources\\GRND3.tsv");
        Bolsa jslg3 = new Bolsa("resources\\JSLG3.tsv");
        Bolsa lren3 = new Bolsa("resources\\LREN3.tsv");
        Bolsa natu3 = new Bolsa("resources\\NATU3.tsv");
        Bolsa prt4 = new Bolsa( "resources\\PTR4.tsv");
        Bolsa sbsp3 = new Bolsa("resources\\SBSP3.tsv");
        Bolsa timp3 = new Bolsa("resources\\TIMP3.tsv");
        Bolsa vivt3 = new Bolsa("resources\\VIVT3.tsv");
        Bolsa wege3 = new Bolsa("resources\\WEGE3.tsv");

    }

}
