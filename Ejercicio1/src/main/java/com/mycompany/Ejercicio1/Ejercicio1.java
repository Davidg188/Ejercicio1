/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author gesle
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hola, soy David Gomez");

        int num1 = 10, num2 = 5;
        System.out.println("");
        System.out.println("Numero 1: " + (num1));
        System.out.println("Numero 2: " + (num2));
        System.out.println("");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));

        int M = 6, T = 1, K = -10;
        System.out.println("M > T: " + (M > T));
        System.out.println("T / K == -5: " + (T / K == -5));
        System.out.println("(M+T == 7) || (M-T == 5): " + ((M + T == 7) || (M - T == 5)));

        String[] nombres = {
            "ALLISON MICHELL PINEDA HERRERA",
            "KEVIN FELIPE ALTAMIRANO MONTOYA",
            "AMIR EDUARDO BORJAS JUANEZ",
            "ANDREA GISELLE OSEJO CANALES",
            "BIANKA NICOLLE RIVERA GALLO",
            "ERMIN ANTONIO GONZALEZ FLORES",
            "CINDY YAMILETH FLORES ARITA",
            "JOSE CARLOS VALDEZ MARCIA",
            "JOSUE MANUEL HENRIQUEZ CRUZ",
            "KARINA IVETH GALO RODRIGUEZ"
        };

        System.out.println("\nLista de companeros:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        String[][] companeros = {
            {"EMERSON DANIEL", "SANTOS DIAZ", "Ingenieria Computacional", "El Progreso, Yoro"},
            {"EDWIN GEOVANNY", "RODRIGUEZ HERNANDEZ", "Ingenieria Electrica", "San Pedro Sula"},
            {"JOSE EDUARDO", "RODRIGUEZ VASQUEZ", "Ingenieria Industrial", "El Progreso, Yoro"},
            {"JOSUE MANUEL", "HENRIQUEZ CRUZ", "Ingenieria Industrial", "Villanueva, Cortes"}
        };

        System.out.println("\nDatos de companeros:");
        for (String[] companero : companeros) {
            System.out.println("Nombre: " + companero[0] + " " + companero[1] + 
                               " | Carrera: " + companero[2] + 
                               " | Ubicacion: " + companero[3]);
        }

        String[][] notasEstudiantes = {
            {"EMERSON DANIEL", "75"},
            {"EDWIN GEOVANNY", "58"},
            {"JOSE EDUARDO", "82"},
            {"JOSUE MANUEL", "90"}
        };

        System.out.println("\nResultados de estudiantes:");
        for (String[] estudiante : notasEstudiantes) {
            int nota = Integer.parseInt(estudiante[1]);
            String estado = nota >= 65 ? "Aprobado" : "Reprobado";
            System.out.println(estudiante[0] + " - " + nota + " - " + estado);
        }

        System.out.println("\nNumeros pares del 2 al 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
