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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class PanelRegistroCliente extends JFrame{
    JPanel Panel;
    JFrame frame;
    public PanelRegistroCliente(){
       this.setSize(500,500);
       this.setLocation(WIDTH,WIDTH);
       Inicializar();
       
    }
    public void Inicializar(){
        IniciarPaneles();
        IniciarBotones();
        IniciarDesplegables();
        IniciarLabels();
        IniciarCajasdeTexto();
               
    }
    public void IniciarPaneles(){
        Panel = new JPanel();
        Panel.setLayout(null);
        this.getContentPane().add(Panel);
    }
    public void IniciarBotones(){
        JButton btSalir = new JButton("Salir");
        btSalir.setBounds(390,390,70,40);
        Panel.add(btSalir);
        
        ActionListener listener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        };
        btSalir.addActionListener(listener);
    }
    public void IniciarDesplegables(){
        String[] id = {"C.C","NUIP","T.I"};
        JComboBox cbId = new JComboBox(id);
        cbId.setBounds(150,190,40,40);
        Panel.add(cbId);
        
    }
    public void IniciarLabels(){
        JLabel lbNombres = new JLabel("Nombres:");
        JLabel lbNip = new JLabel("Documento: ");
        JLabel lbApellidos = new JLabel("Apellidos: ");
        lbNombres.setBounds(70,50,80,40);
        lbNip.setBounds(70,190,80,40);
        lbApellidos.setBounds(70,120,80,40);
        Panel.add(lbNombres);
        Panel.add(lbNip);
        Panel.add(lbApellidos);
        
    }
    public void IniciarCajasdeTexto(){
        JTextField tfNombre = new JTextField();
        JTextField tfApellidos = new JTextField();
        JTextField tfIdentidad = new JTextField();
        tfNombre.setBounds(200,50,180,40);
        tfApellidos.setBounds(200, 120,180,40);
        tfIdentidad.setBounds(200,190,180,40);
        Panel.add(tfNombre);
        Panel.add(tfApellidos);
        Panel.add(tfIdentidad);
    }

    
}
