package aula12.ex_sala_aula12.sigaa.salaaula.adapter.mediaPlayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;
	
	
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("VLC")){
			advancedMusicPlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("MP4")){
			advancedMusicPlayer = new Mp4Player();
		}else{
			System.out.println("Formato de Arquivo Inválido!");
		}
	}

	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("VLC")) {
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("MP4")){
			advancedMusicPlayer.playMp4(fileName);
		}else{
			System.out.println("Formato de Arquivo Inválido!");
		}
	}
	
}
