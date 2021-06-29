package com.company.strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Seleccion seleccion = new Seleccion();
        //seleccion.ordenar();
        //seleccion.mostrar();
        FacadeOrdenar facadeOrdenar = new FacadeOrdenar();
        facadeOrdenar.menu();
    }
}
