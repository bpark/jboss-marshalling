package org.jboss.marshalling.cloner;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @author Kurt Sparber
 */
public class TreeMapComparator implements Serializable, Comparator<AKey> {

    private static final long serialVersionUID = 6210982067862664887L;

    @Override
    public int compare(AKey o1, AKey o2) {
        if (o1 == null && o2 != null)
            return 1;
        if (o1 != null && o2 == null)
            return -1;
        if (o1 == null)
            return 0;
        return o1.getValue().compareTo(o2.getValue());
    }
}
