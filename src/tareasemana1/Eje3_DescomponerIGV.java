/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana1;
import java.util.Scanner;
/**
 *
 * @author THE_G
 */
public class Eje3_DescomponerIGV {
    public static void main(String[] args) {
        double IGV,Monpagar,Montotal;
        Scanner lector= new Scanner(System.in);
        
        System.out.printf("Ingrese el monto total \n");
        Montotal=lector.nextDouble();
        Monpagar=Montotal/1.18;
        IGV=Monpagar*0.18;
        
        System.out.println("El monto a pagar es:" +Monpagar);
        System.out.println("El IGV es de: "+IGV);
    }
}
