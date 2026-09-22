/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jhojan_t1_tecnicas;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Controlador
{
    ArrayList<Alumno> lista_alumnos = new ArrayList<>();
    void Agregar(Alumno nuevo)
    {
        System.out.println("Se agrego un nuevo alumno");
        System.out.println("-------------------");
        lista_alumnos.add(nuevo);
    }
    public void lista_alumnos()
    {
        System.out.println("Los alumnos de la lista son: ");
        for (int i = 0; i < lista_alumnos.size(); i++) {
            lista_alumnos.get(i).Mostrarnombres();
        }
    }

}
