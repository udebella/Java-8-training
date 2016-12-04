package observer;

/**
 * Created by ubu on 03/12/16.
 */
public class ButtonCounterClick {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void handleClick() {
        counter++;
    }
}
