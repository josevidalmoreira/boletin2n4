
package boletin2_4;
import java.util.Scanner;
public class Boletin2_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,suma,resta,multiplicacion,division;
        System.out.println("teclea n1:");
        n1=sc.nextFloat();
        System.out.println("teclea  n2:");
        n2 =sc.nextFloat();
        suma = n1+n2;
        resta =n1-n2;
        multiplicacion = n1* n2;
        division = n1/n2;
        System.out.println("suma = " + suma + " resta= "+ resta + " multiplicacion = "+ multiplicacion+ " division = "+ division);
        
        
        
        
        
    }
    
}
