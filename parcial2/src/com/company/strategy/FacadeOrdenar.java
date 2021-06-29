package com.company.strategy;

import java.util.ArrayList;
import java.util.Scanner;

public class FacadeOrdenar {
    IStrategy burbuja;
    IStrategy quicksort;
    IStrategy seleccion;
    ArrayList<Integer> vector;
    public FacadeOrdenar(){
        vector= new ArrayList<>();
        burbuja = new Burbuja(vector);
        seleccion = new Seleccion(vector);
        quicksort = new QuickSort(vector);

    }
    public void ordenarBurbuja(){
        burbuja.ordenar();
    }
    public void ordenarSeleccion(){
        seleccion.ordenar();
    }
    public void ordenarQuicksort(){
        quicksort.ordenar();
    }
    public void mostrar(){
        burbuja.mostrar();
    }
    public void menuOrdenar(){

            Scanner read = new Scanner(System.in);
            System.out.println("1: Burbuja");
            System.out.println("2: Seleccion");
            System.out.println("3: Quicksort");
            Integer opcion = read.nextInt();
            switch (opcion){
                case 1:
                    ordenarBurbuja();
                    break;
                case 2:
                    ordenarSeleccion();
                    break;
                case 3:
                    ordenarQuicksort();
                    break;
            }
    }
    public void menu(){
        Integer salir=0;
        while (salir==0) {
            Scanner read = new Scanner(System.in);
            System.out.println("1: Agregar");
            System.out.println("2: Ordenar");
            System.out.println("3: Mostrar");
            System.out.println("4: Salir");
            Integer opcion = read.nextInt();
            switch (opcion){
                case 1:
                    agregar();
                    break;
                case 2:
                    menuOrdenar();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    salir=1;
                    break;
            }
        }
    }
    public void agregar(){
        burbuja.agregar();
    }
}
