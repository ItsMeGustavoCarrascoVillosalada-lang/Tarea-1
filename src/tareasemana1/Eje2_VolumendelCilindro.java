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
        Scanner lector= new Scanner(System.in);
        // Solicitar el radio y la altura al usuario
        System.out.printf("Ingrese el radio del cilindro:\n ");
        radio =lector.nextDouble();
        
        System.out.printf("Ingrese la altura del cilindro:\n ");
        altura = lector.nextDouble();
        
        // Calcular el volumen
        volumen = Math.PI * Math.pow(radio, 2) * altura; 
                 
        // Mostrar el resultado
        System.out.printf("El volumen del cilindro es: %.2f\n", volumen);
    }
}
