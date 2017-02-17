package solid.humank.codewars.tambadcode;

/**
 * Created by yikai on 2017/2/16.
 */
public class PhoneClock extends Clock {

    private CityClock cityClock;
    private HotelWorldClockSystem hotelWorldClockSystem;
    private int time;

    public PhoneClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }

    public void setTime(int time) {

        /**
         * 由於原本的寫法是只有一個時鐘可以處理,
         * 但現在因為有世界時鐘系統來統一調配,所以需要改為以世界時鐘來做處理
         */

        this.time = time;
        if (this.hotelWorldClockSystem == null) return;

        for (CityClock cityClock : this.hotelWorldClockSystem.getClocks()) {
            cityClock.setUtcZeroTime(time - super.utcOffset);
        }

    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem) {
        this.hotelWorldClockSystem = hotelWorldClockSystem;
    }

    public int getTime() {
        return this.time;
    }
}
