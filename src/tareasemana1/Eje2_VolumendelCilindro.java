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
public class Eje2_VolumendelCilindro {
  public static void main(String[] args) {
        double radio,altura,volumen;
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar radio 
        System.out.print("Ingrese el radio del cilindro: ");
        radio = scanner.nextDouble();
        // Solicitar la altura 
        System.out.print("Ingrese la altura del cilindro: ");
        altura = scanner.nextDouble();
        
        // Calcular el volumen
        volumen = Math.PI * Math.pow(radio, 2) * altura; 
        
        // Mostrar el resultado
        System.out.printf("El volumen del cilindro es: %.2f\n", volumen);
        
        scanner.close();
    }
}
