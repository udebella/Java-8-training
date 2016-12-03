package observer;

/**
 * Created by ubu on 03/12/16.
 */
public class ButtonCounterClick implements IButtonListener {
    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    @Override
    public void handleClick() {
        counter++;
    }
}
