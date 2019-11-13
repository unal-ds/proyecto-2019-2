/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import javax.swing.*;
/**
 *
 * @author Nicolas
 */
public class AdminPanel extends JFrame {
    JPanel panel ;
    public AdminPanel(){
        this.setSize(500,500);
        this.setLocation(WIDTH, WIDTH);
        Inicializar();
    }
    public void Inicializar(){
       ponerPaneles();
       ponerLabels();
       ponerBotones();
    }
    public void ponerLabels(){
        JLabel imgAdmin= new  JLabel(new ImageIcon("Admin.png"));
        JLabel lbBienvenida = new JLabel("Bienvenido Admin");
        lbBienvenida.setBounds(200,10,100,80);
        imgAdmin.setBounds(10, 10, 135, 153);
        panel.add(lbBienvenida);
        panel.add(imgAdmin);
        
    }
    public void ponerPaneles(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    public void ponerBotones(){
        JButton btGestionar = new JButton("Modificar Cliente");
        JButton btAgregar = new JButton("Agregar Cliente");
        JButton btEliminar = new JButton("Eliminar Cliente");
        JButton btAdministrar = new JButton("Administrar Gimnasio");
        JButton btGestInformacion = new JButton("Gestionar Informacion");
        JButton btSalir = new JButton("Salir");   
            
        btGestionar.setBounds(300,150,100,40);
        btAgregar.setBounds(300,220,100,40);
        btEliminar.setBounds(300,290,100,40);     
        btAdministrar.setBounds(180,150,100,60);
        btGestInformacion.setBounds(180,270,100,60);
        btSalir.setBounds(385, 410, 80, 30);
        panel.add(btGestionar);
        panel.add(btAgregar);
        panel.add(btEliminar);
        panel.add(btAdministrar);
        panel.add(btGestInformacion);
        panel.add(btSalir);
    }
}
