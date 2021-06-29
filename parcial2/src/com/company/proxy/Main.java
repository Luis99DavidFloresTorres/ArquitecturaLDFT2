package com.company.proxy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClaseFacade claseFacade = new ClaseFacade(new ClaseProxy(new Clase(new ArrayList<>())));
        claseFacade.menu();
    }
}
