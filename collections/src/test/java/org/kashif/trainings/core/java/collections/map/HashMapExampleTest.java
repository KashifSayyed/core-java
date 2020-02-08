package org.kashif.trainings.core.java.collections.map;

import org.junit.Assert;
import org.junit.Test;

public class HashMapExampleTest {
    private HashMapExample hashMapExample = new HashMapExample();

    @Test
    public void testUpperCaseWithForEach(){
        hashMapExample.mapForEach();
        Assert.assertEquals(hashMapExample.getNumberMap().size(), 5);
    }

    @Test
    public void testCompute(){
        String value = hashMapExample.mapCompute(6, "Six");
        Assert.assertEquals("Expected value is Six", "Six", value);

        value = hashMapExample.mapCompute(2, "TWO");
        Assert.assertEquals("Expected value is Two", "Two", value);

        Assert.assertEquals(hashMapExample.getNumberMap().size(), 6);
    }

    @Test
    public void testComputeIfAbsent(){
        String value = hashMapExample.mapComputeIfAbsent(6, "Six");
        Assert.assertEquals("Expected value is Six", "Six", value);

        value = hashMapExample.mapComputeIfAbsent(7, "Seven");
        Assert.assertEquals("Expected value is Seven", "Seven", value);

        value = hashMapExample.mapComputeIfAbsent(2, "TWO");
        Assert.assertEquals("Expected value is Two", "Two", value);

        Assert.assertEquals(hashMapExample.getNumberMap().size(), 7);
    }

    @Test
    public void testComputeIfPresent(){
        String value = hashMapExample.mapComputeIfPresent(2, "TWO");
        Assert.assertEquals("Expected value is TWO", "TWO", value);

        value = hashMapExample.mapComputeIfPresent(8, "EIGHT");
        Assert.assertEquals("Expected value is null", null, value);

        Assert.assertEquals(hashMapExample.getNumberMap().size(), 5);
    }

    @Test
    public void testMerge(){
        String value = hashMapExample.mapMerge(2, "TWO");
        Assert.assertEquals("Expected value is TWO", "TWO", value);

        value = hashMapExample.mapMerge(8, "EIGHT");
        Assert.assertEquals("Expected value is EIGHT", "EIGHT", value);

        Assert.assertEquals(hashMapExample.getNumberMap().size(), 6);
    }
}
