/**salario mensual de 1000$, +150$ por venta, +5% del valor del vehiculo*/
package B1;

import java.util.Scanner;

public class Ejer4 {
    public static void main (String [] args){
        float sm, vv = 0, tot;
        int xv,xc;
        Scanner sc = new Scanner (System.in);
        System.out.print("CALCULADORA DE SALARIO \nIngrese el pago mensual : ");
        sm= sc.nextFloat();
        System.out.println("Cuantos carros vendio : ");
        xv=sc.nextInt();
        xc=xv*150;
        if(xv!=0){
            System.out.println("Valor total de ventas : ");
            tot=sc.nextFloat();
            vv=(5*tot)/100;
        }
        System.out.println("Pago total : " + (vv+xc+sm) + "$");
    }
}
