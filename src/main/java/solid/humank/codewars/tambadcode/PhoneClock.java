package solid.humank.codewars.tambadcode;

/**
 * Created by yikai on 2017/2/16.
 */
public class PhoneClock {

    private CityClock cityClock;
    private int utcOffset;
    private HotelWorldClockSystem hotelWorldClockSystem;

    //TODO 3 CityClock 跟PhoneClock 都有個utcOffset , 可以被一起提取到父類別出來做重構
    public PhoneClock(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public void setCityClock(CityClock cityClock) {

        this.cityClock = cityClock;
    }

    public void setTime(int time) {

        /**
         * 由於原本的寫法是只有一個時鐘可以處理,
         * 但現在因為有世界時鐘系統來統一調配,所以需要改為以世界時鐘來做處理
         */

        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - this.utcOffset);
        }

    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }
}
