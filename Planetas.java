/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenextraordinario;

import java.util.ArrayList;

public class Plnetas {

    private String UA;
    private String id;
    private String nombre;
    
    public static ArrayList<Planetas> planetas = new ArrayList<>();
    
    public Planetas(){
        
    }

    public Planetas(String UA, int id, String nombre) {
        this.UA = UA;
        this.id = id;
        this.nombre = nombre;

    }

    public static void insertarPlanetas(String UA, int id, String nombre,){
        planetas.add(new Planetas(UA,id, nombre));
    } 
    
    public String getUA() {
        return UA;
    }
    
    public void setUA(String UA) {
        this.UA = UA;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString() {
        return "Planetas{" + "UA=" + UA + ", id=" + id + ", nombre=" + nombre };
    }    
}
