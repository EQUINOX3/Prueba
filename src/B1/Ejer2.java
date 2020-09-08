package B1;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        float pg, ht, r;
        System.out.print("Salario semanal \nPago por Hora : ");
        pg=sc.nextFloat();
        System.out.print("Horas totales trabajadas : ");
        ht=sc.nextFloat();
        r=pg*ht;
        System.out.println("El salario es: "+r);
    }
    
}
