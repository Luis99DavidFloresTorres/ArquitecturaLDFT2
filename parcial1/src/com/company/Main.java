package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        ZoologicoSingleton zoologicoS = ZoologicoSingleton.SingletonZoologico();
        ZoologicoController controller = new ZoologicoController(zoologicoS);

	    while (i == 0){
            Scanner leer = new Scanner(System.in);
	        System.out.println("1 :  Añadir Animal");
            System.out.println("2 : Mostrar Animales");
            System.out.println("3 : Mostrar Datos");
            System.out.println("4 : Colocar Datos");
            System.out.println("5 : Salir");
            int metodo = leer.nextInt();
	        switch (metodo){
                case 1:
                    controller.insertarAnimal();

                    break;
                case 2:
                    controller.mostrarAnimales();
                    break;
                case 3:
                    controller.mostrar();
                    break;
                case 4:
                    controller.colocarDatos();
                    break;
                case 5:
                    i=1;
                    break;
            }
        }
    }
}
