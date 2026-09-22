/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhojan_t1_tecnicas;

public class Alumno {

    private String nombre;
    private String tipo_Doc;
    private String numero_Doc;
    private String nivel_Socieconomico;
    private String tipo_Beca;
    private int pagoNivel;
    private double porc_beca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_Doc() {
        return tipo_Doc;
    }

    public void setTipo_Doc(String tipo_Doc) {
        this.tipo_Doc = tipo_Doc.toUpperCase();
    }

    public String getNumero_Doc() {
        return numero_Doc;
    }

    public void setNumero_Doc(String numero_Doc) {

    if (this.tipo_Doc == null) {
        throw new IllegalStateException(
                "Primero debe ingresar el tipo de documento."
        );
    }
    if (this.tipo_Doc.equals("DNI")) {

        if (numero_Doc.length() != 8) {
            throw new IllegalArgumentException(
                    "El DNI debe tener exactamente 8 dígitos."
            );
        }
    } else if (this.tipo_Doc.equals("RESIDENCIA TEMPORAL")) {

        if (numero_Doc.length() != 11) {
            throw new IllegalArgumentException(
                    "La Residencia Temporal debe tener exactamente 11 dígitos."
            );
        }
    }
    this.numero_Doc = numero_Doc;
    }
    public String getNivel_Socieconomico() {
        return nivel_Socieconomico;
    }
    public void setNivel_Socieconomico(String nivel_Socieconomico) {

        if (nivel_Socieconomico == null) {
            throw new IllegalArgumentException(
                    "El nivel socioeconómico no puede ser nulo."
            );
        }
        this.nivel_Socieconomico = nivel_Socieconomico.toUpperCase();
        switch (this.nivel_Socieconomico) {
            case "A":
                this.pagoNivel = 500;
                break;
            case "B":
                this.pagoNivel = 300;
                break;
            case "C":
                this.pagoNivel = 100;
                break;
            default:
                throw new IllegalArgumentException("Nivel socioeconomico invalido.");
        }
    }

    public String getTipo_Beca() {
        return tipo_Beca;
    }

    public void setTipo_Beca(String tipo_Beca) {

        this.tipo_Beca = tipo_Beca.toUpperCase();

        if (this.tipo_Beca.equals("PARCIAL")) {
            porc_beca = 0.5;

        } else if (this.tipo_Beca.equals("TOTAL")) {
            porc_beca = 1.0;

        } else if (this.tipo_Beca.equals("NINGUNA")) {
            porc_beca = 0.0;

        } else {
            throw new IllegalArgumentException(
                    "Tipo de beca inválido."
            );
        }
    }

    public void CalcularPensionFinal() {

        double pension = pagoNivel - (pagoNivel * porc_beca);
        System.out.println("Tu Pension Final es: S/ " + pension);
    }
    public void Mostrarnombres() {
    System.out.println("Nombre: " + this.nombre + " Tipo de Documento: " + 
            this.tipo_Doc + " Numero de Documento: " + this.numero_Doc + " Nivel Socioeconomico: " 
            + this.nivel_Socieconomico + " Tipo de Beca: " + this.tipo_Beca);
    }
}
