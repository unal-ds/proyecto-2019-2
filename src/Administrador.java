public class Administrador {
    int cantUsuariosxAdm;
    Lista UsuariosxAdm = new Lista(cantUsuariosxAdm);
    public void administrarGimnasio(){
        
    }
    public boolean borrarUsuario(Cliente cliente){
        return UsuariosxAdm.delete(cliente);
    }
    public void modificarUsuario(Cliente cliente1, Cliente cliente2){
        
    }
    public void modificarInformaciónGimnasio(Gimnasio gimnasio){
        
    }
    public void actualizarDisponibilidadMáquina(){
        
    }
}