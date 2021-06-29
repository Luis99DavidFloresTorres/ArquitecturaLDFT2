package com.company;

import java.util.Scanner;

public class ZoologicoController {
    ZoologicoSingleton zoologico;
    AnimalesController controller = new AnimalesController();
    public ZoologicoController(ZoologicoSingleton zoologicoP){
        zoologico = zoologicoP;
    }
    public void mostrar(){
        String direccion = zoologico.getDireccion();
        String correo = zoologico.getCorreo();
        String nombre = zoologico.getNombre();
        int telefono = zoologico.getTelefono();
        System.out.println("direccion :"+direccion);
        System.out.println("correo : "+correo);
        System.out.println("nombre : "+nombre);
        System.out.println("telefono :"+telefono);
    }
    public void colocarDatos(){
        System.out.println("Ingrese el nombre");
        Scanner leer1 = new Scanner(System.in);
        String nombre = leer1.nextLine();
        System.out.println("Ingrese el direccion");
        Scanner leer2 = new Scanner(System.in);
        String direccion = leer2.nextLine();
        System.out.println("Ingrese el correo");
        Scanner leer3 = new Scanner(System.in);
        String correo = leer3.nextLine();
        System.out.println("Ingrese el telefono");
        Scanner leer4 = new Scanner(System.in);
        int telefono = leer1.nextInt();
        zoologico.SetDatos(nombre,direccion,telefono,correo);
    }
    public void insertarAnimal(){
        Animales animal =controller.insertar();
        zoologico.setAnimalesArrayList(animal);
    }
    public void mostrarAnimales(){
        controller.mostrar(zoologico.getAnimalesArrayList());
    }
}
