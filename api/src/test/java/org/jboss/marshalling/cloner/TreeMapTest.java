package org.jboss.marshalling.cloner;

import org.testng.annotations.Test;

import java.util.TreeMap;

import static org.testng.Assert.assertNotSame;

/**
 * @author Kurt Sparber
 */
public class TreeMapTest {

    /**
     * Tests if the comparators inside a {@linkplain TreeMap} are different.
     *
     * @throws Exception
     */
    @Test
    public void testTreeSetCloning() throws Exception {
        SerializingCloner cloner = new SerializingCloner(new ClonerConfiguration());
        TreeMap<AKey, String> treeMap = new TreeMap<AKey, String>(new TreeMapComparator());
        treeMap.put(new AKey(0), "123");
        treeMap.put(new AKey(1), "098");
        Object clone = cloner.clone(treeMap);
        TreeMap<AKey, String> clonedMap = (TreeMap<AKey, String>) clone;
        clonedMap.get(new AKey(1));

        assertNotSame(treeMap.comparator(), clonedMap.comparator());
    }

}
