package observer;

import java.util.LinkedList;
import java.util.List;

public class Button {

    private List<OnClickListener> listeners = new LinkedList<>();

    public void setListener(OnClickListener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(OnClickListener listener) {
        this.listeners.remove(listener);
    }

    public void click() {
        for (OnClickListener listener : listeners) {
            listener.onClick();
        }
    }
}
