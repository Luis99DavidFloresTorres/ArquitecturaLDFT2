package com.company.strategy;

import java.util.ArrayList;

public class Burbuja extends Ordenamiento{
    public Burbuja(ArrayList<Integer> arrayList) {
        super(arrayList);
    }

    @Override
    public void ordenar() {
        burbuja();
    }
    public void burbuja() {
        int i, j, aux;
        for (i = 0; i < super.getArrayList().size() - 1; i++) {
            for (j = 0; j < super.getArrayList().size() - i - 1; j++) {
                if (super.getArrayList().get(j+1) < super.getArrayList().get(j)) {
                    aux = super.getArrayList().get(j+1);
                    super.getArrayList().set(j+1,j);
                    super.getArrayList().set(j,aux);
                }
            }
        }
    }
}
