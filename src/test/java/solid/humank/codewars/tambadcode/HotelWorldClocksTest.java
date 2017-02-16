package solid.humank.codewars.tambadcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yikai on 2017/2/16.
 */
public class HotelWorldClocksTest {

    @Test
    public void the_time_of_clock_London_should_be_1_after_phone_clock_is_set_to_9_Beijing_time(){

        //the step to write down your test code , is
        // 1. write assert code
        // 2. write act code
        // 3. write arrange code
        // from the end viewpoint of using scenario, that you will more clear to figure out your code structure.

        /**
         *
         * 在這裡書中特別提到, programming by intention, 也就是說避免你奢侈的思考浪費
         * 所有的設計方式都是按照著你的意圖下去走, 從最後的真正期望 -- Assert 開始走
         * 再逐步地往前看, 是基於什麼崔始你的Assert 能被正常執行--> Action
         * 那麼要執行Action, 是基於Arrange 的基礎條件設置
         *
         * 至此, 你的TDD 3A 原則思考套路成形了 !
         */

        //Arrange
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);

        //Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1,londonClock.getTime());


        //TODO 4 只做測試比UTC時間早的城市, 比UTC時間晚的沒有測到

    }

}
