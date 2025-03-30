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
       
        Scanner sc = new Scanner(System.in);
        final double IGV_PORCENTAJE = 0.18;

        System.out.print("Ingrese el monto total: ");
        double montoTotal = sc.nextDouble();

        double montoSinIGV = montoTotal / (1 + IGV_PORCENTAJE);
        double igv = montoTotal - montoSinIGV;

        System.out.printf("Monto sin IGV: %.2f\n", montoSinIGV);
        System.out.printf("IGV (18%%): %.2f\n", igv);
        System.out.printf("Monto total: %.2f\n", montoTotal);

        sc.close();
    }
}