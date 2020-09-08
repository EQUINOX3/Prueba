/*
Como material de apoyo se recomienda revisar la API de Java
*/
package B13_Componentes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame{
    
    
    public Ventana(){
        setTitle("ESTO ES UN TITULO DE LA VENTANA XD");//Establece el titulo de la ventana
        
        this.setSize(500,500);//Establece el tamaño de la ventana (ancho y alto)
        //setLocation(100,200);//Establece la posicion de la ventana (X, Y)
        /*setBounds(X, Y, Ancho, Alto);  Une los los metodos de tamaño y pocision*/
        //setBounds(100,200,500,500);
        setLocationRelativeTo(null);//Establecemos la ventana en el centro de la pantalla
        
        //setResizable(false);//Desactiva la redimensionalidad de la ventana
        setMinimumSize(new Dimension(200,200));//Establece el minimo de lo pequeño que puede ser la ventana
        
        //El this.""" es opcional usarlo pero se recomienda hacerlo
        //this.getContentPane().setBackground(Color.LIGHT_GRAY);//Establece el color de la ventana (getCont... obtenemos el contenido de la ventana y setBack... establece el color de la ventana)
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Al cerrar la ventana pará la ejecucion
    }
    
    private void iniciarComponentes(){
        colocarPaneles();
    }
    
    public void colocarPaneles(){
        JPanel panel=new JPanel();//CReacion del panel
        //panel.setBackground(Color.BLUE);//Agrega color al panel
        panel.setLayout(null);//Desactiva el Diseño o Layout
        this.getContentPane().add(panel);//agregamos el panel a la ventana (getCon... optenemos el contenido y add()... agrega la ventana) 
        //colocarBotones(panel);
        colocarEtiquetas(panel);
        //colocarRadioBotones(panel);
        //colorBotonesActivacion(panel);
        //colocarCajasTexto(panel);
        //colocarAreasTexto(panel);
        //colocarCasillasVerificacion(panel);
        //colocarListasDesplegables(panel);
        //colocarCampoContraseña(panel);
        //colocarTablas(panel);
        //coloarListas(panel);
    }
    
    public void colocarEtiquetas(JPanel panel){
        JLabel etiqueta =new JLabel();//Crea una etiqueta (Se puede agregar el texto directamente dentro de la instacia JLabel etiqueta =new JLabel("Hola")).Dentro del constructor el segundo parametro indica lo posicion de las letras dentro de la etiqueta (JLabel etiqueta =new JLabel("Hola",SwingConstants.ctrl+space);)
        etiqueta.setText("CRL-2020");//Se establece el texto de la etiqueta
        etiqueta.setBounds(85, 10, 300, 80);//Establece la pocision y dimencion de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//Estable la alineacion horizontal de texto dentro de la etiqueta
        etiqueta.setForeground(Color.BLACK);//Establecemos el color de letra de la etiqueta
        etiqueta.setOpaque(true);////Permite pintar la etiqueta(true permite, false no permite y por defecto es false)
        //etiqueta.setBackground(Color.BLACK);//Color de fondo de la eiqueta
        etiqueta.setFont(new Font("Impact",0,40));//Estable la fuente del texto (Tipo de fuente, Font.*BOLD:negrita, ITALIC:cursiva, PLAIN:plano*, tamaño)
        panel.add(etiqueta);//Agregamos la etiqueta
        
        //ETIQUETA 2 - TIPO IMAGEN      
        ImageIcon imagen=new ImageIcon("CRL.png");
        JLabel etiqueta2=new JLabel();//Crea la etiqueta con la imagen
        etiqueta2.setBounds(98,80, 300, 350);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);//Agrega la imagen a la etiqueta
        
    }
    
    public void colocarBotones(JPanel panel){
        //Boton 1 - boton de texto
        JButton boton1= new JButton();
        boton1.setText("CLICK");//Estable texto al boton
        boton1.setBounds(100,100,100,40);
        boton1.setEnabled(true);//"esta habilitado por defecto" Estable el encendido del boton (true funciona, false no funciona)
        boton1.setMnemonic('a');//Estable atajo: alt + letraSelecionada
        boton1.setForeground(Color.BLUE);
        boton1.setFont(new Font("compact",1,15));
        panel.add(boton1);
        
        //Boton 2 - boton de imagen
        JButton boton2=new JButton();
        boton2.setBounds(100,200,100,40);
        ImageIcon clickAqui=new ImageIcon("boton-clic-aqui.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        boton2.setBackground(Color.BLUE);//Cambia el color de fondo del boton
        panel.add(boton2);
        
        //Boton 3 - Boton de borde
        JButton boton3=new JButton();
        boton3.setBounds(100,300,110,50);
        boton3.setBorder(BorderFactory.createLineBorder(Color.BLUE,3,false));//Agrega borde (color, ancho, true=esquina redondeada)
        panel.add(boton3);
        
    }
    
    public void colocarRadioBotones(JPanel panel){
        JRadioButton radioBoton=new JRadioButton("Opcion 1",true);
        radioBoton.setEnabled(true);//desactiva el radiobutton
        radioBoton.setText("Op 1 :3");//agrega texto
        radioBoton.setForeground(Color.red);//agrega color
        radioBoton.setFont(new Font("impact",0,20));//agrega fuente (tipo de fuente,tipo de letra,tamaño) 
        radioBoton.setBounds(100,100,100,40);//x, y, ancho, alto
        panel.add(radioBoton);//agregamos al panel
        
        JRadioButton radioboton2=new JRadioButton("Opcion 2");
        radioboton2.setBounds(100,150,100,40);
        panel.add(radioboton2);
        
        JRadioButton radioboton3=new JRadioButton("Opcion 3");
        radioboton3.setBounds(100,200,100,40);
        panel.add(radioboton3);
        
        ButtonGroup grupoRadioBotones= new ButtonGroup();
        grupoRadioBotones.add(radioBoton);
        grupoRadioBotones.add(radioboton2);
        grupoRadioBotones.add(radioboton3);
    }
    
    public void colorBotonesActivacion(JPanel panel){
        //Los mismos metodos del radiobutton pueden ser implementados
        JToggleButton botonActivacion=new JToggleButton("Opcion 1",true);
        botonActivacion.setBounds(100,100,100,40);
        //botonActivacion.getSelected(); Esto no existe
        panel.add(botonActivacion);
        
        JToggleButton botonActivacion2=new JToggleButton("Opcion 2",true);
        botonActivacion2.setBounds(100,150,100,40);
        panel.add(botonActivacion2);
        
        JToggleButton botonActivacion3=new JToggleButton("Opcion 3",true);
        botonActivacion3.setBounds(100,200,100,40);
        panel.add(botonActivacion3);
        
        ButtonGroup grupoBotonesActivados=new ButtonGroup();
        grupoBotonesActivados.add(botonActivacion);
        grupoBotonesActivados.add(botonActivacion2);
        grupoBotonesActivados.add(botonActivacion3);
    }
    
    public void colocarCajasTexto(JPanel panel){//Caja de texto de una sola fila
        JTextField cajaTexto= new JTextField();
        cajaTexto.setBounds(50,50,100,30);
        cajaTexto.setText("Hola...");
        
        System.out.println("Texto: "+cajaTexto.getText());
        panel.add(cajaTexto);
    }
    
    public void colocarAreasTexto(JPanel panel){
        JTextArea areaTexto=new JTextArea();
        areaTexto.setBounds(20,20,300,300);
        areaTexto.setText("Escriba el texto:");
        areaTexto.append("\nEscribe por aqui...");//Añade mas texto
        //areaTexto.setEditable(false);//Permite establecer el editado del area de texto
        //System.out.println("El texto es:"+areaTexto.getText());
        panel.add(areaTexto);
        
        //Barras de desplazamiento
        JScrollPane barrasDesplazamiento= new JScrollPane(areaTexto,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barrasDesplazamiento.setBounds(20,20,300,300);
        //barrasDesplazamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //barrasDesplazamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        panel.add(barrasDesplazamiento);
        
    }
    
    public void colocarCasillasVerificacion(JPanel panel){
        JCheckBox casillaVerificacion1= new JCheckBox("Vegetales");
        casillaVerificacion1.setBounds(100,100,100,50);
        casillaVerificacion1.setEnabled(false);
        
        panel.add(casillaVerificacion1);
        
        JCheckBox casillaVerificacion2= new JCheckBox("Electrodomesticos");
        casillaVerificacion2.setBounds(100,150,100,50);
        panel.add(casillaVerificacion2);
        
        JCheckBox casillaVerificacion3= new JCheckBox("Golocinas");
        casillaVerificacion3.setBounds(100,200,100,50);
        panel.add(casillaVerificacion3);
        
        /*ButtonGroup grupoCheckBox=new ButtonGroup();
        grupoCheckBox.add(casillaVerificacion1);
        grupoCheckBox.add(casillaVerificacion2);
        grupoCheckBox.add(casillaVerificacion3);
        */
    }
    
    public void colocarListasDesplegables(JPanel panel){
        
        
        String [] paises={"Ecuador","Peru","Colombia","Paraguay"};
        JComboBox listaDesplegable=new JComboBox(paises);
        listaDesplegable.setBounds(100,100,100,40);
        listaDesplegable.addItem("Argentina");//Agrega Objetos despues de haberlo inicializado
        listaDesplegable.setSelectedItem("Paraguay");//Seleccionar el primer objeto visto
        
        panel.add(listaDesplegable);  
        Persona persona= new Persona("VICTOR",20,"ECUATORIANO");
        Persona persona2=new Persona("JONATHAN",14,"PERUANO");
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        //JComboBox listaDesplegable=new JComboBox(modelo);
        
        modelo.addElement(persona);
        modelo.addElement(persona2);
        listaDesplegable.setBounds(20,20,200,30);
        panel.add(listaDesplegable);
    }
    
    public void colocarCampoContraseña(JPanel panel){
        JPasswordField campoContraseña=new JPasswordField();
        campoContraseña.setBounds(100,100,100,40);
        campoContraseña.setText("Hola");
        panel.add(campoContraseña);
        
        String contraseña="";
        
        for (int i = 0; i < campoContraseña.getPassword().length; i++) {
            contraseña+=campoContraseña.getPassword()[i];
        }
        
        System.out.println("Contraseña:"+contraseña);
        //System.out.println("Contraseña: "+Arrays.toString(campoContraseña.getPassword())); campoContraseña.getPassword es un arreglo de char
    }
    
    public void colocarTablas(JPanel panel){
        
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Nombre:");
        modelo.addColumn("Edad:");
        modelo.addColumn("Nacionalidad:");
        String [] persona1={"Victor","20","Ecuatoriano"};
        String [] persona2={"Anahi","13","Ecuatoriana"};
        modelo.addRow(persona1);
        modelo.addRow(persona2);
        
        JTable tabla=new JTable(modelo);
        tabla.setBounds(100,100,300,200);
        
        panel.add(tabla);
        
        JScrollPane scroll=new JScrollPane(tabla,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(100,100,300,200);
        panel.add(scroll);
    }   
    
    public void coloarListas(JPanel panel){
        
        DefaultListModel modelo=new DefaultListModel();
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Victor",20,"Ecuatoriano"));
        modelo.addElement(new Persona("Bernardo",20,"Ecuatoriano"));
        
        JList lista= new JList(modelo);
        lista.setBounds(100,100,250,200);
        panel.add(lista);
        
        JScrollPane scroll=new JScrollPane(lista,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(100,100,250,200);
        panel.add(scroll);
    }
}
