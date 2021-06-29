package com.company;

import java.util.ArrayList;

public class ZoologicoSingleton {
    private String nombre;
    private String direccion;
    private int telefono;
    private String correo;
    private ArrayList<Animales> animalesArrayList;
    private static ZoologicoSingleton zoologico;
    private ZoologicoSingleton(){
    }
    public static ZoologicoSingleton SingletonZoologico(){
        if(zoologico==null){
            return zoologico = new ZoologicoSingleton();
        }
        else {
            return zoologico;
        }
    }
    public void SetDatos(String nombreP, String direccionP, int telefonoP, String correoP){
        nombre= nombreP;
        direccion=direccionP;
        correo=correoP;
        telefono=telefonoP;
        animalesArrayList = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
<<<<<<< HEAD

=======
>>>>>>> parcial 2
    public ArrayList<Animales> getAnimalesArrayList() {
        return animalesArrayList;
    }

    public void setAnimalesArrayList(Animales animal) {
        this.animalesArrayList.add(animal);
    }
}
