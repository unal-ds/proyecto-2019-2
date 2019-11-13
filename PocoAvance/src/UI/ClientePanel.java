/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Nicolas
 */
import javax.swing.*;
public class ClientePanel extends JFrame {
    JPanel Panel;
    public ClientePanel(){
        this.setSize(500,500);
        this.setLocation(WIDTH,WIDTH);
        Inicializar();
    }
    public void Inicializar(){
        IniciarPaneles();
        IniciarLabels();
        IniciarBotones();
      
    }
    public void IniciarPaneles(){
        Panel = new JPanel();
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
    }
    public void IniciarLabels(){
        JLabel lbImgCliente = new JLabel(new ImageIcon("Admin.png"));
        JLabel lbBienvenida = new JLabel("Bienvenido Usuario");
        lbImgCliente.setBounds(10,10,135,153);
        lbBienvenida.setBounds(200, 10, 150, 80);
        Panel.add(lbImgCliente);
        Panel.add(lbBienvenida);
    }
    public void IniciarBotones(){
        JButton btReserva = new JButton("reservar sesion");
        JButton btcanReserva = new JButton("Cancelar reserva");
        JButton btInformacion = new JButton("Informacion suscripcion");
        JButton btGestSuscripcion = new JButton("Gestionar informacion");
        JButton btCerrarSesion = new JButton("Cerrar sesion");
        btReserva.setBounds(180,150,100,40);
        btcanReserva.setBounds(180,220,100,40);
        btInformacion.setBounds(300,150,100,40);
        btGestSuscripcion.setBounds(300, 220, 100, 40);
        btCerrarSesion.setBounds(240,290,100,40);
        Panel.add(btReserva);
        Panel.add(btcanReserva);
        Panel.add(btInformacion);
        Panel.add(btGestSuscripcion);
        Panel.add(btCerrarSesion);
    }
}
