package com.company.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class QuickSort extends Ordenamiento {

    public QuickSort(ArrayList<Integer> integerArrayList) {
        super(integerArrayList);

    }

    @Override
    public ArrayList<Integer> getArrayList() {
        return super.getArrayList();
    }


    @Override
    public void ordenar() {
       System.out.println( "sa"+quickSort(super.getArrayList(),0, super.getArrayList().size()-1));

    }


    public ArrayList<Integer> quickSort(ArrayList<Integer> list, int a, int b)
    {
        if (a >= b)
            return list;

        Integer pivot = list.get(b);

        int left = a;
        int right = b;

        while (left < right)
        {
            while(list.get(left).compareTo(pivot) < 0)
                left++;

            while(list.get(right).compareTo(pivot) > 0)
                right--;

            if (right > left);
            {
                Collections.swap(list, left, right);
            }
        }

        quickSort(list, a, right-1);
        quickSort(list, right+1, b);

        return list;
    }
}
