package solid.humank.codewars.tambadcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by yikai on 2017/2/16.
 */
public class HotelWorldClocksTest {

    @Test
    public void the_time_of_clock_London_should_be_1_after_phone_clock_is_set_to_9_Beijing_time() {

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

        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(londonClock);
        PhoneClock phoneClock = new PhoneClock(8);

        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1, londonClock.getTime());


    }

    @Test
    public void the_time_of_clock_NewYork_should_be_20_is_set_to_9_Beijing_time() {

        //Arrange
        CityClock newYorkClock = new CityClock(-5);
        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(newYorkClock);
        PhoneClock phoneClock = new PhoneClock(8);
        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);
        //Assert
        assertEquals(20, newYorkClock.getTime());
    }


    //TODO-working-on: Set time to multiple city clocks
    @Test
    public void the_time_of_clock_London_and_NewYork_should_be_1_and_20_respectively_after_the_phone_clock_is_set_to_9_Beijing_time() {

        //Arrange

        /**
         * 我們心裡想著希望可以直接改手機上的時鐘, 就能一次性的把全世界的時間都調整好,
         * 常見的用法我們可能會乾脆就塞一個ArrayList, 讓phoneClock在調整時就醫病處理掉,
         * 但是ArrayList 這樣的概念並不是真正的領域概念, 我們可以用一個世界時間系統來表示完整的世界時間,
         * 這樣就可以一次直接調整
         */

        CityClock londonClock = new CityClock(0);
        CityClock newYorkClock = new CityClock(-5);
        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(londonClock);
        hotelWorldClockSystem.attach(newYorkClock);
        PhoneClock phoneClock = new PhoneClock(8);

        //Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1, londonClock.getTime());
        assertEquals(20, newYorkClock.getTime());

    }

    @Test
    public void the_time_of_the_phone_clock_should_be_set_correctly_after_its_setTime_method_is_invoked() {

        //Arrange
        PhoneClock phoneClock = new PhoneClock(8);

        //Act
        phoneClock.setTime(9);

        //Assert
        assertEquals(9, phoneClock.getTime());
    }

    @Test
    public void the_time_of_clock_Moscow_should_be_5_after_the_phone_clock_is_set_to_9_Beijing_time(){

        //Arrange

        CityClock moscowClock = new CityClock(4);
        HotelWorldClockSystem hotelWorldClockSystem = new HotelWorldClockSystem();
        hotelWorldClockSystem.attach(moscowClock);
        PhoneClock phoneClock = new PhoneClock(8);

        //Action
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        //Assert
        assertEquals(5, moscowClock.getTime());

    }
}
