package com.company.strategy;

import java.util.ArrayList;

public abstract class Ordenamiento implements IStrategy{
    private ArrayList<Integer> arrayList;
    public Ordenamiento(ArrayList<Integer> arrayList){
        this.arrayList =arrayList;

    }
    public void generar() {
        for (Integer i = 0; i < 1000; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
    }
    @Override
    public abstract void ordenar();
    @Override
    public void mostrar() {
        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }
    @Override
    public void agregar() {
        generar();
    }
}
