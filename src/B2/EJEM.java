/*
Para que se cumpla la cumpla la condicion y y entre la bloque del if la sentencia debe ser verdadera:true
==  : Igualdad 
=!  : Diferencia
<=  : Menor o igual
<   : Menor
>=  : Mayor o igual
>   : Mayor 

El operador ternario ' ? '
  valor = (Condicion) ?  valor1 : valor2
*/
package B2;

import javax.swing.JOptionPane;
public class EJEM {
    public static void main(String args[]){
        int op =0;
        op = Integer.parseInt(JOptionPane.showInputDialog("1 para IF 2 para Ternario\nposi crv"));
        switch (op) {
            case 1:
                JOptionPane.showMessageDialog(null, "IF");
                sentencia_if();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "TERNARIO");
                Operador_ternario();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void sentencia_if(){
        int numero, dato =5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        if(numero==5){
            JOptionPane.showMessageDialog(null,"El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
    }
    
    public static void Operador_ternario(){
        String respuesta;
        System.out.println("Identifica si el numero es par o impar");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero :"));
        //                           true       false
        respuesta= (numero%2==0) ? "Es Par" : "Es Impar" ;
        //Ejemplo 1
        JOptionPane.showMessageDialog(null, respuesta);
        
        //Ejemplo 2
        JOptionPane.showMessageDialog(null, (numero%2==0) ? "Es Par" : "Es Impar");
    }
}
