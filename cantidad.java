package solucionparcial;
/**
 *
 * @author Ale Trejo
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class cantidad {
    public static void main(String[] args, int Sumafilas, String b) {
        Scanner entrada = new Scanner(System.in);
        int cantidad [][],fila,col,sumafila = 0,sumacol;
        //sumar el cantidades
        fila= Integer.parseInt(JOptionPane.showInputDialog("el numero de la fila"));
        col= Integer.parseInt(JOptionPane.showInputDialog("el numero de la col"));
    
    cantidad = new int[fila][col];
   
    System.out.println("numero es");
    for(int a=0;a<fila;a++){
        for(int b=0;b<col;b++){
             System.out.print("cantidad:["+a+"]["+b+"]=");
            cantidad[a][b]= entrada.nextInt();
        }
    }
    System.out.println("cantidad es el :");
    for(int a=0;a<fila;a++){
        for(int b=0;b<col;b++){
             System.out.print(cantidad[a][b]+"");
           
        }
}
    System.out.println("");
    
    
    //sumamos en total
    for(int a=0;a<fila;a++){
            Sumafilas = 0;
    for(int b=0;b<col;b++){
    sumafila+=cantidad[a][b];
}
    System.out.println("la suma fila["+a+"] es:"+Sumafilas);
}
    System.out.println("");
    for(int a=0;a<fila;a++){
            sumacol = 0;
    for(int b =0;b<fila;b++){
    sumacol+=cantidad[a][b];
}
    System.out.println("la suma columna ["+b+"] es:"+sumacol);
}
    }
}
