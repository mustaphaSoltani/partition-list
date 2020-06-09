package com.adneom.partition;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartitionTest {

    @Test
    public void testListe() {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            resultList.add(i);
        }
        List<List<Integer>> expectedList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Collections.singletonList(5));
        assertEquals(expectedList, Partition.partition(resultList, 2));

    }

}
