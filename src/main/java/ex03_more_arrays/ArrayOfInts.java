package ex03_more_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOfInts {

    public Integer[] findCommonElements(Integer[] array1, Integer[] array2){
        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) return null;
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(array2));
        set1.retainAll(set2);
        return set1.toArray(new Integer[0]);
    }

    public Integer[] findDuplicateValues(Integer[] array1){
        if (array1 == null || array1.length == 0) return null;

        ArrayList<Object> help = new ArrayList<> ();
        ArrayList<Integer> result = new ArrayList<> ();
        for (int i : array1) {
            if (!help.contains(i)) help.add(i);
            if (help.contains(i)) result.add(i);
        }

        return (Integer[]) result.toArray();
    }
}
