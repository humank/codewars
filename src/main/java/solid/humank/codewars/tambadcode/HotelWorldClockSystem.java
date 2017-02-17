package solid.humank.codewars.tambadcode;

import java.util.ArrayList;

/**
 * Created by yikai on 17/02/2017.
 */
public class HotelWorldClockSystem {
    private ArrayList<CityClock> cityClocks =new ArrayList<CityClock>();

    public void attach(CityClock CityClock) {
        this.cityClocks.add(CityClock);
    }

    public ArrayList<CityClock> getClocks() {
        return this.cityClocks;
    }
}
