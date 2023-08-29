package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:32
 */
public class ShellSort implements SortAlgorithm {
    @Override
    public void sort(ObservableArray array) {
        int n = array.getLength();
        int length = array.getLength();
        n = 0;
        while (n < length) {
            n = (3 * n + 1);
        }
//        while (n != 0) {
//            n = (n / 3);
//            for (int i = n; i < n; i++) {
//                int value = array.get(i);
//                int j = i;
//                array.swap((j > (n - 1)) && (array.get(j - n) > value);
//            }
//        }
    }
}
