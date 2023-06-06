/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacion;

/**
 *
 * @author Jess
 */
public class Aplicacion {
    public String Jessica59640() {
        String nombre = "Jessica";
        String matricula = "59640";
        String correo = "al059640@gmail.com";
        String hobby = "programar";

        String datos = "Nombre: " + nombre + "\nMatrícula: " + matricula + "\nCorreo electrónico: " + correo + "\nHobby: " + hobby;
        return datos;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Aplicacion
        Aplicacion app = new Aplicacion();

        String resultados = app.Jessica59640();

        System.out.println(resultados);
    }
}
    
