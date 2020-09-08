
/* INTEGRANTES 
   -BERNARDO PARRALES
   -MICHAEL PARRALES
*/
package B1;

import java.util.Scanner;

public class Ejer {
    static Scanner sc=new Scanner(System.in);
    public static void main (String args[]){
        iterar();
    }
    
    public static void iterar(){
        System.out.println("FORMULA GENERAL");
        int op=0;
        do {
            double a,b,c,r1,r2;
            System.out.print("Ingrese los valores\nA :");
            a=sc.nextDouble();
            System.out.print("B: ");
            b=sc.nextDouble();
            System.out.print("C: ");
            c=sc.nextDouble();
            r1=(-b+Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
            r2=(-b-Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a);
            System.out.println("Resultado: "+"\n"+"X1="+r1+"\n"+"X2="+r2);
            System.out.println("Desea repetir el proceso (si=1/no=0)");
            //sc.next();
            op=sc.nextInt();
        } while (op!=0);
        
    }
}
