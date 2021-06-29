package com.company.proxy;

import java.util.Scanner;

public class ClaseFacade {
    ClaseProxy claseProxy;
    public ClaseFacade(ClaseProxy claseProxy1){
        claseProxy= claseProxy1;
    }
    public void menu(){
        Integer salir=0;
        while (salir==0) {
            Scanner read = new Scanner(System.in);
            System.out.println("1: Agregar");
            System.out.println("2: Eliminar");
            System.out.println("3: Mostrar Alumnos");
            System.out.println("4: Mostrar operaciones realizadas");
            System.out.println("5: Salir");
            Integer opcion = read.nextInt();
            switch (opcion){
                case 1:
                    agregar();
                    break;
                case 2:
                    eliminar();
                    break;
                case 3:
                    Mostrar();
                    break;
                case 4:
                    MostrarOperaciones();
                    break;
                case 5:
                    salir=1;
                    break;
            }
        }
    }
    public void agregar(){
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese nombres");
        String nombre = read.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = read.nextLine();
        System.out.println("Ingrese ci");
        String ci = read.nextLine();
        System.out.println("Ingrese cu");
        String cu = read.nextLine();
        Alumno nuevoAlumno= new Alumno(cu,ci,apellidos,nombre);
        claseProxy.agregar(nuevoAlumno);
    }
    public void eliminar(){
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese nombres");
        String nombre = read.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = read.nextLine();
        System.out.println("Ingrese ci");
        String ci = read.nextLine();
        System.out.println("Ingrese cu");
        String cu = read.nextLine();
        Alumno eliminarAlumno= new Alumno(cu,ci,apellidos,nombre);
        claseProxy.eliminar(eliminarAlumno);
    }
    public void Mostrar(){
        claseProxy.mostrarAlumnos();
    }
    public void MostrarOperaciones(){
        claseProxy.mostrarAcciones();
    }
}
