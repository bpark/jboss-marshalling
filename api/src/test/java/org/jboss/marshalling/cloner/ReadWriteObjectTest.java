package org.jboss.marshalling.cloner;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotSame;

/**
 * @author Kurt Sparber
 */
public class ReadWriteObjectTest {

    /**
     * Tests if the comparators are not the same after cloning with a object with readObject and writeObject methods.
     *
     * @throws Exception
     */
    @Test
    public void testWithReadAndWriteObject() throws Exception {
        ComparatorHolder orig = new ComparatorHolder(new TreeMapComparator());
        SerializingCloner cloner = new SerializingCloner(new ClonerConfiguration());
        ComparatorHolder clone = (ComparatorHolder) cloner.clone(orig);
        assertNotSame(orig, clone);
        assertNotSame(orig.comparator(), clone.comparator());
    }
}
