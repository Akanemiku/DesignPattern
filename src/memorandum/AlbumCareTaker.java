package memorandum;

import java.util.Hashtable;

public class AlbumCareTaker {
    private Hashtable ht;

    public AlbumCareTaker() {
        ht = new Hashtable();
    }

    public void add(String name, IMemento im) {
        ht.put(name, im);
    }

    public IMemento findIMemonto(String name) {
        return (IMemento) ht.get(name);
    }
}
