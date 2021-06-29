package com.company.proxy;

import java.util.ArrayList;

public class ClaseProxy {
    Clase clase;
    ArrayList<String> operaciones;
    public ClaseProxy(Clase clase1){
        clase= clase1 ;
        operaciones= new ArrayList<>();
    }
    public void agregar(Alumno alumno){
        clase.agregar(alumno);
        operaciones.add("Se agrego el alumno "+ alumno.getNombres()+" "+alumno.getApellidos());
    }
    public void eliminar(Alumno alumno){
        clase.eliminar(alumno);
        operaciones.add("Se elimino el alumno "+ alumno.getNombres()+" "+alumno.getApellidos());
    }
    public void mostrarAlumnos(){
        clase.mostrarAlumnos();
        System.out.println("funciona");
        operaciones.add("Se mostro todos los alumnos");
    }
    public void mostrarAcciones(){
        for(String acciones: operaciones){
            System.out.println(acciones);
        }
    }
}
