public class Cuenta {
    private int Id;
    private String tipo;
    private Usuario usuario;
    private int contID=1;
    private double peso; 
    
    public Cuenta(String tipo, Usuario usuario) {
        this.Id = contID;
        this.tipo = tipo;
        this.usuario = usuario;
        contID++;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}