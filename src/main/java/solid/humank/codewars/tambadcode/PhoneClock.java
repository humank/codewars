package solid.humank.codewars.tambadcode;

/**
 * Created by yikai on 2017/2/16.
 */
public class PhoneClock {

    private CityClock cityClock;
    private int utcOffset;

    //TODO 3 CityClock 跟PhoneClock 都有個utcOffset , 可以被一起提取到父類別出來做重構
    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setCityClock(CityClock cityClock) {

        this.cityClock=cityClock;
    }

    public void setTime(int time) {

        this.cityClock.setUtcZeroTime(time - this.utcOffset);
    }
}
