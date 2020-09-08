
package B9.Ejer4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejecutar {
    
    public static void main(String args[]){
        ArrayList<Atleta>arrayAtleta=new ArrayList<>();
        JOptionPane.showMessageDialog(null,"      Bienvenido\n\nSelector de ganador de carrera\nde atletismo");
        int natleta;
        String nombre;
        float tiempo;
        boolean op=false;
        do {
            int Catle=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Atletas a ingresar:"));
            for (int i = 0; i < Catle; i++) {
                natleta=Integer.parseInt(JOptionPane.showInputDialog(i+1 +" |Numero del Atleta:"));
                nombre=JOptionPane.showInputDialog(i+1+ " Nombre del Atleta:");
                tiempo=Float.parseFloat(JOptionPane.showInputDialog("Tiempo :"));
                arrayAtleta.add(new Atleta(natleta, nombre, tiempo));
            }
            Atleta aux;
            for (int i = 0; i < arrayAtleta.size()-1; i++) {
                for (int j = 0; j < arrayAtleta.size()-i-1; j++) {
                    if (arrayAtleta.get(j+1).getTiempo() < arrayAtleta.get(j).getTiempo()) {
                       aux=arrayAtleta.get(j+1);
                       arrayAtleta.set(j+1, arrayAtleta.get(j));
                       arrayAtleta.set(j, aux);
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"El Atleta ganador es:"+arrayAtleta.get(0)+"\n"
            +"Lista del resto de Atletas:\n"+arrayAtleta);
        } while (op);
        
    }
}
