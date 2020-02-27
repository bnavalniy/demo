package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    /*@Autowired
    SortAlgorithm bubbleSortAlgorithm;*/

    @Autowired
    SortAlgorithm quickSortAlgorithm;

   /* public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

  /*  public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numToSearch) {
        int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
        System.out.println(quickSortAlgorithm);
        return 3;
    }
}
