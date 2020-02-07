package aula12.ex_sala_aula12.sigaa.salaaula.adapter.mediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		//do nothing.
	}

	public void playMp4(String fileName) {

		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
