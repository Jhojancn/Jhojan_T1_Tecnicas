/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jhojan_t1_tecnicas;

public class Alumno 
{
    private String nombre;
    private String tipo_Doc;
    private String numero_Doc;
    private String nivel_Socieconomico;
    private String tipo_Beca;

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
            throw new IllegalStateException("Cual es su tipo de documento");
        }
        if (this.tipo_Doc.equals("DNI")) {
            if (numero_Doc.length() != 8) {
                throw new IllegalArgumentException("El DNI debe tener exactamente 8 dígitos.");
            }
        } else if (this.tipo_Doc.equals("Residencia Ttemporal")) {
            if (numero_Doc.length() != 11) {
                throw new IllegalArgumentException("La Residencia Temporal debe tener exactamente 11 dígitos.");
            }
        }
    }

    public String getNivel_Socieconomico() {
        return nivel_Socieconomico;
    }

    public void setNivel_Socieconomico(String nivel_Socieconomico) {
        this.nivel_Socieconomico = nivel_Socieconomico;
    }

    public String getTipo_Beca() {
        return tipo_Beca;
    }

    public void setTipo_Beca(String tipo_Beca) {
        this.tipo_Beca = tipo_Beca;
    }
    
    public void ObtenerPorcentajeBeca()
    {
        
    }
    public void CalcularPensionFinal()
    {
        
    }
    public void Mostrarnombres() {
        System.out.println( nombre );
    }
}
