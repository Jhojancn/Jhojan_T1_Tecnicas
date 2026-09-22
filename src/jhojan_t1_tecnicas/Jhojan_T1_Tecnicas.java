/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jhojan_t1_tecnicas;

import java.util.Scanner;

public class Jhojan_T1_Tecnicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Alumno alumno = new Alumno();

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = sc.nextLine();
        alumno.setNombre(nombre);

        System.out.println("Ingrese el tipo de documento:");
        System.out.println("DNI o Residencia Temporal");
        String tipo = sc.nextLine();
        alumno.setTipo_Doc(tipo);

        System.out.println("Ingrese el numero de documento:");
        String numero = sc.nextLine();
        alumno.setNumero_Doc(numero);

        System.out.println("Ingrese nivel socioeconómico:");
        System.out.println("A| B| C");
        String nivel = sc.nextLine();
        alumno.setNivel_Socieconomico(nivel);

        System.out.println("Ingrese tipo de beca:");
        System.out.println("Parcial / Total / Ninguna");
        String beca = sc.nextLine();
        alumno.setTipo_Beca(beca);

        System.out.println("\n||DATOS DEL ALUMNO|||");

        alumno.Mostrarnombres();
        alumno.CalcularPensionFinal();
    }
}
