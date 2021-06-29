package com.company.strategy;

import java.util.ArrayList;

public  class Seleccion extends Ordenamiento {
    public Seleccion(ArrayList<Integer> arrayList) {
        super(arrayList);

    }


    @Override
    public void ordenar() {
        seleccion(super.getArrayList());
    }

    public static void seleccion(ArrayList<Integer> A) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.size() - 1; i++) {      // tomamos como menor el primero
            menor = A.get(i);                       // de los elementos que quedan por ordenar
            pos = i;                            // y guardamos su posición
            for (j = i + 1; j < A.size()-1; j++){ // buscamos en el resto
                if (A.get(j) < menor) {           // del array algún elemento
                    menor = A.get(j);             // menor que el actual
                    pos = j;
                }
            }
            if (pos != i){                      // si hay alguno menor se intercambia
                tmp = A.get(j);
                A.set(i,pos);
                A.set(pos,tmp);
            }
        }
    }
}
