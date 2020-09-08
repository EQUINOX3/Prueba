
package B1;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String [] args){
        float p, e1, e2, ef, nf;
        int c;
        Scanner sc=new Scanner (System.in);
        System.out.println("Participacion:");
        p=sc.nextFloat();
        System.out.println("Examen 1:");
        e1=sc.nextFloat();
        System.out.println("Examen 2:");
        e2=sc.nextFloat();
        System.out.println("Examen Final:");
        ef=sc.nextFloat();
        nf=(0.1f*p)+(0.25f*e1)+(0.25f*e2)+(0.40f*ef);
        System.out.println("Nota Final :" + nf);
    }
}
