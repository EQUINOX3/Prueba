
package B2;
import javax.swing.JOptionPane;

public class Ejer123678 {
    public static void main (String args[]){
        int op=0;
        boolean vf=true;
        do {
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU\n1)MULTIPLO\n2)NUMERO <=>\n3)DETERMINA LETRA MAYUSCULA\n"
                + "4)DETERMINA NUMERO PAR O IMPAR\n5)ORDENAR 3 NUMEROS\n6)CALCULAR CUANTAS CIFRAS TIENE UN NUMERO\n"
                    + "7)IDENTIFICA FECHA\n\nPRECIONE CUALQUIER OTRO NUMERO\nSI DESEA SALIR DEL PROGRAMA"));
            switch (op) {
                case 1:Multiplo();
                    break;
                case 2:Nmm();
                    break;
                case 3:Dlm();
                    break;
                case 4:Dnp();
                    break;
                case 5:Onm();
                    break;
                case 6:Ccc();
                    break;
                case 7:Dma();
                default:
                    vf=false;
            }
        } while (vf);    
    }
    //int numero= Integer.parseInt(JOptionPane.showInputDialog(""));
    //JOptionPane.showMessageDialog(null,"");
    public static void Multiplo(){
        int numero= Integer.parseInt(JOptionPane.showInputDialog("MULTIPLO\nIngrese el numero:"));
        JOptionPane.showMessageDialog(null,(numero%10==0) ? "Es multiplo de 10":"No es multiplo de 10");
    }
    public static void Nmm(){
        int numero1= Integer.parseInt(JOptionPane.showInputDialog("NUMERO MAYOR MENOR O IGUAL\nIngrese primer numero"));
        int numero2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        if(numero1==numero2){
            JOptionPane.showMessageDialog(null,numero1+" Es igual a "+numero2);
        }else if(numero1>numero2){
            JOptionPane.showMessageDialog(null,numero1+" Es mayor que "+numero2);
        }else if(numero2>numero1){
            JOptionPane.showMessageDialog(null,numero2+" Es mayor que "+numero1);
        }
    }
    public static void Dlm(){
        char letra= JOptionPane.showInputDialog("LETRA MAYUSCULA\nDigite una letra").charAt(0);
        JOptionPane.showMessageDialog(null,(Character.isUpperCase(letra)) ? "Es una letra mayuscula":"Es letra minuscula");//Determina si es mayuscula
    }
    public static void Dnp(){
        int numero1= Integer.parseInt(JOptionPane.showInputDialog("NUMERO PAR O IMPAR\nIngrese primer numero:"));
        int numero2= Integer.parseInt(JOptionPane.showInputDialog("NUMERO PAR O IMPAR\nIngrese el segundo numero:"));
        if(numero1%2==0 && numero2%2==0){
            JOptionPane.showMessageDialog(null,"Los numeros son Pares");
        }else if(numero1%2!=0 && numero2%2!=0){
            JOptionPane.showMessageDialog(null,"Los numeros son Impares");            
        }else if(numero1%2==0 && numero2%2!=0){
            JOptionPane.showMessageDialog(null,"El primer numero es impar y el segundo par");
        }else{
            JOptionPane.showMessageDialog(null,"El primer numero es par y el sugundo numero es impar");
        }
    }
    public static void Onm(){
        int numero1= Integer.parseInt(JOptionPane.showInputDialog("ORDENAR 3 NUMEROS\nNUMERO 1:"));
        int numero2= Integer.parseInt(JOptionPane.showInputDialog("ORDENAR 3 NUMEROS\nNUMERO 2:"));
        int numero3= Integer.parseInt(JOptionPane.showInputDialog("ORDENAR 3 NUMEROS\nNUMERO 3:"));
        if(numero1>numero2 && numero1>numero3){
            if(numero2>numero3){
                JOptionPane.showMessageDialog(null, numero1 +","+ numero2 +","+ numero3);
            }else {
                JOptionPane.showMessageDialog(null, numero1 +","+ numero3 +","+ numero2);
            }
        }else if(numero2>numero1 && numero2>numero3){
            if(numero1>numero3){
                JOptionPane.showMessageDialog(null, numero2 +","+ numero1 +","+ numero3);
            }else {
                JOptionPane.showMessageDialog(null, numero2 +","+ numero3 +","+ numero1);
            }
        }else if(numero3>numero1 && numero3>numero2){
            if(numero1>numero2){
                JOptionPane.showMessageDialog(null, numero3 +","+ numero1 +","+ numero2);
            }else {
                JOptionPane.showMessageDialog(null, numero3 +","+ numero2 +","+ numero1);
            }
        }
    }
    public static void Ccc(){
        int numero= Integer.parseInt(JOptionPane.showInputDialog("CONTADOR DE CIFRAS DEL 0 AL 9999"));
        if(numero<10){
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
        }else if(numero<100){
            JOptionPane.showMessageDialog(null, "El numero tiene 2 cifra");
        }else if(numero<1000){
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifra");
        }else if(numero<10000){
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifra");
        }
    }
    public static void Dma(){
        int d= Integer.parseInt(JOptionPane.showInputDialog("     FECHA\nDIA:"));
        int m= Integer.parseInt(JOptionPane.showInputDialog("     FECHA\nMES:"));
        int a= Integer.parseInt(JOptionPane.showInputDialog("     FECHA\nAÑO:"));
        JOptionPane.showMessageDialog(null,(d>0 && d<31 && m>0 && m<13) ? "La fecha es correcta" : "La fecha es incorrecta");
    }
}
