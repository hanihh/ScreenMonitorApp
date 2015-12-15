import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by hani.hawasli on 12/15/2015.
 */
public abstract class AbstractTimer extends Timer {
    private int period;
    private int step;
    private TimerTask task;
    public abstract void initiate ();
    public abstract int run();
    public abstract int stop();
}
