package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;

/**

 Created by Web 74 all right reserved
 User: vincent
 Date: 27/07/2023
 Time: 16:32
 */
public class ShellSort implements SortAlgorithm {

    public void sort(ObservableArray array) {
        int length = array.getLength();
        int n = 2;

        // Calcul de la séquence de ns
        while (n < length / 3) {
            n = 3 * n + 1;
        }

        while (n >= 1) {
            for (int i = n; i < length; i++) {
                int value = array.get(i);
                int j = i;

                while (j >= n && array.get(j - n) > value) {
                    array.swap(j, j - n);
                    j = j - n;
                }
            }
            n = n / 3;
        }
    }
}