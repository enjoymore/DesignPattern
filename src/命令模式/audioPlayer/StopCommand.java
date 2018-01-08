package 命令模式.audioPlayer;

/**
 * Created by snlu on 2018/1/8.
 */
public class StopCommand implements Command {

  private AudioPlayer myAudio;

  public StopCommand(AudioPlayer audioPlayer) {
    myAudio = audioPlayer;
  }

  @Override
  public void execute() {
    myAudio.stop();
  }
}
