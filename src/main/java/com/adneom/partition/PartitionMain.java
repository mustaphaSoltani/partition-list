package com.adneom.partition;

import java.util.Arrays;
import java.util.List;


public class PartitionMain {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Partition.partition(inputList,2));
    }


}
