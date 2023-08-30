package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm {
    int premier;
    int dernier;
    int partition;
    int quickSort;

    @Override

    public void sort(ObservableArray array) {
        if (2 <= array.getLength()) {
            int pi = partition(array, premier, dernier);
            quickSort(array, premier, pi - 1);
            quickSort(array, pi + 1, dernier);
        }
    }

    private void quickSort(ObservableArray array, int premier, int i) {

    }

    private int partition(ObservableArray array, int premier, int dernier) {
        return premier;
    }

    public void setPartition(ObservableArray array, int premier, int dernier) {
        int pivot = dernier;
        int j = premier;
        for (int i = premier; i < dernier; i++) {
            if (array.get(i) <= array.get(pivot)) {
                array.swap((i), (j));
                j = j + 1;
            }
        }
        array.swap((dernier), j);
        return j;
    }
}

