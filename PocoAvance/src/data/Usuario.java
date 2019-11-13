package data;

import java.io.Serializable;


public class Usuario implements Serializable {
    
    String nombre;
    long id;
    int edad;
    String tipo;

    public Usuario(String nombre, long id, int edad, String tipo) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

   
    public void programarEjercicio(){
        
    }
    
}
