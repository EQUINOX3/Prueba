
package B13_Eventos;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;


public class Ventana extends JFrame{
    
    private JPanel panel;
    private JLabel mensaje,etiqueta;
    private JTextField cajaTexto;
    private JButton boton;
    private JTextArea areaText;
    private JScrollPane scroll;
    
    public Ventana(){
        setTitle("Eventos");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(500,400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        colocarEtiqueta();
        colocarCajaTexto();
        colocarBoton();
        areaTexto();
        eventoTeclado();
        
    }
    
    
    public void colocarEtiqueta(){
        etiqueta=new JLabel();
        etiqueta.setText("Ingrese su nombre :");
        etiqueta.setBounds(40,20,300,40);
        //etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("Impact",0,30));
        panel.add(etiqueta);
    }
    
    public void colocarCajaTexto(){
        cajaTexto=new JTextField();
        cajaTexto.setBounds(220,65,200,40);
        panel.add(cajaTexto);
    }
    

    public void areaTexto(){
        int x=20 , y=20 , ancho=180 , alto=300 ;
        areaText=new JTextArea();
        areaText.setBounds(x,y,ancho,alto);
        panel.add(areaText);
        
        scroll=new JScrollPane(areaText,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(x,y,ancho,alto);
        panel.add(scroll);
    }
    
    public void colocarBoton(){
        boton=new JButton();
        boton.setText("Pulse aqui!!!");
        boton.setBounds(210,150,120,40);
        boton.setFont(new Font("Impact",2,14));
        panel.add(boton);
        
        
        /*
        mensaje=new JLabel();
        mensaje.setBounds(40,200,220,40);
        mensaje.setFont(new Font("Times Roman",0,30));
        panel.add(mensaje);
        */


        //oyenteAccion();
        //eventoOyenteRaton();
        //eventoDeMovimientoRaton();
        //eventoDeRuedaRaton();
        
    }
    
    public void oyenteAccion(){
        //AGREGA EVENTO DE TIPO ActionListener 
        ActionListener oyenteDeAccion=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mensaje.setText(".: "+cajaTexto.getText()+" :.");
            }
        };
        boton.addActionListener(oyenteDeAccion);
    }
    
    public void eventoOyenteRaton(){
        //Agegar oyente de raton
        MouseListener oyenteDeRaton= new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {//presionar y soltar dentro del boton
                //Todos estos eventos se pueden usar en los otros metodos
                if(e.isAltDown()){
                    areaText.append("Alt\n");
                }else if(e.isControlDown()){
                    areaText.append("Control\n");
                }else if(e.isShiftDown()){
                    areaText.append("Shift\n");
                }else if(e.isMetaDown()){
                    areaText.append("Click Derecho\n");
                }else{
                    areaText.append("Click izquierdo\n");
                }
                
                if(e.getClickCount() == 2){
                    areaText.append("Doble click\n");
                }
                

                //areaText.append("mouseClicked\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {//solo presionar
                //areaText.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {//presionar y soltar fuera y dentro del boton
                //areaText.append("mouseRealsed\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {//poner el raton encima del boton
                //areaText.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {//sacar el raton fuera del boton
                //areaText.append("mouseExitd\n");
            }
        };
        
        
        boton.addMouseListener(oyenteDeRaton);
    }
    
    public void eventoDeMovimientoRaton(){
        
        MouseMotionListener oyenteMovimientoRaton = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {//Click y mover el raton
                areaText.append("mouseDragged\n");
            }

            @Override
            public void mouseMoved(MouseEvent e) {//solo mover el raton
                areaText.append("mouseMoved\n");
            }
        };
        
        panel.addMouseMotionListener(oyenteMovimientoRaton);
    }
    
    public void eventoDeRuedaRaton(){
        
        MouseWheelListener ruedaRaton= new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //areaText.append("Moviendo rueda raton\n");
                if(e.getPreciseWheelRotation() == -1){
                    areaText.append("rueda hacia arriba\n");
                }else if(e.getPreciseWheelRotation() == 1){
                    areaText.append("rueda hacia abajo\n");
                }
            }
        };
        
        panel.addMouseWheelListener(ruedaRaton);//Añadir oyente de la rueda del raton
    }
    
    public void eventoTeclado(){
        KeyListener eventoTeclado = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {//Solo se activa si se presiona una tecla de tipo unicode o tambien cuando se elimina
                //areaText.append("KeyTyped\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {//Se activa cuando se preciona cualquier tecla del teclado
                //areaText.append("KeyPressed\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {//Se activa solo si se presiona y suelta una tecla
                //areaText.append("KeyReleased\n");
                if(e.getKeyChar() == 'w'){//getKeyChar() debuelve la letra presionada 
                    areaText.append("Letra w\n");
                }
                if(e.getKeyChar() == '\n'){
                    areaText.append("ENTER\n");
                }
                if (e.getKeyChar() == ' ') {
                    areaText.append("ESPACIO\n");
                }
            }
        };
        cajaTexto.addKeyListener(eventoTeclado);
    }
}
