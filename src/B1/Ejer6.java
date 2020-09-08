
package B1;

import java.util.Scanner;

public class Ejer6 {
    
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        //*c=(int) ((Math.pow(a, 2))+(Math.pow(b, 2))+(2*a*b));
        c=(int)(Math.pow((a+b), 2));
        System.out.println(c);
    }
}
