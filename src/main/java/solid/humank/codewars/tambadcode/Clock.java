package solid.humank.codewars.tambadcode;

/**
 * Created by yikai on 17/02/2017.
 */
public abstract class Clock {
    protected int utcOffset;
    protected int time;

    public abstract int getTime();
}
