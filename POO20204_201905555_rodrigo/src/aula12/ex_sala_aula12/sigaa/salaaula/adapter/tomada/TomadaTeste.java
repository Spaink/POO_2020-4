package aula12.ex_sala_aula12.sigaa.salaaula.adapter.tomada;

/**
 * Created by gilmario on 20/05/16.
 */
public class TomadaTeste {
    public static void main(String args[]) {

        TomadaTresPinos t3 = new TomadaTresPinos();

        TomadaAdapter t2 = new TomadaAdapter(t3);
            t2.ligarTomadaDoisPinos();
    }
}
