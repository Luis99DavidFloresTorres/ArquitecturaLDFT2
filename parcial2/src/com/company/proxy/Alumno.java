package com.company.proxy;

public class Alumno {
    private String CU;
    private String ci;
    private String apellidos;
    private String nombres;

    public Alumno(String CU, String ci, String apellidos, String nombres) {
        this.CU = CU;
        this.ci = ci;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getCU() {
        return CU;
    }

    public void setCU(String CU) {
        this.CU = CU;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
