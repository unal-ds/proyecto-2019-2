/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.*;
/**
 *
 * @author Nicolas
 */
public class Login extends JFrame{
    JPanel Panel;
    public Login(){
        this.setSize(500,500);
        this.setLocation(WIDTH,WIDTH);
        this.setTitle("Hola que tal");
        Inicializar();
    }
    public void Inicializar(){
        IniciarPaneles();
        IniciarLabels();
        IniciarBotones();
        IniciarCuadrosdeTexto();
    }
    public void IniciarBotones(){
        JButton jbIngresar = new JButton("Ingresar");
        jbIngresar.setBounds(200,290,100,40);
        Panel.add(jbIngresar);
    }
    public void IniciarLabels(){
        JLabel lbUsuario = new JLabel("Usuario:");
        JLabel lbContrasena = new JLabel("Contrasena:");
        JLabel lbContacto = new JLabel("Contactar administrador");
        lbUsuario.setBounds(50,150,100,40);
        lbContrasena.setBounds(50,220,100,40);
        lbContacto.setBounds(150,360,200,40);
        lbContacto.setForeground(Color.BLUE);
        lbContacto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Panel.add(lbUsuario);
        Panel.add(lbContrasena);
        Panel.add(lbContacto);
    }
    public void IniciarCuadrosdeTexto(){
        JTextField tfUsuario= new JTextField();
        JPasswordField tfContrasena = new JPasswordField();
       tfUsuario.setBounds(150,150,150,40);
       tfContrasena.setBounds(150,220,150,40);
       Panel.add(tfUsuario);
       Panel.add(tfContrasena);
    }
    public void IniciarPaneles(){
        Panel = new JPanel();
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
        
    }
}
