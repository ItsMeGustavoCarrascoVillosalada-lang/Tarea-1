/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasemana1;
import java.util.Scanner; //permite la entrada de datos por teclado.
/**
 *
 * @author THE_G
 */
public class Eje1_CalculoAreaCuadrado {
    public static void main(String[] args) { //Dentro del método main, se crea un objeto de tipo Scanner para capturar el valor ingresado por el usuario.
        double area,lado;
        Scanner input = new Scanner(System.in);
        //solicitar el lado del cuadrado
        System.out.printf("Ingresa el valor de los lados del cuadrado:\n");
        lado = input.nextDouble();
        //calular el area
        area = lado * lado;
        //Resultado del area
        System.out.println("El área del cuadrado es: " + area);
    }
}
