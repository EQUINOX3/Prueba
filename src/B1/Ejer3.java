package B1;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        float p1,p2,p3;
        System.out.println("Cantidad de dinero P1:");
        p1=sc.nextFloat();
        System.out.println("Cantidad de dinero P2:");
        p2=p1/2;
        System.out.println(p2);
        System.out.println("Cantidad de dinero P3:");
        p3=(p1+p2)/2;
        System.out.println(p3+"\nLa suma de los 3 es: "+ (p1+p2+p3));
        
        
    }
}
