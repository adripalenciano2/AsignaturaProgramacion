package com.company;

public class PruebaTipado {
    public static void main(String[] args){

        int edad = 23;
        float estatura = 1.78f;
        char grupoClase = 'L';
        String nombre = "Adrian";
        String apellido1 = "Palenciano";
        String apellido2 = "Garcia";
        String nombreCompleto = nombre + " " + apellido1 + " " + apellido2;

        System.out.print("Mi nombre es " + nombreCompleto + ", tengo " + edad + " años, mido " + estatura
                          + " metros y pertenezco al grupo " + grupoClase + ".");

    }
}
