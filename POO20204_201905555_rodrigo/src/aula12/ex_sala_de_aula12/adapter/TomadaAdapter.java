package aula12.ex_sala_de_aula12.adapter;

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
