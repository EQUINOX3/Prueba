/*
SEMANA 168 H
DIA 24 H
HORA 60 MIN
 */
package B1;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int horasTotales, Semana, dia, hora;
        System.out.println("Ingrese las horas");
        horasTotales=sc.nextInt();
        Semana=horasTotales/168;
        dia=horasTotales%168 /24;
        hora=horasTotales%24;
        System.out.println("Semana: "+Semana+" Dia: "+dia+" Hora: "+hora);
    }
}
