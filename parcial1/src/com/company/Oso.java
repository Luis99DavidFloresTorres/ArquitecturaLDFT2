package com.company;

public class Oso implements Animales{
    private String nombre;
    private int peso;
    private int alto;
    private int ancho;
    private String color;

    public Oso(String nombre, int peso, int alto, int ancho, String color) {
        this.nombre = nombre;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void getDatos() {

        System.out.println("nombre : "+nombre);
        System.out.println("peso: "+peso);
        System.out.println("alto: "+alto);
        System.out.println("ancho: "+ancho);
        System.out.println("color: "+color);
        System.out.println("espacio requerido: "+calcularEspacio());
    }
    @Override
    public int calcularEspacio() {
        int area = (alto*ancho*20)/4;
        return area;
    }
}
