package 命令模式.audioPlayer;

/**
 * Created by snlu on 2018/1/8.
 */
public class RewindCommand implements Command{

  private AudioPlayer myAudio;

  public RewindCommand(AudioPlayer audioPlayer){
    myAudio = audioPlayer;
  }

  @Override
  public void execute() {
    myAudio.rewind();
  }
}
