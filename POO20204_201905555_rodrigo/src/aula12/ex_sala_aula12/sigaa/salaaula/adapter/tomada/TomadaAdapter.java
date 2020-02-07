package aula12.ex_sala_aula12.sigaa.salaaula.adapter.tomada;

/**
 * Created by gilmario on 20/05/16.
 */
public class TomadaAdapter extends TomadaDoisPinos{

    private TomadaTresPinos tomadaTresPinos;

    public TomadaAdapter(TomadaTresPinos tresPinos){

        this.tomadaTresPinos = tresPinos;
    }
    
    @Override
    public void ligarTomadaDoisPinos() {
    	
        tomadaTresPinos.ligarNaTomadaDeTresPinos();
        
    }
}
