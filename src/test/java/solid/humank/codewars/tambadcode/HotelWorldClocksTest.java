package solid.humank.codewars.tambadcode;

import org.junit.Assert;
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

        //Arrange
        CityClock londonClock = new CityClock(0);
        PhoneClock phoneClock = new PhoneClock(8);

        //Act
        phoneClock.setCityClock(londonClock);
        phoneClock.setTime(9);

        //Assert
        assertEquals(1,londonClock.getTime());


    }

}
