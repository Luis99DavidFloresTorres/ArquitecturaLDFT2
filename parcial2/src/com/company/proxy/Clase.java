package com.company.proxy;

import java.util.ArrayList;

public class Clase {
    ArrayList<Alumno> alumnoArrayList;
    public Clase(ArrayList<Alumno> alumnoArrayList){
        this.alumnoArrayList = alumnoArrayList;
    }
    public void agregar(Alumno alumno){
        alumnoArrayList.add(alumno);
    }
    public void eliminar(Alumno alumno){
        alumnoArrayList.remove(alumno);
    }
    public void mostrarAlumnos(){
        for (Alumno alumno: alumnoArrayList){
            System.out.println("Alumno: "+ alumno.getNombres()+" "+alumno.getApellidos());
            System.out.println("cu: "+alumno.getCU());
            System.out.println("ci: "+alumno.getCi());
        }
    }

}
