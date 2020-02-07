package aula12.ex_sala_aula12.sigaa.salaaula.adapter.mediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	public void playVlc(String fileName) {
		System.out.println("Playing Vlc file. Name: " + fileName);;		
	}

	public void playMp4(String fileName) {
		// do nothing
	}
	
}
