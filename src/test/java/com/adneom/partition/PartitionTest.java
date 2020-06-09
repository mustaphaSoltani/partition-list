package com.adneom.partition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;

public class PartitionTest {

    @Test
    public void testListe(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        ArrayList<ArrayList<Integer>> expected = new ArrayList<> ();
        expected.add(new ArrayList<>(Arrays.asList(1,2)));
        expected.add(new ArrayList<>(Arrays.asList(3,4)));
        expected.add(new ArrayList<>(Collections.singletonList( 5)));
        assertEquals(expected, Partition.partition(list, 2));

    }

}
