package 命令模式.audioPlayer;

/**
 * Created by snlu on 2018/1/8.
 */
public class PlayCommand implements Command {

  private AudioPlayer myAudio;

  public PlayCommand(AudioPlayer audioPlayer) {
    myAudio = audioPlayer;
  }

  @Override
  public void execute() {
    myAudio.play();
  }
}
