package org.jboss.marshalling.cloner;

import java.io.Serializable;

/**
 * Simple key class for testing.
 *
 * @author Kurt Sparber
 */
public class AKey implements Serializable {

    private static final long serialVersionUID = -7570800428493795417L;

    private Integer value;

    public AKey(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AKey aKey = (AKey) o;

        return !(value != null ? !value.equals(aKey.value) : aKey.value != null);

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
