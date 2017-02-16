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
     * @return
     */

    public int getTime() {

        //TODO 1 每次都回傳1 , 這個東西是個壞味道, 應該要改成以變數方式傳遞

        return this.utcOffset+ this.utcZeroTime;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}
