package solid.humank.codewars.tambadcode;

/**
 * Created by yikai on 2017/2/16.
 */
public class CityClock extends Clock {
    private int utcZeroTime;

    //TODO 2 CityClock 跟PhoneClock 都有個utcOffset , 可以被一起提取到父類別出來做重構

    public CityClock(int utcOffset) {
        super(utcOffset);
    }


    /**
     * 當地時間 = UTC時間 + 當地時間與UTC時間的時間差
     *
     * @return
     */

    public int getTime() {
        return (this.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
