package solid.humank.codewars.tambadcode;

/**
 * Created by yikai on 2017/2/16.
 */
public class CityClock {
    private int utcZeroTime;
    private int utcOffset;

    //TODO 2 CityClock 跟PhoneClock 都有個utcOffset , 可以被一起提取到父類別出來做重構

    public CityClock(int utcOffset) {
        this.utcOffset = utcOffset;
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
