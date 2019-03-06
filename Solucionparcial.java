
package solucionparcial;

import java.util.Scanner;

/**
 *
 * @author Ale Trejo
 */
public class Solucionparcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //usamos el Scanner para ingresar cantidad filas y columna
        //Scabber  para ingresar los valores
        
        Scanner nombre=new Scanner (System.in);
        System.out.print("ingrese el nombre de filas:");
        int filas=nombre.nextInt();
        System.out.print("ingrese el nombre de columnas:");
        int columnas=nombre.nextInt();
        
        //creamos el nombre de combustible en cada columan y fila
        int Solucionparcial [][]=new int [filas][columnas];
        //INGRESE EL VALORES
        
        System.out.println("---------");
        System.out.println("ingrese el nombre");
        
        for (int a=0;a<filas;a ++){
            for(int b=0;b<columnas;b++){
                System.out.print("cantidad de NOMBRE:["+a+"]["+b+"]=");
                Solucionparcial[a][b]=nombre.nextInt();
            }
        }
             //ayudar a reconocer mas posiciones en cada valor  
            System.out.println("---------");
          System.out.println("ingrese la cantidad");
          for (int a=0;a<Solucionparcial.length;a ++){
            for(int b=10;b<Solucionparcial[a].length;b++){
                System.out.print(Solucionparcial[a][b]+"");
                
            }
            System.out.println();
            //debe salta en cada uno
    }
    }
}
