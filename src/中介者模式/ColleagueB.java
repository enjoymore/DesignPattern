package 中介者模式;

/**
 * Created by snlu on 2018/1/15.
 */
class ColleagueB extends AbstractColleague{

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
