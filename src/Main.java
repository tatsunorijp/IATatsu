import model.Bolsa;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tatsunori on 19/04/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Bolsa ciel3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\CIEL3.tsv");
        Bolsa grnd3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\GRND3.tsv");
        Bolsa jslg3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\JSLG3.tsv");
        Bolsa lren3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\LREN3.tsv");
        Bolsa natu3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\NATU3.tsv");
        Bolsa prt4 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\PTR4.tsv");
        Bolsa sbsp3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\SBSP3.tsv");
        Bolsa timp3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\TIMP3.tsv");
        Bolsa vivt3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\VIVT3.tsv");
        Bolsa wege3 = new Bolsa("C:\\Users\\Tatsunori\\IdeaProjects\\trabalho1ia\\resources\\WEGE3.tsv");

        ArrayList<ArrayList> teste = ciel3.getBuffer();
        for(ArrayList s: teste){
            System.out.println(s);
        }

    }

}
