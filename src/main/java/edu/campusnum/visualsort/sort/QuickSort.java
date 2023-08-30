package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class QuickSort implements SortAlgorithm {

    @Override

    public void sort(ObservableArray array) {
        quickSort(array,0,array.getLength()-1);
    }

    private void quickSort(ObservableArray array, int premier, int dernier) {
        if (1 < (dernier - premier + 1 )) {
            int pi = partition(array, premier, dernier);
            quickSort(array, premier, pi - 1);
            quickSort(array, pi + 1, dernier);
        }
    }


    public int partition(ObservableArray array, int premier, int dernier) {
        int pivot = dernier;
        int j = premier;
        for (int i = premier; i < dernier; i++) {
            if (array.get(i) <= array.get(pivot)) {
                array.swap(i, j);
                j = j + 1;
            }
        }
        array.swap(dernier, j);
        return j;
    }
}

