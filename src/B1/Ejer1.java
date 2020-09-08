package B1;

import java.util.Scanner;

/**
 *
 * @author EQUINOX
 */
public class Ejer1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Suma de 3 Notas \nN1 :");
        int n1=sc.nextInt();
        System.out.print("N2 :");
        int n2=sc.nextInt();
        System.out.print("N3 :");
        int n3=sc.nextInt();
        int r=n1+n2+n3;
        System.out.print("El resultado es :"+ r);
    }
    
}
