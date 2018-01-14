package 中介者模式;

/**
 * Created by snlu on 2018/1/15.
 */
public class ColleagueA extends AbstractColleague{

    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.AaffectB();
    }
}