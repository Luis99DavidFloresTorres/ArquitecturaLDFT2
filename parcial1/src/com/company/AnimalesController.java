package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalesController {
    FabricaAnimales fabrica = new FabricaAnimales();
    public Animales insertar(){
        System.out.println("Ingrese clase de animal");
        Scanner leer = new Scanner(System.in);
        String animal = leer.nextLine();

        if(animal.equals("mono")){
            System.out.println("Ingrese nombre");
            Scanner leer1 = new Scanner(System.in);
            String nombre = leer1.nextLine();
            Scanner leer2 = new Scanner(System.in);
            System.out.println("Ingrese peso");
            int peso = leer2.nextInt();
            Scanner leer3 = new Scanner(System.in);
            System.out.println("Ingrese alto");
            int alto = leer3.nextInt();
            Scanner leer4 = new Scanner(System.in);
            System.out.println("Ingrese ancho");
            int ancho = leer4.nextInt();
            System.out.println("Ingrese especie");
            Scanner leer5 = new Scanner(System.in);
            Especie especie = Especie.valueOf(leer5.nextLine());
            System.out.println("Ingrese color");
            Scanner leer6 = new Scanner(System.in);
            String color = leer6.nextLine();
            Especie paramateroEspecie = Especie.ValorDesconocido;
            for (Especie especieValor : Especie.values()) {
                if (especie.equals(especieValor)) {
                    paramateroEspecie = especie;
                }
            }

            Animales animales=  fabrica.generarAnimal(animal,nombre,peso,ancho,alto,color, paramateroEspecie);
            return animales;
        }else if(animal.equals("leon")) {
            System.out.println("Ingrese nombre");
            Scanner leer1 = new Scanner(System.in);
            String nombre = leer1.nextLine();
            System.out.println("Ingrese peso");
            Scanner leer2 = new Scanner(System.in);

            int peso = leer2.nextInt();
            System.out.println("Ingrese alto");
            Scanner leer3 = new Scanner(System.in);

            int alto = leer3.nextInt();
            System.out.println("Ingrese ancho");
            Scanner leer4 = new Scanner(System.in);

            int ancho = leer4.nextInt();
            Animales animales=  fabrica.generarAnimal(animal,nombre,peso,ancho,alto,"ninguno",Especie.ValorDesconocido);
            return animales;
        }else if (animal.equals("oso")){
            System.out.println("Ingrese nombre");
            Scanner leer1 = new Scanner(System.in);
            String nombre = leer1.nextLine();
            System.out.println("Ingrese peso");
            Scanner leer2 = new Scanner(System.in);
            int peso = leer2.nextInt();
            System.out.println("Ingrese alto");
            Scanner leer3 = new Scanner(System.in);
            int alto = leer3.nextInt();
            System.out.println("Ingrese ancho");
            Scanner leer4 = new Scanner(System.in);
            int ancho = leer4.nextInt();
            System.out.println("Ingrese color");
            Scanner leer5 = new Scanner(System.in);
            String color = leer5.nextLine();
            Animales animales=  fabrica.generarAnimal(animal,nombre,peso,ancho,alto,color, Especie.ValorDesconocido);
            return animales;
        }
        return null;
    }
    public void mostrar(ArrayList<Animales> lista) {
        for (Animales animal : lista) {
            animal.getDatos();
        }
    }
}
