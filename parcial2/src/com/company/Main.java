package com.company;

import com.company.strategy.QuickSort;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort(new ArrayList<>());
        quickSort.mostrar();
        quickSort.ordenar();
    }
}
