
package B13_Ejercicios;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ContadorDeClicks extends JFrame{
    
    private int cont=1;
    private JPanel panel;
    private JLabel etiqueta,imagen;
    private JButton boton;
    
    private void initComponet(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta=new JLabel();
        etiqueta.setText("Pulse el boton");
        etiqueta.setBounds(130,20,400,50);
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);Centra de forma horizontal la etiqueta
        etiqueta.setFont(new Font("Impact",0,20));
        panel.add(etiqueta);
        
        ImageIcon mouse=new ImageIcon("mouse.png");
        imagen=new JLabel();
        imagen.setBounds(70,25,50,50);
        imagen.setIcon(new ImageIcon(mouse.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(imagen);
        
        boton=new JButton();
        boton.setText("Click Aqui!");
        boton.setBounds(135,150,100,40);
        panel.add(boton);
        eventos();
    }
    
    private void eventos(){
        ActionListener click=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setBounds(95,20,300,50);
                imagen.setBounds(25,25,50,50);
                etiqueta.setText("El numero de Click es: "+cont);
                cont++;
            }
        };
        
        boton.addActionListener(click);
    }
    
    public ContadorDeClicks(){
        setTitle("Contador de Clicks");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponet();
    }
    
    public static void main(String[] args) {
        ContadorDeClicks v=new ContadorDeClicks();
        v.setVisible(true);
    }
}
