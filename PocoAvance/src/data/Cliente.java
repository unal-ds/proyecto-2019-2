package data;

import java.io.Serializable;

public class Cliente extends Usuario implements Serializable{
    private static final long serialVersionUID= 1L;
    
    private String TipoMembresia;
    private boolean membresiaActiva;
    private Cuenta cuenta = null;
    

    public Cliente(String TipoMembresia, boolean membresiaActiva, String nombre, long id, int edad, String tipo) {
        super(nombre, id, edad, tipo);
        this.TipoMembresia = TipoMembresia;
        this.membresiaActiva = membresiaActiva;
    }
    
    @Override
    public String toString() {
    return "tipo de membresia  " + TipoMembresia + "; " + "nombre  " + nombre + ", identificacion " + id + ", edad "+ edad +", tipo " + tipo ;
  }
    

    public String getTipoMembresia() {
        return TipoMembresia;
    }

    public void setTipoMembresia(String TipoMembresia) {
        this.TipoMembresia = TipoMembresia;
    }

    public boolean isMembresiaActiva() {
        return membresiaActiva;
    }

    public void setMembresiaActiva(boolean membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    
    
    
    public void crearCuenta(String tipo) throws CloneNotSupportedException{
        cuenta = new Cuenta(tipo, (Usuario) this.clone());
    }
    
    public void programarEntrenamiento(){
        
    }
    public void cancelarEntrenamiento(){
        
    }
    public void cancelarMembresia(){
        membresiaActiva = false;
    }
}
