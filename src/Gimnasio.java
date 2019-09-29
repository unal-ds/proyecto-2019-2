public class Gimnasio {
    int cantClientes = 3;
    int cantMaquinas = 3;
    int cantAdm = 3;
    Lista<Cliente> Clientes = new Lista<>(cantClientes);
    Lista<Maquinas> Maquinas = new Lista<>(cantMaquinas);
    Lista<Administrador> Administradores = new Lista<>(cantAdm);
    
    public void consultarClientes(){
        Clientes.output();
    }
    public void consultarMaquinas(){
        Maquinas.output();
    }
    public void consultarAdministradores(){
        Administradores.output();
    }
}
