package edu.campusnum.visualsort.sort;

import edu.campusnum.visualsort.model.ObservableArray;


/**
 * Created by Web 74 all right reserved
 * User: vincent
 * Date: 27/07/2023
 * Time: 16:31
 */
public class MergeSort implements SortAlgorithm {

    @Override
    public void sort(ObservableArray array) {

        int middle = array.getLength()/ 2;
        if (array.getLength() > 1) {

            sort(array.slice(0, middle));
            sort(array.slice(middle, array.getLength()- middle));

            int left = 0;

            while (left != middle && middle < array.getLength()) {
                if (array.get(left) < array.get(middle)) {
                    left++;
                } else {
                    for (int i = middle; i > left; i--) {
                        array.swap(i - 1, i);
                    }
                    left++;
                    middle++;
                }
            }
        }
    }
}