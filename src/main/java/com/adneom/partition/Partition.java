package com.adneom.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition {


    public static List<ArrayList<Integer>> partition(List<Integer> liste, Integer taille) {

        List<ArrayList<Integer>> resultList = new ArrayList<>();
        ArrayList<Integer> sousList = new ArrayList<>();

        int i = 0;
        while (i < liste.size()) {
            sousList.clear();
            for (int j = 0; j < taille; j++) {
                if ((j + i) < liste.size())
                    sousList.add(liste.get(i + j));
            }
            resultList.add((ArrayList<Integer>) sousList.clone());
            i += taille;
        }

        return resultList;
    }

}
