package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ubu on 03/12/16.
 */
public class Button {
    private List<IButtonListener> listenerList = new ArrayList<>();

    public void addListener(IButtonListener buttonListener) {
        listenerList.add(buttonListener);
    }

    public void click() {
        for (IButtonListener listener : listenerList) {
            listener.handleClick();
        }
    }
}
