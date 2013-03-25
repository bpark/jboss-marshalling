package org.jboss.marshalling.cloner;

import java.io.IOException;
import java.io.Serializable;
import java.util.Comparator;

/**
 * This class defines {@linkplain #readObject(java.io.ObjectInputStream)} and
 * {@linkplain #writeObject(java.io.ObjectOutputStream)} and a field comparator (like a TreeMap).
 *
 * @author Kurt Sparber
 */
public class ComparatorHolder implements Serializable {

    private static final long serialVersionUID = 8447276568866139567L;
    private final Comparator comparator;

    public ComparatorHolder(Comparator comparator) {
        this.comparator = comparator;
    }

    public Comparator comparator() {
        return comparator;
    }

    private void readObject(final java.io.ObjectInputStream s) throws IOException, ClassNotFoundException {
        // Read in the Comparator and any hidden stuff
        s.defaultReadObject();
    }

    private void writeObject(java.io.ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
    }
}
