/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author MTE Luis Estrada
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op = 0;
        double var_1 = 0.0;
        double var_2 = 0.0;
        double resul = 0.0;
        do{
            System.out.println("MENU CALCULADORA");
            System.out.println("1.- Sumar");
            System.out.println("2.- Multiplicar");
            System.out.println("3.- Dividir");
            System.out.println("4.- Raiz cuadrada");
            System.out.println("5.- TERMINAR PROGRAMA");
            System.out.println("Selecciona una op: ");
            op = leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Captura var1");
                    var_1 = leer.nextDouble();
                    System.out.println("Captura var2");
                    var_2 = leer.nextDouble();
                    resul = var_1 + var_2 ;
                    System.out.println("LA SUMA ES: "+resul);
                    break;
                case 2:
                    System.out.println("Captura var1");
                    var_1 = leer.nextDouble();
                    System.out.println("Captura var2");
                    var_2 = leer.nextDouble();
                    resul = var_1 * var_2 ;
                    System.out.println("LA MULTIPLICACION ES: "+resul);
                    break;
                case 3:
                    System.out.println("Captura var1");
                    var_1 = leer.nextDouble();
                    System.out.println("Captura var2");
                    var_2 = leer.nextDouble();
                    if(var_2 == 0){
                        System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
                    }else{
                        resul = var_1 / var_2 ;
                        System.out.println("LA DIV ES: "+resul);                    
                    }
                    break;
                case 4:
                    System.out.println("Captura var1");
                    var_1 = leer.nextDouble();
                    if(var_1 < 0){
                        System.out.println("ERROR RAICES NEGATIVAS");
                    }else{
                        resul = Math.sqrt(var_1);
                        System.out.println("La raiz es: "+resul);
                    }
                    break;
                case 5:
                    System.out.println("GRACIAS POR USAR EL PROGRAMA");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA DEL MENU");
                    break;
            }
            
        }while(op != 5);
    }
    
}
