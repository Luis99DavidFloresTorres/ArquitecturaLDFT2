package com.company;

import java.util.Date;

public class FabricaAnimales {
    public Animales generarAnimal(String animal, String nombre, int peso, int ancho, int alto, String color,  Especie especie) {
        if (animal.equals("mono")) {
            return new Mono(nombre,peso,alto,ancho,color, especie);
        } else if (animal.equals("leon")) {
            return new Leon(nombre,peso,alto,ancho);

        } else if (animal.equals("oso")) {
            return new Oso(nombre,peso,alto,ancho,color);
        } else {
            return null;
        }
    }
}
