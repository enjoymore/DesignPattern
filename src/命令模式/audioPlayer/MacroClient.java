package 命令模式.audioPlayer;

/**
 * Created by snlu on 2018/1/8.
 */
public class MacroClient {

  public static void main(String[] args) {
    //创建接收者对象
    AudioPlayer audioPlayer = new AudioPlayer();
    //创建命令对象
    Command playCommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopCommand = new StopCommand(audioPlayer);

    MacroCommand marco = new MacroAudioCommand();

    marco.add(playCommand);
    marco.add(rewindCommand);
    marco.add(stopCommand);
    marco.execute();
  }
}
