package data;
import java.io.Serializable;
import java.util.*;

import bussinesLogic.Lista;

public class Administrador extends Usuario implements Serializable {
    
    private static final long serialVersionUID= 2L;
    
    private int cantUsuariosxAdm;
    Lista UsuariosxAdm = new Lista(cantUsuariosxAdm);

    public Administrador(int cantUsuariosxAdm, String nombre, long id, int edad, String tipo) {
        super(nombre, id, edad, tipo);
        this.cantUsuariosxAdm = cantUsuariosxAdm;
    }
    
    
    public void administrarGimnasio(){
        
    }
    public boolean borrarUsuario(Cliente cliente){
        return UsuariosxAdm.delete(cliente);
    }
    public void modificarUsuario(Cliente cliente1, Cliente cliente2){
        UsuariosxAdm.replace(cliente1, cliente2);
    }
   // public void modificarInformaciónGimnasio(Gimnasio gimnasio){
        
   // }
  
    
    public String toString() {
    return "cantidad de usuarios " + cantUsuariosxAdm + "; " + "nombre  " + nombre + ", identificacion " + id + ", edad "+ edad +", tipo" + tipo ;
  }
}